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
public enum Puntos {
    MALA(0),
    REGULAR(3),
    BUENA(5);
    
    private int puntos;

    private Puntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
}
