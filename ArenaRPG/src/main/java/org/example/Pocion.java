package org.example;

public class Pocion {
    private final int curacion;

    public Pocion(int curacion) {
        if (curacion <= 0) throw new IllegalArgumentException("La curacion debe ser positiva.");
        this.curacion = curacion;
    }
    public void usar(Personaje personaje) { personaje.curar(curacion); }
    public int getCuracion() { return curacion; }
}
