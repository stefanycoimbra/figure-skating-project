package br.edu.unifei.ecot12.patinacaogelo.stefany;

import java.util.ArrayList;
import java.util.List;

//Classe que representa os juízes da competição
//Possuem duas listas: uma correspondente às notas que deram aos 5 componentes de programa
//A outra é referente às notas que deram aos elementos técnicos
public class Judge extends Profissional {
	private String tituloHonorifico;
	private EnumTipoCargoJudge tipoCargo;
	private List<AvaliacaoComponente> pontuacaoComponentes = new ArrayList<AvaliacaoComponente>();
	private List<AvaliacaoElemento> pontuacaoElementos = new ArrayList<AvaliacaoElemento>();
	
	public String getTituloHonorifico() {
		return tituloHonorifico;
	}
	public void setTituloHonorifico(String tituloHonorifico) {
		this.tituloHonorifico = tituloHonorifico;
	}
	public EnumTipoCargoJudge getTipoCargo() {
		return tipoCargo;
	}
	public void setTipoCargo(EnumTipoCargoJudge tipoCargo) {
		this.tipoCargo = tipoCargo;
	}
	public List<AvaliacaoComponente> getPontuacaoComponentes() {
		return pontuacaoComponentes;
	}
	public void setPontuacaoComponentes(List<AvaliacaoComponente> pontuacaoComponentes) {
		this.pontuacaoComponentes = pontuacaoComponentes;
	}
	public List<AvaliacaoElemento> getPontuacaoElementos() {
		return pontuacaoElementos;
	}
	public void setPontuacaoElementos(List<AvaliacaoElemento> pontuacaoElementos) {
		this.pontuacaoElementos = pontuacaoElementos;
	}
}
