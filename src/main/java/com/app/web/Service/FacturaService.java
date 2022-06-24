/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.Service;

import com.app.web.Entity.FacturaEntity;
import com.app.web.Repository.FacturaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService{

    @Autowired
    FacturaRepository facturaRepository;
    
    
    public List<FacturaEntity> listarFacturas() {
        return facturaRepository.findAll();
    }
        
}
