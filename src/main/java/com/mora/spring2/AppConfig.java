package com.mora.spring2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mora.models.services.IService;
import com.mora.models.services.MiServicioMedio;

@Configuration
public class AppConfig {
    @Bean("miServicioMedio")
    public IService llamarServicio() {
        return new MiServicioMedio();
    }
}
