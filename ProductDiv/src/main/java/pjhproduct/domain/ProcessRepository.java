package pjhproduct.domain;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pjhproduct.domain.*;

@RepositoryRestResource(collectionResourceRel = "processes", path = "processes")
public interface ProcessRepository
    extends PagingAndSortingRepository<Process, Long> {
    List<Process> findByName(String name);
}
