package com.mora.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("miServicioComplejo")
@Primary
public class MiServicioComplejo implements IService {
    public String operacion() {
        return "ejecutando algún proceso importante complicado...";
    }
}
