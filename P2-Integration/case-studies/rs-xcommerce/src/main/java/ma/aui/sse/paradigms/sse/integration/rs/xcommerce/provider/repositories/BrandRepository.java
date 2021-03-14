package ma.aui.sse.paradigms.sse.integration.rs.xcommerce.provider.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.aui.sse.paradigms.sse.integration.rs.xcommerce.provider.entities.Brand;

@RepositoryRestResource
public interface BrandRepository extends CrudRepository<Brand, Long> {
    
}
