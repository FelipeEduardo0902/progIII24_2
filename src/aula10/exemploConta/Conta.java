package aula10.exemploConta;

import java.util.Random;

public class Conta {
  String titular;
  String identificador;
  float saldo;


//  Conta(){
//    geraIdentificador();
//    saldo = 0;
//  }

  Conta(String titular, float deposito){
    this.titular = titular;
    saldo = deposito;
    geraIdentificador();
  }

  void depositar(float valor){
    saldo+=valor;
  }

  void geraIdentificador(){
    Random aleatorio = new Random();
    identificador = "conta"+aleatorio.nextInt(1000,10000);
  }

  boolean sacar(float valor){
    if(valor<=saldo){
      saldo-=valor;
      return true;
    }
    return false;
  }

  String verificaSaldo(){
    return String.format("Seu saldo é de R$%.2f",saldo);
  }

  //  boolean sacar(float valor){
//    boolean okSaque = false;
//    if(valor<=saldo){
//      saldo-=valor;
//      okSaque = true;
//    }
//    return okSaque;
//  }
}
