package com.mora.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mora.models.domain.Usuario;

@Controller
public class FormController {
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("titulo", "Formulario Usuarios");
        return "form";
    }

    @PostMapping("/form")
    public String procesar(Model model,
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam(value = "E-Mail") String email) {

        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setPassword(password);
        usuario.setEmail(email);

        model.addAttribute("titulo", "Resultado Form");
        // model.addAttribute("username", username);
        // model.addAttribute("password", password);
        // model.addAttribute("email", email);
        model.addAttribute("usuario", usuario);

        return "resultado";
    }
}
