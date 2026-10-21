package org.example;

public abstract class Personaje implements ICombatiente {
    protected String nombre;
    protected int vida;
    protected int ataqueBase;
    protected int posicionX;
    protected int posicionY;
    private final int vidaMaxima;

    public Personaje(String nombre, int vida, int ataqueBase, int posicionX, int posicionY) {
        if (nombre == null || nombre.isBlank() || vida <= 0 || ataqueBase < 0) {
            throw new IllegalArgumentException("Nombre, vida o ataque no validos.");
        }
        this.nombre = nombre;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.ataqueBase = ataqueBase;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public abstract void realizarAtaqueEspecial(Personaje objetivo);

    public void atacar(Personaje p) {
        atacar(p, false);
    }

    public void atacar(Personaje p, boolean modoFuria) {
        if (!estaVivo() || p == null || !p.estaVivo() || p == this) {
            System.out.println("No se puede atacar a ese objetivo.");
            return;
        }
        int dano = modoFuria ? ataqueBase * 2 : ataqueBase;
        System.out.println(nombre + (modoFuria ? " ataca con furia a " : " ataca a ") + p.nombre);
        p.defender(dano);
    }

    @Override
    public void defender(int danoRecibido) {
        recibirDano(danoRecibido);
    }

    public void recibirDano(int cantidad) {
        int anterior = vida;
        vida -= Math.min(vida, Math.max(0, cantidad));
        System.out.println(nombre + " recibe " + (anterior - vida) + " de dano. Vida: " + vida);
        if (anterior > 0 && !estaVivo()) System.out.println(nombre + " ha caido.");
    }

    public void curar(int cantidad) {
        if (!estaVivo()) return;
        int recuperado = Math.min(Math.max(0, cantidad), vidaMaxima - vida);
        vida += recuperado;
        System.out.println(nombre + " recupera " + recuperado + " de vida. Vida: " + vida);
    }

    public boolean estaVivo() { return vida > 0; }
    public String getNombre() { return nombre; }
    public int getVida() { return vida; }
    public int getPosicionX() { return posicionX; }
    public int getPosicionY() { return posicionY; }
    public void cambiarPosicion(int x, int y) { posicionX = x; posicionY = y; }
    public String getEstado() { return nombre + " | Vida: " + vida + "/" + vidaMaxima; }
}
