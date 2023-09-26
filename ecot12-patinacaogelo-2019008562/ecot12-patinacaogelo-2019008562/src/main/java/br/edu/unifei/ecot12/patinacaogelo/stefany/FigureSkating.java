package br.edu.unifei.ecot12.patinacaogelo.stefany;

//Classe Abstrata que valida música e tem dependência de um score para ser criada --> uso do padrão Ponte
public abstract class FigureSkating {
	private String nomeMusica;
	private EnumQualidadeMusica qualidadeMusica;
	private double tempoMusicaSegundos;
	private double soundPressuredB;
	private String duracaoPrograma;
	private String compositores;
	private ScoreSkating programa;
	private String nomeModalidade;
	
	public FigureSkating(ScoreSkating programa) {
		this.programa = programa;
	}
	
	public boolean validaMusica(double soundPressuredB, EnumQualidadeMusica qualidade) {
		if(soundPressuredB > 85 && qualidade == EnumQualidadeMusica.HIGH_QUALITY)
			return false;
		else return true;
	}
	
	public abstract void regrasClassificacao();

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public EnumQualidadeMusica getQualidadeMusica() {
		return qualidadeMusica;
	}

	public void setQualidadeMusica(EnumQualidadeMusica qualidadeMusica) {
		this.qualidadeMusica = qualidadeMusica;
	}

	public double getTempoMusicaSegundos() {
		return tempoMusicaSegundos;
	}

	public void setTempoMusicaSegundos(double tempoMusicaSegundos) {
		this.tempoMusicaSegundos = tempoMusicaSegundos;
	}

	public double getSoundPressuredB() {
		return soundPressuredB;
	}

	public void setSoundPressuredB(double soundPressuredB) {
		this.soundPressuredB = soundPressuredB;
	}

	public String getDuracaoPrograma() {
		return duracaoPrograma;
	}

	public void setDuracaoPrograma(String duracaoPrograma) {
		this.duracaoPrograma = duracaoPrograma;
	}

	public String getCompositores() {
		return compositores;
	}

	public void setCompositores(String compositores) {
		this.compositores = compositores;
	}

	public ScoreSkating getScore() {
		return programa;
	}

	public void setScore(ScoreSkating programa) {
		this.programa = programa;
	}
	
	public String getNomeModalidade() {
		return nomeModalidade;
	}

	public void setNomeModalidade(String nomeModalidade) {
		this.nomeModalidade = nomeModalidade;
	}
}
