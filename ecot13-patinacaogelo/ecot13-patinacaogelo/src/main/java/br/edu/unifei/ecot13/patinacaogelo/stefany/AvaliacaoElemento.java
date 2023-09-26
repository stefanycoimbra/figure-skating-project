package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

//Classe que representa conjunto de avaliações de elementos

@Data
@Entity
public class AvaliacaoElemento implements Avaliacao<AvaliacaoElemento>, PontuacaoIgual<AvaliacaoElemento>, Serializable {
	private static final long serialVersionUID = 3248392086659454495L;
	@Id
	@GeneratedValue  
    private int codigo;
	private double pontuacaoElemento;
	
	//Cria um clone --> padrão protótipo para que possa utilizar o estado anterior e preservar
	//avaliação sem perdas ao esporte, mas ainda realizar testes
	@Transient
	public AvaliacaoElemento clone() {
		AvaliacaoElemento ae = new AvaliacaoElemento();
		ae.pontuacaoElemento=this.pontuacaoElemento;
		return ae;
	}
	
	//Verifica se uma avaliação de um elemento é igual a outra
	@Transient
	@Override
	public boolean isEqual(AvaliacaoElemento obj) {		
		return (this.pontuacaoElemento==obj.pontuacaoElemento);
	}
}
