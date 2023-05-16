package pjhproduct.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjhproduct.domain.*;

@RestController
// @RequestMapping(value="/products")
@Transactional
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PutMapping("/products/search/findByMaterialOrProcess")
    public Object findByMaterialOrProcess(@RequestBody ProductViewQuery query) {
        return productRepository.findByMaterialOrProcess(
            query.getMaterial(),
            query.getProcess()
        );
    }
}
