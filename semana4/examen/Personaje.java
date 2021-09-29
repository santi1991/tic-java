package semana4.examen;

public class Personaje {
    //Inserte acá los atributos
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida = 100;
    
    
    //Inserte acá el método constructor
    Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
    }
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void golpear(Personaje p) {
        // double distance = calcularDistanciaRespectoPersonaje(p);        
        // double totalDmg = this.damage/distance;
        // p.recibirImpacto(totalDmg);

        if (p.getVida() > 0) {
            p.setVida(p.getVida() - (getDamage() / calcularDistanciaRespectoPersonaje(p)));
        } else {
            p.setVida(0);
        }
    }

    public void recibirImpacto(double d) {
        setVida(getVida()-d);
    }

    public double calcularDistanciaRespectoPersonaje(Personaje p) {
        // double x = Math.abs(p.getPosicionX() - this.getPosicionX());
        // double y = Math.abs(p.getPosicionY() - this.getPosicionY());
        // return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        //----------------------------------------------
        // double x1 = p.getPosicionX();
        // double y1 = p.getPosicionY();
        // double d = Math.sqrt((Math.pow(this.posicionX-p.getPosicionX(), 2)) + (Math.pow(this.posicionY-p.getPosicionY(), 2)));
        // // System.out.println("distance: " + d);
        // return d;
        //----------------------------------------------
        double d = Math.sqrt(((getPosicionX() - p.posicionX) * (getPosicionX() - p.posicionX))+((getPosicionY() - p.posicionY)*(getPosicionY() - p.posicionY)));
        return d;
        //----------------------------------------------
        // double x = Math.abs(this.getPosicionX()-p.getPosicionX());
        // double y = Math.abs(this.getPosicionY()-p.getPosicionY());
        // return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    //Inserte acá los SETTERS Y GETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public char getSexo() {
        return this.sexo;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }
    public double getPosicionX() {
        return this.posicionX;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }
    public double getPosicionY() {
        return this.posicionY;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
    public double getDamage() {
        return this.damage;
    }

    public void setVida(double vida) {
        // this.vida = vida;
        if (vida > 100) {
            this.vida = 100;
        } 
        if (vida < 0) {
            this.vida = 0;
        } 
        if (vida >= 0 && vida <= 100) {
            this.vida = vida;
        }            
    }
    public double getVida() {
        return this.vida;
    }
}
