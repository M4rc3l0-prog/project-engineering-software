package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaInfo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TelaInfo() {
		setTitle("Informa\u00E7\u00F5es");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Version 1.0");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(185, 151, 72, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblVersion = new JLabel("\u00A9 Copyright - Clean");
		lblVersion.setForeground(Color.BLACK);
		lblVersion.setBackground(Color.WHITE);
		lblVersion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblVersion.setBounds(163, 179, 125, 17);
		contentPane.add(lblVersion);
		
		JLabel lblNewLabel_1 = new JLabel("Escrever algo aqui");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(163, 68, 118, 17);
		contentPane.add(lblNewLabel_1);
		
		JButton btCancelar = new JButton("Cancelar");
		btCancelar.setForeground(Color.BLACK);
		btCancelar.setBackground(Color.WHITE);
		btCancelar.setFont(new Font("Arial", Font.PLAIN, 14));
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btCancelar.setBounds(173, 216, 103, 23);
		contentPane.add(btCancelar);
	}

}
