package com.acrip.distribuidos.api_rest_bidding.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.acrip.distribuidos.api_rest_bidding.models.ProductEntity;
import com.acrip.distribuidos.api_rest_bidding.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService{
    @Autowired
    private ProductRepository DBAccessService;

    @Override
    public ProductEntity create(ProductEntity prmProduct) {
        return this.DBAccessService.create(prmProduct);
    }

    @Override
    public ProductEntity findById(Integer prmCod) {
        return this.DBAccessService.findById(prmCod);
    }
    
}
