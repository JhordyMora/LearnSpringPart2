package com.mora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mora.models.services.IService;
// import com.mora.models.services.MiServicio;

@Controller
public class IndexController {

    @Autowired
    // private MiServicio miServicio; // = new MiServicio();
    // al implementar un servicio, se puede dar nombres a los componentes para
    // ayudarle a spring a saber cual debe de usar, ademas se pueden usar 2
    // anotaciones
    // 1. @Primary
    // 2. @Qualifier
    @Qualifier("miServicioMedio") // Con esta anotacion aunque haya un bean que
    // implemente el servicio con
    // primary, esta anotacion la va a ignorar y buscar el bean con el nombre que
    // tenga la clase del componente escrito en el qualifier. Tambien se prodria
    // usar solo qualifier estar poniendo el servicio necesario segun sea el caso
    private IService miServicio;

    @GetMapping({ "/", "", "/index" })
    public String index(Model model) {
        model.addAttribute("objeto", miServicio.operacion());
        return "index";
    }

    // Aqui spring boot inyecta el servicio por detras, y el setter lo pasa al
    // atributo de la clase
    // @Autowired
    // public void setMiServicio(IService miServicio) {
    // this.miServicio = miServicio;
    // }
}