package com.example.wwwul.practicapuntosdeinteres;

/**
 * Created by wwwul on 27/01/2016.
 */
public class PuntoInteres {

    private int titulo;
    private int descripcion;
    private int imagen;

    public PuntoInteres(int titulo, int descripcion, int imagen) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public int getTitulo() {
        return titulo;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public int getImagen() {
        return imagen;
    }


}
