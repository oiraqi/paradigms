package ma.aui.sse.paradigms.sse.integration.rs.xcommerce.provider.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.aui.sse.paradigms.sse.integration.rs.xcommerce.provider.entities.Category;

@RepositoryRestResource
public interface CategoryRepository extends CrudRepository<Category, Long> {
    
}
