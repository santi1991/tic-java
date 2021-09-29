package semana5.examen;

public class Bronce extends Asiento {
    // ^ hereda de Asiento
    
    //Inserte acá el método constructor

    Bronce(String ID, char tipo) {
        super(ID, tipo);
        //TODO Auto-generated constructor stub
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    @Override
    public String imprimirMenuPantalla() {
        // TODO Auto-generated method stub
        return "BRONCE";
    }
}
