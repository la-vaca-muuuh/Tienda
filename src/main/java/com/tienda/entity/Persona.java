package com.tienda.entity;


import java.io.Serializable;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="personas")

public class Persona implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private long id;
    private String apelido1;
    private String apellido2;
    private String telefono;
    private String email;
    
    @ManyToOne
    @JoinColumn(name="paises_id")
    
    private Pais pais;

    public long getId() {
        return id;
    }

    public String getApelido1() {
        return apelido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Pais getPais() {
        return pais;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setApelido1(String apelido1) {
        this.apelido1 = apelido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    
    

}