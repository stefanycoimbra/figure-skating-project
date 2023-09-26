package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Possui a soma das pontuações em cada uma das 8 modalidades de Figure Skating para compor o score do time
public class TeamEvent {
	private FigureSkating modalidades[] = new FigureSkating[8];
	
	public double totalPontuacao() {
		double soma = 0.0;
		for(FigureSkating fs : modalidades) {
			soma += fs.getScore().totalScore();
		}
		return soma;
	}

	public FigureSkating[] getModalidades() {
		return modalidades;
	}

	public void setModalidades(FigureSkating[] modalidades) {
		this.modalidades = modalidades;
	}
}
