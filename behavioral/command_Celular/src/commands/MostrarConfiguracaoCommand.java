package commands;

import receivers.IReceiver;

public class MostrarConfiguracaoCommand implements ICommand{

  private IReceiver receiver;

  public MostrarConfiguracaoCommand(IReceiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.mostrarConfiguracao();
  }

}
