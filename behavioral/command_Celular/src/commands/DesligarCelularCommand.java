package commands;

import receivers.IReceiver;

public class DesligarCelularCommand implements ICommand{

  private IReceiver receiver;

  public DesligarCelularCommand(IReceiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.desligarCelular();
  }

}
