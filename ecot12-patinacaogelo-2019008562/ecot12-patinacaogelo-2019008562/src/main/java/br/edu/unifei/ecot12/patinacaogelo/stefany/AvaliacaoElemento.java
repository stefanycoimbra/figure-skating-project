package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Classe que representa conjunto de avaliações de elementos
public class AvaliacaoElemento implements Avaliacao<AvaliacaoElemento>, PontuacaoIgual<AvaliacaoElemento> {
	private double pontuacaoElemento;
	
	protected AvaliacaoElemento() {};
	
	//Cria um clone --> padrão protótipo para que possa utilizar o estado anterior e preservar
	//avaliação sem perdas ao esporte, mas ainda realizar testes
	public AvaliacaoElemento clone() {
		AvaliacaoElemento ae = new AvaliacaoElemento();
		ae.pontuacaoElemento=this.pontuacaoElemento;
		return ae;
	}
	
	//Verifica se uma avaliação de um elemento é igual a outra
	@Override
	public boolean isEqual(AvaliacaoElemento obj) {		
		return (this.pontuacaoElemento==obj.pontuacaoElemento);
	}

	public double getPontuacaoElemento() {
		return pontuacaoElemento;
	}

	public void setPontuacaoElemento(double pontuacaoElemento) {
		this.pontuacaoElemento = pontuacaoElemento;
	}
}
