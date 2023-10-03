package com.example.demospringweek7edo.controller;

import com.example.demospringweek7edo.dto.ProductDto;
import com.example.demospringweek7edo.model.Products;
import com.example.demospringweek7edo.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/product")
public class AdminController {

    private final AdminService adminService;

    @PostMapping("/post")
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto productDto){
        adminService.addProduct(productDto);
        return  new ResponseEntity<>(productDto, HttpStatus.CREATED);
    }

    @GetMapping("/getProduct/{id}")
    public ResponseEntity<Long> getProducts(@PathVariable Long id){
        adminService.getProduct(id);
        return new ResponseEntity<>(id,HttpStatus.OK);
    }
}
