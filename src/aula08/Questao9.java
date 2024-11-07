package aula08;

public class Questao9 {
	public static int[][] calculaTransposta(int[][] matriz){
		int[][] transp = new int[matriz[0].length][matriz.length];
		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				transp[c][l] = matriz[l][c];
			}
		}
		return transp;
	}

	public static void mostraMatriz(int[][] matriz){
		for(int[] linha: matriz){
			for(int c:linha){
				System.out.printf("%02d ",c);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matriz = {{1,5},{7,3},{8,2}};
		System.out.println("Matriz original...");
		mostraMatriz(matriz);
		matriz = calculaTransposta(matriz);
		System.out.println("\nMatriz transposta...");
		mostraMatriz(matriz);
	}
}
