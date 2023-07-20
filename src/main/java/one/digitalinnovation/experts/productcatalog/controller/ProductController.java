package one.digitalinnovation.experts.productcatalog.controller;

import one.digitalinnovation.experts.productcatalog.model.Product;
import one.digitalinnovation.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product create(@RequestBody Product product) {
        System.out.println(product);
        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> findAll() {
        List<Product> all = new ArrayList<>();
        for(long i=0; i < productRepository.count(); i++) {
            try {
                all.add(productRepository.findById(i).get());
            } catch (Exception e) { }
        }
        return all;
    }

    @GetMapping(value = "/{id}")
    public Optional<Product> findById(@PathVariable Long id) {
        return productRepository.findById(id);
    }
}
