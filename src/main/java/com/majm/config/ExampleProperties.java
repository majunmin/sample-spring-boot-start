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
@ConfigurationProperties("com.service")
public class ExampleProperties {

    private String name;

    private String desc;

}
