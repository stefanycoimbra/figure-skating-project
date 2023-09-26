package br.edu.unifei.ecot12.patinacaogelo.stefany;

import java.util.ArrayList;
import java.util.List;

//Classe que representa elementos técnicos, tais como Triple Toe, Twizzles, Spins, Jumps...
public class ElementoTecnico {
	private String nome;
	private String codigo;
	private List<Double> valoresBase = new ArrayList<Double>();
	private String descricao;
	private EnumCorValida corValida;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public List<Double> getValoresBase() {
		return valoresBase;
	}
	public void setValoresBase(List<Double> valoresBase) {
		this.valoresBase = valoresBase;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public EnumCorValida getCorValida() {
		return corValida;
	}
	public void setCorValida(EnumCorValida corValida) {
		this.corValida = corValida;
	}
}
