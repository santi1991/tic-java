package semana5.examen;

public abstract class Asiento {
    //Inserte acá los atributos
    private char tipo;
    private String ID;
    private Boolean pantallaEncendida = false;
    private double inclinacionSilla = 90;
    private Boolean luzLecturaEncendida = false;
    private Boolean luzAsistenciaEncendida = false;
    private Boolean aireAcondicionadoEncendido = false;

    //Inserte acá el método constructor

    Asiento(String ID, char tipo) {
        this.ID = ID;
        this.tipo = tipo;        
    }

    //Inserte acá los SETTERS Y GETTERS
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public char getTipo() {
        return this.tipo;
    }

    public void setID(String id) {
        this.ID = id;
    }
    public String getID() {
        return this.ID;
    }

    public void setPantallaEncendida(Boolean arg) {
        this.pantallaEncendida = arg;
    }
    public Boolean isPantallaEncendida() {
        return this.pantallaEncendida;
    }

    public void setInclinacionSilla(double inclinacion) {
        this.inclinacionSilla = inclinacion;
    }
    public double getInclinacionSilla() {
        return this.inclinacionSilla;
    }

    public void setLuzLecturaEncendida(Boolean arg) {
        this.luzLecturaEncendida = arg;
    }
    public Boolean isLuzLecturaEncendida() {
        return this.luzLecturaEncendida;
    }

    public void setLuzAsistenciaEncendida(Boolean arg) {
        this.luzAsistenciaEncendida = arg;
    }
    public Boolean isLuzAsistenciaEncendida(){
        return this.luzAsistenciaEncendida;
    }

    public void setAireAcondicionadoEncendido(Boolean arg) {
        this.aireAcondicionadoEncendido = arg;
    }
    public Boolean isAireAcondicionadoEncendido() {
        return this.aireAcondicionadoEncendido;
    }


    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    public void gestionarAireAcondicionado() {
        if(isAireAcondicionadoEncendido() == false) {
            setAireAcondicionadoEncendido(true);
        } else {
            setAireAcondicionadoEncendido(false);
        }
    }

    public void gestionarPantalla() {
        if(isPantallaEncendida() == false) {
            setPantallaEncendida(true);
        } else {
            setPantallaEncendida(false);
        }
    }

    public void gestionarLuzLectura() {
        if(isLuzLecturaEncendida() == false) {
            setLuzLecturaEncendida(true);
        } else {
            setLuzLecturaEncendida(false);
        }
    }

    public void gestionarLuzAsistencia() {
        if(isLuzAsistenciaEncendida() == false) {
            setLuzAsistenciaEncendida(true);
        } else {
            setLuzAsistenciaEncendida(false);
        }
    }

    public void aumentarInclinacion(double d) {
        //0-135
        this.inclinacionSilla = this.inclinacionSilla + d;
        if (this.inclinacionSilla > 135) {
            this.inclinacionSilla = 135;
        }
    }

    public void disminuirInclinacion(double d) {
        this.inclinacionSilla = this.inclinacionSilla - d;
        if (this.inclinacionSilla < 0) {
            this.inclinacionSilla = 0;
        }
    }

    public abstract String imprimirMenuPantalla();
}
