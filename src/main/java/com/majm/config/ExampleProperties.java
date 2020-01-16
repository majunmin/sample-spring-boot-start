package com.majm.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性类 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-07-04 17:53
 * @since
 */
@Getter
@Setter
@ConfigurationProperties(ExampleProperties.EXAMPLE_PREFIX)
public class ExampleProperties {

    public static final String EXAMPLE_PREFIX = "com.service";

    private String name;

    private String desc;

    private Integer age;

}
