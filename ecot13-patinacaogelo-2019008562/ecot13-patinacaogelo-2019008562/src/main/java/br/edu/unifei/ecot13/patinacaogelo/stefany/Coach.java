package br.edu.unifei.ecot13.patinacaogelo.stefany;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;

//Classe que representa os coaches dos patinadores

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Coach extends Profissional {
	private static final long serialVersionUID = -9195101359525302523L;
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	private String curiosidade;
	private String tipo;
	@OneToOne
	private Patinador patinador;
	private int age;
	
	@Transient
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
		
		this.age = age;
		return age;
	}
}
