package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;

//Classe que representa o conjunto de eventos de uma competição de patinação

@Data
@Entity
public class Evento implements Serializable{
	private static final long serialVersionUID = 9021005590889788629L;
	@Id
	@GeneratedValue 
    private int codigo;
	private String nome;
	@Enumerated(EnumType.STRING)
	private EnumNivelCompeticao nivelCompeticao;
	private String local;
	@Temporal(TemporalType.DATE)
	private Date inicioEvento;
	@Temporal(TemporalType.DATE)
	private Date fimEvento;
	@OneToMany
	private List<Profissional> profissionais = new ArrayList<Profissional>(); 
	@OneToMany
	private List<FigureSkating> modalidades = new ArrayList<FigureSkating>(); 
	
	@Transient
	public int duracaoDiasEvento() {
		Calendar dataInicio = new GregorianCalendar();
		dataInicio.setTime(this.inicioEvento);
		
		Calendar dataFim = new GregorianCalendar();
		dataFim.setTime(this.fimEvento);
		
		int duracao = dataFim.get(Calendar.DAY_OF_MONTH) - dataInicio.get(Calendar.DAY_OF_MONTH);

		dataInicio.add(Calendar.DAY_OF_MONTH, duracao);
				
		if (dataFim.before(dataInicio)) 
			duracao--;

		return duracao;
	}
	
	//Verifica se competidor está apto à participar do evento a depender do nível da competição
	@SuppressWarnings("unlikely-arg-type")
	@Transient
	public boolean validaCompetidor(Patinador p) {
		if(this.nivelCompeticao.equals("SENIOR") && p.idade() >= 15)
			return true;
		else if(this.nivelCompeticao.equals("JUNIOR") && (p.idade() >= 13 && p.idade() <= 19))
			return true;
		else if(this.nivelCompeticao.equals("ADVANCED_NOVICE") && (p.idade() >= 10 && p.idade() <= 15))
			return true;
		else if(this.nivelCompeticao.equals("INTERMEDIATE_NOVICE") && p.idade() < 15)
			return true;
		else if(this.nivelCompeticao.equals("BASIC_NOVICE") && p.idade() < 13)
			return true;
		else return false;
	}
	
}
