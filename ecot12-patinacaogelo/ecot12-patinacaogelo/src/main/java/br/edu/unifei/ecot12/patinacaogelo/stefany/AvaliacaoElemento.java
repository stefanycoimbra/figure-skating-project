package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Classe que representa conjunto de avalia��es de elementos
public class AvaliacaoElemento implements Avaliacao<AvaliacaoElemento>, PontuacaoIgual<AvaliacaoElemento> {
	private double pontuacaoElemento;
	
	protected AvaliacaoElemento() {};
	
	//Cria um clone --> padr�o prot�tipo para que possa utilizar o estado anterior e preservar
	//avalia��o sem perdas ao esporte, mas ainda realizar testes
	public AvaliacaoElemento clone() {
		AvaliacaoElemento ae = new AvaliacaoElemento();
		ae.pontuacaoElemento=this.pontuacaoElemento;
		return ae;
	}
	
	//Verifica se uma avalia��o de um elemento � igual a outra
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
