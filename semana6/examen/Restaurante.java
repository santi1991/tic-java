package semana6.examen;

import java.util.ArrayList;

public class Restaurante {

    // Inserte acá los atributos
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    // Inserte acá el método constructor
    Restaurante() {}

    // Inserte acá los SETTERS Y GETTERS
    public void setPedidos(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }

    // Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void agregarPedidoLista(Pedido p) {
        // this.pedidos.add(p);
        // Boolean same = pedidos.contains(p.getnPedido());
        Boolean flag = false;
        for(Pedido pActual:pedidos){  
            if (p.getnPedido() == pActual.getnPedido()) {
                flag = true;
                break;
            }
        }  
        if (flag == false) {
            this.pedidos.add(p);
        }
    }

    public void eliminarPedido(String nPedido) {
        for (int i = 0; i < pedidos.size(); i++) {
            Pedido p = pedidos.get(i);
            if (p.getnPedido() == nPedido) {
                pedidos.remove(i);
            }
        }
        // for(Pedido p:pedidos){  
        //     if (p.getnPedido() == nPedido) {
        //         pedidos.remove(0);
        //     }
        //     // System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        // }  
        
    }

    public double calcularGanancias() {
        double suma = 0;
        for(Pedido pActual:this.pedidos){  
            suma += pActual.getCostoPedido();            
        }  
        return suma;
    } 

    public double promedioGananciasTotales() {
        return calcularGanancias()/this.pedidos.size();
    }

    public double desviacionEstandarGananciasTotales() {
        double prom = promedioGananciasTotales();
        double accSum = 0;
        for(Pedido pActual:this.pedidos){  
            double result = Math.pow((pActual.getCostoPedido() - prom), 2);   
            accSum += result;         
        } 
        return Math.sqrt((accSum/this.pedidos.size()));
        // return Math.sqrt(promedioGananciasTotales());
    }

    public double retornarCostoPedido(String nPedido) {
        double val = 0;
        for (int i = 0; i < this.pedidos.size(); i++) {
            Pedido p = this.pedidos.get(i);
            if (p.getnPedido() == nPedido) {
                val = p.getCostoPedido();                
                break;
            }
        }   
        return val;        
    }
}