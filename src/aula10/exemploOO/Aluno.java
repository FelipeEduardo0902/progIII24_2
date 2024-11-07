package aula10.exemploOO;

public class Aluno {
  String nome;
  String sobrenome;
  String mail;
  float n1;
  float n2;
  float n3;
  //Construtor vazio
  Aluno(){

  }

  Aluno(String nome, String sobrenome){
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  Aluno(String nome, String sobrenome, String mail){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.mail = mail;
  }

  float calculaMedia(){
    float media = (n1+n2+n3)/3;
    return media;
  }

  String verificaStatus(float mediaAprovacao){
    float media = calculaMedia();
    if(media>=mediaAprovacao)
      return "aprovado";
    else
      return "recuperação";
  }

  String obterDados(){
    float media = calculaMedia();
    String resultado = "Nome: "+nome+" "+sobrenome;
    resultado+="\nE-mail: "+mail;
    resultado+="\nMédia: "+String.format("%.2f",media);
    return resultado;
  }
}
