package com.example.wwwul.practicalistview;

/**
 * Created by wwwul on 23/01/2016.
 */
public class Titular {

    private String titulo;
    private String subtitulo;

    public Titular(String titulo, String subtitulo) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getSubtitulo(){
        return subtitulo;
    }
}
