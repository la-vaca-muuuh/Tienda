package com.tienda.service;

import com.tienda.entity.Pais;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface iPaisService {
    public List <Pais> listCountry();
    
    
}
