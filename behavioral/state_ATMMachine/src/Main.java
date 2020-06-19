
public class Main {

  public static void main(String[] args) {

    ATMMAchine atmMachine = new ATMMAchine();

    System.out.println("\n** WITH WRONG PIN **");
    atmMachine.insertCard();
    atmMachine.insertPin(56);

    System.out.println("\n** WITH INSUFFICIENT MONEY IN THE MACHINE **");
    atmMachine.insertCard();
    atmMachine.insertPin(1234);
    atmMachine.requestCash(5000);

    System.out.println("\n** WITH RIGHT PIN - WITHDRAW 2000 **");
    atmMachine.insertCard();
    atmMachine.insertPin(1234);
    atmMachine.requestCash(2000);

    System.out.println("\n** WITH RIGHT PIN - WITHDRAW AGAIN **");
    atmMachine.insertCard();

  }

}
