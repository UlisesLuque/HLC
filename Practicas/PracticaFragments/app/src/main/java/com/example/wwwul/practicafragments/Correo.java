package com.example.wwwul.practicafragments;

/**
 * Created by wwwul on 17/02/2016.
 */
public class Correo {
    private String de;
    private String asunto;
    private String texto;

    public Correo(String de, String asunto, String texto) {
        this.de = de;
        this.asunto = asunto;
        this.texto = texto;
    }

    public String getDe() {
        return de;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getTexto() {
        return texto;
    }
}