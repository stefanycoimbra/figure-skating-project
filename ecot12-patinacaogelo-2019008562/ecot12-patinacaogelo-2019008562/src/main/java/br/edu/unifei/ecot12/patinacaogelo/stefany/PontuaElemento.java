package br.edu.unifei.ecot12.patinacaogelo.stefany;

//F�brica de avalia��es de elementos --> uso do padr�o m�todo de f�brica
public class PontuaElemento implements JudgeFabricaPontuacao<AvaliacaoElemento> {
	@Override
	public AvaliacaoElemento pontuarPrograma() {
		return (new AvaliacaoElemento());
	}
}
