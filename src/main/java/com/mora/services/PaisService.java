package com.mora.services;

import java.util.List;

import com.mora.models.domain.Pais;


public interface PaisService {
    public List<Pais> listaPaisesClase();
    public Pais obtenerPaisPorId(Integer id);
}
