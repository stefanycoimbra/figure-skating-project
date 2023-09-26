package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Dança no gelo --> precisa de um casal de um homem e uma mulher
public class IceDance extends FigureSkating {
	
	public IceDance(ScoreSkating score) {
		super(score);
	}

	private Patinador patinador1 = new Patinador();
	private Patinador patinador2 = new Patinador();
	
	//Regras da modalidade
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

	public Patinador getPatinador1() {
		return patinador1;
	}

	public void setPatinador1(Patinador patinador1) {
		this.patinador1 = patinador1;
	}

	public Patinador getPatinador2() {
		return patinador2;
	}

	public void setPatinador2(Patinador patinador2) {
		this.patinador2 = patinador2;
	}

	public void setPatinadores(Patinador patinador1, Patinador patinador2) {
		this.patinador1 = patinador1;
		this.patinador2 = patinador2;
	}
}
