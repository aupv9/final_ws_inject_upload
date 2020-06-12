package com.example.ws.api_ws_final.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class MyUploadForm {
    private String description;
    private MultipartFile[] fileDatas;
}
