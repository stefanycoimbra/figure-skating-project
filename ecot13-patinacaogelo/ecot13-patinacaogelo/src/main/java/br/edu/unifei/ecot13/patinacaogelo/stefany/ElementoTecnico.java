package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

//Classe que representa elementos técnicos, tais como Triple Toe, Twizzles, Spins, Jumps...

@Data
@Entity
public class ElementoTecnico implements Serializable{
	private static final long serialVersionUID = -7210781254006767123L;
	@Id
	@GeneratedValue   
    private int codigoId;
	private String nome;
	private String codigo;
	@ElementCollection
	private List<Double> valoresBase = new ArrayList<Double>();
	private String descricao;
	@Enumerated
	private EnumCorValida corValida;
}
