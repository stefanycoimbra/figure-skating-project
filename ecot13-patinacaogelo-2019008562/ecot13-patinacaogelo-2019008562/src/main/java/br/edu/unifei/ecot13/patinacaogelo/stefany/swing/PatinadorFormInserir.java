package br.edu.unifei.ecot13.patinacaogelo.stefany.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.unifei.ecot13.patinacaogelo.stefany.Patinador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Toolkit;

public class PatinadorFormInserir extends JFrame {

	private EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("patinacaoGelo");
	private EntityManager em = emf.createEntityManager();
	private Patinador patinador;

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNacionalidade;
	private JTextField txtCuriosidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatinadorFormInserir frame = new PatinadorFormInserir();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PatinadorFormInserir() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Stefany\\eclipse-workspace\\ecot13-patinacaogelo-2019008562\\ecot13-patinacaogelo-2019008562\\Skating01.jpg"));
		setBackground(new Color(0, 128, 192));
		setTitle("Inserir Patinador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("ID do Patinador:");
		lblCodigo.setBounds(10, 11, 123, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 36, 123, 14);
		contentPane.add(lblNome);
		
		JLabel lblNacionalidade = new JLabel("Nacionalidade:");
		lblNacionalidade.setBounds(10, 60, 123, 14);
		contentPane.add(lblNacionalidade);
		
		JLabel lblNascimento = new JLabel("Data de Nascimento:");
		lblNascimento.setBounds(10, 85, 123, 20);
		contentPane.add(lblNascimento);
		
		txtNome = new JTextField();
		txtNome.setBounds(143, 33, 279, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNacionalidade = new JTextField();
		txtNacionalidade.setColumns(10);
		txtNacionalidade.setBounds(143, 57, 279, 20);
		contentPane.add(txtNacionalidade);
		
		JDateChooser dateNascimento = new JDateChooser();
		dateNascimento.setBounds(143, 85, 108, 20);
		contentPane.add(dateNascimento);
		
		JLabel lblCuriosidade = new JLabel("Curiosidade:");
		lblCuriosidade.setBounds(10, 116, 123, 20);
		contentPane.add(lblCuriosidade);
		
		txtCuriosidade = new JTextField();
		txtCuriosidade.setBounds(143, 116, 279, 50);
		contentPane.add(txtCuriosidade);
		txtCuriosidade.setColumns(10);
		
		JLabel lblScoreTotal = new JLabel("Score Total:");
		lblScoreTotal.setBounds(10, 177, 79, 20);
		contentPane.add(lblScoreTotal);
		
		JSpinner spnScoreInt = new JSpinner();
		spnScoreInt.setBounds(143, 177, 46, 20);
		contentPane.add(spnScoreInt);
		
		JSpinner spnScoreDec1 = new JSpinner();
		spnScoreDec1.setBounds(210, 177, 46, 20);
		contentPane.add(spnScoreDec1);
		
		JLabel lblVirgula = new JLabel(",");
		lblVirgula.setBounds(199, 177, 4, 20);
		contentPane.add(lblVirgula);
		
		JSpinner spnCodigo = new JSpinner();
		spnCodigo.setEnabled(false);
		spnCodigo.setBounds(143, 8, 60, 20);
		contentPane.add(spnCodigo);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patinador=new Patinador();
				patinador.setNome(txtNome.getText());
				patinador.setDataNascimento(dateNascimento.getDate());
				patinador.setCuriosidade(txtCuriosidade.getText());
				String s = Integer.toString((Integer)spnScoreDec1.getValue());
				Integer i = 1, l = s.length();
				Double fator = 1.0;
				Double parteInteira = Double.parseDouble(spnScoreInt.getValue().toString());
				Double parteFracionaria;
				while (i <= l) {
					fator = fator/10;
					i++;
				}
				if((Integer)spnScoreDec1.getValue() < 0) {
					parteFracionaria = 0.0;
				}
				else {
					parteFracionaria = Double.parseDouble(spnScoreDec1.getValue().toString());
				}
				Double scorePatinador = parteInteira+parteFracionaria*fator;
				patinador.setTotalScoreSkating(scorePatinador);
				patinador.idade();
				em.getTransaction().begin();
				em.persist(patinador);
				em.getTransaction().commit();
				spnCodigo.setEnabled(true);
				spnCodigo.setValue(patinador.getCodigo());
				spnCodigo.setEnabled(false);
			}
		});
		
		btnInserir.setBounds(192, 227, 89, 23);
		contentPane.add(btnInserir);
	}
}
