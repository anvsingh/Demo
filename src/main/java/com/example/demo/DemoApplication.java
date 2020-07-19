package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    @Bean
    Docket swaggerConfiguration() {
        //return a instance of docket
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/*"))
                .apis(RequestHandlerSelectors.basePackage("com.example"))
                .build()
                .apiInfo(apiDetails());
    }
    private ApiInfo apiDetails(){
        return new ApiInfo(
                "Learning Swagger",
                "Learning Swagger2",
                "1.0",
                "Still learning",
                 new springfox.documentation.service.Contact("Anuj Veer Singh","github.com/anujvs","anujveersingh@gmail.com"),
                "Learning InteliJ",
                "github.com/anujvs",
                Collections.emptyList());
    }

}
