package aula11.exemploOverride;

public class Teste {
	public static void main(String[] args) {
		Colaborador c1 = new Colaborador("a123","jonas","Silva");
		c1.setNome("Jonas");
		System.out.println(c1.obterDados());
		System.out.println(c1);

		Medico m1 = new Medico("m345", "Betina","Souza","58564-RS");
		System.out.println(m1.obterDados());
		System.out.println(m1);
	}
}
