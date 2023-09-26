package br.edu.unifei.ecot13.patinacaogelo.stefany;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;

//Dança no gelo --> precisa de um casal de um homem e uma mulher

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class IceDance extends FigureSkating {
	private static final long serialVersionUID = -2183146632099962872L;
	
	public IceDance() {}

	public IceDance(ScoreSkating score) {
		super(score);
	}
	
	@OneToOne
	private Patinador patinador1 = new Patinador();
	@OneToOne
	private Patinador patinador2 = new Patinador();
	
	//Regras da modalidade
	@Transient
	@Override
	public void regrasClassificacao() {
		System.out.println("Rhythms Junior and Senior:");
		System.out.println("Pelo menos dois ritmos diferentes dos seguintes: Street Dance Rhythms (such as hip hop, disco, swing, krump, popping, funk, etc.), jazz,\r\n"
				+ "reggae (reggaeton) e blues ");
		System.out.println("máximo de 1 Short Lift;");
		System.out.println("1 Step Sequence;");
		System.out.println("1 conjunto de Twizzles em sequência.");
		System.out.println();
		System.out.println("Free Dance:");
		System.out.println("Junior: dois tipos diferentes de Short Lift ou 1 Combination Lift;");
		System.out.println("Senior: dois tipos diferentes de Short Lift ou 1 Short Lift e 1 Combination Lift de diferentes tipos;");
		System.out.println("1 Dance Spin (Spin ou Combination Spin);");
		System.out.println("Step Sequence – Tipos: Straight Line ou Curve;");
		System.out.println("Synchronized Twizzles;");
		System.out.println("Choreographic element.");
	}
	
	@Transient
	public void setPatinadores(Patinador patinador1, Patinador patinador2) {
		this.setPatinador1(patinador1);
		this.setPatinador2(patinador1);
	}
}
