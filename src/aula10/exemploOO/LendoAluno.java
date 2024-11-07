package aula10.exemploOO;

import java.util.Scanner;

public class LendoAluno {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual o nome do aluno: ");
    String nome = ler.next();
    System.out.print("Qual o sobrenome do "+nome+": ");
    String sobrenome = ler.next();
    System.out.print("Qual o e-mail do "+nome+": ");
    String mail = ler.next();
    Aluno a1 = new Aluno(nome,sobrenome,mail);
    System.out.print("Qual a primeira nota do "+a1.nome+": ");
    a1.n1 = ler.nextFloat();
    System.out.print("Qual a segunda nota do "+a1.nome+": ");
    a1.n2 = ler.nextFloat();
    System.out.print("Qual a terceira nota do "+a1.nome+": ");
    a1.n3 = ler.nextFloat();
    System.out.println(a1.obterDados());
    System.out.println(a1.nome+" está "+a1.verificaStatus(6));
  }
}
