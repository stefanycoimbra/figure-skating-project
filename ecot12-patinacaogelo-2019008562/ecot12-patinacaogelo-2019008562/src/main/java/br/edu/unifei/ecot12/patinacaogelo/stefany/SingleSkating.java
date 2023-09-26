package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Modalidade individual --> competi��o individual
public class SingleSkating extends FigureSkating {
	
	public SingleSkating(ScoreSkating score) {
		super(score);
	}

	private Patinador patinador = new Patinador();
	
	//Regras da modalidade
	@Override
	public void regrasClassificacao() {
		System.out.println("Short Program(SP):");
		System.out.println("7 elementos t�cnicos;");
		System.out.println("5 componentes do programa;");
		System.out.println("Primeira e �ltima notas descartadas para contabiliza��o da pontua��o.");
		System.out.println();
		System.out.println("Free Skate(FS):");
		System.out.println("m�ximo de 7 jump elements (um deles deve ser um tipo de Axel);");
		System.out.println("m�ximo de 3 spins, com um deles sendo uma combina��o de spins, um eles flying spin ou spin com flying entrance e um spin com uma posi��o apenas;");
		System.out.println("m�ximo de um step sequence;");
		System.out.println("Apenas para nivel SsENIOR: m�ximo de uma choreographic sequence.");
	}

	public Patinador getPatinador() {
		return patinador;
	}

	public void setPatinador(Patinador patinador) {
		this.patinador = patinador;
	}
}
