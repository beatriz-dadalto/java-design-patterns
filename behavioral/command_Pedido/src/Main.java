public class Main {

  public static void main(String[] args) {

    PedidoReceiver pedido1 = new PedidoReceiver("Bia Coelho", 450.0);
    PedidoReceiver pedido2 = new PedidoReceiver("Adam Faria", 250.98);

    FilaDeTrabalhoInvoker fila = new FilaDeTrabalhoInvoker();

    fila.adicionar(new PagarPedidoComando(pedido1));
    fila.adicionar(new PagarPedidoComando(pedido2));
    fila.adicionar(new ConcluirPedidoComando(pedido2));
    fila.adicionar(new ConcluirPedidoComando(pedido1));

    fila.processar();

  }
}
