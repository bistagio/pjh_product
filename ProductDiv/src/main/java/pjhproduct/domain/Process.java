package pjhproduct.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import pjhproduct.ProductDivApplication;
import pjhproduct.domain.ProcessAdd;

@Entity
@Table(name = "Process_table")
@Data
public class Process {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @PostPersist
    public void onPostPersist() {
        ProcessAdd processAdd = new ProcessAdd(this);
        processAdd.publishAfterCommit();
    }

    public static ProcessRepository repository() {
        ProcessRepository processRepository = applicationContext()
            .getBean(ProcessRepository.class);
        return processRepository;
    }

    public static ApplicationContext applicationContext() {
        return ProductDivApplication.applicationContext;
    }
}
