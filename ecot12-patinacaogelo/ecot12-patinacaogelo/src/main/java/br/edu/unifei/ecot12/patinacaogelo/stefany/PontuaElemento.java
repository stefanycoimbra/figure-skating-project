package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Fábrica de avaliações de elementos --> uso do padrão método de fábrica
public class PontuaElemento implements JudgeFabricaPontuacao<AvaliacaoElemento> {
	@Override
	public AvaliacaoElemento pontuarPrograma() {
		return (new AvaliacaoElemento());
	}
}
