package aula10.exemploEncapsulamento;

import java.util.Random;

public class Conta {
  //Atributo leitura e escrita e por isso recebe um getter e um setter
  private String titular;
  //Atributo somente leitura e por isso recebe apenas um getter
  private String identificador;
  private float saldo;


  Conta(String titular, float deposito){
    this.titular = titular;
    saldo = deposito;
    geraIdentificador();
  }

  public void setTitular(String titular){
    this.titular = titular;
  }

  public String getTitular(){
    return titular;
  }

  public String getIdentificador(){
    return identificador;
  }

  public float getSaldo(){
    return saldo;
  }

  public void depositar(float valor){
    saldo+=valor;
  }

  private void geraIdentificador(){
    Random aleatorio = new Random();
    identificador = "conta"+aleatorio.nextInt(1000,10000);
  }

  public boolean sacar(float valor){
    if(valor<=saldo){
      saldo-=valor;
      return true;
    }
    return false;
  }

  public String verificaSaldo(){
    return String.format("Seu saldo é de R$%.2f",saldo);
  }

}
