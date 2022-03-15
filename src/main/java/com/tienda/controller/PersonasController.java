package com.tienda.controller;

import com.tienda.entity.Pais;
import com.tienda.entity.Persona;
import com.tienda.service.iPaisService;
import com.tienda.service.iPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PersonasController {
    @Autowired
    private iPersonaService personaService;
    @Autowired
    private iPaisService paisService;
    
    @GetMapping("/personas")
    public String index(Model model){
        List<Persona> listaPersonas=personaService.getAllPerson();
        model.addAttribute("titulo", "Personas");
        model.addAttribute("personas",listaPersonas);
        return "personas";
    }
    @GetMapping ("/personasN")
    public String crearPersona(Model model){
        List<Pais> listaPais = paisService.listCountry();
        model.addAttribute("persona", new Persona());
        model.addAttribute("paises", listaPais);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona){
        personaService.savePersona(persona);
        return "redirect:/personas";
    }
    @GetMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable("id")Long idPersona){
        personaService.delete(idPersona);
        return "redirect:/personas";
    }
    @GetMapping ("/editPersona/{id}")
    public String editarPersona(@PathVariable("id") Long idPersona, Model model){
        Persona p = personaService.getPersonaById(idPersona);
        List<Pais> listaPais = paisService.listCountry();
        model.addAttribute("persona", p);
        model.addAttribute("paises", listaPais);
        return "crear";
    }
   
}
