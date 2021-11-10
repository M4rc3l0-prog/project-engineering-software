package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;



public class TelaAlterarPrestador extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfTelefone;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField tfEndereco;
	private JTextField tfComplemento;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaAlterarPrestador() throws ParseException {
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setTitle("Alterar");
		setBounds(100, 100, 450, 405);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(51, 38, 36, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Email");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBackground(Color.WHITE);
		lblNome.setBounds(51, 66, 36, 17);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel_1_1 = new JLabel("Telefone");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(51, 94, 56, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sexo");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(51, 203, 36, 17);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Senha");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1.setBounds(51, 231, 41, 17);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Confirmar Senha");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setBounds(51, 259, 107, 17);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Raio De Servi\u00E7o");
		lblNewLabel_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1_2.setBounds(51, 287, 102, 17);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1 = new JLabel("Data de nascimento");
		lblNewLabel_1_1_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1_2_1_1.setBounds(51, 175, 136, 17);
		contentPane.add(lblNewLabel_1_1_1_1_2_1_1);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setForeground(Color.BLACK);
		btnEnviar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEnviar.setBackground(Color.WHITE);
		btnEnviar.setBounds(10, 329, 89, 23);
		contentPane.add(btnEnviar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(Color.BLACK);
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.setBackground(Color.WHITE);
		btnSair.setBounds(311, 329, 89, 23);
		contentPane.add(btnSair);
		
		tfNome = new JTextField();
		tfNome.setForeground(Color.BLACK);
		tfNome.setColumns(10);
		tfNome.setBackground(Color.WHITE);
		tfNome.setBounds(100, 38, 234, 20);
		contentPane.add(tfNome);
		
		JFormattedTextField ftfDataNascimento = new JFormattedTextField(new MaskFormatter("##/##/###"));
		ftfDataNascimento.setForeground(Color.BLACK);
		ftfDataNascimento.setBackground(Color.WHITE);
		ftfDataNascimento.setBounds(197, 174, 109, 20);
		contentPane.add(ftfDataNascimento);
		
		tfEmail = new JTextField();
		tfEmail.setForeground(Color.BLACK);
		tfEmail.setColumns(10);
		tfEmail.setBackground(Color.WHITE);
		tfEmail.setBounds(100, 66, 234, 20);
		contentPane.add(tfEmail);
		
		tfTelefone = new JTextField();
		tfTelefone.setForeground(Color.BLACK);
		tfTelefone.setColumns(10);
		tfTelefone.setBackground(Color.WHITE);
		tfTelefone.setBounds(120, 94, 234, 20);
		contentPane.add(tfTelefone);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.BLACK);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(166, 287, 234, 20);
		contentPane.add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(105, 231, 229, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setForeground(Color.BLACK);
		passwordField_1.setBackground(Color.WHITE);
		passwordField_1.setBounds(171, 259, 229, 20);
		contentPane.add(passwordField_1);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(Color.BLACK);
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.setBackground(Color.WHITE);
		btnLimpar.setBounds(160, 329, 89, 23);
		contentPane.add(btnLimpar);
		
		JRadioButton rdMasculino = new JRadioButton("M");
		rdMasculino.setForeground(Color.BLACK);
		rdMasculino.setFont(new Font("Arial", Font.PLAIN, 14));
		rdMasculino.setBackground(Color.WHITE);
		rdMasculino.setBounds(97, 199, 46, 23);
		contentPane.add(rdMasculino);
		
		JRadioButton rdFeminino = new JRadioButton("F");
		rdFeminino.setForeground(Color.BLACK);
		rdFeminino.setFont(new Font("Arial", Font.PLAIN, 14));
		rdFeminino.setBackground(Color.WHITE);
		rdFeminino.setBounds(171, 199, 41, 23);
		contentPane.add(rdFeminino);
		
		JRadioButton rdOutros = new JRadioButton("Outros");
		rdOutros.setForeground(Color.BLACK);
		rdOutros.setFont(new Font("Arial", Font.PLAIN, 14));
		rdOutros.setBackground(Color.WHITE);
		rdOutros.setBounds(232, 199, 74, 23);
		contentPane.add(rdOutros);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Endere\u00E7o");
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_1_2.setBounds(51, 122, 70, 17);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Complemento");
		lblNewLabel_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1.setBounds(51, 146, 102, 17);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		tfEndereco = new JTextField();
		tfEndereco.setForeground(Color.BLACK);
		tfEndereco.setColumns(10);
		tfEndereco.setBackground(Color.WHITE);
		tfEndereco.setBounds(120, 121, 234, 20);
		contentPane.add(tfEndereco);
		
		tfComplemento = new JTextField();
		tfComplemento.setForeground(Color.BLACK);
		tfComplemento.setColumns(10);
		tfComplemento.setBackground(Color.WHITE);
		tfComplemento.setBounds(145, 145, 234, 20);
		contentPane.add(tfComplemento);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 56, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setBackground(Color.WHITE);
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Manual");
		mntmNewMenuItem_1.setForeground(Color.BLACK);
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ajuda");
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mntmNewMenuItem_2.setBackground(Color.WHITE);
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		
	}

}
