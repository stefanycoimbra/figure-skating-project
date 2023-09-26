package br.edu.unifei.ecot12.patinacaogelo.stefany;

import java.util.List;

//Categoria de Single Skating e Pairs Skating
public class ShortProgram extends ScoreSkating {
	
	@Override
	public double scoreProgramElementos() {
		double somaElementos = 0.0;
		double menor = 100.0;
		double maior = 0.0;
		double pontoElemento = 0.0;
		double somaTotal = 0.0, somaTotalElementoi = 0.0;
		for(Judge j : this.getJuizes()) {
			List<AvaliacaoElemento> ae = j.getPontuacaoElementos();
			int w = 0;
			for(int i = 1; i <= 7; i++) {
				pontoElemento = this.getElementos().get(w).getValoresBase().get((int)ae.get(w).getPontuacaoElemento());
				somaElementos += pontoElemento;
				if(pontoElemento > maior)
					maior = pontoElemento;
				if(pontoElemento < menor)
					menor = pontoElemento;
				w++;
			}
			somaTotalElementoi = (somaElementos-7*maior-7*menor)/9.0;
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
