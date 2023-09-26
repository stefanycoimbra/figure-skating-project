package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Interface --> mãe na hierarquia de avaliações
public interface Avaliacao<A extends Avaliacao<A>> {
	public A clone();
}
