package aula10.exemploOO;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    //Primeiro aluno
    Aluno alunoUm = new Aluno("Jonas","Silva");
//    alunoUm.nome = "Jonas";
//    alunoUm.sobrenome = "Silva";
    alunoUm.mail = "jonas@terra.com.br";
    alunoUm.n1 = 8;
    alunoUm.n2 = 9;
    alunoUm.n3 = (float) 6.7;
    //Segundo aluno
    Aluno alunoDois = new Aluno("Pedro","Souza");
//    alunoDois.nome = "Pedro";
//    alunoDois.sobrenome = "Souza";
    alunoDois.nome = "Andre";
    alunoDois.mail = "pedro@gmail.com";
    alunoDois.n1 = 8;
    alunoDois.n2 = 10;
    alunoDois.n3 = 5;
    //Interação com os objetos
    System.out.println(alunoUm.obterDados());
    System.out.println(alunoUm.verificaStatus(8));
    float media = alunoUm.calculaMedia();
    System.out.println("O aluno "+alunoUm.nome+" está com média "+String.format("%.2f",media));
    System.out.println("Para entrar com contato com o aluno use o e-mail: "+alunoUm.mail);

    Aluno alunoTres = new Aluno();
    alunoTres.nome = "João";
    alunoTres.sobrenome = "Silva";
    alunoTres.mail = "js@gmail.com";
    Aluno alunoQuatro = new Aluno("Nome", "Sobrenome");
    alunoQuatro.mail = "mail@teste.com";
    Aluno alunoCinco = new Aluno("Nome", "Sobrenome", "mail@servidor.com");
  }
}
