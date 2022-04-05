package com.tienda.service;

import com.tienda.entity.Persona;
import org.springframework.security.core.userdetails.UserDetails;

public class Userprincipal implements UserDetails{
    private Persona Persona;

    public Userprincipal(Persona Persona) {
        this.Persona = Persona;
    }
    
    
   
}
