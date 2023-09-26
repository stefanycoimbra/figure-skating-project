package br.edu.unifei.ecot12.patinacaogelo.stefany;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

//Classe que representa o conjunto de eventos de uma competição de patinação
public class Evento {
	private String nome;
	private EnumNivelCompeticao nivelCompeticao;
	private String local;
	private Date inicioEvento;
	private Date fimEvento;
	private List<Profissional> profissionais = new ArrayList<Profissional>(); 
	private List<FigureSkating> modalidades = new ArrayList<FigureSkating>(); 
	
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EnumNivelCompeticao getNivelCompeticao() {
		return nivelCompeticao;
	}

	public void setNivelCompeticao(EnumNivelCompeticao nivelCompeticao) {
		this.nivelCompeticao = nivelCompeticao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Date getInicioEvento() {
		return inicioEvento;
	}

	public void setInicioEvento(Date inicioEvento) {
		this.inicioEvento = inicioEvento;
	}

	public Date getFimEvento() {
		return fimEvento;
	}

	public void setFimEvento(Date fimEvento) {
		this.fimEvento = fimEvento;
	}

	public List<Profissional> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(List<Profissional> profissionais) {
		this.profissionais = profissionais;
	}

	public List<FigureSkating> getModalidades() {
		return modalidades;
	}

	public void setModalidades(List<FigureSkating> modalidades) {
		this.modalidades = modalidades;
	}
	
}
