package br.edu.unifei.ecot13.eleicao.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.unifei.ecot13.eleicao.Eleitor;

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
import java.awt.event.ActionEvent;

public class EleitorFormExcluir extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private EntityManagerFactory emf=
	Persistence.createEntityManagerFactory("eleicaoPU");
	private EntityManager em = 
		emf.createEntityManager();
	private Eleitor eleitor;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EleitorFormExcluir frame = new EleitorFormExcluir();
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
	public EleitorFormExcluir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 179);
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
		txtNome.setEnabled(false);
		txtNome.setColumns(10);
		txtNome.setBounds(87, 33, 151, 20);
		contentPane.add(txtNome);
		
		JSpinner spnSecao = new JSpinner();
		spnSecao.setEnabled(false);
		spnSecao.setBounds(86, 57, 93, 20);
		contentPane.add(spnSecao);
		
		JCheckBox chkAlfabetizado = new JCheckBox("É Alfabetizado");
		chkAlfabetizado.setEnabled(false);
		chkAlfabetizado.setBounds(85, 81, 97, 23);
		contentPane.add(chkAlfabetizado);

		JSpinner spnTitulo = new JSpinner();
		spnTitulo.setBounds(87, 8, 92, 20);
		contentPane.add(spnTitulo);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eleitor.setNome(txtNome.getText());
				eleitor.setSecao((Integer)spnSecao.getValue());
				eleitor.setAlfabetizado(
						chkAlfabetizado.isSelected());
				chkAlfabetizado.setEnabled(false);
				spnTitulo.setEnabled(true);
				em.getTransaction().begin();
				em.remove(eleitor);
				em.getTransaction().commit();							
			}
		});
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(85, 110, 89, 23);
		contentPane.add(btnExcluir);
		
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eleitor=em.find(Eleitor.class, 
						(Integer)spnTitulo.getValue());
				if(eleitor!=null) {
					spnTitulo.setEnabled(false);
					txtNome.setText(eleitor.getNome());
					spnSecao.setValue(eleitor.getSecao());
					chkAlfabetizado.setSelected(
							eleitor.isAlfabetizado());
					btnExcluir.setEnabled(true);
				}else {
					JOptionPane.showMessageDialog(null, "Eleitor não existe");
				}
				
				
			}
		});
		btnBuscar.setBounds(189, 7, 89, 23);
		contentPane.add(btnBuscar);
	}
}
