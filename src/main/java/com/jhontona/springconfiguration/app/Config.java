package com.jhontona.springconfiguration.app;

import com.jhontona.springconfiguration.service.Service;
import com.jhontona.springconfiguration.service.ServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("service")
    public Service getService() {
        Service myService = new ServiceImpl();
        System.out.println(myService.hello());
        return myService;
    }
}
