package br.edu.unifei.ecot13.eleicao.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.unifei.ecot13.eleicao.Eleitor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EleitorFormInserir extends JFrame {

	private EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("eleicaoPU");
	private EntityManager em = emf.createEntityManager();
	private Eleitor eleitor;

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EleitorFormInserir frame = new EleitorFormInserir();
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
	public EleitorFormInserir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Titulo Eleitor:");
		lblTitulo.setBounds(10, 11, 79, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 36, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSecao = new JLabel("Seção:");
		lblSecao.setBounds(10, 60, 46, 14);
		contentPane.add(lblSecao);
		
		JLabel lblAlfabetizado = new JLabel("Alfabetizado:");
		lblAlfabetizado.setBounds(10, 85, 69, 14);
		contentPane.add(lblAlfabetizado);
		
		txtNome = new JTextField();
		txtNome.setBounds(87, 33, 151, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JSpinner spnSecao = new JSpinner();
		spnSecao.setBounds(86, 57, 93, 20);
		contentPane.add(spnSecao);
		
		JCheckBox chkAlfabetizado = new JCheckBox("É Alfabetizado");
		chkAlfabetizado.setBounds(85, 81, 97, 23);
		contentPane.add(chkAlfabetizado);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eleitor=new Eleitor();
				eleitor.setNome(txtNome.getText());
				eleitor.setSecao((Integer)spnSecao.getValue());
				eleitor.setAlfabetizado(chkAlfabetizado.isSelected());
				em.getTransaction().begin();
				em.persist(eleitor);
				em.getTransaction().commit();
			}
		});
		btnInserir.setBounds(85, 110, 89, 23);
		contentPane.add(btnInserir);
	}
}
