package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

//Classe que representa os juízes da competição
//Possuem duas listas: uma correspondente às notas que deram aos 5 componentes de programa
//A outra é referente às notas que deram aos elementos técnicos

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Judge extends Profissional{
	private static final long serialVersionUID = -5595248658390402671L;
	private String tituloPessoal;
	@Enumerated(EnumType.STRING)
	private EnumTipoCargoJudge tipoCargo;
	@OneToMany
	private List<AvaliacaoComponente> pontuacaoComponentes = new ArrayList<AvaliacaoComponente>();
	@OneToMany
	private List<AvaliacaoElemento> pontuacaoElementos = new ArrayList<AvaliacaoElemento>();
}
