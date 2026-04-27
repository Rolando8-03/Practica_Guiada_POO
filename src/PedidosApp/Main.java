package PedidosApp;

import PedidosApp.modelos.Cliente;
import PedidosApp.modelos.Tienda;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Ana");
        Tienda tienda = new Tienda();

        cliente.realizarPedido(tienda, "Laptop", 2);
    }
}
