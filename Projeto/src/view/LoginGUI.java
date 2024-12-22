package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class LoginGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLogin;
	private JTextField textFieldSenha;
	private JLabel lblLogin;
	private JLabel lblSenha;
	private JButton btnLimpar;
	private JButton btnEntrar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginGUI() {
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblLogin.setBounds(23, 11, 64, 38);
		contentPane.add(lblLogin);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblSenha.setBounds(23, 69, 46, 25);
		contentPane.add(lblSenha);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(20, 40, 162, 20);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(23, 94, 159, 20);
		contentPane.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Calibri", Font.PLAIN, 17));
		btnLimpar.setBounds(23, 143, 134, 38);
		contentPane.add(btnLimpar);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Calibri", Font.PLAIN, 17));
		btnEntrar.setBounds(173, 143, 134, 38);
		contentPane.add(btnEntrar);
	}
	
	public void adicionarOuvinteLogin(ActionListener ouvinte) {
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnLimpar.setActionCommand("LIMPAR");
			}
		});
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnEntrar.setActionCommand("ENVIAR");
			}
		});
	}
	
	public String getLogin() {
	    return textFieldLogin.getText();
	}

	public String getSenha() {
	    return textFieldSenha.getText();
	}

	public void limparCampos() {
	    textFieldLogin.setText("");
	    textFieldSenha.setText("");
	}
}
