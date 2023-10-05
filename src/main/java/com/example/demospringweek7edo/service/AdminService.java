package com.example.demospringweek7edo.service;

import com.example.demospringweek7edo.dto.ProductDto;
import com.example.demospringweek7edo.model.Admin;
import com.example.demospringweek7edo.model.Products;
import com.example.demospringweek7edo.repository.AdminRepository;
import com.example.demospringweek7edo.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AdminService {
    private final AdminRepository adminRepository;
    private final ProductRepo productRepo;


    public ResponseEntity<Products> addProduct(ProductDto productDto){
        Products newProduct = new Products();
        newProduct.setName(productDto.getName());
        newProduct.setDescription(productDto.getDescription());
        newProduct.setAmount(productDto.getAmount());

        Products savedProduct = productRepo.save(newProduct);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    public ResponseEntity<Products> getProduct(Long id){
        Products products = productRepo.findById(id).orElseThrow(()-> new RuntimeException("Product requested not in stock"));
        return new ResponseEntity<>(products,HttpStatus.OK);
    }

    public String deleteProduct(Long id){
         productRepo.deleteById(id);
         return deleteProduct(id);
    }
}
