package br.edu.unifei.ecot12.patinacaogelo.stefany;

import java.util.ArrayList;
import java.util.List;

//Patinação Sincronizada --> até 8 competidores por time no gelo competindo
public class SynchronizedSkating extends FigureSkating{
	
	public SynchronizedSkating(ScoreSkating score) {
		super(score);
	}

	private List<Patinador> patinadores = new ArrayList<Patinador>();
	
	//Regras da modalidade
	@Override
	public void regrasClassificacao() {
		System.out.println("Short Program(SP):");
		System.out.println("5 elementos técnicos;");
		System.out.println("5 componentes do programa;");
		System.out.println();
		System.out.println("Free Skate(FS):");
		System.out.println("Nível Senior:");
		System.out.println("oito elementos: Creative Element – Lift, Group Lift Element, 2 diferentes Intersection Elements, Move Element, No Hold Element, Pair Element, Twizzle Element;");
		System.out.println("nono elemento: Artistic Element – Circle ou Artistic Element – Wheel;");
		System.out.println("Nível Junior:");
		System.out.println("oito elementos: 2 diferentes Intersection Elements, Move Element, No Hold Element, Pivoting Element – Block, Synchronized Spin Element, Traveling Element - Circle;");
		System.out.println("nono elemento: Artistic Element – Line ou Artistic Element – Wheel.");
	}

	public List<Patinador> getPatinadores() {
		return patinadores;
	}

	public void setPatinadores(List<Patinador> patinadores) {
		this.patinadores = patinadores;
	}
	
}
