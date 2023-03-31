package com.example.C2Sprint1Demowork.Controller;

import com.example.C2Sprint1Demowork.Domain.Product;
import com.example.C2Sprint1Demowork.Services.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")

public class ProductController {
    ProductServiceImp productServiceImp;
    @Autowired
    //http://localhost:65500/api/v1/add-user this is the post link for the json
    //the base url is upto 65500 , api/v1 is the url of the contorller and add-user is the url of the class
    public ProductController(ProductServiceImp productServiceImp) {
        this.productServiceImp = productServiceImp;
    }
    @PostMapping("/product")
    public ResponseEntity<?> saveProduct(@RequestBody Product product){

        return new ResponseEntity<>(productServiceImp.saveProduct(product), HttpStatus.CREATED);
    }
    //http://localhost:65500/api/v1/products


    @GetMapping("/products")
    public ResponseEntity<?> getAllProducts() {
        return new ResponseEntity<>(productServiceImp.getProducts(), HttpStatus.OK);
    }
    //htttp://localhost:65500/api/v1/delete-user/{id}
    @DeleteMapping("/delete-user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int Id){
        return new ResponseEntity<>(productServiceImp.deleteUser(Id), HttpStatus.OK);
    }
//    http://localhost:66550/api/v1/update-product/{id}
    @PutMapping("/updateProduct/{id}")
    public ResponseEntity updateProduct(@RequestBody Product product, @PathVariable int id){
        return new ResponseEntity(productServiceImp.updateProduct(product,id ), HttpStatus.OK);
    }

}
