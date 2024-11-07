package aula11.exemploHeranca;

public class Engenheiro extends Colaborador{
	private String crea;

	public Engenheiro(String matricula, String nome, String sobrenome) {
		super(matricula, nome, sobrenome);
	}

	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}
}
