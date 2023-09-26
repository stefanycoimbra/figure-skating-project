package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

//Fábrica de avaliações de elementos --> uso do padrão método de fábrica

@Data
@Entity
public class PontuaElemento implements JudgeFabricaPontuacao<AvaliacaoElemento>, Serializable {
	private static final long serialVersionUID = -8887753563053626608L;
	@Id
	@GeneratedValue 
    private int codigo;
	
	@Transient
	@Override
	public AvaliacaoElemento pontuarPrograma() {
		return (new AvaliacaoElemento());
	}
}
