package aula10.exemploConta;

import java.util.Scanner;

public class Banco {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Informe o titular: ");
    String titular = ler.nextLine();
    System.out.print("Qual o depósito inicial da conta: ");
    float deposito = ler.nextFloat();
    Conta c1 = new Conta(titular,deposito);
    System.out.println("Conta do "+c1.titular+" criada, obteve o identificador: "+c1.identificador);
    String opc;
    do{
      System.out.println("Acessando a conta "+c1.identificador);
      System.out.println("Selecione uma opção");
      System.out.println("d - para depositar");
      System.out.println("s - para sacar");
      System.out.println("v - verificar saldo");
      System.out.println("e - sair");
      opc = ler.next().toLowerCase();
      switch (opc){
        case "d"->{
          System.out.print("Qual valor deseja depositar: ");
          float valor = ler.nextFloat();
          c1.depositar(valor);
          System.out.println("Depósito realizado!");
        }
        case "s" ->{
          System.out.print("Qual valor deseja depositar: ");
          float valor = ler.nextFloat();
          if(c1.sacar(valor))
            System.out.println("Saque realizado");
          else
            System.out.println("Saldo insuficiente");
        }
        case "v"->System.out.println(c1.verificaSaldo());
      }
    }
    while (!opc.equals("e"));
  }
}
