package studio.thinkground.aroundhub.data.handler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import studio.thinkground.aroundhub.data.dao.ProductDAO;
import studio.thinkground.aroundhub.data.entity.Product;
import studio.thinkground.aroundhub.data.handler.ProductDataHandler;

@Service
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler {

    ProductDAO productDAO;

    @Autowired
    public ProductDataHandlerImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public Product saveProductEntity(String productId, String productName, int productPrice,
                                     int productStock) {
        Product product = new Product(productId, productName, productPrice,
                productStock);

        return productDAO.saveProduct(product);
    }

    @Override
    public Product getProductEntity(String productId) {
        return productDAO.getProduct(productId);
    }
}