package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/upload")
public class FileUploadController {

//    @Autowired

    public static String uploadDirectory = System.getProperty("user.dir") + "/uploads";

    @GetMapping("")
    public String UploadPage(){
        return "uploadview";
    }

    @PostMapping("/files")
    public String upload(Model model, @RequestParam("files") MultipartFile[] files) throws IOException{

        //todo 아무 값도 안들어왔을때 처리 필요 / (jsp에서 자바스크립트 처리?)

        StringBuilder fileNames = new StringBuilder();
        for (MultipartFile file : files) {
            Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
            fileNames.append(file.getOriginalFilename()+" ");
            try {
                Files.write(fileNameAndPath, file.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        model.addAttribute("msg", "Successfully uploaded files : " + fileNames.toString());
        return "uploadstatusview";

    }
}
