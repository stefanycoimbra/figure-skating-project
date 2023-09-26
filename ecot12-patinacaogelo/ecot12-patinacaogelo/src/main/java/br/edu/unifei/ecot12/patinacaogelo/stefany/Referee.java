package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Classe que representa o conjunto de árbitros do esporte
public class Referee extends Profissional {
	private String tituloHonorifico;
	private EnumTipoCargoReferee tipoCargo;
	
	public String getTituloHonorifico() {
		return tituloHonorifico;
	}
	public void setTituloHonorifico(String tituloHonorifico) {
		this.tituloHonorifico = tituloHonorifico;
	}
	public EnumTipoCargoReferee getTipoCargo() {
		return tipoCargo;
	}
	public void setTipoCargo(EnumTipoCargoReferee tipoCargo) {
		this.tipoCargo = tipoCargo;
	}
}
