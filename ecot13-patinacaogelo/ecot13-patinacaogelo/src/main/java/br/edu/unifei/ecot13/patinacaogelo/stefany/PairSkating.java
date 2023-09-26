package br.edu.unifei.ecot13.patinacaogelo.stefany;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;

//Patinação Artística em Pares --> precisa de um casal de um homem e uma mulher

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class PairSkating extends FigureSkating {
	private static final long serialVersionUID = 4622822470272488270L;
	
	public PairSkating() {}

	public PairSkating(ScoreSkating score) {
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
		System.out.println("Short Program(SP):");
		System.out.println("7 elementos técnicos;");
		System.out.println("5 componentes do programa;");
		System.out.println("Primeira e Última notas descartadas para contabilização da pontuação.");
		System.out.println();
		System.out.println("Free Skate(FS):");
		System.out.println("Senior Well-Balanced Program");
		System.out.println("máximo de 3 lifts, nem todos do mesmo grupo, com total extensão dos braços levantados;");
		System.out.println("máximo de 1 twist lift;");
		System.out.println("máximo de 2 diferentes throw jumps;");
		System.out.println("máximo de 1 solo jump;");
		System.out.println("máximo de 1 jump combination ou sequence;");
		System.out.println("máximo de 1 pair spin combination;");
		System.out.println("máximo de 1 death spiral diferente da usada no programa curto;");
		System.out.println("máximo de 1 choreographic sequence.");
		System.out.println("Junior Well-Balanced Program");
		System.out.println("máximo de 2 lifts, nem todos do mesmo grupo, com total extensão dos braços levantados;");
		System.out.println("máximo de 1 twist lift;");
		System.out.println("máximo de 2 diferentes throw jumps;");
		System.out.println("máximo de 1 solo jump;");
		System.out.println("máximo de 1 jump combination ou sequence;");
		System.out.println("máximo de 1 pair spin combination;");
		System.out.println("máximo de 1 death spiral;");
		System.out.println("máximo de 1 choreographic sequence.");
	}
	
	@Transient
	public void setPatinadores(Patinador patinador1, Patinador patinador2) {
		this.patinador1 = patinador1;
		this.patinador2 = patinador2;
	}
}
