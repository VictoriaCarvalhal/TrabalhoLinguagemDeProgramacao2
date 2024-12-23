
/**
 * Classe criada para lidar com os eventos da tela de login;
 * data de criacao:21/12/2024;
 * @author Victoria, Hugo e Davi;
 */
package controller;

import modelo.Login;
import view.LoginGUI;
import view.InstituicaoGUI;
import controller.ControllerInstituicaoGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerLoginGUI {

    private LoginGUI lGUI;
    
    /**
     * A lGUI e a variavel responsavel por criar a instancia da tela de Login. A partir dela todas as 
     * variaveis e metodos da classe LoginGUI sao acessadas
     * **/

    public ControllerLoginGUI() {
        lGUI = new LoginGUI();
        lGUI.registrarAcoes(new OuvinteLogin());
        lGUI.setVisible(true);
        /**Aqui e criado o ouvinte que ira perceber os eventos da janela de login. Abaixo dele, a tela de login se torna visivel**/
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
        /**Essa classe e uma classe especial de ouvinte, criada para reconhecer e agir a partir dos eventos especificos da classe
         * login
         */
        public void actionPerformed(ActionEvent e) {
            String comando = e.getActionCommand();
            /**variavel criada para pegar o evento disparado pela classe ControllerLoginGUI**/
            if (comando.equals("Entrar")) {
            	/**Tratamento do evento do tipo entrar
            	 * Guarda os dados preenchidos na caixa de escrita
            	 * Caso nao haja nada, cria uma mensagem que pede para o usuario colocar algo dentro das caixas
            	 * Caso tudo esteja certo, preenche o modelo de login com os dados e cria uma instancia da classe 
            	 * ControllerInstituicaoGUI, assim passando para a proxima janela. 
            	 * **/
                String login = lGUI.getLogin();
                String senha = lGUI.getSenha();
                if (!camposPreenchidos(login, senha)) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    Login loginModel = new Login(login, senha);
                    JOptionPane.showMessageDialog(null, "Login feito com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
                    new ControllerInstituicaoGUI();
                    
                    /**Apos terminar o evento e a nova pagina é criada, a atual pagina é descartada**/
                    lGUI.dispose();
                }
            }
            /**O tratamento do evento de limpar as caixas de escrita é feito diretamente no view pois é de facil resolucao**/
        }
    }
}



