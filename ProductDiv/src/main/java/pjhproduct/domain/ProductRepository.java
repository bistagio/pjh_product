package pjhproduct.domain;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pjhproduct.domain.*;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository
    extends PagingAndSortingRepository<Product, Long> {
    List<Product> findByMaterialOrProcess(String material, String process);
}
