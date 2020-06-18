import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalhoInvoker {

  // guardar as ações dos pedidos
  private List<IComando> comandos;

  public FilaDeTrabalhoInvoker() {
    comandos = new ArrayList<IComando>();
  }

  public void adicionar(IComando comando) {
    comandos.add(comando);
  }

  public void processar() {
    for (IComando comando : comandos) {
      comando.executar();
    }
  }
}
