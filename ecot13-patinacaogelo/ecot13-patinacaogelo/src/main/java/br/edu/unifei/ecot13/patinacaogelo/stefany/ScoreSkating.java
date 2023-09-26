package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import lombok.Data;


//Score de um programa dentro e uma modalidade, através do programa curto, longo e soma de ambos

@Data
@Entity
public abstract class ScoreSkating implements Serializable{
	private static final long serialVersionUID = 6963563509860912888L;
	@Id
	@GeneratedValue  
    private int codigo;
	private int numeroElementosRequisitados;
	private int numeroComponentesPrograma;
	private String codigoComponente;
	private String nomeComponente;
	private String painelTecnico;
	private double deducaoElementos = 0.0;
	private double totalScoreSave = 0.0;
	@OneToMany
	private List<ElementoTecnico> elementos = new ArrayList<ElementoTecnico>();
	
	@OneToOne
	private Judge juiz1;
	@OneToOne
	private Judge juiz2;
	@OneToOne
	private Judge juiz3;
	@OneToOne
	private Judge juiz4;
	@OneToOne
	private Judge juiz5;
	@OneToOne
	private Judge juiz6;
	@OneToOne
	private Judge juiz7;
	@OneToOne
	private Judge juiz8;
	@OneToOne
	private Judge juiz9;
	
	private transient Judge juizes[] = new Judge[9];
	
	public ScoreSkating() {
		this.setJuizes();
	}
	
	public abstract double scoreProgramElementos();
	
	//São sempre 5 componentes a serem avaliados, independente da categoria
	@Transient
	public double scoreProgramComponentes() {
		double somaComponentes = 0.0;
		double menor = 100.0;
		double maior = 0.0;
		double pontoComponente = 0.0;
		double somaTotal = 0.0, somaTotalComponentei = 0.0;
		for(Judge j : juizes) {
			List<AvaliacaoComponente> ac = j.getPontuacaoComponentes();
			for(AvaliacaoComponente c : ac) {
				pontoComponente = c.getPontuacaoComponente();
				if(pontoComponente > maior)
					maior = pontoComponente;
				if(pontoComponente < menor)
					menor = pontoComponente;
				somaComponentes += pontoComponente;
			}
			somaTotalComponentei = (somaComponentes-5*maior-5*menor)/9.0;
			somaTotal += somaTotalComponentei;
		}
		return (somaTotal);
	}
	
	@Transient
	public double totalScore() {
		this.setTotalScoreSave(scoreProgramElementos()+scoreProgramComponentes());
		return (scoreProgramElementos()+scoreProgramComponentes());
	}
	
	@Transient
	public void setJuizes() {
		juizes[0] = this.juiz1;
		juizes[1] = this.juiz2;
		juizes[2] = this.juiz3;
		juizes[3] = this.juiz4;
		juizes[4] = this.juiz5;
		juizes[5] = this.juiz6;
		juizes[6] = this.juiz7;
		juizes[7] = this.juiz8;
		juizes[8] = this.juiz9;
	}
}
