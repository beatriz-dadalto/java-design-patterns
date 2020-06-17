package commands;

import receivers.IReceiver;

public class AbrirInstagramCommand implements ICommand{

  private IReceiver receiver;

  public AbrirInstagramCommand(IReceiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.abrirInstagram();
  }

}
