package com.mora.models.services;

import org.springframework.stereotype.Component;

// Se le puede dar nombres a los componentes y anotaciones para reconocerlas en caso de que spring no sepa diferenciar una de la otra o hayan confuciones
@Component("miServicioSimple")
// @Service // Seria mejor @Service pero por ahora lo vamos a dejar como
// component
public class MiServicio implements IService {
    public String operacion() {
        return "ejecutando algun proceso importante simple...";
    }
}
