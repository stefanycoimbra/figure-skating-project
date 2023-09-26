package br.edu.unifei.ecot13.patinacaogelo.stefany.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unifei.ecot13.patinacaogelo.stefany.*;

public class App {

	public static void main(String[] args) throws ParseException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("patinacaoGelo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//Criação de primeiro patinador para score SP
		
		Patinador nathan = new Patinador();
		nathan.setNome("Nathan Chen");
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Date data = f.parse("05/05/1999");
		nathan.setDataNascimento(data);
		nathan.setNacionalidade("Estado-Unidense");
		nathan.setCuriosidade("Nathan Chen anotou um recorde mundial com sua apresentação no programa curto individual na patinação artística dos Jogos Olímpicos de Inverno em Pequim. O norte-americano conseguiu a marca de 113.97 pontos, superando o anterior recorde de Yuzuru Hanyu.");
		nathan.idade();
		
		//Criação de segundo patinador para score SP
		
		Patinador yuzuru = new Patinador();
		yuzuru.setNome("Yuzuru Hanyu");
		Date data3 = f.parse("07/12/1994");
		yuzuru.setDataNascimento(data3);
		yuzuru.setNacionalidade("Japonês");
		yuzuru.setCuriosidade("Nos Jogos Olímpicos de Inverno de Sochi em 2014, ele ganhou a primeira medalha de ouro olímpica para o Japão no evento masculino de patinação artística. Ele terminou o ano com uma vitória no Campeonato Mundial de Patinação Artística de 2014 em Saitama, Japão.");
		yuzuru.idade();
		
		// Lista com Profissionais da Patinação Artística
		
		List<Profissional> eventoProfissionais = new ArrayList<Profissional>();
		
		// Juízes para patinador 1
		
        Judge juizes[] = new Judge[9];
		
		for(int i=0;i<9;i++) {
			juizes[i]=new Judge();
		} 
		juizes[0].setTipoCargo(EnumTipoCargoJudge.ISU_JUDGE);
		juizes[0].setNome("Baumann Christian");
		juizes[0].setTituloPessoal("Mr.");
		juizes[0].setNacionalidade("Alemão");
		juizes[1].setTipoCargo(EnumTipoCargoJudge.ISU_JUDGE);
		juizes[1].setNome("Yoshioka Nobuhiko");
		juizes[1].setTituloPessoal("Mr.");
		juizes[1].setNacionalidade("Japonês");
		juizes[2].setTipoCargo(EnumTipoCargoJudge.ISU_JUDGE);
		juizes[2].setNome("Koh Sung-Hee");
		juizes[2].setTituloPessoal("Ms.");
		juizes[2].setNacionalidade("Coreana");
		juizes[3].setTipoCargo(EnumTipoCargoJudge.ISU_JUDGE);
		juizes[3].setNome("Gribonosov-Grebneva Maria");
		juizes[3].setTituloPessoal("Ms.");
		juizes[3].setNacionalidade("Russa");
		juizes[4].setTipoCargo(EnumTipoCargoJudge.INTERNATIONAL_JUDGE);
		juizes[4].setNome("Monica Lopez Camara");
		juizes[4].setTituloPessoal("Ms.");
		juizes[4].setNacionalidade("Andorrana");
		juizes[5].setTipoCargo(EnumTipoCargoJudge.INTERNATIONAL_JUDGE);
		juizes[5].setNome("Ganner Georg");
		juizes[5].setTituloPessoal("Mr.");
		juizes[5].setNacionalidade("Austríaco");
		juizes[6].setTipoCargo(EnumTipoCargoJudge.INTERNATIONAL_JUDGE);
		juizes[6].setNome("Sun Rui");
		juizes[6].setTituloPessoal("Ms.");
		juizes[6].setNacionalidade("Chinesa");
		juizes[7].setTipoCargo(EnumTipoCargoJudge.INTERNATIONAL_JUDGE);
		juizes[7].setNome("Periz Daniel");
		juizes[7].setTituloPessoal("Mr.");
		juizes[7].setNacionalidade("Espanhol");
		juizes[8].setTipoCargo(EnumTipoCargoJudge.ISU_JUDGE);
		juizes[8].setNome("Kankaanranta Marjo");
		juizes[8].setTituloPessoal("Ms.");
		juizes[8].setNacionalidade("Finlandesa");
		
		for(int i=0;i<9;i++) {
			eventoProfissionais.add(juizes[i]);
		}
		
		for(int i=0;i<9;i++) {
			em.persist(juizes[i]);
		} 
		
        // Juízes para patinador 2
		
        Judge juizes2[] = new Judge[9];
		
		for(int i=0;i<9;i++) {
			juizes2[i]=new Judge();
		} 
		juizes2[0].setTipoCargo(EnumTipoCargoJudge.ISU_JUDGE);
		juizes2[0].setNome("Blanc Christine");
		juizes2[0].setTituloPessoal("Ms.");
		juizes2[0].setNacionalidade("Suíça");
		juizes2[1].setTipoCargo(EnumTipoCargoJudge.ISU_JUDGE);
		juizes2[1].setNome("Anildi Ebru");
		juizes2[1].setTituloPessoal("Ms.");
		juizes2[1].setNacionalidade("Turca");
		juizes2[2].setTipoCargo(EnumTipoCargoJudge.ISU_JUDGE);
		juizes2[2].setNome("Fedchenko Igor");
		juizes2[2].setTituloPessoal("Mr.");
		juizes2[2].setNacionalidade("Ucraniano");
		juizes2[3].setTipoCargo(EnumTipoCargoJudge.ISU_JUDGE);
		juizes2[3].setNome("Medvedeva Irina");
		juizes2[3].setTituloPessoal("Ms.");
		juizes2[3].setNacionalidade("Ucraniana");
		juizes2[4].setTipoCargo(EnumTipoCargoJudge.INTERNATIONAL_JUDGE);
		juizes2[4].setNome("Pimsan Rattanadilok na Phuket");
		juizes2[4].setTituloPessoal("Ms.");
		juizes2[4].setNacionalidade("Tailandesa");
		juizes2[5].setTipoCargo(EnumTipoCargoJudge.INTERNATIONAL_JUDGE);
		juizes2[5].setNome("Anildi Ebru");
		juizes2[5].setTituloPessoal("Ms.");
		juizes2[5].setNacionalidade("Turca");
		juizes2[6].setTipoCargo(EnumTipoCargoJudge.INTERNATIONAL_JUDGE);
		juizes2[6].setNome("Dreyer Etienne");
		juizes2[6].setTituloPessoal("Mr.");
		juizes2[6].setNacionalidade("Sul-africano");
		juizes2[7].setTipoCargo(EnumTipoCargoJudge.INTERNATIONAL_JUDGE);
		juizes2[7].setNome("Martinez Mendoza Sasha");
		juizes2[7].setTituloPessoal("Ms.");
		juizes2[7].setNacionalidade("Mexicana");
		juizes2[8].setTipoCargo(EnumTipoCargoJudge.ISU_JUDGE);
		juizes2[8].setNome("Swiderska Agnieszka");
		juizes2[8].setTituloPessoal("Ms.");
		juizes2[8].setNacionalidade("Polonesa");
		
		for(int i=0;i<9;i++) {
			eventoProfissionais.add(juizes2[i]);
		}
		
		for(int i=0;i<9;i++) {
			em.persist(juizes2[i]);
		} 
		
		// Referees
		
		Referee r1 = new Referee();
		r1.setNome("Gordon-Poltorak Halina");
		r1.setNacionalidade("Polonês");
		
		Referee r2 = new Referee();
		r2.setNome("Adolfsen Mona");
		r2.setNacionalidade("Norueguês");
		
		Referee r3 = new Referee();
		r3.setNome("Rhee Chi-Hee");
		r3.setNacionalidade("Coreana");
		
		Referee r4 = new Referee();
		r4.setNome("Maeda Mami");
		r4.setNacionalidade("Japonesa");
		
		Referee r5 = new Referee();
		r5.setNome("Okabe Yukiko");
		r5.setNacionalidade("Japonesa");
		
		eventoProfissionais.add(r1);
		eventoProfissionais.add(r2);
		eventoProfissionais.add(r3);
		eventoProfissionais.add(r4);
		eventoProfissionais.add(r5);
		
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		em.persist(r4);
		em.persist(r5);
		
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
		
		//System.out.println("Elemento 1: "+e1.getCodigo());
		//System.out.println("Descrição do Elemento 1: "+e1.getDescricao());
		
		//System.out.println();
				
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
		
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		em.persist(e5);
		em.persist(e6);
		em.persist(e7);
		
		// Notas para Primeiro Patinador
		
		List<AvaliacaoComponente> pointsComponentes1 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos1 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes1 = new ArrayList<Double>();
		List<Integer> listElementos1 = new ArrayList<Integer>();
		
		//Juiz 01
		
		listComponentes1.add(9.75);
		listComponentes1.add(9.50);
		listComponentes1.add(9.50);
		listComponentes1.add(9.50);
		listComponentes1.add(9.50);
		
		listElementos1.add(4);
		listElementos1.add(3);
		listElementos1.add(4);
		listElementos1.add(4);
		listElementos1.add(5);
		listElementos1.add(3);
		listElementos1.add(4);
		
		int i;
		for(i = 0; i < listComponentes1.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes1.get(i));
			pointsComponentes1.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos1.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos1.get(i));
			pointsElementos1.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes[0].setPontuacaoComponentes(pointsComponentes1);
		juizes[0].setPontuacaoElementos(pointsElementos1);
		em.merge(juizes[0]);
		
		//Juiz 02
		
		List<AvaliacaoComponente> pointsComponentes2 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos2 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes2 = new ArrayList<Double>();
		List<Integer> listElementos2 = new ArrayList<Integer>();
		
		listComponentes2.add(9.25);
		listComponentes2.add(9.25);
		listComponentes2.add(9.50);
		listComponentes2.add(9.50);
		listComponentes2.add(9.75);
		
		listElementos2.add(4);
		listElementos2.add(3);
		listElementos2.add(4);
		listElementos2.add(4);
		listElementos2.add(5);
		listElementos2.add(4);
		listElementos2.add(4);
		
		for(i = 0; i < listComponentes2.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes2.get(i));
			pointsComponentes2.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos2.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos2.get(i));
			pointsElementos2.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes[1].setPontuacaoComponentes(pointsComponentes2);
		juizes[1].setPontuacaoElementos(pointsElementos2);
		em.merge(juizes[1]);
		
		//Juiz 03
		
		List<AvaliacaoComponente> pointsComponentes3 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos3 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes3 = new ArrayList<Double>();
		List<Integer> listElementos3 = new ArrayList<Integer>();
		
		listComponentes3.add(9.50);
		listComponentes3.add(9.25);
		listComponentes3.add(9.75);
		listComponentes3.add(10.00);
		listComponentes3.add(10.00);
				
		listElementos3.add(5);
		listElementos3.add(3);
		listElementos3.add(3);
		listElementos3.add(4);
		listElementos3.add(5);
		listElementos3.add(4);
		listElementos3.add(4);
		
		for(i = 0; i < listComponentes3.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes3.get(i));
			pointsComponentes3.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos3.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos3.get(i));
			pointsElementos3.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes[2].setPontuacaoComponentes(pointsComponentes3);
		juizes[2].setPontuacaoElementos(pointsElementos3);
		em.merge(juizes[2]);
		
		//Juiz 04
		
		List<AvaliacaoComponente> pointsComponentes4 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos4 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes4 = new ArrayList<Double>();
		List<Integer> listElementos4 = new ArrayList<Integer>();
		
		listComponentes4.add(9.75);
		listComponentes4.add(9.50);
		listComponentes4.add(10.00);
		listComponentes4.add(9.75);
		listComponentes4.add(9.75);
						
		listElementos4.add(4);
		listElementos4.add(3);
		listElementos4.add(4);
		listElementos4.add(3);
		listElementos4.add(5);
		listElementos4.add(3);
		listElementos4.add(5);
		
		for(i = 0; i < listComponentes4.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes4.get(i));
			pointsComponentes4.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos4.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos4.get(i));
			pointsElementos4.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes[3].setPontuacaoComponentes(pointsComponentes4);
		juizes[3].setPontuacaoElementos(pointsElementos4);
		em.merge(juizes[3]);
		
		//Juiz 05
		
		List<AvaliacaoComponente> pointsComponentes5 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos5 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes5 = new ArrayList<Double>();
		List<Integer> listElementos5 = new ArrayList<Integer>();
		
		listComponentes5.add(9.50);
		listComponentes5.add(9.50);
		listComponentes5.add(9.50);
		listComponentes5.add(9.75);
		listComponentes5.add(9.50);
						
		listElementos5.add(4);
		listElementos5.add(4);
		listElementos5.add(3);
		listElementos5.add(4);
		listElementos5.add(5);
		listElementos5.add(4);
		listElementos5.add(4);
		
		for(i = 0; i < listComponentes5.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes5.get(i));
			pointsComponentes5.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos5.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos5.get(i));
			pointsElementos5.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes[4].setPontuacaoComponentes(pointsComponentes5);
		juizes[4].setPontuacaoElementos(pointsElementos5);
		em.merge(juizes[4]);
		
		//Juiz 06
		
		List<AvaliacaoComponente> pointsComponentes6 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos6 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes6 = new ArrayList<Double>();
		List<Integer> listElementos6 = new ArrayList<Integer>();
		
		listComponentes6.add(9.75);
		listComponentes6.add(9.50);
		listComponentes6.add(9.75);
		listComponentes6.add(9.75);
		listComponentes6.add(9.50);
						
		listElementos6.add(4);
		listElementos6.add(2);
		listElementos6.add(3);
		listElementos6.add(2);
		listElementos6.add(5);
		listElementos6.add(3);
		listElementos6.add(4);
		
		for(i = 0; i < listComponentes6.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes6.get(i));
			pointsComponentes6.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos6.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos6.get(i));
			pointsElementos6.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes[5].setPontuacaoComponentes(pointsComponentes6);
		juizes[5].setPontuacaoElementos(pointsElementos6);
		em.merge(juizes[5]);
		
		//Juiz 07
		
		List<AvaliacaoComponente> pointsComponentes7 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos7 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes7 = new ArrayList<Double>();
		List<Integer> listElementos7 = new ArrayList<Integer>();
		
		listComponentes7.add(9.50);
		listComponentes7.add(9.25);
		listComponentes7.add(9.50);
		listComponentes7.add(9.25);
		listComponentes7.add(9.50);
						
		listElementos7.add(4);
		listElementos7.add(2);
		listElementos7.add(3);
		listElementos7.add(2);
		listElementos7.add(4);
		listElementos7.add(3);
		listElementos7.add(4);
		
		for(i = 0; i < listComponentes7.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes7.get(i));
			pointsComponentes7.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos7.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos7.get(i));
			pointsElementos7.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes[6].setPontuacaoComponentes(pointsComponentes7);
		juizes[6].setPontuacaoElementos(pointsElementos7);
		em.merge(juizes[6]);
		
		//Juiz 08
		
		List<AvaliacaoComponente> pointsComponentes8 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos8 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes8 = new ArrayList<Double>();
		List<Integer> listElementos8 = new ArrayList<Integer>();
		
		listComponentes8.add(9.50);
		listComponentes8.add(9.00);
		listComponentes8.add(9.50);
		listComponentes8.add(9.50);
		listComponentes8.add(9.50);
						
		listElementos8.add(4);
		listElementos8.add(2);
		listElementos8.add(3);
		listElementos8.add(3);
		listElementos8.add(5);
		listElementos8.add(3);
		listElementos8.add(5);
		
		for(i = 0; i < listComponentes8.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes8.get(i));
			pointsComponentes8.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos8.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos8.get(i));
			pointsElementos8.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes[7].setPontuacaoComponentes(pointsComponentes8);
		juizes[7].setPontuacaoElementos(pointsElementos8);
		em.merge(juizes[7]);
		
		//Juiz 09
		
		List<AvaliacaoComponente> pointsComponentes9 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos9 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes9 = new ArrayList<Double>();
		List<Integer> listElementos9 = new ArrayList<Integer>();
		
		listComponentes9.add(9.50);
		listComponentes9.add(9.50);
		listComponentes9.add(10.00);
		listComponentes9.add(9.75);
		listComponentes9.add(9.50);
						
		listElementos9.add(4);
		listElementos9.add(4);
		listElementos9.add(3);
		listElementos9.add(4);
		listElementos9.add(5);
		listElementos9.add(4);
		listElementos9.add(4);
		
		for(i = 0; i < listComponentes9.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes9.get(i));
			pointsComponentes9.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos9.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos9.get(i));
			pointsElementos9.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes[8].setPontuacaoComponentes(pointsComponentes9);
		juizes[8].setPontuacaoElementos(pointsElementos9);
		em.merge(juizes[8]);
		
		// Programa de Patinação do Primeiro Patinador
		
		ShortProgram sp = new ShortProgram();
		sp.setJuiz1(juizes[0]);
		sp.setJuiz2(juizes[1]);
		sp.setJuiz3(juizes[2]);
		sp.setJuiz4(juizes[3]);
		sp.setJuiz5(juizes[4]);
		sp.setJuiz6(juizes[5]);
		sp.setJuiz7(juizes[6]);
		sp.setJuiz8(juizes[7]);
		sp.setJuiz9(juizes[8]);
		sp.setJuizes(juizes);
		sp.setElementos(elementos);
		em.persist(sp);
		nathan.setScore(sp);
		nathan.setTotalScoreSkating(nathan.getTotalScore());
		eventoProfissionais.add(nathan);
		em.persist(nathan);
		
		// Notas para Segundo Patinador
		
		List<AvaliacaoComponente> pointsComponentes1_1 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos1_1 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes1_1 = new ArrayList<Double>();
		List<Integer> listElementos1_1 = new ArrayList<Integer>();
		
		//Juiz 01
		
		listComponentes1_1.add(9.75);
		listComponentes1_1.add(9.50);
		listComponentes1_1.add(9.25);
		listComponentes1_1.add(9.50);
		listComponentes1_1.add(9.50);
		
		listElementos1_1.add(4);
		listElementos1_1.add(3);
		listElementos1_1.add(4);
		listElementos1_1.add(4);
		listElementos1_1.add(5);
		listElementos1_1.add(3);
		listElementos1_1.add(4);
		
		for(i = 0; i < listComponentes1_1.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes1_1.get(i));
			pointsComponentes1_1.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos1_1.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos1_1.get(i));
			pointsElementos1_1.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes2[0].setPontuacaoComponentes(pointsComponentes1_1);
		juizes2[0].setPontuacaoElementos(pointsElementos1_1);
		em.merge(juizes2[0]);
		
		//Juiz 02
		
		List<AvaliacaoComponente> pointsComponentes2_1 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos2_1 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes2_1 = new ArrayList<Double>();
		List<Integer> listElementos2_1 = new ArrayList<Integer>();
		
		listComponentes2_1.add(9.50);
		listComponentes2_1.add(9.50);
		listComponentes2_1.add(9.75);
		listComponentes2_1.add(9.75);
		listComponentes2_1.add(9.75);
		
		listElementos2_1.add(4);
		listElementos2_1.add(3);
		listElementos2_1.add(4);
		listElementos2_1.add(4);
		listElementos2_1.add(5);
		listElementos2_1.add(4);
		listElementos2_1.add(4);
		
		for(i = 0; i < listComponentes2_1.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes2_1.get(i));
			pointsComponentes2_1.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos2_1.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos2_1.get(i));
			pointsElementos2_1.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes2[1].setPontuacaoComponentes(pointsComponentes2_1);
		juizes2[1].setPontuacaoElementos(pointsElementos2_1);
		em.merge(juizes2[1]);
		
		//Juiz 03
		
		List<AvaliacaoComponente> pointsComponentes3_1 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos3_1 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes3_1 = new ArrayList<Double>();
		List<Integer> listElementos3_1 = new ArrayList<Integer>();
		
		listComponentes3_1.add(9.50);
		listComponentes3_1.add(9.00);
		listComponentes3_1.add(9.75);
		listComponentes3_1.add(10.00);
		listComponentes3_1.add(10.00);
				
		listElementos3_1.add(4);
		listElementos3_1.add(5);
		listElementos3_1.add(5);
		listElementos3_1.add(4);
		listElementos3_1.add(5);
		listElementos3_1.add(4);
		listElementos3_1.add(4);
		
		for(i = 0; i < listComponentes3_1.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes3_1.get(i));
			pointsComponentes3_1.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos3_1.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos3_1.get(i));
			pointsElementos3_1.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes2[2].setPontuacaoComponentes(pointsComponentes3_1);
		juizes2[2].setPontuacaoElementos(pointsElementos3_1);
		em.merge(juizes2[2]);
		
		//Juiz 04
		
		List<AvaliacaoComponente> pointsComponentes4_1 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos4_1 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes4_1 = new ArrayList<Double>();
		List<Integer> listElementos4_1 = new ArrayList<Integer>();
		
		listComponentes4_1.add(9.75);
		listComponentes4_1.add(9.50);
		listComponentes4_1.add(9.50);
		listComponentes4_1.add(9.50);
		listComponentes4_1.add(9.75);
						
		listElementos4_1.add(4);
		listElementos4_1.add(3);
		listElementos4_1.add(4);
		listElementos4_1.add(3);
		listElementos4_1.add(5);
		listElementos4_1.add(3);
		listElementos4_1.add(5);
		
		for(i = 0; i < listComponentes4_1.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes4_1.get(i));
			pointsComponentes4_1.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos4_1.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos4_1.get(i));
			pointsElementos4_1.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes2[3].setPontuacaoComponentes(pointsComponentes4_1);
		juizes2[3].setPontuacaoElementos(pointsElementos4_1);
		em.merge(juizes2[3]);
		
		//Juiz 05
		
		List<AvaliacaoComponente> pointsComponentes5_1 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos5_1 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes5_1 = new ArrayList<Double>();
		List<Integer> listElementos5_1 = new ArrayList<Integer>();
		
		listComponentes5_1.add(9.50);
		listComponentes5_1.add(9.50);
		listComponentes5_1.add(9.00);
		listComponentes5_1.add(9.75);
		listComponentes5_1.add(9.50);
						
		listElementos5_1.add(2);
		listElementos5_1.add(1);
		listElementos5_1.add(3);
		listElementos5_1.add(2);
		listElementos5_1.add(3);
		listElementos5_1.add(2);
		listElementos5_1.add(2);
		
		for(i = 0; i < listComponentes5_1.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes5_1.get(i));
			pointsComponentes5_1.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos5_1.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos5_1.get(i));
			pointsElementos5_1.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes2[4].setPontuacaoComponentes(pointsComponentes5_1);
		juizes2[4].setPontuacaoElementos(pointsElementos5_1);
		em.merge(juizes2[4]);
		
		//Juiz 06
		
		List<AvaliacaoComponente> pointsComponentes6_1 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos6_1 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes6_1 = new ArrayList<Double>();
		List<Integer> listElementos6_1 = new ArrayList<Integer>();
		
		listComponentes6_1.add(10.00);
		listComponentes6_1.add(9.50);
		listComponentes6_1.add(10.00);
		listComponentes6_1.add(9.75);
		listComponentes6_1.add(9.75);
						
		listElementos6_1.add(4);
		listElementos6_1.add(2);
		listElementos6_1.add(5);
		listElementos6_1.add(5);
		listElementos6_1.add(5);
		listElementos6_1.add(3);
		listElementos6_1.add(4);
		
		for(i = 0; i < listComponentes6_1.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes6_1.get(i));
			pointsComponentes6_1.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos6_1.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos6_1.get(i));
			pointsElementos6_1.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes2[5].setPontuacaoComponentes(pointsComponentes6_1);
		juizes2[5].setPontuacaoElementos(pointsElementos6_1);
		em.merge(juizes2[5]);
		
		//Juiz 07
		
		List<AvaliacaoComponente> pointsComponentes7_1 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos7_1 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes7_1 = new ArrayList<Double>();
		List<Integer> listElementos7_1 = new ArrayList<Integer>();
		
		listComponentes7_1.add(9.50);
		listComponentes7_1.add(9.50);
		listComponentes7_1.add(9.00);
		listComponentes7_1.add(9.75);
		listComponentes7_1.add(9.75);
						
		listElementos7_1.add(4);
		listElementos7_1.add(3);
		listElementos7_1.add(3);
		listElementos7_1.add(2);
		listElementos7_1.add(2);
		listElementos7_1.add(3);
		listElementos7_1.add(2);
		
		for(i = 0; i < listComponentes7_1.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes7_1.get(i));
			pointsComponentes7_1.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos7_1.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos7_1.get(i));
			pointsElementos7_1.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes2[6].setPontuacaoComponentes(pointsComponentes7_1);
		juizes2[6].setPontuacaoElementos(pointsElementos7_1);
		em.merge(juizes2[6]);
		
		//Juiz 08
		
		List<AvaliacaoComponente> pointsComponentes8_1 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos8_1 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes8_1 = new ArrayList<Double>();
		List<Integer> listElementos8_1 = new ArrayList<Integer>();
		
		listComponentes8_1.add(9.50);
		listComponentes8_1.add(9.25);
		listComponentes8_1.add(9.50);
		listComponentes8_1.add(9.25);
		listComponentes8_1.add(9.00);
						
		listElementos8_1.add(4);
		listElementos8_1.add(2);
		listElementos8_1.add(3);
		listElementos8_1.add(3);
		listElementos8_1.add(5);
		listElementos8_1.add(3);
		listElementos8_1.add(5);
		
		for(i = 0; i < listComponentes8_1.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes8_1.get(i));
			pointsComponentes8_1.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos8_1.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos8_1.get(i));
			pointsElementos8_1.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes2[7].setPontuacaoComponentes(pointsComponentes8_1);
		juizes2[7].setPontuacaoElementos(pointsElementos8_1);
		em.merge(juizes2[7]);
		
		//Juiz 09
		
		List<AvaliacaoComponente> pointsComponentes9_1 = new ArrayList<AvaliacaoComponente>();
		List<AvaliacaoElemento> pointsElementos9_1 = new ArrayList<AvaliacaoElemento>();
		
		List<Double> listComponentes9_1 = new ArrayList<Double>();
		List<Integer> listElementos9_1 = new ArrayList<Integer>();
		
		listComponentes9_1.add(9.50);
		listComponentes9_1.add(9.50);
		listComponentes9_1.add(9.75);
		listComponentes9_1.add(9.75);
		listComponentes9_1.add(9.50);
						
		listElementos9_1.add(3);
		listElementos9_1.add(4);
		listElementos9_1.add(5);
		listElementos9_1.add(5);
		listElementos9_1.add(5);
		listElementos9_1.add(2);
		listElementos9_1.add(4);
		
		for(i = 0; i < listComponentes9_1.size(); i++) {
			PontuaComponente pc = new PontuaComponente();
			AvaliacaoComponente ac = new AvaliacaoComponente();
			ac = pc.pontuarPrograma();
			ac.setPontuacaoComponente(listComponentes9_1.get(i));
			pointsComponentes9_1.add(ac);
			em.persist(pc);
			em.persist(ac);
		}
		
		for(i = 0; i < listElementos9_1.size(); i++) {
			PontuaElemento pe = new PontuaElemento();
			AvaliacaoElemento ae = new AvaliacaoElemento();
			ae = pe.pontuarPrograma();
			ae.setPontuacaoElemento(listElementos9_1.get(i));
			pointsElementos9_1.add(ae);
			em.persist(pe);
			em.persist(ae);
		}
		
		juizes2[8].setPontuacaoComponentes(pointsComponentes9_1);
		juizes2[8].setPontuacaoElementos(pointsElementos9_1);
		em.merge(juizes2[8]);
		
		// Programa de Patinação do Segundo Patinador
		
		//Criação de Elementos Técnicos
		
		ElementoTecnico e1_1 = new ElementoTecnico();
		e1.setCorValida(EnumCorValida.VERDE);
		ElementoTecnico e2_1 = new ElementoTecnico();
		e2.setCorValida(EnumCorValida.VERDE);
		ElementoTecnico e3_1 = new ElementoTecnico();
		e3.setCorValida(EnumCorValida.VERMELHO);
		ElementoTecnico e4_1 = new ElementoTecnico();
		e4.setCorValida(EnumCorValida.VERDE);
		ElementoTecnico e5_1 = new ElementoTecnico();
		e5.setCorValida(EnumCorValida.VERDE);
		ElementoTecnico e6_1 = new ElementoTecnico();
		e6.setCorValida(EnumCorValida.VERMELHO);
		ElementoTecnico e7_1 = new ElementoTecnico();
		e7.setCorValida(EnumCorValida.VERDE);
		
		List<ElementoTecnico> elementosYuzuru = new ArrayList<ElementoTecnico>();
		elementosYuzuru.add(e1_1);
		elementosYuzuru.add(e2_1);
		elementosYuzuru.add(e3_1);
		elementosYuzuru.add(e4_1);
		elementosYuzuru.add(e5_1);
		elementosYuzuru.add(e6_1);
		elementosYuzuru.add(e7_1);
		
		e1_1.setValoresBase(val1);
		e2_1.setValoresBase(val2);
		e3_1.setValoresBase(val3);
		e4_1.setValoresBase(val4);
		e5_1.setValoresBase(val5);
		e6_1.setValoresBase(val6);
		e7_1.setValoresBase(val7);
		
		em.persist(e1_1);
		em.persist(e2_1);
		em.persist(e3_1);
		em.persist(e4_1);
		em.persist(e5_1);
		em.persist(e6_1);
		em.persist(e7_1);
		
		ShortProgram scoreUm = new ShortProgram();
		scoreUm.setElementos(elementosYuzuru);
		scoreUm.setJuiz1(juizes2[0]);
		scoreUm.setJuiz2(juizes2[1]);
		scoreUm.setJuiz3(juizes2[2]);
		scoreUm.setJuiz4(juizes2[3]);
		scoreUm.setJuiz5(juizes2[4]);
		scoreUm.setJuiz6(juizes2[5]);
		scoreUm.setJuiz7(juizes2[6]);
		scoreUm.setJuiz8(juizes2[7]);
		scoreUm.setJuiz9(juizes2[8]);
		scoreUm.setJuizes(juizes2);
		em.persist(scoreUm);
		yuzuru.setScore(scoreUm);
		yuzuru.setTotalScoreSkating(yuzuru.getTotalScore());
		eventoProfissionais.add(yuzuru);
		em.persist(yuzuru);
		
		//Criação de patinador e seu coach
		
		Patinador valieva = new Patinador();
		valieva.setNome("Kamila Valieva");
		Date dataPatinadora = f.parse("26/04/2006");
		valieva.setDataNascimento(dataPatinadora);
		valieva.setNacionalidade("Russa");
		valieva.setCuriosidade("Tem 8 recordes mundiais e seu programa curto das Olimpíadas de 2022 foi dedicado à sua avó, que faleceu em 2019. Ela patinou ao som da música 'In memorian'.");
		valieva.idade();
		em.persist(valieva);
		
		Coach eteri = new Coach();
		eteri.setNome("Eteri Tutberidze");
		Date dataCoach = f.parse("24/02/1974");
		eteri.setDataNascimento(dataCoach);
		eteri.setNacionalidade("Russa");
		eteri.setCuriosidade("Fez transição da patinação artística para dança no gelo aos quatro anos e não há relatos de medalhas na modalidade anterior.");
		eteri.idade();
		eteri.setPatinador(valieva);
		em.persist(eteri);
		
		// Lista de modalidades
		
		List<FigureSkating> eventoModalidades = new ArrayList<FigureSkating>();
		
		Evento evento = new Evento();
		evento.setNome("Olimpíadas de Inverno 2022");
		Date datainicio = f.parse("04/02/2022");
		Date datafim = f.parse("20/02/2022");
		evento.setInicioEvento(datainicio);
		evento.setFimEvento(datafim);
		evento.setProfissionais(eventoProfissionais);
		
		// Team Event
		
		TeamEvent te = new TeamEvent();
		
		//Verificação de IceDance para verificação de passagem de dois patinadores
		
		RythmDance scoreice = new RythmDance();
		
		Patinador par1 = new Patinador();
		par1.setNome("Gabriella Papadakis");
		Patinador par2 = new Patinador();
		par2.setNome("Guillaume Cizeron");
		
		em.persist(par1);
		em.persist(par2);
		em.persist(scoreice);
		
		IceDance icedance = new IceDance(scoreice);
		icedance.setPatinadores(par1, par2);
		eventoModalidades.add(icedance);
		te.setModalidade1(icedance);
		em.persist(icedance);
		
		//Verificação da Música
		
		ShortProgram spf = new ShortProgram();
		spf.setScoreShortProgram(10.0);
		SingleSkating sk = new SingleSkating(spf);
		sk.setDuracaoPrograma("2 minutos e 40 segundos");
		sk.setNomeModalidade("Women’s Single Figure Skating");
		sk.setNomeMusica("Let It Go");
		sk.setQualidadeMusica(EnumQualidadeMusica.HIGH_QUALITY);
		sk.setSoundPressuredB(86);
		sk.setSoundPressuredB(85);
		te.setModalidade4(sk);
		eventoModalidades.add(sk);
		evento.setModalidades(eventoModalidades);
		
		em.persist(spf);
		em.persist(sk);
		em.persist(evento);
		
		// Pair Skating
		
		PairSkating pairskating = new PairSkating();
		
		Patinador parps1 = new Patinador();
		parps1.setNome("Wenjing Sui");
		parps1.setNacionalidade("Chinesa");
		Patinador parps2 = new Patinador();
		parps2.setNome("Cong Han");
		parps2.setNacionalidade("Chinês");
		pairskating.setPatinadores(parps1, parps2);
		te.setModalidade3(pairskating);
		
		em.persist(parps1);
		em.persist(parps2);
		em.persist(pairskating);
		
		//Synchronized Skating
		
		List<Patinador> patinadoresSync = new ArrayList<Patinador>();
		Patinador sync1 = new Patinador();
		sync1.setNome("Amelia Asparian");
		Patinador sync2 = new Patinador();
		sync2.setNome("Anouk Begin");
		Patinador sync3 = new Patinador();
		sync3.setNome("Karianne Begin");
		Patinador sync4 = new Patinador();
		sync4.setNome("Julia Bernardo");
		Patinador sync5 = new Patinador();
		sync5.setNome("Anne-Claude Champagne");
		Patinador sync6 = new Patinador();
		sync6.setNome("Loriana Cocca");
		Patinador sync7 = new Patinador();
		sync7.setNome("Marie-Ève Comtois");
		Patinador sync8 = new Patinador();
		sync8.setNome("Laurie Desilets");
		Patinador sync9 = new Patinador();
		sync9.setNome("Olivia Di Giandomenico");
		Patinador sync10 = new Patinador();
		sync10.setNome("Lisanne Foley");
		Patinador sync11 = new Patinador();
		sync11.setNome("Charlotte Grutter");
		Patinador sync12 = new Patinador();
		sync12.setNome("Alessia Hart-Lewis");
		Patinador sync13 = new Patinador();
		sync13.setNome("Giulia Hart-Lewis");
		Patinador sync14 = new Patinador();
		sync14.setNome("Audrey-Ann Lajeunesse");
		Patinador sync15 = new Patinador();
		sync15.setNome("Agathe Sigrid Merlier");
		Patinador sync16 = new Patinador();
		sync16.setNome("Andréanne Paradis");
		Patinador sync17 = new Patinador();
		sync17.setNome("Martha Maria Pietrasik");
		Patinador sync18 = new Patinador();
		sync18.setNome("Florence Poulin");
		Patinador sync19 = new Patinador();
		sync19.setNome("Olivia Ronca");
		Patinador sync20 = new Patinador();
		sync20.setNome("Emmakaisa Tikkinen");
		
		em.persist(sync1);
		em.persist(sync2);
		em.persist(sync3);
		em.persist(sync4);
		em.persist(sync5);
		em.persist(sync6);
		em.persist(sync7);
		em.persist(sync8);
		em.persist(sync9);
		em.persist(sync10);
		em.persist(sync11);
		em.persist(sync12);
		em.persist(sync13);
		em.persist(sync14);
		em.persist(sync15);
		em.persist(sync16);
		em.persist(sync17);
		em.persist(sync18);
		em.persist(sync19);
		em.persist(sync20);
		
		ShortProgram scoresyncskating = new ShortProgram();
		scoresyncskating.setScoreShortProgram(81.51);
		SynchronizedSkating syncskating = new SynchronizedSkating(scoresyncskating);
		syncskating.setTimeName("Les Supremes");
		te.setModalidade2(syncskating);
		patinadoresSync.add(sync1);
		patinadoresSync.add(sync2);
		patinadoresSync.add(sync3);
		patinadoresSync.add(sync4);
		patinadoresSync.add(sync5);
		patinadoresSync.add(sync6);
		patinadoresSync.add(sync7);
		patinadoresSync.add(sync8);
		patinadoresSync.add(sync9);
		patinadoresSync.add(sync10);
		patinadoresSync.add(sync11);
		patinadoresSync.add(sync12);
		patinadoresSync.add(sync13);
		patinadoresSync.add(sync14);
		patinadoresSync.add(sync15);
		patinadoresSync.add(sync16);
		patinadoresSync.add(sync17);
		patinadoresSync.add(sync18);
		patinadoresSync.add(sync19);
		patinadoresSync.add(sync20);
		syncskating.setPatinadores(patinadoresSync);
		em.persist(scoresyncskating);
		em.persist(syncskating);
		
		em.persist(te);
		
		// Long Program e Short Program para um Patinador
		
		ShortProgram shortprogramTrusova = new ShortProgram();
		shortprogramTrusova.setScoreShortProgram(74.60);
		LongProgram longprogramTrusova = new LongProgram();
		longprogramTrusova.setScoreLongProgram(177.13);
		Patinador trusova = new Patinador();
		trusova.setNome("Alexandra Trusova");
		trusova.setNacionalidade("Russa");
		trusova.setTotalScoreSkating(longprogramTrusova.getScoreLongProgram()+shortprogramTrusova.getScoreShortProgram());
		em.persist(shortprogramTrusova);
		em.persist(longprogramTrusova);
		em.persist(trusova);
		
		em.getTransaction().commit();
        em.close();
        emf.close();
	}

}
