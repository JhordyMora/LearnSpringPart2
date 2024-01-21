package com.mora.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mora.models.domain.Usuario;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class FormController {
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("titulo", "Formulario Usuarios");
        return "form";
    }

    // Esta es una manera valida pero la siguiente manera tambien funcion
    // @PostMapping("/form")
    // public String procesar(Model model,
    // @RequestParam(value = "username", required = true) String username,
    // @RequestParam(value = "password", required = true) String password,
    // @RequestParam(value = "email") String email) {

    // Usuario usuario = new Usuario();
    // usuario.setUsername(username);
    // usuario.setPassword(password);
    // usuario.setEmail(email);

    // model.addAttribute("titulo", "Resultado Form");
    // // model.addAttribute("username", username);
    // // model.addAttribute("password", password);
    // // model.addAttribute("email", email);
    // model.addAttribute("usuario", usuario);

    // return "resultado";
    // }

    // En esta manera java spring boot puede hacer el RequesParam automaticamente si
    // los nombres de los atributos en el html son exactamente iguales a los de la
    // clase que pongamos. En esta caso la clase es Usuario y los atributos de
    // usuario (username, password, email) son iguales a los id de el formulario,
    // por eso el request para se hace automatico
    @PostMapping("/form")
    public String procesar(Usuario usuario, Model model) {

        model.addAttribute("titulo", "Resultado Form");
        model.addAttribute("usuario", usuario);
        return "resultado";
    }

}
