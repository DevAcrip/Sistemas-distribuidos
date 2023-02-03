package com.acrip.distribuidos.api_rest_bidding.repositories;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.acrip.distribuidos.api_rest_bidding.models.ProductEntity;

@Service
public class ProductRepository {
    private ArrayList<ProductEntity> productsList;

    public ProductRepository() {
        this.productsList = new ArrayList<ProductEntity>();
        loadProducts();
    }

    private void loadProducts() {
        ProductEntity objProduct1 = new ProductEntity(1, "Cuadro Mona Lisa", 81000000);
        ProductEntity objProduct2 = new ProductEntity(2, "La ultima cena", 72000000);
        ProductEntity objProduct3 = new ProductEntity(3, "Arte abstracto", 56000000);
        ProductEntity objProduct4 = new ProductEntity(4, "Lotus Elise", 99000000);
        this.productsList.add(objProduct1);
        this.productsList.add(objProduct2);
        this.productsList.add(objProduct3);
        this.productsList.add(objProduct4);
    }

    public ProductEntity create(ProductEntity prmProduct){
        return this.productsList.add(prmProduct) ? prmProduct : null;
    }

    public ProductEntity findById(Integer prmCod) {
        return productsList.stream().filter(product -> product.getCodigo() == prmCod).findFirst().orElse(null);
    }
}
