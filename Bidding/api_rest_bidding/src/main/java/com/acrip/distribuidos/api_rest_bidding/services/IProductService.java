package com.acrip.distribuidos.api_rest_bidding.services;

import com.acrip.distribuidos.api_rest_bidding.models.ProductEntity;

public interface IProductService {
    public ProductEntity create(ProductEntity prmProduct);
    public ProductEntity findById(Integer prmCod);
}
