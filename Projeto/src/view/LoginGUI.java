/**
 * Classe criada para servir como base da tela de login;
 * Data de Criação:21/12/2024;
 * @author Victória, Hugo e Davi;
 */

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

public class LoginGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLogin;
	private JTextField textFieldSenha;
	private JLabel lblLogin;
	private JLabel lblSenha;
	private JButton btnLimpar;
	private JButton btnEntrar;
	

	/**
	 * Inicializa a janela;
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
	* Construtor para os componentes da tela de login;
	 */
	
	public LoginGUI() {
		
		/**
		 * Adicionando titulo, tamanho e limites da janela;
		 */
		
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		 * Adiciona o texto Login;
		 */
		
		lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblLogin.setBounds(23, 11, 64, 38);
		contentPane.add(lblLogin);
		
		/**
		 * adiciona o texto Senha;
		 */
		
		lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblSenha.setBounds(23, 69, 46, 25);
		contentPane.add(lblSenha);
		
		/**
		 * adiciona o campo para login;
		 */
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(20, 40, 162, 20);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		/**
		 * adiciona o campo para nome;
		 */
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(23, 94, 159, 20);
		contentPane.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		/**
		 * adiciona botão de limpar;
		 */
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Calibri", Font.PLAIN, 17));
		btnLimpar.setBounds(23, 143, 134, 38);
		contentPane.add(btnLimpar);
		
		/**
		 * adiciona botão de enviar;
		 */
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Calibri", Font.PLAIN, 17));
		btnEntrar.setBounds(173, 143, 134, 38);
		contentPane.add(btnEntrar);
	}
	
	/**
	 * adiciona um ouvinte para eventuais ações ocorridas na tela;
	 */
	
	public void adicionarOuvinteLogin(ActionListener ouvinte) {
	}
}
