package com.experiencia.entidades;

/**
 *
 * @author Facundo
 */
public enum Funcionalidad {
    
    SEGURIDAD("Seguridad de Acceso"),
    EXACTITUD("Exactitud de los resultados");
    
    private String atributo;

    private Funcionalidad(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

}
