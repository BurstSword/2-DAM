package com.mespigares.listaequipolol;

public class Equipo {
    private String nombre;
    private int idImage;
    private Jugador[] jugadores;
    private Tipo tipo;

    public Equipo(String nombre, int idImage, Jugador[] jugadores, Tipo tipo) {
        this.nombre = nombre;
        this.idImage = idImage;
        this.jugadores = jugadores;
        this.tipo=tipo;
    }

    public Equipo(String nombre, int idImage, Tipo tipo) {
        this.nombre = nombre;
        this.idImage = idImage;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
