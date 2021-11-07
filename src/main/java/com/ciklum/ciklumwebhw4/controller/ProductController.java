package com.ciklum.ciklumwebhw4.controller;

import com.ciklum.ciklumwebhw4.domain.Product;
import com.ciklum.ciklumwebhw4.service.ProductService;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

//@Controller
@RequestMapping("")
public class ProductController {


    private ProductService productService;

//    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public String showPanoramaForm(Product product) {
        return "add-product";
    }

    @PostMapping("/add")
    public String addPanorama(Product product, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-product";
        }
        productService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/products")
    public String showPersonList(Model model) {
        model.addAttribute("productList", productService.getAll());
        return "products";
    }

    @PostMapping("/edit/{id}")
    public void addAndUpdate(@RequestBody Product product) {
       productService.save(product);
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable String id, Model model) {
        int idForDeletion = Integer.parseInt(id);
       productService.delete(idForDeletion);
        return "redirect:/products";
    }
}
