package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.automaticdb.Configuracaodb;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

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
	 * @throws ParseException 
	 */
	public TelaLogin() throws ParseException {
		// Sintaxe
	   Configuracaodb configBd = new Configuracaodb();
		TelaInfo inf = new TelaInfo();
		TelaCadastroEscolha cade = new TelaCadastroEscolha();
		TelaPrincipal pri = new TelaPrincipal();
		// Sintaxe
		
		setFont(new Font("Arial", Font.PLAIN, 14));
		setForeground(Color.RED);
		setBackground(Color.CYAN);
		
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(33, 79, 62, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSenha.setBounds(33, 105, 62, 14);
		contentPane.add(lblSenha);
		
		JButton btEntrar = new JButton("Entrar");
		btEntrar.setForeground(Color.BLACK);
		btEntrar.setBackground(Color.WHITE);
		btEntrar.setFont(new Font("Arial", Font.PLAIN, 14));
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pri.setVisible(true);
				setVisible(false);
			}
		});
		btEntrar.setBounds(150, 150, 101, 23);
		contentPane.add(btEntrar);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.setForeground(Color.BLACK);
		btCadastrar.setBackground(Color.WHITE);
		btCadastrar.setFont(new Font("Arial", Font.PLAIN, 14));
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cade.setVisible(true);
			}
		});
		btCadastrar.setBounds(150, 188, 101, 23);
		contentPane.add(btCadastrar);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(0, 0, 62, 23);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1.setForeground(Color.BLACK);
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				inf.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Manual");
		mntmNewMenuItem_2.setBackground(Color.WHITE);
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Ajuda");
		mntmNewMenuItem.setBackground(Color.WHITE);
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		tfUsuario.setForeground(Color.BLACK);
		tfUsuario.setBackground(Color.WHITE);
		tfUsuario.setBounds(105, 78, 229, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setEchoChar('*');
		pfSenha.setFont(new Font("Arial", Font.PLAIN, 12));
		pfSenha.setForeground(Color.BLACK);
		pfSenha.setBackground(Color.WHITE);
		pfSenha.setBounds(105, 103, 229, 20);
		contentPane.add(pfSenha);
		
		JButton btAcessarBD = new JButton("Conectar banco de dados");
		btAcessarBD.setForeground(Color.BLACK);
		btAcessarBD.setBackground(Color.WHITE);
		btAcessarBD.setFont(new Font("Arial", Font.PLAIN, 14));
		btAcessarBD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configBd.setVisible(true);
				
			}
		});
		btAcessarBD.setBounds(93, 223, 241, 23);
		contentPane.add(btAcessarBD);
		
		
		
	}
}
