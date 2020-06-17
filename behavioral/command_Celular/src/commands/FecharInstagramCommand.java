package commands;

import receivers.IReceiver;

public class FecharInstagramCommand implements ICommand{

  private IReceiver receiver;

  public FecharInstagramCommand(IReceiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.fecharInstagram();
  }

}
