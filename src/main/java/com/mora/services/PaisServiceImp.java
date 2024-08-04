package com.mora.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mora.models.domain.Pais;

@Service
public class PaisServiceImp implements PaisService {

    private List<Pais> listaDePaises;

    public PaisServiceImp() {
        this.listaDePaises = List.of(
                new Pais(1, "ES", "España"),
                new Pais(2, "CO", "Colombia"),
                new Pais(3, "DE", "Alemania"),
                new Pais(4, "PE", "Peru"));

    }

    @Override
    public List<Pais> listaPaisesClase() {
        return listaDePaises;
    }

    @Override
    public Pais obtenerPaisPorId(Integer id) {
        return this.listaDePaises.stream()
                .filter(pais -> pais.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
