package commands;

import receivers.IReceiver;

public class LigarCelularCommand implements ICommand{

  private IReceiver receiver;

  public LigarCelularCommand(IReceiver newReceiver) {
    this.receiver = newReceiver;
  }

  @Override
  public void execute() {
    receiver.ligarCelular();
  }

}
