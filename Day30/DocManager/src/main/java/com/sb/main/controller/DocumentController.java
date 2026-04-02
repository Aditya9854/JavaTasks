package com.sb.main.controller;

import com.sb.main.entity.DocumentMetadata;
import com.sb.main.service.DocumentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    @Autowired private DocumentService service;

    //upload
    @PostMapping("/upload")
    public ResponseEntity<DocumentMetadata> upload(@RequestParam("file")MultipartFile file) throws IOException
    {
        return ResponseEntity.ok(service.save(file));
    }

    //download / image display
    @GetMapping("/view/{filename:.+}")
    public ResponseEntity<Resource> viewFile(@PathVariable String filename, HttpServletRequest request)
    {
        Resource resource = service.load(filename);
        String contentType = request.getServletContext().getMimeType(filename);

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType != null ? contentType : "application/octet-stream"))
                .header(HttpHeaders.CONTENT_DISPOSITION,"inline;filename=\""+resource.getFilename()+"\"")
                .body(resource);
    }

    //Generate PDF summary
    @GetMapping("/report")
    public ResponseEntity<byte[]>getReport()throws IOException
    {
        byte[] pdf = service.generatePdfReport();
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename=report.pdf")
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdf);
    }
}
