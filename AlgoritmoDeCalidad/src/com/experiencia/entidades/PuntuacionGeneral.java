/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.experiencia.entidades;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Facundo
 */
public class PuntuacionGeneral {
    private final Map<String,Integer> funcionalidad;
    private final Map<String,Integer> eficiencia;
    private final Map<String,Integer> fiabilidad;
    private final Map<String,Integer> mantenibilidad;
    private final Map<String,Integer> usabilidad;
    private final Map<String,Integer> portabilidad;
    private int sumaTotal;

    public int getSumaTotal() {
        return sumaTotal;
    }
    
    public void sumar(int valor){
        sumaTotal += valor;
    }
    

    public PuntuacionGeneral() {
        funcionalidad = new TreeMap<>();
        funcionalidad.put(Funcionalidad.SEGURIDAD.getAtributo(), 0);
        funcionalidad.put(Funcionalidad.EXACTITUD.getAtributo(), 0);
        
        eficiencia = new TreeMap<>();
        eficiencia.put(Eficiencia.RECURSOS.getAtributo(), 0);
        eficiencia.put(Eficiencia.COMPORTAMIENTO.getAtributo(), 0);
        
        fiabilidad = new TreeMap<>();
        fiabilidad.put(Fiabilidad.TOLFALLOS.getAtributo(),0);
        fiabilidad.put(Fiabilidad.RECUPERACION.getAtributo(),0);
        
        mantenibilidad = new TreeMap<>();
        mantenibilidad.put(Mantenibilidad.ANALIZADO.getAtributo(),0);
        mantenibilidad.put(Mantenibilidad.CAMBIADO.getAtributo(),0);
        mantenibilidad.put(Mantenibilidad.ESTABILIDAD.getAtributo(),0);
        
        usabilidad = new TreeMap<>();
        usabilidad.put(Usabilidad.CAPENTENDIDO.getAtributo(),0);
        usabilidad.put(Usabilidad.CAPOPERADO.getAtributo(),0);
        usabilidad.put(Usabilidad.CAPATRACTIVO.getAtributo(),0);
        
        portabilidad = new TreeMap<>();
        portabilidad.put(Portabilidad.ADAPTABILIDAD.getAtributo(),0);
        portabilidad.put(Portabilidad.INSTALABILIDAD.getAtributo(),0);
    }

    public Map<String, Integer> getFuncionalidad() {
        return funcionalidad;
    }

    public Map<String, Integer> getEficiencia() {
        return eficiencia;
    }

    public Map<String, Integer> getFiabilidad() {
        return fiabilidad;
    }

    public Map<String, Integer> getMantenibilidad() {
        return mantenibilidad;
    }

    public Map<String, Integer> getUsabilidad() {
        return usabilidad;
    }

    public Map<String, Integer> getPortabilidad() {
        return portabilidad;
    }
    
}
