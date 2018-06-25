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
public enum Eficiencia {
    
    RECURSOS("Utilizacion de recursos"),
    COMPORTAMIENTO("Comportamiento en el tiempo");
    
    private String atributo;

    private Eficiencia(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
}
