package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import java.awt.Color;

public class TelaCadastro extends JFrame {

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
	public TelaCadastro() throws ParseException {
		
		//Sintaxe 
		TelaInfo inf = new TelaInfo();
		//Sintaxe
		
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		
		setTitle("Cadastro");
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(28, 42, 36, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setBackground(Color.WHITE);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEmail.setBounds(28, 67, 34, 17);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("telefone");
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setBackground(Color.WHITE);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefone.setBounds(28, 92, 51, 17);
		contentPane.add(lblTelefone);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setForeground(Color.BLACK);
		lblSexo.setBackground(Color.WHITE);
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSexo.setBounds(28, 200, 31, 17);
		contentPane.add(lblSexo);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setBackground(Color.WHITE);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSenha.setBounds(28, 228, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setForeground(Color.BLACK);
		lblConfirmarSenha.setBackground(Color.WHITE);
		lblConfirmarSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblConfirmarSenha.setBounds(28, 253, 107, 17);
		contentPane.add(lblConfirmarSenha);
		
		tfNome = new JTextField();
		tfNome.setForeground(Color.BLACK);
		tfNome.setBackground(Color.WHITE);
		tfNome.setBounds(74, 41, 261, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setForeground(Color.BLACK);
		tfEmail.setBackground(Color.WHITE);
		tfEmail.setColumns(10);
		tfEmail.setBounds(72, 66, 263, 20);
		contentPane.add(tfEmail);
		
		tfTelefone = new JTextField();
		tfTelefone.setForeground(Color.BLACK);
		tfTelefone.setBackground(Color.WHITE);
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(89, 91, 246, 20);
		contentPane.add(tfTelefone);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setForeground(Color.BLACK);
		btnEnviar.setBackground(Color.WHITE);
		btnEnviar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEnviar.setBounds(28, 327, 89, 23);
		contentPane.add(btnEnviar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(Color.BLACK);
		btnSair.setBackground(Color.WHITE);
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(319, 327, 89, 23);
		contentPane.add(btnSair);
		
		pfSenhacon = new JPasswordField();
		pfSenhacon.setForeground(Color.BLACK);
		pfSenhacon.setBackground(Color.WHITE);
		pfSenhacon.setBounds(145, 252, 229, 20);
		contentPane.add(pfSenhacon);
		
		JFormattedTextField ftfDataNascimento = new JFormattedTextField(new MaskFormatter("##/##/####"));
		ftfDataNascimento.setForeground(Color.BLACK);
		ftfDataNascimento.setBackground(Color.WHITE);
		ftfDataNascimento.setBounds(170, 175, 143, 20);
		contentPane.add(ftfDataNascimento);
		
		pfSenha = new JPasswordField();
		pfSenha.setForeground(Color.BLACK);
		pfSenha.setBackground(Color.WHITE);
		pfSenha.setBounds(84, 226, 229, 20);
		contentPane.add(pfSenha);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(Color.BLACK);
		btnLimpar.setBackground(Color.WHITE);
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					tfNome.setText("");
					tfEmail.setText("");
					tfComplemento.setText("");
					tfEndereco.setText("");
					tfTelefone.setText("");
					pfSenha.setText("");
					pfSenhacon.setText("");
					ftfDataNascimento.setText("");
								}
		});
		btnLimpar.setBounds(170, 327, 89, 23);
		contentPane.add(btnLimpar);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(Color.WHITE);
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 71, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Infoma\u00E7\u00F5es");
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setBackground(Color.WHITE);
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				inf.setVisible(true);
			}
		});
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
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setForeground(Color.BLACK);
		lblEndereo.setBackground(Color.WHITE);
		lblEndereo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEndereo.setBounds(28, 120, 61, 17);
		contentPane.add(lblEndereo);
		
		tfEndereco = new JTextField();
		tfEndereco.setForeground(Color.BLACK);
		tfEndereco.setBackground(Color.WHITE);
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(99, 119, 266, 20);
		contentPane.add(tfEndereco);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setForeground(Color.BLACK);
		lblComplemento.setBackground(Color.WHITE);
		lblComplemento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblComplemento.setBounds(28, 148, 89, 17);
		contentPane.add(lblComplemento);
		
		tfComplemento = new JTextField();
		tfComplemento.setForeground(Color.BLACK);
		tfComplemento.setBackground(Color.WHITE);
		tfComplemento.setColumns(10);
		tfComplemento.setBounds(127, 143, 266, 20);
		contentPane.add(tfComplemento);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento");
		lblDataDeNascimento.setForeground(Color.BLACK);
		lblDataDeNascimento.setBackground(Color.WHITE);
		lblDataDeNascimento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDataDeNascimento.setBounds(28, 176, 145, 17);
		contentPane.add(lblDataDeNascimento);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("M");
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(65, 200, 46, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("F");
		rdbtnNewRadioButton_1.setForeground(Color.BLACK);
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setBounds(139, 200, 41, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Outros");
		rdbtnNewRadioButton_1_1.setForeground(Color.BLACK);
		rdbtnNewRadioButton_1_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1_1.setBounds(200, 200, 74, 23);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		
	}
}
