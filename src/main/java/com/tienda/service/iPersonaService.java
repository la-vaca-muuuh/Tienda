package com.tienda.service;

import com.tienda.entity.Persona;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface iPersonaService {
    public List<Persona> getAllPerson();
    public void savePersona (Persona persona);
    public Persona getPersonaById (long id);
    public void delete(long id);
    public Persona findByNombre(String nombre);
}
