package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JFormattedTextField;

public class TelaAgenda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaAgenda() throws ParseException {
		// 	Sintaxe 
		TelaColetaDados col = new TelaColetaDados();
		// Sintaxe
		
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
	
		setTitle("Agenda");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(116, 101, 46, 14);
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(Color.WHITE);
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 63, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 14));
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setBackground(Color.WHITE);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Manual");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 14));
		mntmNewMenuItem_1.setForeground(Color.BLACK);
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ajuda");
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 14));
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mntmNewMenuItem_2.setBackground(Color.WHITE);
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JFormattedTextField ftfData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		ftfData.setBackground(Color.WHITE);
		ftfData.setForeground(Color.BLACK);
		ftfData.setBounds(172, 99, 89, 20);
		contentPane.add(ftfData);
		
		JButton btProximo = new JButton("Pr\u00F3ximo");
		btProximo.setFont(new Font("Arial", Font.PLAIN, 14));
		btProximo.setForeground(Color.BLACK);
		btProximo.setBackground(Color.WHITE);
		btProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				col.setVisible(true);
			}
		});
		btProximo.setBounds(14, 227, 89, 23);
		contentPane.add(btProximo);
		
		JButton btSair = new JButton("Sair");
		btSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btSair.setForeground(Color.BLACK);
		btSair.setBackground(Color.WHITE);
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btSair.setBounds(335, 227, 89, 23);
		contentPane.add(btSair);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btLimpar.setForeground(Color.BLACK);
		btLimpar.setBackground(Color.WHITE);
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ftfData.setText("");
			}
		});
		btLimpar.setBounds(172, 227, 89, 23);
		contentPane.add(btLimpar);
		
		
	}

}
