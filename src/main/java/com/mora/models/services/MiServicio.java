package com.mora.models.services;

import org.springframework.stereotype.Component;

@Component
// @Service // Seria mejor @Service pero por ahora lo vamos a dejar como
// component
public class MiServicio implements IService {
    public String operacion() {
        return "ejecutando algun proceso importante ...";
    }
}
