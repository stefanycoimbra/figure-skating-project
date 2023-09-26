package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Classe que representa conjunto de avaliações de componentes
public class AvaliacaoComponente implements Avaliacao<AvaliacaoComponente>, PontuacaoIgual<AvaliacaoComponente> {
	private double pontuacaoComponente;
	
	protected AvaliacaoComponente() {};
	
	//Cria um clone --> padrão protótipo para que possa utilizar o estado anterior e preservar
	//avaliação sem perdas ao esporte, mas ainda realizar testes
	public AvaliacaoComponente clone() {
		AvaliacaoComponente ae = new AvaliacaoComponente();
		ae.pontuacaoComponente=this.pontuacaoComponente;
		return ae;
	}
	
	//Verifica se uma avaliação de um componente é igual a outra
	@Override
	public boolean isEqual(AvaliacaoComponente obj) {		
		return (this.pontuacaoComponente==obj.pontuacaoComponente);
	}

	public double getPontuacaoComponente() {
		return (this.pontuacaoComponente);
	}

	public void setPontuacaoComponente(double pontuacaoComponente) {
		this.pontuacaoComponente = pontuacaoComponente;
	}
	
}
