package com.example.demo;

import com.example.demo.controller.FileUploadController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.io.File;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(DemoApplication.class, args);
	}
}
