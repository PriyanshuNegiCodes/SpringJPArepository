package com.example.C2Sprint1Demowork.Services;

import com.example.C2Sprint1Demowork.Domain.Product;

import java.util.List;

public interface IProductService {
    public Product saveProduct(Product product);
    List<Product> getProducts();
    public boolean deleteProduct(int ProductId);
    public Product updateProduct(Product product, int ProductId);
    public Product getProductById(int productId);
    public List<Product> getProductByName(String name);
}
