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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import java.awt.Color;

public class TelaCadPrestador extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfTelefone;
	private JTextField tfRaio;
	private JPasswordField pfSenha;
	private JPasswordField pfSenhacon;
	private JTextField tfEndereco;
	private JTextField tfComplemento;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaCadPrestador() throws ParseException {
		//Sintaxe
		TelaInfo inf = new TelaInfo();
		//Sintaxe
		
		setTitle("Cadastro De Prestador");
		setBounds(100, 100, 450, 423);
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
		lblNewLabel.setBounds(53, 32, 36, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Email");
		lblNome.setForeground(Color.BLACK);
		lblNome.setBackground(Color.WHITE);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(53, 60, 36, 17);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel_1_1 = new JLabel("Telefone");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(53, 88, 56, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sexo");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(53, 197, 36, 17);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Senha");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(53, 225, 41, 17);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Confirmar Senha");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(53, 253, 107, 17);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Raio De Servi\u00E7o");
		lblNewLabel_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_2.setBounds(53, 281, 102, 17);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1 = new JLabel("Data de nascimento");
		lblNewLabel_1_1_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_2_1_1.setBounds(53, 169, 136, 17);
		contentPane.add(lblNewLabel_1_1_1_1_2_1_1);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setForeground(Color.BLACK);
		btnEnviar.setBackground(Color.WHITE);
		btnEnviar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEnviar.setBounds(34, 350, 89, 23);
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
		btnSair.setBounds(335, 350, 89, 23);
		contentPane.add(btnSair);
		
		tfNome = new JTextField();
		tfNome.setForeground(Color.BLACK);
		tfNome.setBackground(Color.WHITE);
		tfNome.setBounds(102, 32, 234, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JFormattedTextField ftfDataNascimento = new JFormattedTextField(new MaskFormatter("##/##/###"));
		ftfDataNascimento.setForeground(Color.BLACK);
		ftfDataNascimento.setBackground(Color.WHITE);
		ftfDataNascimento.setBounds(199, 168, 109, 20);
		contentPane.add(ftfDataNascimento);
		
		tfEmail = new JTextField();
		tfEmail.setForeground(Color.BLACK);
		tfEmail.setBackground(Color.WHITE);
		tfEmail.setColumns(10);
		tfEmail.setBounds(102, 60, 234, 20);
		contentPane.add(tfEmail);
		
		tfTelefone = new JTextField();
		tfTelefone.setForeground(Color.BLACK);
		tfTelefone.setBackground(Color.WHITE);
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(122, 88, 234, 20);
		contentPane.add(tfTelefone);
		
		tfRaio = new JTextField();
		tfRaio.setForeground(Color.BLACK);
		tfRaio.setBackground(Color.WHITE);
		tfRaio.setColumns(10);
		tfRaio.setBounds(168, 281, 234, 20);
		contentPane.add(tfRaio);
		
		pfSenha = new JPasswordField();
		pfSenha.setForeground(Color.BLACK);
		pfSenha.setBackground(Color.WHITE);
		pfSenha.setBounds(107, 225, 229, 20);
		contentPane.add(pfSenha);
		
		pfSenhacon = new JPasswordField();
		pfSenhacon.setForeground(Color.BLACK);
		pfSenhacon.setBackground(Color.WHITE);
		pfSenhacon.setBounds(173, 253, 229, 20);
		contentPane.add(pfSenhacon);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(Color.BLACK);
		btnLimpar.setBackground(Color.WHITE);
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNome.setText("");
				tfEmail.setText("");
				tfTelefone.setText("");
				tfRaio.setText("");
				ftfDataNascimento.setText("");
				pfSenha.setText("");
				pfSenhacon.setText("");
			}
		});
		btnLimpar.setBounds(184, 350, 89, 23);
		contentPane.add(btnLimpar);
		
		JRadioButton rdMasculino = new JRadioButton("M");
		rdMasculino.setFont(new Font("Arial", Font.PLAIN, 14));
		rdMasculino.setForeground(Color.BLACK);
		rdMasculino.setBackground(Color.WHITE);
		rdMasculino.setBounds(99, 193, 46, 23);
		contentPane.add(rdMasculino);
		
		JRadioButton rdFeminino = new JRadioButton("F");
		rdFeminino.setFont(new Font("Arial", Font.PLAIN, 14));
		rdFeminino.setForeground(Color.BLACK);
		rdFeminino.setBackground(Color.WHITE);
		rdFeminino.setBounds(173, 193, 41, 23);
		contentPane.add(rdFeminino);
		
		JRadioButton rdOutros = new JRadioButton("Outros");
		rdOutros.setFont(new Font("Arial", Font.PLAIN, 14));
		rdOutros.setForeground(Color.BLACK);
		rdOutros.setBackground(Color.WHITE);
		rdOutros.setBounds(234, 193, 74, 23);
		contentPane.add(rdOutros);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setForeground(Color.BLACK);
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 56, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem.setBackground(Color.WHITE);
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				inf.setVisible(true);
			}
		});
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Manual");
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1.setForeground(Color.BLACK);
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ajuda");
		mntmNewMenuItem_2.setBackground(Color.WHITE);
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Endere\u00E7o");
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(53, 116, 70, 17);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Complemento");
		lblNewLabel_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1.setBounds(53, 140, 102, 17);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		tfEndereco = new JTextField();
		tfEndereco.setForeground(Color.BLACK);
		tfEndereco.setBackground(Color.WHITE);
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(122, 115, 234, 20);
		contentPane.add(tfEndereco);
		
		tfComplemento = new JTextField();
		tfComplemento.setForeground(Color.BLACK);
		tfComplemento.setBackground(Color.WHITE);
		tfComplemento.setColumns(10);
		tfComplemento.setBounds(147, 139, 234, 20);
		contentPane.add(tfComplemento);
		
	
	}
}
