package com.hmall.cart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Shihaohu
 * @date 2024/8/21 12:49
 */
@Configuration
public class RemoteCallConfig {
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
