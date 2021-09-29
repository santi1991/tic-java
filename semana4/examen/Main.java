package semana4.examen;

public class Main {
    public static void main(String[] args) {

        Jugador j = new Jugador("Explorador", 'f', -1, -1, 130);
        // Jugador j = new Jugador("Explorador", 'm', 0, 5, 100);
        Enemigo e = new Enemigo("Bitter", 'f', 0, 0, 80);

        // j.golpear(e);
        // j.golpear(e);
        // j.moverDerecha(10);
        // j.moverAbajo(5);

        // e.golpear(j);
        // e.golpear(j);
        // j.recogerBotiquin();

        // j.usarBotiquin();
        // j.usarBotiquin();
        // j.golpear(e);
        // j.golpear(e);
        // j.golpear(e);

        // e.golpear(j);
        // e.golpear(j);

        // j.golpear(e);
        // j.golpear(e);

        // j.golpear(e);
        // j.golpear(e);
        // j.golpear(e);

        //--------------------
        j.golpear(e);
        j.golpear(e);
        j.usarBotiquin();
        j.recogerBotiquin();
        j.recogerBotiquin();
        j.usarBotiquin();
        j.moverArriba(2);
        e.golpear(j);

        System.out.println("___ Jugador ____");
        System.out.println(j.getNombre());
        System.out.println(j.getSexo());
        System.out.println(j.getPosicionX());
        System.out.println(j.getPosicionY());
        System.out.println(j.getDamage());
        System.out.println(j.getVida());
        System.out.println(j.getNumeroBotiquines());

        System.out.println("___ ENEMIGO ____");
        System.out.println(e.getNombre());
        System.out.println(e.getSexo());
        System.out.println(e.getPosicionX());
        System.out.println(e.getPosicionY());
        System.out.println(e.getDamage());
        System.out.println(e.getVida());
        System.out.println(e.getEvolucionesAplicadas());
        System.out.println(e.getResistencia());

        
        
        
    }
}
