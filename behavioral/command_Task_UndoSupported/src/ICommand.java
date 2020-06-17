public interface ICommand {
  // typically this method does not take any argument.
  // soma of the reasons are:
  // 1. we supply all the information when it is created.
  // 2. Invoker may reside in different address space, etc.
  void executeCommand();
  void executeUndoCommand();
}
