package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAgenda extends JFrame {

	private JPanel contentPane;
	private JTextField tfData;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TelaAgenda() {
		TelaColetaDados col = new TelaColetaDados();
		setTitle("Agenda");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(116, 101, 46, 14);
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 63, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Informa\u00E7\u00F5es");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Manual");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ajuda");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		tfData = new JTextField();
		tfData.setBounds(172, 99, 92, 20);
		contentPane.add(tfData);
		tfData.setColumns(10);
		
		JButton btProximo = new JButton("Pr\u00F3ximo");
		btProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				col.setVisible(true);
			}
		});
		btProximo.setBounds(14, 227, 89, 23);
		contentPane.add(btProximo);
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btSair.setBounds(335, 227, 89, 23);
		contentPane.add(btSair);
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfData.setText("");
			}
		});
		btLimpar.setBounds(172, 227, 89, 23);
		contentPane.add(btLimpar);
	}

}
