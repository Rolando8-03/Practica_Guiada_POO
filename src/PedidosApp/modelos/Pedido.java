package PedidosApp.modelos;

public class Pedido {
    Cliente cliente;
    String producto;

    public Pedido(Cliente cliente, String producto) {
        this.cliente = cliente;
        this.producto = producto;
    }

    public void mostrarDetalle() {
        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Producto: " + producto);
    }
}
