package pjhproduct.domain;

import java.util.*;
import lombok.*;
import pjhproduct.domain.*;
import pjhproduct.infra.AbstractEvent;

@Data
@ToString
public class MaterialAdd extends AbstractEvent {

    private Long id;
    private String name;

    public MaterialAdd(Material aggregate) {
        super(aggregate);
    }

    public MaterialAdd() {
        super();
    }
}
