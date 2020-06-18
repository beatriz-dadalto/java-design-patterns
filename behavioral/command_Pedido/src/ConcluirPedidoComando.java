public class ConcluirPedidoComando implements IComando{

  private PedidoReceiver pedido;

  public ConcluirPedidoComando(PedidoReceiver pedido) {
    this.pedido = pedido;
  }

  @Override
  public void executar() {
    System.out.println("Finalizando pedido de " + pedido.getCliente() +
            " no valor de R$ " + String.format("%.2f", pedido.getValor()));
    pedido.finalizar();
  }
}
