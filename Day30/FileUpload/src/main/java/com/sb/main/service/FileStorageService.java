package com.sb.main.service;

import ch.qos.logback.core.util.StringUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

@Service
public class FileStorageService {

    private final Path fileStorageLocation;
    private static final List<String> ALLOWED_EXTENTIONS = Arrays.asList("image/jpeg","image/png","application/pdf");

    public FileStorageService(@Value("${file.upload-dir}") String uploadDir)
    {
        this.fileStorageLocation = Paths.get(uploadDir).toAbsolutePath().normalize();
        try{
            Files.createDirectories(this.fileStorageLocation);
        }
        catch (Exception ex)
        {
            throw new RuntimeException("Could not create directory where the uploaded files will be stored.",ex);
        }
    }

    public String storeFile(MultipartFile file)
    {
        //validating file type
        String contentType = file.getContentType();
        if (contentType == null || !ALLOWED_EXTENTIONS.contains(contentType))
        {
            throw new RuntimeException("Invalid file type.Only jpeg,png and pdf are allowed");
        }
        //Normalize and sanitize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            if (fileName.contains(".."))
            {
                throw new RuntimeException("File name contains inavalid path sequence."+fileName);
            }
            //copying file to the targeted location
            Path targetLocation = this.fileStorageLocation.resolve(fileName);
            Files.copy(file.getInputStream(),targetLocation, StandardCopyOption.REPLACE_EXISTING);
            return fileName;
        }
        catch (IOException ex){
            throw new RuntimeException("could not store file"+fileName+".Please try again!",ex);
        }
    }
}
