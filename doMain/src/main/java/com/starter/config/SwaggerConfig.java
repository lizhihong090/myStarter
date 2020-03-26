package com.starter.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Auther: li zhihong
 * @Date: 2020/3/13 4:51 PM
 */
@Configuration
@EnableSwagger2
@ConditionalOnProperty(prefix = "guns", name = "swagger-open", havingValue = "true")
public class SwaggerConfig {
    @Bean
    public Docket createRestV2Api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo2())
                .groupName("v2")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mycom.lzh.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo2() {
        return new ApiInfoBuilder()
                .title("DEMO v2 API Doc")
                .description("DEMO REST API文档")
                .version("2.0")
                .build();
    }
}
