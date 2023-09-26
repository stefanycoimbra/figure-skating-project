package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Fábrica de avaliações de componentes --> uso do padrão método de fábrica
public class PontuaComponente implements JudgeFabricaPontuacao<AvaliacaoComponente> {
	@Override
	public AvaliacaoComponente pontuarPrograma() {
		return (new AvaliacaoComponente());
	}
}
