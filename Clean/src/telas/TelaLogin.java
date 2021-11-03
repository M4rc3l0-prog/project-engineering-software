package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		TelaInfo inf = new TelaInfo();
		TelaCadastro cad = new TelaCadastro();
		TelaPrincipal pri = new TelaPrincipal();
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(33, 79, 62, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSenha.setBounds(33, 105, 62, 14);
		contentPane.add(lblSenha);
		
		JButton btEntrar = new JButton("Entrar");
		btEntrar.setFont(new Font("Arial", Font.PLAIN, 14));
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pri.setVisible(true);
			}
		});
		btEntrar.setBounds(150, 153, 101, 23);
		contentPane.add(btEntrar);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.setFont(new Font("Arial", Font.PLAIN, 14));
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cad.setVisible(true);
			}
		});
		btCadastrar.setBounds(150, 188, 101, 23);
		contentPane.add(btCadastrar);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 58, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				inf.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Manual");
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Ajuda");
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(105, 78, 229, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(105, 103, 229, 20);
		contentPane.add(pfSenha);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pfSenha.setText("");
				tfUsuario.setText("");
			}
		});
		btLimpar.setBounds(150, 222, 101, 23);
		contentPane.add(btLimpar);
	}
}
