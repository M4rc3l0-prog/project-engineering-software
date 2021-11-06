package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class TelaCadPrestador extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfTelefone;
	private JTextField tfRaio;
	private JTextField tfIdade;
	private JPasswordField pfSenha;
	private JPasswordField pfSenhacon;
	private JTextField tfEndereco;
	private JTextField tfComplemento;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TelaCadPrestador() {
		TelaInfo inf = new TelaInfo();
		setTitle("Cadastro De Prestador");
		setBounds(100, 100, 450, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(53, 32, 36, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Email");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(53, 60, 36, 17);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel_1_1 = new JLabel("Telefone");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(53, 88, 56, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sexo");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(53, 197, 36, 17);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Senha");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(53, 225, 41, 17);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Confirmar Senha");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(53, 253, 107, 17);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Raio De Servi\u00E7o");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_2.setBounds(53, 281, 102, 17);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1 = new JLabel("Data de nascimento");
		lblNewLabel_1_1_1_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_2_1_1.setBounds(53, 169, 136, 17);
		contentPane.add(lblNewLabel_1_1_1_1_2_1_1);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEnviar.setBounds(34, 350, 89, 23);
		contentPane.add(btnEnviar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnSair.setBounds(335, 350, 89, 23);
		contentPane.add(btnSair);
		
		tfNome = new JTextField();
		tfNome.setBounds(102, 32, 234, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(102, 60, 234, 20);
		contentPane.add(tfEmail);
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(122, 88, 234, 20);
		contentPane.add(tfTelefone);
		
		tfRaio = new JTextField();
		tfRaio.setColumns(10);
		tfRaio.setBounds(168, 281, 234, 20);
		contentPane.add(tfRaio);
		
		tfIdade = new JTextField();
		tfIdade.setColumns(10);
		tfIdade.setBounds(199, 168, 163, 20);
		contentPane.add(tfIdade);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(107, 225, 229, 20);
		contentPane.add(pfSenha);
		
		pfSenhacon = new JPasswordField();
		pfSenhacon.setBounds(173, 253, 229, 20);
		contentPane.add(pfSenhacon);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNome.setText("");
				tfEmail.setText("");
				tfTelefone.setText("");
				tfRaio.setText("");
				tfIdade.setText("");
				pfSenha.setText("");
				pfSenhacon.setText("");
			}
		});
		btnLimpar.setBounds(184, 350, 89, 23);
		contentPane.add(btnLimpar);
		
		JRadioButton rdMasculino = new JRadioButton("M");
		rdMasculino.setBounds(99, 193, 46, 23);
		contentPane.add(rdMasculino);
		
		JRadioButton rdFeminino = new JRadioButton("F");
		rdFeminino.setBounds(173, 193, 41, 23);
		contentPane.add(rdFeminino);
		
		JRadioButton rdOutros = new JRadioButton("Outros");
		rdOutros.setBounds(234, 193, 74, 23);
		contentPane.add(rdOutros);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 56, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				inf.setVisible(true);
			}
		});
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Manual");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ajuda");
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Endere\u00E7o");
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(53, 116, 70, 17);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Complemento");
		lblNewLabel_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1.setBounds(53, 140, 102, 17);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		tfEndereco = new JTextField();
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(122, 115, 234, 20);
		contentPane.add(tfEndereco);
		
		tfComplemento = new JTextField();
		tfComplemento.setColumns(10);
		tfComplemento.setBounds(147, 139, 234, 20);
		contentPane.add(tfComplemento);
	}
}
