package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Interface --> m�e na hierarquia de f�bricas de avalia��es
public interface JudgeFabricaPontuacao<A extends Avaliacao> {
	public abstract A pontuarPrograma();
}
