package br.edu.unifei.ecot13.patinacaogelo.stefany.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.unifei.ecot13.patinacaogelo.stefany.Patinador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.Toolkit;

public class PatinadorFormAlterar extends JFrame {

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
					PatinadorFormAlterar frame = new PatinadorFormAlterar();
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
	public PatinadorFormAlterar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Stefany\\eclipse-workspace\\ecot13-patinacaogelo-2019008562\\ecot13-patinacaogelo-2019008562\\Skating01.jpg"));
		setTitle("Alterar Patinador");
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
		txtNome.setEnabled(false);
		txtNome.setBounds(143, 33, 279, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNacionalidade = new JTextField();
		txtNacionalidade.setEnabled(false);
		txtNacionalidade.setColumns(10);
		txtNacionalidade.setBounds(143, 57, 279, 20);
		contentPane.add(txtNacionalidade);
		
		JDateChooser dateNascimento = new JDateChooser();
		dateNascimento.setEnabled(false);
		dateNascimento.setBounds(143, 85, 108, 20);
		contentPane.add(dateNascimento);
		
		JLabel lblCuriosidade = new JLabel("Curiosidade:");
		lblCuriosidade.setBounds(10, 116, 123, 20);
		contentPane.add(lblCuriosidade);
		
		txtCuriosidade = new JTextField();
		txtCuriosidade.setEnabled(false);
		txtCuriosidade.setBounds(143, 116, 279, 50);
		contentPane.add(txtCuriosidade);
		txtCuriosidade.setColumns(10);
		
		JLabel lblScoreTotal = new JLabel("Score Total:");
		lblScoreTotal.setBounds(10, 177, 79, 20);
		contentPane.add(lblScoreTotal);
		
		JSpinner spnScoreInt = new JSpinner();
		spnScoreInt.setEnabled(false);
		spnScoreInt.setBounds(143, 177, 60, 20);
		contentPane.add(spnScoreInt);
		
		JSpinner spnCodigo = new JSpinner();
		spnCodigo.setBounds(143, 8, 60, 20);
		contentPane.add(spnCodigo);
		
		JSpinner spnScoreDec1 = new JSpinner();
		spnScoreDec1.setEnabled(false);
		spnScoreDec1.setBounds(221, 177, 60, 20);
		contentPane.add(spnScoreDec1);
		
		JLabel lblVirgula = new JLabel(",");
		lblVirgula.setEnabled(false);
		lblVirgula.setBounds(213, 177, 4, 20);
		contentPane.add(lblVirgula);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patinador.setNome(txtNome.getText());
				patinador.setNacionalidade(txtNacionalidade.getText());
				patinador.setDataNascimento(dateNascimento.getDate());
				patinador.setCuriosidade(txtCuriosidade.getText());
				patinador.idade();
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
				spnCodigo.setEnabled(false);
				em.getTransaction().begin();
				em.merge(patinador);
				em.getTransaction().commit();
			}
		});
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(192, 227, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patinador=em.find(Patinador.class, 
						(Integer)spnCodigo.getValue());
				if(patinador!=null) {
					spnCodigo.setEnabled(false);
					txtNome.setText(patinador.getNome());
					txtNome.setEnabled(true);
					txtNacionalidade.setText(patinador.getNacionalidade());
					txtNacionalidade.setEnabled(true);
					txtCuriosidade.setText(patinador.getCuriosidade());
					txtCuriosidade.setEnabled(true);
					dateNascimento.setDate(patinador.getDataNascimento());
					dateNascimento.setEnabled(true);
					Double scorePatinadorBusca = patinador.getTotalScoreSkating();
					spnScoreInt.setValue(scorePatinadorBusca);
					spnScoreInt.setEnabled(true);
					spnScoreDec1.setEnabled(true);
					lblVirgula.setEnabled(true);
					btnAlterar.setEnabled(true);
				}else {
					JOptionPane.showMessageDialog(null, "Patinador não existe");
				}
			}
			
		});
		btnBuscar.setBounds(220, 7, 79, 23);
		contentPane.add(btnBuscar);
		
	}
}
