package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

//Fábrica de avaliações de componentes --> uso do padrão método de fábrica

@Data
@Entity
public class PontuaComponente implements JudgeFabricaPontuacao<AvaliacaoComponente>, Serializable {
	private static final long serialVersionUID = -4057652711337691109L;
	@Id
	@GeneratedValue
    private int codigo;
	
	@Transient
	@Override
	public AvaliacaoComponente pontuarPrograma() {
		return (new AvaliacaoComponente());
	}
}
