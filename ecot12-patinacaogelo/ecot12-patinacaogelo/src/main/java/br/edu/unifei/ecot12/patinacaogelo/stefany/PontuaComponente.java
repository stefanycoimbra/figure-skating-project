package br.edu.unifei.ecot12.patinacaogelo.stefany;

//F�brica de avalia��es de componentes --> uso do padr�o m�todo de f�brica
public class PontuaComponente implements JudgeFabricaPontuacao<AvaliacaoComponente> {
	@Override
	public AvaliacaoComponente pontuarPrograma() {
		return (new AvaliacaoComponente());
	}
}
