package com.majm.config;

import lombok.AllArgsConstructor;

/**
 * 业务类 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-07-04 17:59
 * @since
 */
@AllArgsConstructor
public class ExampleService {

    private String name;

    private String desc;

    public String desc(){
        return name + ":" + desc;
    }

}
