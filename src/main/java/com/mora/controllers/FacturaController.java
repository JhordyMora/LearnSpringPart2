package com.mora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mora.models.domain.Factura;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping(value = "/factura")
public class FacturaController {
    @Autowired
    Factura factura;

    @GetMapping("/ver")
    public String getMethodName(Model model) {
        model.addAttribute("factura", factura);
        model.addAttribute("titulo", "Ejemplo Factura con inyeccion de dependencia");
        return "factura/ver";
    }

}
