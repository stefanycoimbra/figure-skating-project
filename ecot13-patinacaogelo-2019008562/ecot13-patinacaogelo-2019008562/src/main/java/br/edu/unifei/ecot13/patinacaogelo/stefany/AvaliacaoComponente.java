package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

//Classe que representa conjunto de avaliações de componentes

@Data
@Entity
public class AvaliacaoComponente implements Avaliacao<AvaliacaoComponente>, PontuacaoIgual<AvaliacaoComponente>, Serializable {
	private static final long serialVersionUID = -5037860525895920430L;
	@Id
	@GeneratedValue  
    private int codigo;
	private double pontuacaoComponente;
	
	//Cria um clone --> padrão protótipo para que possa utilizar o estado anterior e preservar
	//avaliação sem perdas ao esporte, mas ainda realizar testes
	@Transient
	public AvaliacaoComponente clone() {
		AvaliacaoComponente ae = new AvaliacaoComponente();
		ae.pontuacaoComponente=this.pontuacaoComponente;
		return ae;
	}
	
	//Verifica se uma avaliação de um componente é igual a outra
	@Transient
	@Override
	public boolean isEqual(AvaliacaoComponente obj) {		
		return (this.pontuacaoComponente==obj.pontuacaoComponente);
	}
	
}
