package com.mora.controllers;

import com.mora.models.domain.Usuario;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Controller
public class FormController {
    @GetMapping("/form")
    public String form(Model model) {
        Usuario usuario = new Usuario();
        model.addAttribute("titulo", "Formulario Usuarios");
        model.addAttribute("usuario", usuario);
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


    // @Valid hace una validacion del objeto usario con las anotaciones que se pusieron dentro de la clase Usuario
    // (ej. @NotNull)
    // BindingResult se usa para confirmar si la validacion es correcta o no, siempre va despues de @Valid (o del
    // objeto que queramos validar)
    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model) {

        model.addAttribute("titulo", "Resultado Form");
        if (result.hasErrors()) {
            Map<String, String> errores = new HashMap<>();
            result.getFieldErrors()
                    .forEach(err -> errores.put(err.getField(),
                                                "El Campo ".concat(err.getField().concat(" ").concat(
                                                        Objects.requireNonNull(err.getDefaultMessage())))));
            model.addAttribute("error", errores);
            return "form";
        }
        model.addAttribute("usuario", usuario);
        return "resultado";
    }

}
