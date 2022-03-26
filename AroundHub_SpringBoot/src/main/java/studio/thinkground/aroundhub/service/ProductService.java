package studio.thinkground.aroundhub.service;

import studio.thinkground.aroundhub.data.dto.ProductDto;

public interface ProductService {
    // loosely-coupling

    ProductDto saveProduct(String productId, String productName, int productPrice, int productStock);

    ProductDto getProduct(String productId);

}