package br.edu.unifei.ecot12.patinacaogelo.stefany;


//Classe que representa todos os profissionais do esporte modelados
public abstract class Profissional {
	private String nome;
	private String nacionalidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
}
