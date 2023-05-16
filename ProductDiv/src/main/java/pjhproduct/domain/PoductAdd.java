package pjhproduct.domain;

import java.util.*;
import lombok.*;
import pjhproduct.domain.*;
import pjhproduct.infra.AbstractEvent;

@Data
@ToString
public class PoductAdd extends AbstractEvent {

    private Long id;
    private String productNo;
    private String productName;
    private String productStandard;
    private MaterialId materialId;
    private ProcessId processId;
    private List<ProductDetail> productDetail;

    public PoductAdd(Product aggregate) {
        super(aggregate);
    }

    public PoductAdd() {
        super();
    }
}
