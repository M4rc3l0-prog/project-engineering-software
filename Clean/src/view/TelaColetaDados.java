package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class TelaColetaDados extends JFrame {

	private JPanel contentPane;
	private JTextField tfSalaJantar;
	private JTextField tfSalaEstar;
	private JTextField tfCozinha;
	private JTextField tfBanheiro;
	private JTextField tfQuarto;
	private JTextField tfPropostaValor;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TelaColetaDados() {
		// Sintaxe 
		TelaInfo inf = new TelaInfo();
		// Sintaxe
		
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		
		setTitle("Coleta de Dados");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(Color.WHITE);
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 67, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mntmNewMenuItem.setBackground(Color.WHITE);
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				inf.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Manual");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1.setForeground(Color.BLACK);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ajuda");
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mntmNewMenuItem_2.setBackground(Color.WHITE);
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JLabel lblNewLabel = new JLabel("Sala de jantar");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 63, 98, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblSalaDeJantar = new JLabel("Sala de estar");
		lblSalaDeJantar.setForeground(Color.BLACK);
		lblSalaDeJantar.setBackground(Color.WHITE);
		lblSalaDeJantar.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSalaDeJantar.setBounds(10, 88, 98, 17);
		contentPane.add(lblSalaDeJantar);
		
		JLabel lblCozinha = new JLabel("Cozinha");
		lblCozinha.setForeground(Color.BLACK);
		lblCozinha.setBackground(Color.WHITE);
		lblCozinha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCozinha.setBounds(10, 113, 98, 17);
		contentPane.add(lblCozinha);
		
		JLabel lblBanheiro = new JLabel("Banheiro");
		lblBanheiro.setForeground(Color.BLACK);
		lblBanheiro.setBackground(Color.WHITE);
		lblBanheiro.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBanheiro.setBounds(10, 138, 98, 17);
		contentPane.add(lblBanheiro);
		
		JLabel lblQuarto = new JLabel("Quarto");
		lblQuarto.setForeground(Color.BLACK);
		lblQuarto.setBackground(Color.WHITE);
		lblQuarto.setFont(new Font("Arial", Font.PLAIN, 14));
		lblQuarto.setBounds(10, 163, 98, 17);
		contentPane.add(lblQuarto);
		
		JButton btEnviar = new JButton("Enviar");
		btEnviar.setForeground(Color.BLACK);
		btEnviar.setBackground(Color.WHITE);
		btEnviar.setFont(new Font("Arial", Font.PLAIN, 14));
		btEnviar.setBounds(10, 227, 89, 23);
		contentPane.add(btEnviar);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.setForeground(Color.BLACK);
		btLimpar.setBackground(Color.WHITE);
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfSalaJantar.setText("");
				tfSalaEstar.setText("");
				tfCozinha.setText("");
				tfBanheiro.setText("");
				tfQuarto.setText("");
				tfPropostaValor.setText("");
			}
		});
		btLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btLimpar.setBounds(171, 227, 89, 23);
		contentPane.add(btLimpar);
		
		JButton btSair = new JButton("Sair");
		btSair.setForeground(Color.BLACK);
		btSair.setBackground(Color.WHITE);
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btSair.setBounds(335, 227, 89, 23);
		contentPane.add(btSair);
		
		tfSalaJantar = new JTextField();
		tfSalaJantar.setHorizontalAlignment(SwingConstants.CENTER);
		tfSalaJantar.setText("1");
		tfSalaJantar.setFont(new Font("Arial", Font.PLAIN, 14));
		tfSalaJantar.setForeground(Color.BLACK);
		tfSalaJantar.setBackground(Color.WHITE);
		tfSalaJantar.setBounds(118, 62, 46, 20);
		contentPane.add(tfSalaJantar);
		tfSalaJantar.setColumns(10);
		
		tfSalaEstar = new JTextField();
		tfSalaEstar.setHorizontalAlignment(SwingConstants.CENTER);
		tfSalaEstar.setText("1");
		tfSalaEstar.setFont(new Font("Arial", Font.PLAIN, 14));
		tfSalaEstar.setForeground(Color.BLACK);
		tfSalaEstar.setBackground(Color.WHITE);
		tfSalaEstar.setColumns(10);
		tfSalaEstar.setBounds(118, 87, 46, 20);
		contentPane.add(tfSalaEstar);
		
		tfCozinha = new JTextField();
		tfCozinha.setHorizontalAlignment(SwingConstants.CENTER);
		tfCozinha.setText("1");
		tfCozinha.setFont(new Font("Arial", Font.PLAIN, 14));
		tfCozinha.setForeground(Color.BLACK);
		tfCozinha.setBackground(Color.WHITE);
		tfCozinha.setColumns(10);
		tfCozinha.setBounds(118, 112, 46, 20);
		contentPane.add(tfCozinha);
		
		tfBanheiro = new JTextField();
		tfBanheiro.setHorizontalAlignment(SwingConstants.CENTER);
		tfBanheiro.setText("1");
		tfBanheiro.setFont(new Font("Arial", Font.PLAIN, 14));
		tfBanheiro.setForeground(Color.BLACK);
		tfBanheiro.setBackground(Color.WHITE);
		tfBanheiro.setColumns(10);
		tfBanheiro.setBounds(118, 137, 46, 20);
		contentPane.add(tfBanheiro);
		
		tfQuarto = new JTextField();
		tfQuarto.setHorizontalAlignment(SwingConstants.CENTER);
		tfQuarto.setText("1");
		tfQuarto.setFont(new Font("Arial", Font.PLAIN, 14));
		tfQuarto.setForeground(Color.BLACK);
		tfQuarto.setBackground(Color.WHITE);
		tfQuarto.setColumns(10);
		tfQuarto.setBounds(118, 162, 46, 20);
		contentPane.add(tfQuarto);
		
		JLabel lblQuantos = new JLabel("Informe quantidades de c\u00F4modos o im\u00F3vel tem");
		lblQuantos.setForeground(Color.BLACK);
		lblQuantos.setBackground(Color.WHITE);
		lblQuantos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblQuantos.setBounds(66, 25, 312, 17);
		contentPane.add(lblQuantos);
		
		JLabel lblPropostaDoValor = new JLabel("Proposta de valor");
		lblPropostaDoValor.setForeground(Color.BLACK);
		lblPropostaDoValor.setBackground(Color.WHITE);
		lblPropostaDoValor.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPropostaDoValor.setBounds(199, 63, 123, 17);
		contentPane.add(lblPropostaDoValor);
		
		tfPropostaValor = new JTextField();
		tfPropostaValor.setHorizontalAlignment(SwingConstants.CENTER);
		tfPropostaValor.setText("80,00");
		tfPropostaValor.setFont(new Font("Arial", Font.PLAIN, 14));
		tfPropostaValor.setForeground(Color.BLACK);
		tfPropostaValor.setBackground(Color.WHITE);
		tfPropostaValor.setColumns(10);
		tfPropostaValor.setBounds(332, 62, 46, 20);
		contentPane.add(tfPropostaValor);
	}
}
