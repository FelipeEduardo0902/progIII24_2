package aula11.exemploOverload;

public class Operacoes {

	public String soma(String s1, String s2){
		return s1+" "+s2;
	}

	public int soma(int n1, int n2){
		return n1+n2;
	}

	public int soma(int n1, int n2, int n3){
		return n1+n2+n3;
	}

	public int soma(int[] vetor){
		int soma = 0;
		for(int i:vetor){
			soma+=i;
		}
		return soma;
	}
}
