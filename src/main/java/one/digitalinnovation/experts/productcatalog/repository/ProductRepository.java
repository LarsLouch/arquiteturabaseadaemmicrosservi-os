package one.digitalinnovation.experts.productcatalog.repository;

import one.digitalinnovation.experts.productcatalog.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, Long> {

    List<Product> findAll();

}
