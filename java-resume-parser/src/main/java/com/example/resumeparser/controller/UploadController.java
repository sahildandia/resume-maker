package com.example.resumeparser.controller;

import com.example.resumeparser.dto.UploadResponse;
import com.example.resumeparser.service.parsing.ResumeParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/upload")
public class UploadController {

    @Autowired
    private ResumeParserService resumeParserService;

    @PostMapping
    public ResponseEntity<UploadResponse> uploadResume(@RequestParam("file") MultipartFile file) {
        UploadResponse response = resumeParserService.parseResume(file);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}