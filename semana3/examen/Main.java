package semana3.examen;

public class Main {
    public static void main(String[] args) {

        Autobus camion = new Autobus("Pepe", 30, false);

        // camion.moverDerecha(5);

        // camion.gestionarWifi();
        // camion.gestionarAireAcondicionador();
        // camion.gestionarMarcha();

        camion.gestionarMotor();
        camion.gestionarMarcha();
        camion.moverDerecha(5);

        camion.recogerPasajero(2);
        camion.gestionarPuerta();
        camion.moverArriba(10);

        camion.gestionarMarcha();
        camion.gestionarPuerta();
        camion.recogerPasajero(1);
        camion.recogerPasajero(4);
        camion.recogerPasajero(6);

        camion.gestionarWifi();
        camion.gestionarAireAcondicionado();
        camion.gestionarMarcha();
        camion.moverIzquierda(2);

        camion.dejarPasajero();
        camion.gestionarMotor();
        camion.calcularDistanciaAcopio();

        System.out.println("nombreConductor: " + camion.getNombreConductor());
        System.out.println("nPasajeros: " + camion.getnPasajeros());
        System.out.println("CantidadDinero: " + camion.getCantidadDinero());
        System.out.println("nMaximoPasajeros: " + camion.getnMaximoPasajeros());
        System.out.println("LocalizacionX: " + camion.getLocalizacionX());
        System.out.println("LocalizacionY: " + camion.getLocalizacionY());
        System.out.println("isPuertaAbierta: " + camion.isPuertaAbierta());
        System.out.println("isAireAcondicionadoActivado: " + camion.isAireAcondicionadoActivado());
        System.out.println("isMotorEncendido: " + camion.isMotorEncendido());
        System.out.println("isWifiEncendido: " + camion.isWifiEncendido());
        System.out.println("isEnMarcha: " + camion.isEnMarcha());

        System.out.println("distanciaAcopio: " + camion.calcularDistanciaAcopio());
    }
}
