package com.example.demo.config;



/**
 * @author ：Lh
 * @date ：Created in 2019/7/24 0024 15:35
 * @description：${description}
 * @modified By：
 * @version: $version$
 */

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
 *  Swagger2的接口配置
 * @Author zzl
 * @create 2019/4/29 0029 14:13
 */


@Configuration
@EnableSwagger2
/**
 * 测试环境开启swagger
 */
public class SwaggerConfig{

    /**
     * 创建API
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                // 详细定制
                .apiInfo(apiInfo())
                .select()
                // 指定当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.contoller"))
                // 扫描所有 .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 添加摘要信息
     */
    private ApiInfo apiInfo() {
        // 用ApiInfoBuilder进行定制
        return new ApiInfoBuilder()
                .title("昊哥后台开发文档")
                .description("随便写写")
                .version("版本号:1.0.0")
                .build();
    }
}
