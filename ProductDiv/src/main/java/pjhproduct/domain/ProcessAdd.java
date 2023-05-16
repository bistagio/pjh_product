package pjhproduct.domain;

import java.util.*;
import lombok.*;
import pjhproduct.domain.*;
import pjhproduct.infra.AbstractEvent;

@Data
@ToString
public class ProcessAdd extends AbstractEvent {

    private Long id;
    private String name;

    public ProcessAdd(Process aggregate) {
        super(aggregate);
    }

    public ProcessAdd() {
        super();
    }
}
