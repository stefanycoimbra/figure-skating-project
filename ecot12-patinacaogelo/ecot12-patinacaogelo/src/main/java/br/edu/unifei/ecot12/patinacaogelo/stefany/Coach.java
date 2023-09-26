package br.edu.unifei.ecot12.patinacaogelo.stefany;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//Classe que representa os coaches dos patinadores
public class Coach extends Profissional {
	private Date dataNascimento;
	private String curiosidade;
	private String tipo;
	private Patinador patinador;
	
	public int idade() {
		Calendar dateOfBirth = new GregorianCalendar();
		dateOfBirth.setTime(this.dataNascimento);

		//Cria um objeto calendar com a data atual
		Calendar today = Calendar.getInstance();

		//Obtém a idade baseado no ano
		int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

		dateOfBirth.add(Calendar.YEAR, age);
		
		//Se a data de hoje é antes da data de Nascimento, então diminui 1(um)
		if (today.before(dateOfBirth)) 
			age--;

		return age;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCuriosidade() {
		return curiosidade;
	}
	public void setCuriosidade(String curiosidade) {
		this.curiosidade = curiosidade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Patinador getPatinador() {
		return patinador;
	}
	public void setPatinador(Patinador patinador) {
		this.patinador = patinador;
	}
}
