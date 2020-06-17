package commands;

public class Invoker {

  ICommand command;

//  objeto está sendo instanciado pelo metodo setCommand()
//  public Invoker(ICommand command) {
//    this.command = command;
//  }

  public void setCommand(ICommand command) {
    this.command = command;
  }

  public void executeCommand() {
    command.execute();
  }

  public void limparTela() {
    for (int i = 1; i <= 20; i++) {
      System.out.println();
    }
  }

}
