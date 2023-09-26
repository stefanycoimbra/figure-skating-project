package br.edu.ecot12.patinacaogelo.stefany.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.edu.unifei.ecot12.patinacaogelo.stefany.AvaliacaoComponente;
import br.edu.unifei.ecot12.patinacaogelo.stefany.AvaliacaoElemento;
import br.edu.unifei.ecot12.patinacaogelo.stefany.Coach;
import br.edu.unifei.ecot12.patinacaogelo.stefany.ElementoTecnico;
import br.edu.unifei.ecot12.patinacaogelo.stefany.EnumCorValida;
import br.edu.unifei.ecot12.patinacaogelo.stefany.EnumQualidadeMusica;
import br.edu.unifei.ecot12.patinacaogelo.stefany.Evento;
import br.edu.unifei.ecot12.patinacaogelo.stefany.IceDance;
import br.edu.unifei.ecot12.patinacaogelo.stefany.Judge;
import br.edu.unifei.ecot12.patinacaogelo.stefany.Patinador;
import br.edu.unifei.ecot12.patinacaogelo.stefany.PontuaComponente;
import br.edu.unifei.ecot12.patinacaogelo.stefany.PontuaElemento;
import br.edu.unifei.ecot12.patinacaogelo.stefany.Rank;
import br.edu.unifei.ecot12.patinacaogelo.stefany.RythmDance;
import br.edu.unifei.ecot12.patinacaogelo.stefany.ShortProgram;
import br.edu.unifei.ecot12.patinacaogelo.stefany.SingleSkating;

public class App {

	public static void main(String[] args) throws ParseException {
		
		//Criação de primeiro patinador para score SP
		
		Patinador nathan = new Patinador();
		nathan.setNome("Nathan Chen");
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Date data = f.parse("05/05/1999");
		nathan.setDataNascimento(data);
		nathan.setNacionalidade("Estado-Unidense");
		nathan.setCuriosidade("Nathan Chen anotou um recorde mundial com sua apresentação no programa curto individual na patinação artística dos Jogos Olímpicos de Inverno em Pequim. O norte-americano conseguiu a marca de 113.97 pontos, superando o anterior recorde de Yuzuru Hanyu.");
		
		Judge juizes[] = new Judge[9];
		
		for(int i=0;i<9;i++) {
			juizes[i]=new Judge();
		} 
		
		//Criação de Elementos Técnicos
		
		ElementoTecnico e1 = new ElementoTecnico();
		e1.setCorValida(EnumCorValida.VERDE);
		ElementoTecnico e2 = new ElementoTecnico();
		e2.setCorValida(EnumCorValida.VERDE);
		ElementoTecnico e3 = new ElementoTecnico();
		e3.setCorValida(EnumCorValida.VERMELHO);
		ElementoTecnico e4 = new ElementoTecnico();
		e4.setCorValida(EnumCorValida.VERDE);
		ElementoTecnico e5 = new ElementoTecnico();
		e5.setCorValida(EnumCorValida.VERDE);
		ElementoTecnico e6 = new ElementoTecnico();
		e6.setCorValida(EnumCorValida.VERMELHO);
		ElementoTecnico e7 = new ElementoTecnico();
		e7.setCorValida(EnumCorValida.VERDE);
		
		//Verificando um elemento
		
		e1.setCodigo("1Tw1");
		e1.setDescricao("Um giro em um pé com uma ou mais rotações que é feita rapidamente com uma ação contínua");
		
		System.out.println("Elemento 1: "+e1.getCodigo());
		System.out.println("Descrição do Elemento 1: "+e1.getDescricao());
		
		System.out.println();
		
		List<Double> val1 = new ArrayList<Double>();
		val1.add(-5.50);
		val1.add(-4.40);
		val1.add(-3.30);
		val1.add(-2.20);
		val1.add(-1.10);
		val1.add(11.00);
		val1.add(+1.10);
		val1.add(+2.20);
		val1.add(+3.30);
		val1.add(+4.40);
		val1.add(+5.50);
		e1.setValoresBase(val1);
		
		List<Double> val2 = new ArrayList<Double>();
		val2.add(-4.00);
		val2.add(-3.20);
		val2.add(-2.40);
		val2.add(-1.60);
		val2.add(-0.80);
		val2.add(+8.00);
		val2.add(+0.80);
		val2.add(+1.60);
		val2.add(+2.40);
		val2.add(+3.20);
		val2.add(+4.00);
		e2.setValoresBase(val2);
		
		List<Double> val3 = new ArrayList<Double>();
		val3.add(-1.60);
		val3.add(-1.28);
		val3.add(-0.96);
		val3.add(-0.64);
		val3.add(-0.32);
		val3.add(+3.20);
		val3.add(+0.32);
		val3.add(+0.64);
		val3.add(+0.96);
		val3.add(+1.28);
		val3.add(+1.60);
		e3.setValoresBase(val3);
		
		List<Double> val4 = new ArrayList<Double>();
		val4.add(-7.85);
		val4.add(-6.28);
		val4.add(-4.71);
		val4.add(-3.14);
		val4.add(-1.57);
		val4.add(+15.70);
		val4.add(+1.57);
		val4.add(+3.14);
		val4.add(+4.71);
		val4.add(+6.28);
		val4.add(+7.85);
		e4.setValoresBase(val4);
		
		List<Double> val5 = new ArrayList<Double>();
		val5.add(-1.95);
		val5.add(-1.56);
		val5.add(-1.17);
		val5.add(-0.78);
		val5.add(-0.39);
		val5.add(+3.90);
		val5.add(+0.39);
		val5.add(+0.78);
		val5.add(+1.17);
		val5.add(+1.56);
		val5.add(+1.95);
		e5.setValoresBase(val5);
		
		List<Double> val6 = new ArrayList<Double>();
		val6.add(-1.50);
		val6.add(-1.20);
		val6.add(-0.90);
		val6.add(-0.60);
		val6.add(-0.30);
		val6.add(+3.00);
		val6.add(+0.30);
		val6.add(+0.60);
		val6.add(+0.90);
		val6.add(+1.20);
		val6.add(+1.50);
		e6.setValoresBase(val6);
		
		List<Double> val7 = new ArrayList<Double>();
		val7.add(-1.75);
		val7.add(-1.40);
		val7.add(-1.05);
		val7.add(-0.70);
		val7.add(-0.35);
		val7.add(+3.50);
		val7.add(+0.35);
		val7.add(+0.70);
		val7.add(+1.05);
		val7.add(+1.40);
		val7.add(+1.75);
		e7.setValoresBase(val7);
		
		List<ElementoTecnico> elementos = new ArrayList<ElementoTecnico>();
		elementos.add(e1);
		elementos.add(e2);
		elementos.add(e3);
		elementos.add(e4);
		elementos.add(e5);
		elementos.add(e6);
		elementos.add(e7);
		
		List<AvaliacaoComponente> pointsComponentes = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes = new ArrayList<Double>();
		List<Integer> listElementos = new ArrayList<Integer>();
		
		//Juiz 01
		
		listComponentes.add(9.75);
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		
		listElementos.add(4);
		listElementos.add(3);
		listElementos.add(4);
		listElementos.add(4);
		listElementos.add(5);
		listElementos.add(3);
		listElementos.add(4);
		
		int i;
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
		
		juizes[0].setPontuacaoComponentes(pointsComponentes);
		juizes[0].setPontuacaoElementos(pointsElementos);
		
		//Juiz 02
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
		
		listComponentes.add(9.25);
		listComponentes.add(9.25);
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		listComponentes.add(9.75);
		
		listElementos.add(4);
		listElementos.add(3);
		listElementos.add(4);
		listElementos.add(4);
		listElementos.add(5);
		listElementos.add(4);
		listElementos.add(4);
		
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
		
		juizes[1].setPontuacaoComponentes(pointsComponentes);
		juizes[1].setPontuacaoElementos(pointsElementos);
		
		//Juiz 03
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
				
		listComponentes.add(9.50);
		listComponentes.add(9.25);
		listComponentes.add(9.75);
		listComponentes.add(10.00);
		listComponentes.add(10.00);
				
		listElementos.add(5);
		listElementos.add(3);
		listElementos.add(3);
		listElementos.add(4);
		listElementos.add(5);
		listElementos.add(4);
		listElementos.add(4);
				
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
				
		juizes[2].setPontuacaoComponentes(pointsComponentes);
		juizes[2].setPontuacaoElementos(pointsElementos);
		
		//Juiz 04
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
						
		listComponentes.add(9.75);
		listComponentes.add(9.50);
		listComponentes.add(10.00);
		listComponentes.add(9.75);
		listComponentes.add(9.75);
						
		listElementos.add(4);
		listElementos.add(3);
		listElementos.add(4);
		listElementos.add(3);
		listElementos.add(5);
		listElementos.add(3);
		listElementos.add(5);
						
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
						
		juizes[3].setPontuacaoComponentes(pointsComponentes);
		juizes[3].setPontuacaoElementos(pointsElementos);
		
		//Juiz 05
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
						
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		listComponentes.add(9.75);
		listComponentes.add(9.50);
						
		listElementos.add(4);
		listElementos.add(4);
		listElementos.add(3);
		listElementos.add(4);
		listElementos.add(5);
		listElementos.add(4);
		listElementos.add(4);
		
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
						
		juizes[4].setPontuacaoComponentes(pointsComponentes);
		juizes[4].setPontuacaoElementos(pointsElementos);
		
		//Juiz 06
				
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
						
		listComponentes.add(9.75);
		listComponentes.add(9.50);
		listComponentes.add(9.75);
		listComponentes.add(9.75);
		listComponentes.add(9.50);
						
		listElementos.add(4);
		listElementos.add(2);
		listElementos.add(3);
		listElementos.add(2);
		listElementos.add(5);
		listElementos.add(3);
		listElementos.add(4);
						
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
						
		juizes[5].setPontuacaoComponentes(pointsComponentes);
		juizes[5].setPontuacaoElementos(pointsElementos);
		
		//Juiz 07
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
						
		listComponentes.add(9.50);
		listComponentes.add(9.25);
		listComponentes.add(9.50);
		listComponentes.add(9.25);
		listComponentes.add(9.50);
						
		listElementos.add(4);
		listElementos.add(2);
		listElementos.add(3);
		listElementos.add(2);
		listElementos.add(4);
		listElementos.add(3);
		listElementos.add(4);
						
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
						
		juizes[6].setPontuacaoComponentes(pointsComponentes);
		juizes[6].setPontuacaoElementos(pointsElementos);
		
		//Juiz 08
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
						
		listComponentes.add(9.50);
		listComponentes.add(9.00);
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		listComponentes.add(9.50);
						
		listElementos.add(4);
		listElementos.add(2);
		listElementos.add(3);
		listElementos.add(3);
		listElementos.add(5);
		listElementos.add(3);
		listElementos.add(5);
						
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
						
		juizes[7].setPontuacaoComponentes(pointsComponentes);
		juizes[7].setPontuacaoElementos(pointsElementos);
		
		//Juiz 09
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
						
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		listComponentes.add(10.00);
		listComponentes.add(9.75);
		listComponentes.add(9.50);
						
		listElementos.add(4);
		listElementos.add(4);
		listElementos.add(3);
		listElementos.add(4);
		listElementos.add(5);
		listElementos.add(4);
		listElementos.add(4);
						
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
						
		juizes[8].setPontuacaoComponentes(pointsComponentes);
		juizes[8].setPontuacaoElementos(pointsElementos);
		
		ShortProgram sp = new ShortProgram();
		sp.setJuizes(juizes);
		sp.setElementos(elementos);
		
		nathan.setScore(sp);
		
		System.out.println("Idade de "+nathan.getNome()+": "+nathan.idade()+" anos.");
		System.out.println("Nacionalidade: "+nathan.getNacionalidade());
		System.out.println("Fun Fact: "+nathan.getCuriosidade());
		
		System.out.println("Nathan Chen SP Componentes: "+nathan.getScore().scoreProgramComponentes());
		System.out.println("Nathan Chen SP Elementos: "+nathan.getScore().scoreProgramElementos());
		System.out.println("Nathan Chen Final Score: "+nathan.getTotalScore());
		
		System.out.println();
		
		//Criação de patinador e coach
		
		Patinador valieva = new Patinador();
		valieva.setNome("Kamila Valieva");
		
		Coach eteri = new Coach();
		eteri.setNome("Eteri Tutberidze");
		Date data1 = f.parse("24/02/1974");
		eteri.setDataNascimento(data1);
		System.out.println("Idade de "+eteri.getNome()+": "+eteri.idade()+" anos.");
		eteri.setNacionalidade("Russa");
		eteri.setCuriosidade("Fez transição da patinação artística para dança no gelo aos quatro anos e não há relatos de medalhas na modalidade anterior.");
		eteri.setPatinador(valieva);
		System.out.println(eteri.getNome()+" é coach de "+eteri.getPatinador().getNome());
		
		System.out.println("Nacionalidade: "+eteri.getNacionalidade());
		System.out.println("Fun fact: "+eteri.getCuriosidade());
		
		//Criação de um evento e teste de duração
		
		Evento evento = new Evento();
		evento.setNome("Olimpíadas de Inverno 2022");
		Date datainicio = f.parse("04/02/2022");
		Date datafim = f.parse("20/02/2022");
		evento.setInicioEvento(datainicio);
		evento.setFimEvento(datafim);
		System.out.println("Duração das "+evento.getNome()+ ": "+evento.duracaoDiasEvento()+" dias.");
		
		//Verificação de IceDance para verificação de passagem de dois patinadores
		
		RythmDance scoreice = new RythmDance();
		
		Patinador par1 = new Patinador();
		par1.setNome("Gabriella Papadakis");
		Patinador par2 = new Patinador();
		par2.setNome("Guillaume Cizeron");
		
		IceDance icedance = new IceDance(scoreice);
		icedance.setPatinadores(par1, par2);
		System.out.println();
		System.out.println("Com vocês, na dança no gelo, "+par1.getNome()+" e da França, "+par2.getNome()+"!");
		
		System.out.println();
		
		//Criação de segundo patinador para score SP
		
		Patinador yuzuru = new Patinador();
		yuzuru.setNome("Yuzuru Hanyu");
		Date data3 = f.parse("07/12/1994");
		yuzuru.setDataNascimento(data3);
		yuzuru.setNacionalidade("Japonês");
		yuzuru.setCuriosidade("Nos Jogos Olímpicos de Inverno de Sochi em 2014, ele ganhou a primeira medalha de ouro olímpica para o Japão no evento masculino de patinação artística. Ele terminou o ano com uma vitória no Campeonato Mundial de Patinação Artística de 2014 em Saitama, Japão.");
		
		//Juiz 01
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
		
		listComponentes.add(9.75);
		listComponentes.add(9.50);
		listComponentes.add(9.25);
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		
		listElementos.add(4);
		listElementos.add(3);
		listElementos.add(4);
		listElementos.add(4);
		listElementos.add(5);
		listElementos.add(3);
		listElementos.add(4);
		
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
		
		juizes[0].setPontuacaoComponentes(pointsComponentes);
		juizes[0].setPontuacaoElementos(pointsElementos);
		
		//Juiz 02
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
		
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		listComponentes.add(9.75);
		listComponentes.add(9.75);
		listComponentes.add(9.75);
		
		listElementos.add(4);
		listElementos.add(3);
		listElementos.add(4);
		listElementos.add(4);
		listElementos.add(5);
		listElementos.add(4);
		listElementos.add(4);
		
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
		
		juizes[1].setPontuacaoComponentes(pointsComponentes);
		juizes[1].setPontuacaoElementos(pointsElementos);
		
		//Juiz 03
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
				
		listComponentes.add(9.50);
		listComponentes.add(9.00);
		listComponentes.add(9.75);
		listComponentes.add(10.00);
		listComponentes.add(10.00);
				
		listElementos.add(4);
		listElementos.add(5);
		listElementos.add(5);
		listElementos.add(4);
		listElementos.add(5);
		listElementos.add(4);
		listElementos.add(4);
				
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
				
		juizes[2].setPontuacaoComponentes(pointsComponentes);
		juizes[2].setPontuacaoElementos(pointsElementos);
		
		//Juiz 04
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
						
		listComponentes.add(9.75);
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		listComponentes.add(9.75);
						
		listElementos.add(4);
		listElementos.add(3);
		listElementos.add(4);
		listElementos.add(3);
		listElementos.add(5);
		listElementos.add(3);
		listElementos.add(5);
						
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
						
		juizes[3].setPontuacaoComponentes(pointsComponentes);
		juizes[3].setPontuacaoElementos(pointsElementos);
		
		//Juiz 05
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
						
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		listComponentes.add(9.00);
		listComponentes.add(9.75);
		listComponentes.add(9.50);
						
		listElementos.add(2);
		listElementos.add(1);
		listElementos.add(3);
		listElementos.add(2);
		listElementos.add(3);
		listElementos.add(2);
		listElementos.add(2);
		
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
						
		juizes[4].setPontuacaoComponentes(pointsComponentes);
		juizes[4].setPontuacaoElementos(pointsElementos);
		
		//Juiz 06
				
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
						
		listComponentes.add(10.00);
		listComponentes.add(9.50);
		listComponentes.add(10.00);
		listComponentes.add(9.75);
		listComponentes.add(9.75);
						
		listElementos.add(4);
		listElementos.add(2);
		listElementos.add(5);
		listElementos.add(5);
		listElementos.add(5);
		listElementos.add(3);
		listElementos.add(4);
						
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
						
		juizes[5].setPontuacaoComponentes(pointsComponentes);
		juizes[5].setPontuacaoElementos(pointsElementos);
		
		//Juiz 07
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
						
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		listComponentes.add(9.00);
		listComponentes.add(9.75);
		listComponentes.add(9.75);
						
		listElementos.add(4);
		listElementos.add(3);
		listElementos.add(3);
		listElementos.add(2);
		listElementos.add(2);
		listElementos.add(3);
		listElementos.add(2);
						
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
						
		juizes[6].setPontuacaoComponentes(pointsComponentes);
		juizes[6].setPontuacaoElementos(pointsElementos);
		
		//Juiz 08
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
						
		listComponentes.add(9.50);
		listComponentes.add(9.25);
		listComponentes.add(9.50);
		listComponentes.add(9.25);
		listComponentes.add(9.00);
						
		listElementos.add(4);
		listElementos.add(2);
		listElementos.add(3);
		listElementos.add(3);
		listElementos.add(5);
		listElementos.add(3);
		listElementos.add(5);
						
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
						
		juizes[7].setPontuacaoComponentes(pointsComponentes);
		juizes[7].setPontuacaoElementos(pointsElementos);
		
		//Juiz 09
		
		pointsComponentes.clear();
		pointsElementos.clear();
		listComponentes.clear();
		listElementos.clear();
						
		listComponentes.add(9.50);
		listComponentes.add(9.50);
		listComponentes.add(9.75);
		listComponentes.add(9.75);
		listComponentes.add(9.50);
						
		listElementos.add(3);
		listElementos.add(4);
		listElementos.add(5);
		listElementos.add(5);
		listElementos.add(5);
		listElementos.add(2);
		listElementos.add(4);
						
		for(i = 0; i < listComponentes.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes.get(i));
			pointsComponentes.add(ac);
		}
		
		for(i = 0; i < listElementos.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos.get(i));
			pointsElementos.add(ae);
		}
						
		juizes[8].setPontuacaoComponentes(pointsComponentes);
		juizes[8].setPontuacaoElementos(pointsElementos);
				
		ShortProgram scoreUm = new ShortProgram();
		scoreUm.setElementos(elementos);
		scoreUm.setJuizes(juizes);
		
		yuzuru.setScore(scoreUm);
		
		System.out.println("Idade de "+yuzuru.getNome()+": "+yuzuru.idade()+" anos.");
		System.out.println("Nacionalidade: "+yuzuru.getNacionalidade());
		System.out.println("Fun Fact: "+yuzuru.getCuriosidade());
		
		System.out.println("Yuzuru Hanyu SP Componentes: "+yuzuru.getScore().scoreProgramComponentes());
		System.out.println("Yuzuru Hanyu SP Elementos: "+yuzuru.getScore().scoreProgramElementos());
		System.out.println("Yuzuru Hanyu Final Score: "+yuzuru.getTotalScore());
				
		System.out.println();
		
		List<Patinador> patinadores = new ArrayList<Patinador>();
		patinadores.add(nathan);
		patinadores.add(yuzuru);
		
		//Verificação do Rank
		
		Rank rank = new Rank();
		rank.setPatinadores(patinadores);
		rank.classificacao();
		System.out.println("Medalha de Ouro: "+rank.getPrimeiroLugar());
		System.out.println("Medalha de Prata: "+rank.getSegundoLugar());
		System.out.println("Medalha de Bronze: "+rank.getTerceiroLugar());
		
		System.out.println();
		
		//Verificação da Música
		
		ShortProgram spf = new ShortProgram();
		SingleSkating sk = new SingleSkating(spf);
		sk.setDuracaoPrograma("2 minutos e 40 segundos");
		
		sk.setNomeModalidade("Women’s Single Figure Skating");
		sk.setNomeMusica("Let It Go");
		sk.setQualidadeMusica(EnumQualidadeMusica.HIGH_QUALITY);
		sk.setSoundPressuredB(86);
		
		System.out.println("Nome da música cadastrada = "+sk.getNomeMusica());
		System.out.println("Sound Pressure Level = "+sk.getSoundPressuredB());
		System.out.println("A Musica é válida? "+sk.validaMusica(sk.getSoundPressuredB(), sk.getQualidadeMusica()));
		
		sk.setSoundPressuredB(85);
		System.out.println("Sound Pressure Level = "+sk.getSoundPressuredB());
		System.out.println("A Musica é válida? "+sk.validaMusica(sk.getSoundPressuredB(), sk.getQualidadeMusica()));
		
		System.out.println("Duração do programa = "+sk.getDuracaoPrograma());
	}

}
