package com.acrip.distribuidos.api_rest_bidding.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.acrip.distribuidos.api_rest_bidding.models.ProductEntity;
import com.acrip.distribuidos.api_rest_bidding.services.IProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    @Autowired
    private IProductService productService;

    @PostMapping("/products")
	public ProductEntity create(@RequestBody ProductEntity prmProduct) {	
		ProductEntity objProduct = null;
		objProduct =  productService.create(prmProduct);
		return objProduct;
	}

    @GetMapping("/products/{prmCod}")
	public ProductEntity show(@PathVariable Integer prmCod) {
		ProductEntity objProduct = null;		
		objProduct = productService.findById(prmCod);		
		return objProduct;
	}

    @GetMapping("/products")
    public List<ProductEntity> index() {
        return productService.findAll();
    }


    //

}
