package br.edu.unifei.ecot12.patinacaogelo.stefany;

import java.util.List;

//Categoria de Single Skating e Pairs Skating
public class LongProgram extends ScoreSkating {
	
	@Override
	public double scoreProgramElementos() {
		double somaElementos = 0.0;
		double menor = 100.0;
		double maior = 0.0;
		double pontoElemento = 0.0;
		double somaTotal = 0.0, somaTotalElementoi = 0.0;
		for(Judge j : this.getJuizes()) {
			List<AvaliacaoElemento> ae = j.getPontuacaoElementos();
			for(int i = 1; i <= 12; i++) {
				pontoElemento = this.getElementos().get(i-1).getValoresBase().get((int)ae.get(i).getPontuacaoElemento());
				somaElementos += pontoElemento;
				if(pontoElemento > maior)
					maior = pontoElemento;
				if(pontoElemento < menor)
					menor = pontoElemento;
			}
			somaTotalElementoi = (somaElementos-12*maior-12*menor)/9.0;
			somaTotal += somaTotalElementoi;
		}
		for(ElementoTecnico e : this.getElementos()) {
			if(e.getCorValida() == EnumCorValida.VERDE) {
				somaTotal += e.getValoresBase().get(5);
			}
		}
		return (somaTotal-this.getDeducaoElementos());
	}

}
