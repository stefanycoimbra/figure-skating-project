package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Interface --> m�e na hierarquia de avalia��es
public interface Avaliacao<A extends Avaliacao<A>> {
	public A clone();
}
