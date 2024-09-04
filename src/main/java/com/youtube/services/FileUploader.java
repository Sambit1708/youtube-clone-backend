package com.youtube.services;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileUploader {

    String uploadFile(MultipartFile file);

    List<String> allFiles();

    String preSignedUrl(String fileName);
}
