public class PagarPedidoComando implements IComando{

  private PedidoReceiver pedido;

  public PagarPedidoComando(PedidoReceiver pedido) {
    this.pedido = pedido;
  }

  @Override
  public void executar() {
    System.out.println("Pagando pedido de " + pedido.getCliente());
    pedido.pagar();
  }
}
