package org.amuji.ninjainventoryservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public List<Product> listProducts() {
        return IntStream.rangeClosed(1, 10).boxed()
                .map(i -> new Product("id" + i, "Product" + i, "Manufacture" + i, "Vendor" + 1))
                .collect(toList());
    }
}
