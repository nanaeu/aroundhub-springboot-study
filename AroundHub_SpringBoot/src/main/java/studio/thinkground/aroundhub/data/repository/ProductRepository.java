package studio.thinkground.aroundhub.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studio.thinkground.aroundhub.data.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}