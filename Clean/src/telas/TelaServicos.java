package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaServicos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TelaServicos() {
		TelaPrincipal pri = new TelaPrincipal();
		setTitle("Servi\u00E7os");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btLimpezaComercial = new JButton("Limpeza Comercial");
		btLimpezaComercial.setFont(new Font("Arial", Font.PLAIN, 14));
		btLimpezaComercial.setBounds(124, 47, 201, 34);
		contentPane.add(btLimpezaComercial);
		
		JButton btLimpezaComum = new JButton("Limpeza Comum");
		btLimpezaComum.setFont(new Font("Arial", Font.PLAIN, 14));
		btLimpezaComum.setBounds(124, 92, 201, 34);
		contentPane.add(btLimpezaComum);
		
		JButton btLimpezaPreMudanca = new JButton("Limpeza Pr\u00E9-Mudan\u00E7a");
		btLimpezaPreMudanca.setFont(new Font("Arial", Font.PLAIN, 14));
		btLimpezaPreMudanca.setBounds(124, 137, 201, 34);
		contentPane.add(btLimpezaPreMudanca);
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pri.setVisible(true);
				setVisible(false);
			}
		});
		btSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btSair.setBounds(173, 227, 89, 23);
		contentPane.add(btSair);
	}
}
