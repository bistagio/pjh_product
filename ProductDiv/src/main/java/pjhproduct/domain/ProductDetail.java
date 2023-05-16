package pjhproduct.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetail {

    private String name;

    private String customer;

    private String description;
}
