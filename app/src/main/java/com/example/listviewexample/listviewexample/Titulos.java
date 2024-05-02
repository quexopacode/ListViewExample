package com.example.listviewexample.listviewexample;

public class Titulos {

    private String titulo;
    private String subtitulo;
    private String nota;

    public Titulos(String tit, String sub, String not){
        titulo = tit;
        subtitulo = sub;
        nota = not;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getSubtitulo(){
        return subtitulo;
    }

    public String getNota() {
        return nota;
    }

}
