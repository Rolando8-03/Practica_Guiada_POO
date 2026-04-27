package PedidosApp.modelos;

public class Tienda {
    public void procesarPedido(Cliente cliente, String producto) {
        Pedido pedido = new Pedido(cliente, producto);
        pedido.mostrarDetalle();
    }
}
