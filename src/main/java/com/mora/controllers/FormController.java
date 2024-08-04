package com.mora.controllers;

import com.mora.editors.NombreMayusculaEditor;
import com.mora.editors.PaisPropertyEditor;
import com.mora.models.domain.Pais;
import com.mora.models.domain.Usuario;
import com.mora.services.PaisService;
import com.mora.validation.UsuarioValidador;

import jakarta.validation.Valid;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("usuario") 
public class FormController {

    private final UsuarioValidador usuarioValidador;

    private PaisService paisService;

    private final PaisPropertyEditor paisPropertyEditor;

    FormController(UsuarioValidador usuarioValidador, PaisService paisService, PaisPropertyEditor paisPropertyEditor) {
        this.usuarioValidador = usuarioValidador;
        this.paisService = paisService;
        this.paisPropertyEditor = paisPropertyEditor;
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(usuarioValidador);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
        binder.registerCustomEditor(String.class, new NombreMayusculaEditor());
        binder.registerCustomEditor(Pais.class, "paisClase", paisPropertyEditor);
    }

    @GetMapping("/form")
    public String form(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("John");
        usuario.setApellido("Doe");
        usuario.setIdentificador("123.456.789-K");
        model.addAttribute("titulo", "Formulario Usuarios");
        model.addAttribute("usuario", usuario);
        return "form";
    }

    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model, SessionStatus status) {
        model.addAttribute("titulo", "Resultado Form");
        if (result.hasErrors()) {
            return "form";
        }
        model.addAttribute("usuario", usuario);
        status.setComplete();
        return "resultado";
    }

    @ModelAttribute("paises")
    public List<String> paises() {
        return Arrays.asList("Colombia", "Chile", "Alemania", "Japón", "Andorra");
    }

    @ModelAttribute("paisesMap")
    public Map<String, String> paisesMap() {
        Map<String, String> paises = new HashMap<>();
        paises.put("ES", "España");
        paises.put("CO", "Colombia");
        paises.put("DE", "Alemania");
        paises.put("PE", "Peru");

        return paises;
    }

    @ModelAttribute("listaPaisesClase")
    public List<Pais> listaPaisesClase() {
        return paisService.listaPaisesClase();
    }
}
