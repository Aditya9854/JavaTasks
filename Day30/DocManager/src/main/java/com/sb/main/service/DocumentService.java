package com.sb.main.service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.sb.main.entity.DocumentMetadata;
import com.sb.main.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class DocumentService {

    private final Path root = Paths.get("uploads");
    @Autowired private DocumentRepository repository;

    public DocumentService()
    {
        try
        {
            Files.createDirectories(root);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    //Upload and save metadata
    public DocumentMetadata save (MultipartFile file)throws IOException
    {
        String name = StringUtils.cleanPath(file.getOriginalFilename());
        Files.copy(file.getInputStream(),this.root.resolve(name), StandardCopyOption.REPLACE_EXISTING);

        DocumentMetadata meta = new DocumentMetadata();
        meta.setFileName(name);
        meta.setFileType(file.getContentType());
        meta.setSize(file.getSize());
        meta.setUploadTime(LocalDateTime.now());
        return repository.save(meta);
    }

    //Load file
    public Resource load(String filename)
    {
        try{
            Path file = root.resolve(filename);
            Resource resource = new UrlResource(file.toUri());

            if (resource.exists()) return resource;
            throw new RuntimeException("File not found");
        }
        catch (MalformedURLException e)
        {
            throw new RuntimeException(e);
        }
    }
    // Generate PDF report
    public byte[] generatePdfReport() throws IOException
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        PdfWriter writer = new PdfWriter(baos);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);

        document.add(new Paragraph("Document Management System Report").setBold().setFontSize(18));
        List<DocumentMetadata> allDocs = repository.findAll();

        for (DocumentMetadata doc : allDocs)
        {
            document.add(new Paragraph("File : "+doc.getFileName()+" | Type : "+doc.getFileType()));
        }
        document.close();
        return baos.toByteArray();
    }

}
