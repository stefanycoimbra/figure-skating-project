package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Interface --> m�todo abstrato isEqual(P obj) para ser implementado nas filhas --> � uma CRTP
public interface PontuacaoIgual <P extends PontuacaoIgual<P>> {
	public abstract boolean isEqual(P obj);
}
