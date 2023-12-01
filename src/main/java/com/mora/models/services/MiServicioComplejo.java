package com.mora.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Se le puede dar nombres a los componentes y anotaciones para reconocerlas en caso de que spring no sepa diferenciar una de la otra o hayan confuciones
@Component("miServicioComplejo")
// @Service // Seria mejor @Service pero por ahora lo vamos a dejar como
// component
@Primary
public class MiServicioComplejo implements IService {
    public String operacion() {
        return "ejecutando algun proceso importante complicado...";
    }
}
