package com.mora.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.mora.models.domain.Usuario;

@Component
public class UsuarioValidador implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return Usuario.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // Se comentó la linea de abajo pq se creó una anotación que las validara
        // Usuario usuario = (Usuario) target;
        // NotEmpty.usuario.nombre viene de los messages.properties. Este se conecta directamente con el mensaje que hay alli
        // importante es no ponerle el mensaje directamente aqui. PD: NotEmpty.usuario.nombre es el estandar pero si lo 
        // personalisamos de esta manera se pudo poner otro que nosotros quisieramos
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "NotEmpty.usuario.nombre");
        
        // Esto no es necesario de hacerlo, es solamente otra manera pero es la misma de arriba. Pero la de arriba es mas corta
        // if(usuario.getNombre().isEmpty()){
        //     errors.rejectValue("nombre", "NotEmpty.usuario.nombre");
        // }

        // Se comentó las 3 lineas de abajo pq se creó una anotación que las validara
        // if(!(usuario.getIdentificador().matches( "^\\d{1,3}\\.\\d{3}\\.\\d{3}-[A-Z]$"))){
        //     errors.rejectValue("identificador", "Pattern.usuario.identificador");
        // }
    }
    
}
