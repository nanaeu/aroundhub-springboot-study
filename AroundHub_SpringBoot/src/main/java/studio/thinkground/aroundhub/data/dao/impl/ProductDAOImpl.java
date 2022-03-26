package studio.thinkground.aroundhub.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studio.thinkground.aroundhub.data.dao.ProductDAO;
import studio.thinkground.aroundhub.data.entity.Product;
import studio.thinkground.aroundhub.data.repository.ProductRepository;

@Service
public class ProductDAOImpl implements ProductDAO {

    ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public Product getProduct(String productId) {
        Product product = productRepository.getById(productId);
        return product;
    }
}