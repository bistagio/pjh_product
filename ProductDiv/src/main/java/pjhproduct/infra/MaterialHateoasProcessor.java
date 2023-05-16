package pjhproduct.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import pjhproduct.domain.*;

@Component
public class MaterialHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Material>> {

    @Override
    public EntityModel<Material> process(EntityModel<Material> model) {
        return model;
    }
}
