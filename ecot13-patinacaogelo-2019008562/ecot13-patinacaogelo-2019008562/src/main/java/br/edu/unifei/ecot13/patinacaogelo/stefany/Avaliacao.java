package br.edu.unifei.ecot13.patinacaogelo.stefany;

//Interface --> mãe na hierarquia de avaliações
public interface Avaliacao<A extends Avaliacao<A>> {
	public A clone();
}