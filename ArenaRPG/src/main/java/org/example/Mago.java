package org.example;

public class Mago extends Personaje {
    protected int puntosMana;
    private static final int COSTO_HECHIZO = 10;

    public Mago(String nombre, int vida, int ataqueBase, int x, int y, int puntosMana) {
        super(nombre, vida, ataqueBase, x, y);
        this.puntosMana = Math.max(0, puntosMana);
    }

    @Override
    public void realizarAtaqueEspecial(Personaje objetivo) {
        if (!estaVivo() || objetivo == null || !objetivo.estaVivo() || objetivo == this) {
            System.out.println("No se puede lanzar el hechizo a ese objetivo.");
            return;
        }
        if (puntosMana < COSTO_HECHIZO) {
            System.out.println(nombre + " no tiene mana suficiente: usa ataque basico.");
            atacar(objetivo);
            return;
        }
        puntosMana -= COSTO_HECHIZO;
        System.out.println(nombre + " lanza un hechizo. Mana restante: " + puntosMana);
        objetivo.defender(ataqueBase + 10);
    }

    public int getPuntosMana() { return puntosMana; }

    @Override
    public String getEstado() { return super.getEstado() + " | Mana: " + puntosMana; }
}
