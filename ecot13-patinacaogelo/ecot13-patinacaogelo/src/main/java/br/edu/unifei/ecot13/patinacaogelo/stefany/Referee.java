package br.edu.unifei.ecot13.patinacaogelo.stefany;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;
import lombok.EqualsAndHashCode;

//Classe que representa o conjunto de árbitros do esporte

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Referee extends Profissional {
	private static final long serialVersionUID = -450936822933682285L;
	private String tituloHonorifico;
	@Enumerated(EnumType.STRING)
	private EnumTipoCargoReferee tipoCargo;
}
