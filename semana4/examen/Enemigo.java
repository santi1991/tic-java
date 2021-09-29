package semana4.examen;

public class Enemigo extends Personaje {

    //Inserte acá los atributos
    
    private int evolucionesAplicadas = 0;
    private int resistencia = 1;
    
    
    //Inserte acá el método constructor

    Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }

    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    public void evolucionar() {
        // double vida = getVida();
        // if(vida <= 30 && vida > 10 && this.evolucionesAplicadas == 0) {
        //     // double newDamage = getDamage() + 20;
        //     setDamage(getDamage() + 20);
        //     this.evolucionesAplicadas += 1;
        // }

        // if(vida <= 10 && this.evolucionesAplicadas == 1) {
        //     this.resistencia += 1;
        //     this.evolucionesAplicadas += 1;
        // }
        if(getVida() <= 30 && getEvolucionesAplicadas() == 0) {
            // double newDamage = getDamage() + 20;
            setDamage(getDamage() + 20);
            setEvolucionesAplicadas(getEvolucionesAplicadas() + 1);
            // this.evolucionesAplicadas += 1;
        }

        if(getVida() <= 10 && getEvolucionesAplicadas() == 1) {
            setResistencia(getResistencia()+1);
            setEvolucionesAplicadas(getEvolucionesAplicadas() + 1);
        }
    }
    
    public void recibirImpacto(double d) {
        double dmg = d/this.resistencia;
        setVida(getVida()-dmg);
        evolucionar();
    }
    
    
    //Inserte acá los SETTERS Y GETTERS
    public void setEvolucionesAplicadas(int num) {
        this.evolucionesAplicadas = num;
    }
    public int getEvolucionesAplicadas() {
        return this.evolucionesAplicadas;
    }

    public void setResistencia(int num) {
        this.resistencia = num;
    }
    public int getResistencia() {
        return this.resistencia;
    }
    
}
