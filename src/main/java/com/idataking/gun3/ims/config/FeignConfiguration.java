package com.idataking.gun3.ims.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.idataking.gun3.ims")
public class FeignConfiguration {

}
