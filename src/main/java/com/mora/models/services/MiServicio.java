package com.mora.models.services;

import org.springframework.stereotype.Component;

@Component("miServicioSimple")
public class MiServicio implements IService {
    public String operacion() {
        return "ejecutando algún proceso importante simple...";
    }
}
