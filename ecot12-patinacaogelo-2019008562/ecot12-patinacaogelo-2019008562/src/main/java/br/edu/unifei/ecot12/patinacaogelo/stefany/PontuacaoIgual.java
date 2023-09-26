package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Interface --> método abstrato isEqual(P obj) para ser implementado nas filhas --> É uma CRTP
public interface PontuacaoIgual <P extends PontuacaoIgual<P>> {
	public abstract boolean isEqual(P obj);
}
