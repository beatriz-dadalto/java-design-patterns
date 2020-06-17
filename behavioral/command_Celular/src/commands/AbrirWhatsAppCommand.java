package commands;

import receivers.IReceiver;

public class AbrirWhatsAppCommand implements ICommand{

  private IReceiver receiver;

  public AbrirWhatsAppCommand(IReceiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.abrirWhatsApp();
  }

}
