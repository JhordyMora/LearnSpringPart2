package com.mora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mora.models.services.IService;

@Controller
public class IndexController {

    @Autowired
    @Qualifier("miServicioMedio") 
    private IService miServicio;

    @GetMapping({ "/", "", "/index" })
    public String index(Model model) {
        model.addAttribute("objeto", miServicio.operacion());
        return "index";
    }
}