package com.example.wwwul.practicalistviewpersonalizado;

/**
 * Created by wwwul on 23/01/2016.
 */
public class Titular {

    private String nombre;
    private int recurso;

    Titular(String nombre, int recurso) {
        this.nombre = nombre;
        this.recurso = recurso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRecurso() {
        return recurso;
    }
}
