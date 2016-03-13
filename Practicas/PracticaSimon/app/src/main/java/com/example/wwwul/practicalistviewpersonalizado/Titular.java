package com.example.wwwul.practicalistviewpersonalizado;

/**
 * Created by wwwul on 23/01/2016.
 */
public class Titular {

    private String nombre;
    private int recurso;
    private int sonido;

    Titular(String nombre, int recurso, int sonido) {
        this.nombre = nombre;
        this.recurso = recurso;
        this.sonido = sonido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRecurso() {
        return recurso;
    }

    public int getSonido() {
        return sonido;
    }
}
