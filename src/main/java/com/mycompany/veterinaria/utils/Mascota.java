
package com.mycompany.veterinaria.utils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    //atributos
    private String nombre;
    private String raza;
    private String color;
    private boolean alergia;
    private boolean atencionEspecial;
    private  int numCliente;
    private  String observaciones;
    
    @ManyToOne
    
    private  Duenio cliente;
//CONSTRUCTORES 
    public Mascota() {
    }

    public Mascota(String nombre, String raza, String color, boolean alergia, boolean atencionEspecial, int numCliente, String observaciones, Duenio cliente) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergia = alergia;
        this.atencionEspecial = atencionEspecial;
        this.numCliente = numCliente;
        this.observaciones = observaciones;
        this.cliente = cliente;
    }
//METODOS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlergia() {
        return alergia;
    }

    public void setAlergia(boolean alergia) {
        this.alergia = alergia;
    }

    public boolean isAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(boolean atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getCliente() {
        return cliente;
    }

    public void setCliente(Duenio cliente) {
        this.cliente = cliente;
    }
    
    
            
    
}    
