package com.mora.models.domain;

import java.util.Date;

import com.mora.validation.IdentificadorRegex;
import com.mora.validation.Requerido;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class Usuario {

    @IdentificadorRegex
    private String identificador;

    private String nombre;

    // @NotEmpty(message = "El atributo no puede estar vacío")
    @Requerido
    private String apellido;

    @NotEmpty(message = "El atributo no puede estar vacío")
    @Size(min = 3, max = 8, message = "La longitud del username debe de ser de mínimo 3 hasta un máximo de 8 caracteres")
    private String username;

    @NotEmpty(message = "El atributo no puede estar vacío")
    private String password;
    @NotBlank(message = "El atributo no puede estar vacío")
    @Email(message = "Correo con formato incorrecto")
    private String email;

    @NotNull
    @Min(5)
    @Max(5000)
    private Integer cuenta;

    @NotNull
    // @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past
    private Date fechaNacimiento;

    @NotEmpty
    private String pais;

    @NotEmpty
    private String paisMap;
    
    public String getPaisMap() {
        return paisMap;
    }

    public void setPaisMap(String paisMap) {
        this.paisMap = paisMap;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getCuenta() {
        return cuenta;
    }

    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }

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
