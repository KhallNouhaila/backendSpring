package com.example.product.web;

import com.example.product.entities.Product;
import com.example.product.repositories.ProductRepository1;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductRepository1 pr;

    public ProductController(ProductRepository1 pr) {
        this.pr = pr;
    }
    @CrossOrigin(origins = "http://localhost:4200" )
    @GetMapping(path = "/products")
    public List<Product> listProduct(){
        return pr.findAll();

    }
    @CrossOrigin(origins = "http://localhost:4200" )
    @GetMapping(path = "/products/{id}")
    public Product listProduct(@PathVariable(name="id") Long id){
        return pr.findById(id).get();

    }
    @CrossOrigin(origins = "http://localhost:4200" )
    @PostMapping(path = "/products")
    public Product save(@RequestBody Product product){
        return pr.save(product);
    }
    @CrossOrigin(origins = "http://localhost:4200" )
    @PutMapping(path = "/products/{id}")
    public Product update(@PathVariable(name="id") Long id, @RequestBody Product product){
        product.setId(id);
        return pr.save(product);
    }
    @CrossOrigin(origins = "http://localhost:4200" )
    @DeleteMapping(path = "/products/delete/{id}")
    public void delete(@PathVariable(name="id") Long id){
         pr.deleteById(id);
    }
}
