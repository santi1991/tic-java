package semana4.examen;

public class Jugador extends Personaje {
    
    //Inserte acá los atributos
    private int numeroBotiquines = 0;

    //Inserte acá el método constructor
    Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }

   
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void golpear(Enemigo p) {        
        // super.golpear(p);
        // p.evolucionar();
        if (p.getVida() > 0) {
            p.setVida(p.getVida() - (getDamage() / (p.getResistencia() * calcularDistanciaRespectoPersonaje(p))));
            if (p.getVida() <= 30) {
                p.evolucionar();
            }
        } else {
            p.setVida(0);
        }
    }

    public void usarBotiquin() {
        
        if(this.numeroBotiquines == 0) {
            return;
        }
        this.numeroBotiquines -= 1;
        setVida(getVida() + 5);
    }

    public void recogerBotiquin() {
        this.numeroBotiquines += 1;
    }

    public void moverDerecha(double d) {
        setPosicionX(getPosicionX() + d);
    }

    public void moverIzquierda(double d) {
        setPosicionX(getPosicionX() - d);
    }

    public void moverArriba(double d) {
        setPosicionY(getPosicionY() + d);
    }

    public void moverAbajo(double d) {
        setPosicionY(getPosicionY() - d);
    }

    
    //Inserte acá los SETTERS Y GETTERS
    public void setNumeroBotiquines(int num) {
        this.numeroBotiquines = num;
    }
    public int getNumeroBotiquines() {
        return this.numeroBotiquines;
    }

    
}
