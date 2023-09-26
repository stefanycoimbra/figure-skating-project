package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import lombok.Data;

//Classe Abstrata que valida música e tem dependência de um score para ser criada --> uso do padrão Ponte

@Data
@Entity
public abstract class FigureSkating implements Serializable{
	private static final long serialVersionUID = -7924600152220672152L;
	@Id
	@GeneratedValue 
    private int codigo;
	private String nomeMusica;
	@Enumerated(EnumType.STRING)
	private EnumQualidadeMusica qualidadeMusica;
	private double tempoMusicaSegundos;
	private double soundPressuredB;
	private String duracaoPrograma;
	private String compositores;
	@OneToOne
	private ScoreSkating programa;
	private String nomeModalidade;
	
	public FigureSkating() {}
	
	public FigureSkating(ScoreSkating programa) {
		this.programa = programa;
	}
	
	@Transient
	public boolean validaMusica(double soundPressuredB, EnumQualidadeMusica qualidade) {
		if(soundPressuredB > 85 && qualidade == EnumQualidadeMusica.HIGH_QUALITY)
			return false;
		else return true;
	}
	
	@Transient
	public abstract void regrasClassificacao();
}
