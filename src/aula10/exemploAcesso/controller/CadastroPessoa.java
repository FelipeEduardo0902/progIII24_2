package aula10.exemploAcesso.controller;

import aula10.exemploAcesso.model.Pessoa;

public class CadastroPessoa {
  public static void main(String[] args) {
    Pessoa pessoaUm = new Pessoa();
    //nome não pode ser acessado porque é protegido em Pessoa
    //pessoaUm.nome
    pessoaUm.mail = "pedro@gmail.com";
  }
}
