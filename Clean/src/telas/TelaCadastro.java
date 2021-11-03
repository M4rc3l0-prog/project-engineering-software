package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfTelefone;
	private JTextField tfSexo;
	private JPasswordField pfSenhacon;
	private JPasswordField pfSenha;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		TelaInfo inf = new TelaInfo();
		setTitle("Cadastro");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(28, 42, 36, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEmail.setBounds(28, 67, 34, 17);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("telefone");
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefone.setBounds(28, 92, 51, 17);
		contentPane.add(lblTelefone);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSexo.setBounds(28, 120, 31, 17);
		contentPane.add(lblSexo);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSenha.setBounds(28, 148, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblConfirmarSenha.setBounds(28, 173, 107, 17);
		contentPane.add(lblConfirmarSenha);
		
		tfNome = new JTextField();
		tfNome.setBounds(74, 41, 261, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(72, 66, 263, 20);
		contentPane.add(tfEmail);
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(89, 91, 246, 20);
		contentPane.add(tfTelefone);
		
		tfSexo = new JTextField();
		tfSexo.setColumns(10);
		tfSexo.setBounds(69, 119, 266, 20);
		contentPane.add(tfSexo);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEnviar.setBounds(28, 227, 89, 23);
		contentPane.add(btnEnviar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(319, 227, 89, 23);
		contentPane.add(btnSair);
		
		pfSenhacon = new JPasswordField();
		pfSenhacon.setBounds(145, 172, 229, 20);
		contentPane.add(pfSenhacon);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(84, 146, 229, 20);
		contentPane.add(pfSenha);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					tfNome.setText("");
					tfEmail.setText("");
					tfSexo.setText("");
					tfTelefone.setText("");
					pfSenha.setText("");
					pfSenhacon.setText("");
			}
		});
		btnLimpar.setBounds(170, 227, 89, 23);
		contentPane.add(btnLimpar);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 71, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Infoma\u00E7\u00F5es");
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
	}

}
