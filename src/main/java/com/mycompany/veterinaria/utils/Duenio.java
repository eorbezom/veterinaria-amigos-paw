
package com.mycompany.veterinaria.utils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Duenio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    // atributos
    private int idDuenio;
    private  String nombre;
    private int celDuenio;
    private String observaciones;
    
    //constructores
    public Duenio() {
        
    }

    public Duenio(int idDuenio, String nombre, int celDuenio, String observaciones) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
        this.observaciones = observaciones;
    }
    
    

    //metodos

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(int celDuenio) {
        this.celDuenio = celDuenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
