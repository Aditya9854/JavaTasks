package com.sb.main.controller;

import com.sb.main.dto.FileResponse;
import com.sb.main.service.FileStorageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
}
