package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;

//Categoria da Dança no Gelo (Ice Dance)

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class FreeDance extends ScoreSkating {
	private static final long serialVersionUID = 385319472690271999L;
	
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
			for(int i = 1; i <= 10; i++) {
				pontoElemento = this.getElementos().get(i-1).getValoresBase().get((int)ae.get(i).getPontuacaoElemento());
				somaElementos += pontoElemento;
				if(pontoElemento > maior)
					maior = pontoElemento;
				if(pontoElemento < menor)
					menor = pontoElemento;
			}
			somaTotalElementoi = (somaElementos-10*maior-10*menor)/9.0;
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
