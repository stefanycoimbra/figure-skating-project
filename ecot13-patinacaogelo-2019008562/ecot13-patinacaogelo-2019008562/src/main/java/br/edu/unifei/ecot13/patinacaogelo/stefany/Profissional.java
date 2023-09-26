package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

//Classe que representa todos os profissionais do esporte modelados

@Data
@Entity
public abstract class Profissional implements Serializable{
	private static final long serialVersionUID = -7311126130045247539L;
	@Id
	@GeneratedValue  
    private int codigo;
	private String nome;
	private String nacionalidade;
}
