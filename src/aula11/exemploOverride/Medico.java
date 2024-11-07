package aula11.exemploOverride;

public class Medico extends Colaborador {
	private String crm;

	public Medico(String matricula, String nome, String sobrenome,String crm){
		super(matricula,nome,sobrenome);
		this.crm = crm;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override
	public String obterDados(){
		return "Nome: "+getNome()+" "+getSobrenome()+" Matricula: "+getMatricula()+" CRM: "+crm;
	}
}
