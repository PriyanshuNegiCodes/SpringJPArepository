package com.example.C2Sprint1Demowork.Services;

import com.example.C2Sprint1Demowork.Domain.Product;
import com.example.C2Sprint1Demowork.Respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements IProductService{

    ProductRepository productRepository;
    //during runtime the spring frame work will generate the class that will implement the ProductRepostory class

    @Autowired
    public ProductServiceImp(ProductRepository productRepository){
        this.productRepository=productRepository;

    }
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public boolean deleteUser(int ProductId) {
        productRepository.deleteById(ProductId);
        return true;
    }

    @Override
    public Product updateProduct(Product product, int ProductId) {
        Optional<Product> checkProduct=productRepository.findById(ProductId);
        if(checkProduct.isEmpty()){
            return null;
        }
        Product existingProduct=checkProduct.get();
        if(product.getName()!=null){
            existingProduct.setProductId(product.getProductId());
        }
        if(product.getDescription()!=null){
            existingProduct.setDescription(product.getDescription());
        }
        if(product.getAmount()!=null){
            existingProduct.setAmount(product.getAmount());
        }
        return productRepository.save(existingProduct);

    }

}
