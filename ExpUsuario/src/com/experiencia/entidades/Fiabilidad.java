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
public enum Fiabilidad {
    
    TOLFALLOS("Tolerancia a fallos"),
    RECUPERACION("Capacidad de recuperacion de errores");
    
    private String atributo;

    private Fiabilidad(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
}
