/**
 * Classe criada para servir como base da tela de login;
 * data de criacao:21/12/2024;
 * @author Victoria, Hugo e Davi;
 */
package view;

/**
 * Importcoes necessarias para o funcionamento da classe;
 */

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldLogin;
    private JPasswordField textFieldSenha;
    private JLabel lblLogin;
    private JLabel lblSenha;
    private JButton btnLimpar;
    private JButton btnEntrar;

    /**
     * contrutor da classe LoginGUI;
     */
    
    public LoginGUI() {
    	
    	/**
    	 * inicializa a janela;
    	 */
    	
        setTitle("Tela de Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 378, 241);
        setLocationRelativeTo(null); // Centraliza a janela;
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        /**
         * adiciona o texto "login"
         */
        
        lblLogin = new JLabel("Login");
        lblLogin.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblLogin.setBounds(23, 11, 64, 38);
        contentPane.add(lblLogin);

        /**
         * adiciona o texto "senha"
         */
        
        lblSenha = new JLabel("Senha");
        lblSenha.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblSenha.setBounds(23, 69, 46, 25);
        contentPane.add(lblSenha);
        
        /**
         * adiciona o um espaco de texto para o login;
         */
        
        textFieldLogin = new JTextField();
        textFieldLogin.setBounds(20, 40, 162, 20);
        contentPane.add(textFieldLogin);
        textFieldLogin.setColumns(10);
        
        /**
         * adiciona o um espaco de senha para a senha;
         */

        textFieldSenha = new JPasswordField(); // Uso de JPasswordField para seguran�a
        textFieldSenha.setBounds(23, 94, 159, 20);
        contentPane.add(textFieldSenha);
        textFieldSenha.setColumns(10);
        
        /**
         * adiciona um botão com o texto "limpar";
         */
        
        btnLimpar = new JButton("Limpar");
        btnLimpar.setFont(new Font("Calibri", Font.PLAIN, 17));
        btnLimpar.setBounds(23, 143, 134, 38);
        contentPane.add(btnLimpar);
        
        /**
         * adiciona um botao com o texto "entrar";
         */
        
        btnEntrar = new JButton("Entrar");
        btnEntrar.setFont(new Font("Calibri", Font.PLAIN, 17));
        btnEntrar.setBounds(173, 143, 134, 38);
        contentPane.add(btnEntrar);
    }
    
    /**
     * Metodo que recebe o parametro ouvinte para executar a acao do botao limpar;
     * @param ouvinte
     */
    public void registrarAcoes(ActionListener ouvinte) {
        btnLimpar.addActionListener(e -> limparCampos());
        btnEntrar.addActionListener(ouvinte);
    }
    
    /**
     * metodo que retorna o texto escrito do espaco de login;
     * @return textFieldLogin.getText();
     */
    
    public String getLogin() {
        return textFieldLogin.getText();
    }
    
    /**
     * metodo que retorna a senha escrita no espaco da senha;
     * @return new String(textFieldSenha.getPassword());
     */
    
    public String getSenha() {
        return new String(textFieldSenha.getPassword());
    }
    
    /**
     * metodo criado para limpar os espacos da senha e login;
     */
    public void limparCampos() {
        textFieldLogin.setText("");
        textFieldSenha.setText("");
        JOptionPane.showMessageDialog(this, "Campos limpos!", "Informacao", JOptionPane.INFORMATION_MESSAGE);
    }
}

