package com.mora.models.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Usuario {

    // @Pattern(regexp = "^\\d{1,3}\\.\\d{3}\\.\\d{3}-[A-Z]$", message = "El patron del identificador es incorrecto")
    // se comento para hacerlo con la clase validation
    private String identificador;

    // @NotEmpty(message = "El atributo no puede estar vacio")// este campo no va a salir de esta manera pq hay un messages.properties con reescribiendo esta anotacion y las demas 
    // se comento para hacerlo con la clase validation
    private String nombre;

    @NotEmpty(message = "El atributo no puede estar vacio")// este campo no va a salir de esta manera pq hay un messages.properties con reescribiendo esta anotacion y las demas 
    private String apellido;

    @NotEmpty(message = "El atributo no puede estar vacio")// este campo no va a salir de esta manera pq hay un messages.properties con reescribiendo esta anotacion y las demas 
    @Size(min = 3, max = 8, message = "La longitud del username debe de ser de minimo 3 hasta un maximo de 8 caracteres")// size se usa para validar longitudes de string, si se quiere validar numeros se usa @min y @max
    private String username;

    @NotEmpty(message = "El atributo no puede estar vacio")// este campo no va a salir de esta manera pq hay un messages.properties con reescribiendo esta anotacion y las demas 
    private String password;

    @NotEmpty(message = "El atributo no puede estar vacio")// este campo no va a salir de esta manera pq hay un messages.properties con reescribiendo esta anotacion y las demas 
    @Email(message = "Correo con formato incorrecto")
    private String email;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

}
