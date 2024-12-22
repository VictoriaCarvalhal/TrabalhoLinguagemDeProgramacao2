package controller;

import modelo.Login;
import view.LoginGUI;
import view.InstituicaoGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerLoginGUI {

    private LoginGUI lGUI;

    public ControllerLoginGUI() {
        lGUI = new LoginGUI();
        lGUI.registrarAcoes(new OuvinteLogin());
        lGUI.setVisible(true);
    }

    private boolean camposPreenchidos(String... campos) {
        for (String campo : campos) {
            if (campo == null || campo.trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    class OuvinteLogin implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String comando = e.getActionCommand();

            if (comando.equals("Entrar")) {
                String login = lGUI.getLogin();
                String senha = lGUI.getSenha();

                if (!camposPreenchidos(login, senha)) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    Login loginModel = new Login(login, senha);
                    JOptionPane.showMessageDialog(null, "Login feito com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
                    InstituicaoGUI instituicaoGUI = new InstituicaoGUI();
                    instituicaoGUI.setVisible(true);
                    
                    lGUI.dispose();
                }
            }
        }
    }
}

