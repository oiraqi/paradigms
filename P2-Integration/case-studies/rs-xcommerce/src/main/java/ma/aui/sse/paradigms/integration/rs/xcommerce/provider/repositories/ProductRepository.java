package ma.aui.sse.paradigms.integration.rs.xcommerce.provider.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.aui.sse.paradigms.integration.rs.xcommerce.provider.entities.Product;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
