package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;



public class TelaAlterar extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfTelefone;
	private JPasswordField pfSenhacon;
	private JPasswordField pfSenha;
	private JTextField tfEndereco;
	private JTextField tfComplemento;

	/**
	 * Launch the application.
	 */
		
	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaAlterar() throws ParseException {
		setTitle("Alterar");
		setBounds(100, 100, 450, 385);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setForeground(Color.BLACK);
		btnAlterar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnAlterar.setBackground(Color.WHITE);
		btnAlterar.setBounds(10, 311, 89, 23);
		contentPane.add(btnAlterar);
		
		JFormattedTextField ftfDataNascimento = new JFormattedTextField(new MaskFormatter("##/##/####"));
		ftfDataNascimento.setForeground(Color.BLACK);
		ftfDataNascimento.setBackground(Color.WHITE);
		ftfDataNascimento.setBounds(182, 176, 143, 20);
		contentPane.add(ftfDataNascimento);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setForeground(Color.BLACK);
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.setBackground(Color.WHITE);
		btnSair.setBounds(316, 312, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNome.setText("");
				tfEmail.setText("");
				tfEndereco.setText("");
				tfTelefone.setText("");
				tfComplemento.setText("");
				ftfDataNascimento.setText("");
				pfSenha.setText("");
				pfSenhacon.setText("");
				
			}
		});
		btnLimpar.setForeground(Color.BLACK);
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.setBackground(Color.WHITE);
		btnLimpar.setBounds(160, 311, 89, 23);
		contentPane.add(btnLimpar);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(40, 43, 36, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEmail.setBackground(Color.WHITE);
		lblEmail.setBounds(40, 68, 34, 17);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("telefone");
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefone.setBackground(Color.WHITE);
		lblTelefone.setBounds(40, 93, 51, 17);
		contentPane.add(lblTelefone);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setForeground(Color.BLACK);
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSexo.setBackground(Color.WHITE);
		lblSexo.setBounds(40, 201, 31, 17);
		contentPane.add(lblSexo);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSenha.setBackground(Color.WHITE);
		lblSenha.setBounds(40, 229, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setForeground(Color.BLACK);
		lblConfirmarSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblConfirmarSenha.setBackground(Color.WHITE);
		lblConfirmarSenha.setBounds(40, 254, 107, 17);
		contentPane.add(lblConfirmarSenha);
		
		tfNome = new JTextField();
		tfNome.setForeground(Color.BLACK);
		tfNome.setColumns(10);
		tfNome.setBackground(Color.WHITE);
		tfNome.setBounds(86, 42, 261, 20);
		contentPane.add(tfNome);
		
		tfEmail = new JTextField();
		tfEmail.setForeground(Color.BLACK);
		tfEmail.setColumns(10);
		tfEmail.setBackground(Color.WHITE);
		tfEmail.setBounds(84, 67, 263, 20);
		contentPane.add(tfEmail);
		
		tfTelefone = new JTextField();
		tfTelefone.setForeground(Color.BLACK);
		tfTelefone.setColumns(10);
		tfTelefone.setBackground(Color.WHITE);
		tfTelefone.setBounds(101, 92, 246, 20);
		contentPane.add(tfTelefone);
		
		pfSenhacon = new JPasswordField();
		pfSenhacon.setForeground(Color.BLACK);
		pfSenhacon.setBackground(Color.WHITE);
		pfSenhacon.setBounds(157, 253, 229, 20);
		contentPane.add(pfSenhacon);
		
		
		
		pfSenha = new JPasswordField();
		pfSenha.setForeground(Color.BLACK);
		pfSenha.setBackground(Color.WHITE);
		pfSenha.setBounds(96, 227, 229, 20);
		contentPane.add(pfSenha);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setForeground(Color.BLACK);
		lblEndereo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEndereo.setBackground(Color.WHITE);
		lblEndereo.setBounds(40, 121, 61, 17);
		contentPane.add(lblEndereo);
		
		tfEndereco = new JTextField();
		tfEndereco.setForeground(Color.BLACK);
		tfEndereco.setColumns(10);
		tfEndereco.setBackground(Color.WHITE);
		tfEndereco.setBounds(111, 120, 266, 20);
		contentPane.add(tfEndereco);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setForeground(Color.BLACK);
		lblComplemento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblComplemento.setBackground(Color.WHITE);
		lblComplemento.setBounds(40, 149, 89, 17);
		contentPane.add(lblComplemento);
		
		tfComplemento = new JTextField();
		tfComplemento.setForeground(Color.BLACK);
		tfComplemento.setColumns(10);
		tfComplemento.setBackground(Color.WHITE);
		tfComplemento.setBounds(139, 145, 266, 20);
		contentPane.add(tfComplemento);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento");
		lblDataDeNascimento.setForeground(Color.BLACK);
		lblDataDeNascimento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDataDeNascimento.setBackground(Color.WHITE);
		lblDataDeNascimento.setBounds(40, 177, 145, 17);
		contentPane.add(lblDataDeNascimento);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("M");
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(116, 203, 46, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("F");
		rdbtnNewRadioButton_1.setForeground(Color.BLACK);
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setBounds(190, 203, 41, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Outros");
		rdbtnNewRadioButton_1_1.setForeground(Color.BLACK);
		rdbtnNewRadioButton_1_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1_1.setBounds(251, 203, 74, 23);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBorderPainted(false);
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(0, 0, 61, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00E3o");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
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
