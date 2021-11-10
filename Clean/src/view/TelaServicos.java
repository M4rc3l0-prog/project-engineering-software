package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaServicos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaServicos() throws ParseException {
		//Sintaxe 
		TelaPrincipal pri = new TelaPrincipal();
		//Sintaxe
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		
		setTitle("Servi\u00E7os");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btLimpezaComercial = new JButton("Limpeza Comercial");
		btLimpezaComercial.setForeground(Color.BLACK);
		btLimpezaComercial.setBackground(Color.WHITE);
		btLimpezaComercial.setFont(new Font("Arial", Font.PLAIN, 14));
		btLimpezaComercial.setBounds(124, 47, 201, 34);
		contentPane.add(btLimpezaComercial);
		
		JButton btLimpezaComum = new JButton("Limpeza Comum");
		btLimpezaComum.setForeground(Color.BLACK);
		btLimpezaComum.setBackground(Color.WHITE);
		btLimpezaComum.setFont(new Font("Arial", Font.PLAIN, 14));
		btLimpezaComum.setBounds(124, 92, 201, 34);
		contentPane.add(btLimpezaComum);
		
		JButton btLimpezaPreMudanca = new JButton("Limpeza Pr\u00E9-Mudan\u00E7a");
		btLimpezaPreMudanca.setForeground(Color.BLACK);
		btLimpezaPreMudanca.setBackground(Color.WHITE);
		btLimpezaPreMudanca.setFont(new Font("Arial", Font.PLAIN, 14));
		btLimpezaPreMudanca.setBounds(124, 137, 201, 34);
		contentPane.add(btLimpezaPreMudanca);
		
		JButton btSair = new JButton("Sair");
		btSair.setForeground(Color.BLACK);
		btSair.setBackground(Color.WHITE);
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pri.setVisible(true);
				setVisible(false);
			}
		});
		btSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btSair.setBounds(173, 227, 89, 23);
		contentPane.add(btSair);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 71, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
		mntmNewMenuItem.setForeground(Color.BLACK);
		mntmNewMenuItem.setBackground(Color.WHITE);
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
	}
}
