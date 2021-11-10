package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaPrincipal extends JFrame {

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
	public TelaPrincipal() throws ParseException {
		
		//Sintaxe
		
		TelaAlterar alt = new TelaAlterar();
		TelaInfo inf = new TelaInfo();
		TelaColetaDados col = new TelaColetaDados();
		TelaHistorico his = new TelaHistorico();
		TelaAgenda age = new TelaAgenda();
		
		//Sintaxe
		
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(0, 0, 61, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
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
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 84, 13, 17);
		contentPane.add(lblNewLabel);
		
		tfID = new JTextField();
		tfID.setForeground(Color.BLACK);
		tfID.setBackground(Color.WHITE);
		tfID.setEditable(false);
		tfID.setColumns(10);
		tfID.setBounds(33, 83, 168, 20);
		contentPane.add(tfID);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.BLACK);
		lblNome.setBackground(Color.WHITE);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(10, 109, 36, 17);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setForeground(Color.BLACK);
		tfNome.setBackground(Color.WHITE);
		tfNome.setEditable(false);
		tfNome.setColumns(10);
		tfNome.setBounds(56, 108, 158, 20);
		contentPane.add(tfNome);
		
		tfTelefone = new JTextField();
		tfTelefone.setForeground(Color.BLACK);
		tfTelefone.setBackground(Color.WHITE);
		tfTelefone.setEditable(false);
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(76, 135, 141, 20);
		contentPane.add(tfTelefone);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setBackground(Color.WHITE);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefone.setBounds(10, 136, 56, 17);
		contentPane.add(lblTelefone);
		
		JLabel lblSobre = new JLabel("Sobre");
		lblSobre.setForeground(Color.BLACK);
		lblSobre.setBackground(Color.WHITE);
		lblSobre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSobre.setBounds(10, 162, 38, 17);
		contentPane.add(lblSobre);
		
		JTextPane tpSobre = new JTextPane();
		tpSobre.setFont(new Font("Arial", Font.PLAIN, 12));
		tpSobre.setForeground(Color.BLACK);
		tpSobre.setBackground(Color.WHITE);
		tpSobre.setBounds(11, 188, 132, 62);
		contentPane.add(tpSobre);
		
		JButton btnAgendar = new JButton("Agendar");
		btnAgendar.setForeground(Color.BLACK);
		btnAgendar.setBackground(Color.WHITE);
		btnAgendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				age.setVisible(true);
			}
		});
		btnAgendar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnAgendar.setBounds(335, 11, 89, 23);
		contentPane.add(btnAgendar);
		
		JButton btnHistorico = new JButton("Historico");
		btnHistorico.setForeground(Color.BLACK);
		btnHistorico.setBackground(Color.WHITE);
		btnHistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				his.setVisible(true);
			}
			
		});
		btnHistorico.setFont(new Font("Arial", Font.PLAIN, 14));
		btnHistorico.setBounds(335, 39, 89, 23);
		contentPane.add(btnHistorico);
		
		JButton btnServios = new JButton("Servi\u00E7os");
		btnServios.setForeground(Color.BLACK);
		btnServios.setBackground(Color.WHITE);
		btnServios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				col.setVisible(true);
			}
		});
		btnServios.setFont(new Font("Arial", Font.PLAIN, 14));
		btnServios.setBounds(161, 22, 89, 23);
		contentPane.add(btnServios);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(Color.BLACK);
		btnSair.setBackground(Color.WHITE);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.setBounds(335, 227, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alt.setVisible(true);
			}
		});
		btnAlterar.setForeground(Color.BLACK);
		btnAlterar.setBackground(Color.WHITE);
		btnAlterar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnAlterar.setBounds(181, 227, 89, 23);
		contentPane.add(btnAlterar);
	}
}
