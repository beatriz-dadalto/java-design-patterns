/*
 * Author: Bia Coelho
 * github: https://github.com/biacoelho
 * Date: 13/06/2020
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CoffeeMachineProgram {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    OldCoffeeMachine oldMachine = new OldCoffeeMachine();
    ICoffeeMachine adapter = new CoffeeTouchscreenAdapter(oldMachine);

    System.out.println("\nCoffee Machine - " + sdf.format(new Date()));

    System.out.println("===== MENU =====");
    System.out.println("1 - Flavor A");
    System.out.println("2 - Flavor B");
    System.out.print("Enter your choice: ");
    char choice = read.next().charAt(0);

    // validating the user input
    while (choice != '1' && choice != '2') {
      System.out.print(choice + " is not an option! Renter your choice: ");
      choice = read.next().charAt(0);
    }

    switch (choice) {
      case '1':
        adapter.selectFlavorA();
        break;
      case '2':
        adapter.selectFlavorB();
        break;
    }

  }

}
