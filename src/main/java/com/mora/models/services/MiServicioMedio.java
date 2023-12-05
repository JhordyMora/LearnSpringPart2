package com.mora.models.services;

public class MiServicioMedio implements IService {

    @Override
    public String operacion() {
        return "Mi servicio medio que no usa ninguna anotacion pero si con bean y configuration";
    }

}
