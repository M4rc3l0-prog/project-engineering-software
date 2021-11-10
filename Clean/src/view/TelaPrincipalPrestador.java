package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.awt.Color;

public class TelaPrincipalPrestador extends JFrame {

	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfNome;
	private JTextField tfTelefone;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaPrincipalPrestador() throws ParseException {
		
		// Sintaxe
		TelaInfo inf = new TelaInfo();
		TelaAlterarPrestador tap = new TelaAlterarPrestador();
		// Sintaxe
		
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		
		
		setTitle("Perfil");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Online");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(323, 11, 101, 23);
		contentPane.add(btnNewButton);
		
		JButton btnOffline = new JButton("Offline");
		btnOffline.setForeground(Color.BLACK);
		btnOffline.setBackground(Color.WHITE);
		btnOffline.setFont(new Font("Arial", Font.PLAIN, 14));
		btnOffline.setBounds(323, 39, 101, 23);
		contentPane.add(btnOffline);
		
		JButton btnServios = new JButton("Servi\u00E7os");
		btnServios.setForeground(Color.BLACK);
		btnServios.setBackground(Color.WHITE);
		btnServios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnServios.setFont(new Font("Arial", Font.PLAIN, 14));
		btnServios.setBounds(150, 22, 89, 23);
		contentPane.add(btnServios);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(Color.BLACK);
		btnSair.setBackground(Color.WHITE);
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(323, 227, 101, 23);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 82, 13, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.BLACK);
		lblNome.setBackground(Color.WHITE);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(10, 107, 36, 17);
		contentPane.add(lblNome);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setBackground(Color.WHITE);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefone.setBounds(10, 134, 56, 17);
		contentPane.add(lblTelefone);
		
		JLabel lblSobre = new JLabel("Sobre");
		lblSobre.setForeground(Color.BLACK);
		lblSobre.setBackground(Color.WHITE);
		lblSobre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSobre.setBounds(10, 160, 38, 17);
		contentPane.add(lblSobre);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 185, 134, 64);
		contentPane.add(scrollPane);
		
		JTextPane tpSobre = new JTextPane();
		tpSobre.setForeground(Color.BLACK);
		scrollPane.setViewportView(tpSobre);
		
		tfID = new JTextField();
		tfID.setForeground(Color.BLACK);
		tfID.setBackground(Color.WHITE);
		tfID.setEditable(false);
		tfID.setBounds(33, 81, 168, 20);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		tfNome = new JTextField();
		tfNome.setForeground(Color.BLACK);
		tfNome.setBackground(Color.WHITE);
		tfNome.setEditable(false);
		tfNome.setColumns(10);
		tfNome.setBounds(56, 106, 158, 20);
		contentPane.add(tfNome);
		
		tfTelefone = new JTextField();
		tfTelefone.setForeground(Color.BLACK);
		tfTelefone.setBackground(Color.WHITE);
		tfTelefone.setEditable(false);
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(76, 133, 141, 20);
		contentPane.add(tfTelefone);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setForeground(Color.BLACK);
		btnAlterar.setBackground(Color.WHITE);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tap.setVisible(true);
			}
		});
		btnAlterar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnAlterar.setBounds(181, 227, 101, 23);
		contentPane.add(btnAlterar);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(Color.WHITE);
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 61, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setBackground(Color.WHITE);
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
		
		JButton btnEstastica = new JButton("Estat\u00EDstica ");
		btnEstastica.setForeground(Color.BLACK);
		btnEstastica.setBackground(Color.WHITE);
		btnEstastica.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEstastica.setBounds(323, 73, 101, 25);
		contentPane.add(btnEstastica);
	}
}
