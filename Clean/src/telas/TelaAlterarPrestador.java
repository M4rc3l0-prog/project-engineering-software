package telas;

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
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

public class TelaAlterarPrestador extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfTelefone;
	private JTextField tfRaio;
	private JTextField tfIdade;
	private JPasswordField pfSenha;
	private JPasswordField pfSenhacon;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TelaAlterarPrestador() {
		setTitle("Alterar");
		setBounds(100, 100, 450, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(29, 11, 36, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Email");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(29, 39, 36, 17);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel_1_1 = new JLabel("Telefone");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(29, 67, 56, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sexo");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(29, 97, 36, 17);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Senha");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(29, 125, 41, 17);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Confirmar Senha");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(29, 153, 107, 17);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Raio De Servi\u00E7o");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_2.setBounds(29, 181, 102, 17);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1 = new JLabel("Idade");
		lblNewLabel_1_1_1_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_2_1_1.setBounds(29, 209, 102, 17);
		contentPane.add(lblNewLabel_1_1_1_1_2_1_1);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnAlterar.setBounds(29, 288, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSair.setBounds(335, 289, 89, 23);
		contentPane.add(btnSair);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(75, 10, 234, 20);
		contentPane.add(tfNome);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(75, 38, 234, 20);
		contentPane.add(tfEmail);
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(95, 66, 234, 20);
		contentPane.add(tfTelefone);
		
		tfRaio = new JTextField();
		tfRaio.setColumns(10);
		tfRaio.setBounds(146, 180, 234, 20);
		contentPane.add(tfRaio);
		
		tfIdade = new JTextField();
		tfIdade.setColumns(10);
		tfIdade.setBounds(75, 209, 234, 20);
		contentPane.add(tfIdade);
		
		JRadioButton rdM = new JRadioButton("M");
		rdM.setBounds(95, 95, 46, 23);
		contentPane.add(rdM);
		
		JRadioButton rdF = new JRadioButton("F");
		rdF.setBounds(146, 95, 41, 23);
		contentPane.add(rdF);
		
		JRadioButton rdOutros = new JRadioButton("Outros");
		rdOutros.setBounds(189, 95, 59, 23);
		contentPane.add(rdOutros);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNome.setText("");
				tfEmail.setText("");
				tfTelefone.setText("");
				tfIdade.setText("");
				pfSenha.setText("");
				pfSenhacon.setText("");
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.setBounds(186, 289, 89, 23);
		contentPane.add(btnLimpar);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(80, 124, 229, 20);
		contentPane.add(pfSenha);
		
		pfSenhacon = new JPasswordField();
		pfSenhacon.setBounds(146, 152, 229, 20);
		contentPane.add(pfSenhacon);
	}

}
