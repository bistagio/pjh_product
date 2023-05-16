package pjhproduct.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import pjhproduct.ProductDivApplication;
import pjhproduct.domain.PoductAdd;

@Entity
@Table(name = "Product_table")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productNo;

    private String productName;

    private String productStandard;

    @Embedded
    private MaterialId materialId;

    @Embedded
    private ProcessId processId;

    @ElementCollection
    private List<ProductDetail> productDetail;

    @PostPersist
    public void onPostPersist() {
        PoductAdd poductAdd = new PoductAdd(this);
        poductAdd.publishAfterCommit();
    }

    public static ProductRepository repository() {
        ProductRepository productRepository = applicationContext()
            .getBean(ProductRepository.class);
        return productRepository;
    }

    public static ApplicationContext applicationContext() {
        return ProductDivApplication.applicationContext;
    }
}
