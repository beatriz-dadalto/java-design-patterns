package commands;

import receivers.IReceiver;

public class FecharWhatsAppCommand implements ICommand{

  private IReceiver receiver;

  public FecharWhatsAppCommand(IReceiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.fecharWhatsApp();
  }

}
