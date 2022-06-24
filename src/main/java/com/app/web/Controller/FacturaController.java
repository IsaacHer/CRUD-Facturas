/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.Controller;

import com.app.web.Service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Johan Hernandez
 */
@Controller
public class FacturaController {
    
    @Autowired
    private FacturaService facturaService;
    
    @GetMapping({"/facturas", "/"})
    public String listarFacturas(Model modelo){
        modelo.addAttribute("facturas", facturaService.listarFacturas());
        return "facturas";
    }
}
