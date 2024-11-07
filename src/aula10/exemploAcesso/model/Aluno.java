package aula10.exemploAcesso.model;

public class Aluno {
  Pessoa pessoa = new Pessoa();

  Aluno(){
    pessoa.nome = "Pedro";
    pessoa.idade = 20;
    //pessoa.sobrenome = "Silva";
    pessoa.mail = "pedro@gmail.com";
  }
}
