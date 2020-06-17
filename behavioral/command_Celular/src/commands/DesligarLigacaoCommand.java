package commands;

import receivers.IReceiver;

public class DesligarLigacaoCommand implements ICommand{

  private IReceiver receiver;

  public DesligarLigacaoCommand(IReceiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.desligarLigacao();
  }

}
