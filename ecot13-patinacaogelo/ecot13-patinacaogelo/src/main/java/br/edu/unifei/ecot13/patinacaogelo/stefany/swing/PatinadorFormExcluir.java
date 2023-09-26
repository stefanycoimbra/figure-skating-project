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

public class PatinadorFormExcluir extends JFrame {

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
					PatinadorFormExcluir frame = new PatinadorFormExcluir();
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
	public PatinadorFormExcluir() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Stefany\\eclipse-workspace\\ecot13-patinacaogelo-2019008562\\ecot13-patinacaogelo-2019008562\\Skating01.jpg"));
		setTitle("Excluir Patinador");
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
		
		JSpinner spnScore = new JSpinner();
		spnScore.setEnabled(false);
		spnScore.setBounds(143, 177, 89, 20);
		contentPane.add(spnScore);
		
		JSpinner spnCodigo = new JSpinner();
		spnCodigo.setBounds(143, 8, 60, 20);
		contentPane.add(spnCodigo);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patinador.setNome(txtNome.getText());
				patinador.setNacionalidade(txtNacionalidade.getText());
				patinador.setDataNascimento(dateNascimento.getDate());
				patinador.setCuriosidade(txtCuriosidade.getText());
				patinador.idade();
				spnCodigo.setEnabled(true);
				em.getTransaction().begin();
				em.remove(patinador);
				em.getTransaction().commit();
			}
		});
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(192, 227, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patinador=em.find(Patinador.class, 
						(Integer)spnCodigo.getValue());
				if(patinador!=null) {
					spnCodigo.setEnabled(false);
					txtNome.setText(patinador.getNome());
					txtNacionalidade.setText(patinador.getNacionalidade());
					txtCuriosidade.setText(patinador.getCuriosidade());
					dateNascimento.setDate(patinador.getDataNascimento());
					Double scorePatinadorBusca = patinador.getTotalScoreSkating();
					
					spnScore.setValue(scorePatinadorBusca);
					btnExcluir.setEnabled(true);
				}else {
					JOptionPane.showMessageDialog(null, "Patinador não existe");
				}
			}
			
		});
		btnBuscar.setBounds(220, 7, 79, 23);
		contentPane.add(btnBuscar);
	}
}
