package br.edu.unifei.ecot13.patinacaogelo.stefany;

//Interface --> mãe na hierarquia de fábricas de avaliações
public interface JudgeFabricaPontuacao<A extends Avaliacao> {
	public abstract A pontuarPrograma();
}
