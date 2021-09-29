package semana3.examen;

public class Autobus {
    //Inserte acá los atributos
   
    private String nombreConductor;
    private int nPasajeros = 0;
    private double cantidadDinero = 0;
    private int nMaximoPasajeros;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean puertaAbierta;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;
    
    //Inserte acá el método constructor
    
    Autobus(String nombreConductor, int nMaximoPasajeros, boolean puertaAbierta) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
        this.puertaAbierta = puertaAbierta;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    public void recogerPasajero(int estrato) {
        if(!isPuertaAbierta() || isEnMarcha()) {
            return;
        };        
        
        int prevNumPasajeros = this.nPasajeros;
        this.nPasajeros ++;
        if (this.nPasajeros > this.nMaximoPasajeros) {
            this.nPasajeros = prevNumPasajeros;
            return;
        }
        double price1 = 1500;
        double price2 = 2600;
        double price3 = 3000;
        if(estrato < 3 ) {
            this.cantidadDinero += price1;
        }
        if(estrato == 3 || estrato == 4) {
            this.cantidadDinero += price2;
        }
        if(estrato > 4) {
            this.cantidadDinero += price3;
        }        
    }

    public void dejarPasajero() {
        if (this.nPasajeros > 0) {
            this.nPasajeros --;
        }        
    }

    public double calcularDistanciaAcopio() {
        return Math.sqrt((Math.pow(this.localizacionX, 2)) + (Math.pow(this.localizacionY, 2)));
    }

    public void gestionarPuerta() {
        if(isEnMarcha()) {
            return;
        }
        this.puertaAbierta = !this.puertaAbierta;
    }

    public void gestionarAireAcondicionado() {        
        if(isMotorEncendido()) {
            this.aireAcondicionadoActivado = !this.aireAcondicionadoActivado;
        }   
    }

    public void gestionarMotor() {
        this.motorEncendido = !this.motorEncendido;
        if (this.motorEncendido == false) {
            this.wifiEncendido = false;
            this.aireAcondicionadoActivado = false;
        }
    }
    
    public void gestionarWifi() {
        if(isMotorEncendido()) {
            this.wifiEncendido = !this.wifiEncendido;
        }        
    }

    public void gestionarMarcha() {        
        if(isEnMarcha()) {
            this.enMarcha = false;
        } else {
            if(isMotorEncendido() && isPuertaAbierta() == false) {
                this.enMarcha = true;
            }             
        }
    }

    public void moverDerecha(double d) {
        if(isEnMarcha()) {
            this.localizacionX += d;
        }        
    }

    public void moverIzquierda(double d) {
        if(isEnMarcha()) {
            this.localizacionX -= d;
        }
    }

    public void moverArriba(double d) {
        if(isEnMarcha()) {
            this.localizacionY += d;
        }
    }

    public void moverAbajo(double d) {
        if(isEnMarcha()) {
            this.localizacionY -= d;
        }
    }
    

    //Inserte acá los SETTERS Y GETTERS
   
    // nombreConductor
    public void setNombreConductor(String nombre) {
        this.nombreConductor = nombre;
    }
    public String getNombreConductor() {
        return this.nombreConductor;
    }
    
    // nPasajeros
    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }
    public int getnPasajeros() {
        return this.nPasajeros;
    }
    
    // cantidadDinero
    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }
    public double getCantidadDinero() {
        return this.cantidadDinero;
    }
    
    // nMaximoPasajeros
    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }
    public int getnMaximoPasajeros() {
        return this.nMaximoPasajeros;
    }
    
    // localizacionX
    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }
    public double getLocalizacionX() {
        return this.localizacionX;
    }
    
    // localizacionY
    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }
    public double getLocalizacionY() {
        return this.localizacionY;
    }
    
    // puertaAbierta
    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
    public boolean isPuertaAbierta() {
        return this.puertaAbierta;
    }
    
    // aireAcondicionadoActivado
    public void setAireAcondicionadoActivado(boolean shouldActivate) {
        this.aireAcondicionadoActivado = shouldActivate;
    }
    public boolean isAireAcondicionadoActivado() {
        return this.aireAcondicionadoActivado;
    }
    
    // motorEncendido
    public void setMotorEncendido(boolean shouldStart) {
        this.motorEncendido = shouldStart;
    }
    public boolean isMotorEncendido() {
        return this.motorEncendido;
    }
    
    // wifiEncendido
    public void setWifiEncendido(boolean shouldActivate) {
        this.wifiEncendido = shouldActivate;
    }
    public boolean isWifiEncendido() {
        return this.wifiEncendido;
    }
    
    // enMarcha
    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }
    public boolean isEnMarcha() {
        return this.enMarcha;
    }
}
