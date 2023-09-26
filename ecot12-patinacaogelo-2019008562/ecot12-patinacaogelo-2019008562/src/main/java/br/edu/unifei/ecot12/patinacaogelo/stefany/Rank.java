package br.edu.unifei.ecot12.patinacaogelo.stefany;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

//Ranking dos patinadores através de uma lista de competidores
public class Rank implements Comparator<Patinador> {
	private String primeiroLugar;
	private String segundoLugar;
	private String terceiroLugar;
	private List<Patinador> patinadores = new ArrayList<Patinador>();
	
	public void classificacao () {
		//Uso da função sort com comparação de ordenação pelo score de cada patinador na lista
		patinadores.sort(Comparator.comparing(Patinador::getTotalScore));
		patinadores.sort(new Comparator<Patinador>() {
			@Override
			public int compare(Patinador o1, Patinador o2) {
				if (o2.getTotalScore() > o1.getTotalScore())
					return 1;
				else if (o2.getTotalScore() > o1.getTotalScore())
					return -1;
				else 
					return 0;
			}
		});
		
		int i = 1;
		for(Patinador p : patinadores) {
			System.out.println("Patinador no "+i+"º lugar: "+p.getNome());
			i++;
		}
		if(patinadores.size() == 1) {
			this.primeiroLugar = patinadores.get(0).getNome();
			this.segundoLugar = "Sem segundo lugar no momento";
			this.terceiroLugar = "Sem terceiro lugar no momento";
		}
		else if(patinadores.size() == 2) {
			this.primeiroLugar = patinadores.get(0).getNome();
			this.segundoLugar = patinadores.get(1).getNome();
			this.terceiroLugar = "Sem terceiro lugar no momento";
		}
		else if(patinadores.size() >= 3) {
			this.primeiroLugar = patinadores.get(0).getNome();
			this.segundoLugar = patinadores.get(1).getNome();
			this.terceiroLugar = patinadores.get(2).getNome();
		}
		else {
			this.primeiroLugar = "Colocação em espera...";
			this.segundoLugar = "Colocação em espera...";
			this.terceiroLugar = "Colocação em espera...";
		}
		
	}

	public String getPrimeiroLugar() {
		return primeiroLugar;
	}

	public void setPrimeiroLugar(String primeiroLugar) {
		this.primeiroLugar = primeiroLugar;
	}

	public String getSegundoLugar() {
		return segundoLugar;
	}

	public void setSegundoLugar(String segundoLugar) {
		this.segundoLugar = segundoLugar;
	}

	public String getTerceiroLugar() {
		return terceiroLugar;
	}

	public void setTerceiroLugar(String terceiroLugar) {
		this.terceiroLugar = terceiroLugar;
	}

	public List<Patinador> getPatinadores() {
		return patinadores;
	}

	public void setPatinadores(List<Patinador> patinadores) {
		this.patinadores = patinadores;
	}

	@Override
	public int compare(Patinador o1, Patinador o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
