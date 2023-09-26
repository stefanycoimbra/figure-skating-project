package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import lombok.Data;

//Possui a soma das pontuações em cada uma das 8 modalidades de Figure Skating para compor o score do time

@Data
@Entity
public class TeamEvent implements Serializable{
	private static final long serialVersionUID = 7907839044006663177L;
	@Id
	@GeneratedValue  
    private int codigo;
	
	@OneToOne
	private FigureSkating modalidade1;
	@OneToOne
	private FigureSkating modalidade2;
	@OneToOne
	private FigureSkating modalidade3;
	@OneToOne
	private FigureSkating modalidade4;
	@OneToOne
	private FigureSkating modalidade5;
	@OneToOne
	private FigureSkating modalidade6;
	@OneToOne
	private FigureSkating modalidade7;
	@OneToOne
	private FigureSkating modalidade8;
	
	
	private FigureSkating modalidades[] = new FigureSkating[8];
	
	@Transient
	public double totalPontuacao() {
		double soma = 0.0;
		for(FigureSkating fs : modalidades) {
			soma += fs.getPrograma().totalScore();
		}
		return soma;
	}
	
	@Transient
	public void setModalidades() {
		modalidades[0] = this.modalidade1;
		modalidades[1] = this.modalidade2;
		modalidades[2] = this.modalidade3;
		modalidades[3] = this.modalidade4;
		modalidades[4] = this.modalidade5;
		modalidades[5] = this.modalidade6;
		modalidades[6] = this.modalidade7;
		modalidades[7] = this.modalidade8;
	}
}
