package br.edu.unifei.ecot12.patinacaogelo.stefany;

import java.util.ArrayList;
import java.util.List;

//Score de um programa dentro e uma modalidade, através do programa curto, longo e soma de ambos
public abstract class ScoreSkating {
	private int numeroElementosRequisitados;
	private int numeroComponentesPrograma;
	private String codigoComponente;
	private String nomeComponente;
	private String painelTecnico;
	private double deducaoElementos = 0.0;
	private List<ElementoTecnico> elementos = new ArrayList<ElementoTecnico>();
	
	private Judge juizes[] = new Judge[9];
	
	public abstract double scoreProgramElementos();
	
	//São sempre 5 componentes a serem avaliados, independente da categoria
	public double scoreProgramComponentes() {
		double somaComponentes = 0.0;
		double menor = 100.0;
		double maior = 0.0;
		double pontoComponente = 0.0;
		double somaTotal = 0.0, somaTotalComponentei = 0.0;
		for(Judge j : juizes) {
			List<AvaliacaoComponente> ac = j.getPontuacaoComponentes();
			int w = 0;
			for(AvaliacaoComponente c : ac) {
				pontoComponente = c.getPontuacaoComponente();
				if(pontoComponente > maior)
					maior = pontoComponente;
				if(pontoComponente < menor)
					menor = pontoComponente;
				somaComponentes += pontoComponente;
				w++;
			}
			somaTotalComponentei = (somaComponentes-5*maior-5*menor)/9.0;
			somaTotal += somaTotalComponentei;
		}
		return (somaTotal);
	}
	
	public double totalScore() {
		return (scoreProgramElementos()+scoreProgramComponentes());
	}
	public int getNumeroElementosRequisitados() {
		return numeroElementosRequisitados;
	}
	public void setNumeroElementosRequisitados(int numeroElementosRequisitados) {
		this.numeroElementosRequisitados = numeroElementosRequisitados;
	}
	public int getNumeroComponentesPrograma() {
		return numeroComponentesPrograma;
	}
	public void setNumeroComponentesPrograma(int numeroComponentesPrograma) {
		this.numeroComponentesPrograma = numeroComponentesPrograma;
	}
	public String getCodigoComponente() {
		return codigoComponente;
	}
	public void setCodigoComponente(String codigoComponente) {
		this.codigoComponente = codigoComponente;
	}
	public String getNomeComponente() {
		return nomeComponente;
	}
	public void setNomeComponente(String nomeComponente) {
		this.nomeComponente = nomeComponente;
	}
	public String getPainelTecnico() {
		return painelTecnico;
	}
	public void setPainelTecnico(String painelTecnico) {
		this.painelTecnico = painelTecnico;
	}
	public List<ElementoTecnico> getElementos() {
		return elementos;
	}
	public void setElementos(List<ElementoTecnico> elementos) {
		this.elementos = elementos;
	}
	public Judge[] getJuizes() {
		return juizes;
	}
	public void setJuizes(Judge[] juizes) {
		this.juizes = juizes;
	}
	public double getDeducaoElementos() {
		return deducaoElementos;
	}
	public void setDeducaoElementos(double deducaoElementos) {
		this.deducaoElementos = deducaoElementos;
	}
}
