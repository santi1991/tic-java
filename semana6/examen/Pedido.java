package semana6.examen;

public class Pedido {
    //Inserte acá los atributos
    private String nPedido;
    private String IDCliente;
    private double costoPedido;
    private int diaPedido;
    private int mesPedido;
    private int yearPedido;
    //Inserte acá el método constructor
    Pedido(String nPedido, String IDCliente, double costoPedido, int diaPedido, int mesPedido, int yearPedido) {
        this.nPedido = nPedido;
        this.IDCliente = IDCliente;
        this.costoPedido = costoPedido;
        this.diaPedido = diaPedido;
        this.mesPedido = mesPedido;
        this.yearPedido = yearPedido;
    }
    //Inserte acá los SETTERS Y GETTERS
    public void setnPedido(String n) {
        this.nPedido = n;
    }
    public String getnPedido() {
        return this.nPedido;
    }

    public void setIDCliente(String id) {
        this.IDCliente = id;
    }
    public String getIDCliente() {
        return this.IDCliente;
    }

    public void setCostoPedido(double c) {
        this.costoPedido = c;
    }
    public double getCostoPedido() {
        return this.costoPedido;
    }

    public void setDiaPedido(int dia) {
        this.diaPedido = dia;
    }
    public int getDiaPedido() {
        return this.diaPedido;
    }

    public void setMesPedido(int mes) {
        this.mesPedido = mes;
    }
    public int getMesPedido() {
        return this.mesPedido;
    }

    public void setYearPedido(int year) {
        this.yearPedido = year;
    }
    public int getYearPedido() {
        return this.yearPedido;
    }
}
