package pjhproduct.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pjhproduct.ProductDivApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductDivApplication.class })
public class CucumberSpingConfiguration {}
