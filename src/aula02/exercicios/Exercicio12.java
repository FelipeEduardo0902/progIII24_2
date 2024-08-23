package aula02.exercicios;

import java.util.Scanner;

/**
 * Escreva um programa para ler as dimensões de uma cozinha retangular (comprimento, largura e altura), calcular e escrever
 * a quantidade de caixas de azulejos para se colocar em todas as suas paredes. Também deve ser lido um valor equivalente a área das
 * Janelas e portas para descontar da área total. Cada caixa de azulejos possui 1,5 m2.
 */

public class Exercicio12 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual o comprimento da cozinha: ");
    float comprimento = ler.nextFloat();
    System.out.print("Qual a largura da cozinha: ");
    float largura = ler.nextFloat();
    System.out.print("Qual a altura da cozinha: ");
    float altura = ler.nextFloat();
    float area = comprimento * altura * 2 + largura * altura * 2;
    System.out.print("Qual a área ocupada por aberturas: ");
    float aAbertura = ler.nextFloat();
    area-=aAbertura;
    float quantCaixas = area/1.5f;
    System.out.printf("Para cobrir os %.2f m² de parede serão necessárias %.2f caixas de azulejos\n", area, quantCaixas);
  }
}