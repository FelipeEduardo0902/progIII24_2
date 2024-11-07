package aula11.exemploOverload;

public class Teste {
	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		int[] v = {1,3,4,6};
		System.out.println(op.soma(v));
		System.out.println(op.soma(4,5));
		System.out.println(op.soma(4,5,8));
		System.out.println(op.soma("Aula","Programação"));
	}
}
