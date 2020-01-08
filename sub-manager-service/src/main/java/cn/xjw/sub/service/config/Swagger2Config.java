package cn.xjw.sub.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Configuration：指定当前类是一个配置文件
 * @EnableSwagger2：开启 swagger2 功能
 * @Profile({"local"})：指定特定环境才加载，可以写多个; 接口测试一般只对local/dev/sit/uat 这些环境开放，生产(prod)一般是禁用的
 * 多个参考：@Profile({"local", "dev"})
 */
@Configuration
@EnableSwagger2
@Profile("local")
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                // 选择哪些路径和api会生成document
                .select()
                // 可以指定扫描全部包
                // .apis(RequestHandlerSelectors.any())
                // 指定api需要扫描的包
                .apis(RequestHandlerSelectors.basePackage("cn.xjw.sub.service.controller"))
                // 对所有路径进行监控
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        // 标题、版本号、描述信息等信息
        return new ApiInfoBuilder()
                .title("Spring Boot 学习")
                .description("学习到的知识若不能很好的形成文档，久而久之就忘了曾经是否有那么回事")
                .termsOfServiceUrl("https://github.com/TonyStonem")
                .version("1.0.0.0")
                .build();
    }
}