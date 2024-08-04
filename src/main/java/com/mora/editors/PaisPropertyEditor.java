package com.mora.editors;

import java.beans.PropertyEditorSupport;

import org.springframework.stereotype.Component;

import com.mora.services.PaisService;

@Component
public class PaisPropertyEditor extends PropertyEditorSupport{

    private final PaisService paisService;

    PaisPropertyEditor(PaisService paisService) {
        this.paisService = paisService;
    }

    @Override
    public void setAsText(String id) throws IllegalArgumentException {
        this.setValue(paisService.obtenerPaisPorId(Integer.parseInt(id)));
    }
    
    
}
