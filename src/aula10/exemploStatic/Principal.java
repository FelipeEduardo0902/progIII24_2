package aula10.exemploStatic;

public class Principal {
  public static void main(String[] args) {
    Conta c1 = new Conta("Jonas",100);
    Conta c2 = new Conta("Ana",150);
    //Atributo static ele é único para todas as instâncias
    c1.nomeBanco = "Banco real";
    System.out.println("O nome do banco de c1 é "+c1.nomeBanco);
    System.out.println("O nome do banco de c2 é "+c2.nomeBanco);
    //Existe independente da criação de instâncias
    Conta.nomeBanco = "Novo banco";
    System.out.println("O nome do banco de c1 é "+c1.nomeBanco);
    System.out.println("O nome do banco de c2 é "+c2.nomeBanco);
    //Exemplos de uso de métodos estáticos
    Operacoes op = new Operacoes();
//    op.soma(4,7);
    float resp = Operacoes.soma(7,10);
    System.out.println("A soma de 7 e 10 vale "+resp);
  }
}
