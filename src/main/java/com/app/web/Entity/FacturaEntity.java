/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.web.Entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Johan Hernandez
 */
@Entity
@Table(name = "factura")
public class FacturaEntity {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nombre", nullable = false)
    private String nombreCliente;
    
    @Column(name = "cedula", nullable = false)
    private String cedulaCliente;
   
    @OneToMany
    @JoinColumn(name = "producto_id")
    private List<ProductoEntity> productos;
    
    public FacturaEntity(){
    }
    
    public FacturaEntity(String nombreCliente, String cedulaCliente){
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
    }

    public Integer getId() {
        return id;
    }


    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public List<ProductoEntity> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoEntity> productos) {
        this.productos = productos;
    }
    
    
    
    
}
