import java.util.Calendar;

public class PedidoReceiver {

  private String cliente;
  private Double valor;
  private Status status; // enum
  private Calendar dataFinalizacao;

  public PedidoReceiver(String cliente, Double valor) {
    this.cliente = cliente;
    this.valor = valor;
    this.status = Status.NOVO;
  }

  public String getCliente() {
    return cliente;
  }

  public double getValor() {
    return valor;
  }

  public Status getStatus() {
    return status;
  }

  public Calendar getDataFinalizacao() {
    return dataFinalizacao;
  }

  public void pagar() {
    status = Status.PAGO;
  }

  public void finalizar() {
    dataFinalizacao = Calendar.getInstance();
    status = Status.ENTREGUE;
  }
}
