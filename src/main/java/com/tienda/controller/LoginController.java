package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping ({"/","/login"})
    public String index(){
        return "login";
        
    }    
}

//esto es para abrir una pagina en especifico primero