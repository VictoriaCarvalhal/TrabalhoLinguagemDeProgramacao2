package view;

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

    public LoginGUI() {
        setTitle("Tela de Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 378, 241);
        setLocationRelativeTo(null); // Centraliza a janela

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

        textFieldSenha = new JPasswordField(); // Uso de JPasswordField para segurança
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

    public void registrarAcoes(ActionListener ouvinte) {
        btnLimpar.addActionListener(e -> limparCampos());
        btnEntrar.addActionListener(ouvinte);
    }

    public String getLogin() {
        return textFieldLogin.getText();
    }

    public String getSenha() {
        return new String(textFieldSenha.getPassword());
    }

    public void limparCampos() {
        textFieldLogin.setText("");
        textFieldSenha.setText("");
        JOptionPane.showMessageDialog(this, "Campos limpos!", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
}
