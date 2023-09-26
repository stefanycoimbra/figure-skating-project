package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;

//Categoria de Single Skating e Pairs Skating

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class LongProgram extends ScoreSkating {
	private static final long serialVersionUID = 4348807199492121427L;
	private double scoreLongProgram = 0.0;
	
	@Transient
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
		this.setScoreLongProgram(somaTotal-this.getDeducaoElementos());
		return (somaTotal-this.getDeducaoElementos());
	}

}
