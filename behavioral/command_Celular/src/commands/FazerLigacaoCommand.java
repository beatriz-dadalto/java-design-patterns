package commands;

import receivers.IReceiver;

public class FazerLigacaoCommand implements ICommand{

  private IReceiver receiver;

  public FazerLigacaoCommand(IReceiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.fazerLigacao();
  }

}
