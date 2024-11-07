package aula08;

public class Questao10 {
	public static boolean eSimetrica(int[][] matriz){
		boolean simetrica = true;

		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				if(matriz[l][c] != matriz[c][l])
					simetrica = false;
			}
		}
		return simetrica;
	}

	public static void main(String[] args){
		int[][] matriz = {
						{1, 2, 3, 4, 5},
						{2, 6, 7, 8, 9},
						{3, 7, 10, 11, 12},
						{4, 8, 11, 13, 14},
						{5, 9, 12, 14, 15}
		};

		if(eSimetrica(matriz)){
			System.out.println("A matriz é simétrica");
		}
		else{
			System.out.println("A matriz não é simétrica");
		}
	}
}
