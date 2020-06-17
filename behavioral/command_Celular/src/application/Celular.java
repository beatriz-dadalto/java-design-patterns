/*
 * Author: Beatriz Coelho Dadalto
 * github: https://github.com/biacoelho
 * Data: 16 de junho de 2020
 */

package application;

import commands.*;
import receivers.*;

import java.util.Scanner;

public class Celular {

  public static void main(String[] args) {
    // pegar o que o usuario digitar
    Scanner sc = new Scanner(System.in);

    // executar os comandos
    Invoker invoker = new Invoker();

    // vai receber o celular que o usuario escolher
    IReceiver celular = null;


    System.out.println("***** COMMAND PATTERN *****\n");

    System.out.print("Ola! Qual é seu nome: ");
    String nome = sc.nextLine();

    System.out.println("--> " + nome + " temos o celular 1 e o celular 2.");
    System.out.print("Qual celular você quer " + nome +"? (1 ou 2) : ");
    char celularAB = sc.next().charAt(0);

    while (celularAB != '1' && celularAB != '2') {
      System.out.print("opcao " + celularAB + " nao tem " + nome +"? (1 ou 2) : ");
      celularAB = sc.next().charAt(0);
    }

    invoker.limparTela();
    switch (celularAB) {
      case '1':
        System.out.println("\nVocê ganhou um Moto G 3000");
        celular = new MotorolaReceiver("(11)99999-9999", "Moto G 3000", "Android 9", Cor.PRETO);
        break;
      case '2':
        System.out.println("\nVocê ganhou um IPhone 8000");
        celular = new IPhoneReceiver("(11)88888-8888", "IPhone 8000", "iOS", Cor.DOURADO);
        break;
    }

    System.out.println("Agora, utilize seu novo celular\n");

    int escolha = 0;
    do {
      System.out.println("********  MENU  *********");
      System.out.println("1 - Mostrar Configuracao");
      System.out.println("2 - Fazer Ligacao");
      System.out.println("3 - Desligar Ligacao");
      System.out.println("4 - Abrir WhatsApp");
      System.out.println("5 - Fechar WhatsApp");
      System.out.println("6 - Abrir Instagram");
      System.out.println("7 - Fechar Instagram");
      System.out.println("8 - Ligar Celular");
      System.out.println("9 - Desligar Celular");
      System.out.println("10 - Quero sair do menu");
      System.out.print("Escolha: ");
      escolha = sc.nextInt();

      while (escolha < 1 || escolha >= 11) {
        System.out.println(nome + " nao tem a opcao " + escolha);
        System.out.print("Escolha novamente: ");
        escolha = sc.nextInt();
      }

      invoker.limparTela();
      switch (escolha) {
        case 1:
          invoker.setCommand(new MostrarConfiguracaoCommand(celular));
          invoker.executeCommand();
          break;
        case 2:
          invoker.setCommand(new FazerLigacaoCommand(celular));
          invoker.executeCommand();
          break;
        case 3:
          invoker.setCommand(new DesligarLigacaoCommand(celular));
          invoker.executeCommand();
          break;
        case 4:
          invoker.setCommand(new AbrirWhatsAppCommand(celular));
          invoker.executeCommand();
          break;
        case 5:
          invoker.setCommand(new FecharWhatsAppCommand(celular));
          invoker.executeCommand();
          break;
        case 6:
          invoker.setCommand(new AbrirInstagramCommand(celular));
          invoker.executeCommand();
          break;
        case 7:
          invoker.setCommand(new FecharInstagramCommand(celular));
          invoker.executeCommand();
          break;
        case 8:
          invoker.setCommand(new LigarCelularCommand(celular));
          invoker.executeCommand();
          break;
        case 9:
          invoker.setCommand(new DesligarCelularCommand(celular));
          invoker.executeCommand();
          break;
      }

    } while (escolha < 10);

  }

}
