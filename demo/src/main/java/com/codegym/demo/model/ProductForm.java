package com.codegym.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductForm {
    private Long id;
    private String name;
    private double price;
    private String description;
    private MultipartFile img;

}
