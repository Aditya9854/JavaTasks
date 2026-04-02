package com.sb.main.controller;

import com.sb.main.dto.FileResponse;
import com.sb.main.service.FileStorageService;
import org.springframework.core.io.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("/api/files")
public class FileController {

    private final FileStorageService fileStorageService;

    public FileController(FileStorageService fileStorageService)
    {
        this.fileStorageService = fileStorageService;
    }

    @PostMapping("/upload")
    public ResponseEntity<FileResponse> uploadFile(@RequestParam("file")MultipartFile file)
    {
        if (file.isEmpty())
        {
            return ResponseEntity.badRequest().body(new FileResponse(null,null,0,"File is Empty"));

        }
        try {
            String fileName = fileStorageService.storeFile(file);

            FileResponse response = new FileResponse(
                    fileName,
                    file.getContentType(),
                    file.getSize(),
                    "File uploaded Successfully!"
            );
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        catch (RuntimeException e)
        {
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED)
                    .body(new FileResponse(file.getOriginalFilename(),null,0,e.getMessage()));
        }

    }

    @GetMapping("/download/{fileName:.+}")
    public ResponseEntity<Resource>downloadFile(@PathVariable String fileName, HttpServletRequest request) throws FileNotFoundException {
        Resource resource = fileStorageService.loadFileAsResponse(fileName);
        String contentType = request.getServletContext().getMimeType(resource.getFilename());

        if (contentType == null) contentType = "application/octet-stream";

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename=\""+resource.getFilename()+"\"")
                .body(resource);
    }
}
