/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.experiencia.entidades;

/**
 *
 * @author Facundo
 */
public enum Usabilidad {
    
    CAPENTENDIDO("Capacidad de ser entendido"),
    CAPOPERADO("Capacidad de ser operado"),
    CAPATRACTIVO("Capacidad de ser atractivo para el usuario");
    
    private String atributo;

    private Usabilidad(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
}
