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
public enum Mantenibilidad {
    
    ANALIZADO("Capacidad del codigo para ser analizado"),
    CAMBIADO("Capacidad del codigo para ser cambiado"),
    ESTABILIDAD("Estabilidad");
    
    private String atributo;

    private Mantenibilidad(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
}
