/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Johan Hernandez
 */
@Entity
@Table(name = "producto")
public class ProductoEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nombre_producto", nullable = false)
    private String nombreProducto;
    
    @Column(name = "precio", nullable = false)
    private Double precio;
    
    @ManyToOne
    @JoinColumn(name = "factura_id")
    private FacturaEntity factura;
    
    public ProductoEntity(){
    }
    
    public ProductoEntity(String nombreProducto, Double Precio){
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public FacturaEntity getFactura() {
        return factura;
    }

    public void setFactura(FacturaEntity factura) {
        this.factura = factura;
    }
    
    
    
    
}
