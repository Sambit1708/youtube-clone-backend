package com.youtube.controller;

import com.youtube.services.FileUploader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/s3")
public class S3Controller {

    private FileUploader fileUploader;

    public S3Controller(FileUploader fileUploader) {
        this.fileUploader = fileUploader;
    }

    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(@RequestParam MultipartFile file) {
        return ResponseEntity.ok(fileUploader.uploadFile(file));
    }
}
