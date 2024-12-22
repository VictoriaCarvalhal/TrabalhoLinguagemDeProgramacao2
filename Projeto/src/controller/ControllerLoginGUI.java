package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.LoginGUI;
import modelo.Login;

public class ControllerLoginGUI {
	private LoginGUI lGUI;
	public ControllerLoginGUI() {
		lGUI = new LoginGUI();
		lGUI.adicionarOuvinteLogin(new OuvinteLogin());
	}
	
	class OuvinteLogin implements ActionListener{
		@Override 
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand() == "ENVIAR"){
				 String login = lGUI.getLogin();
	             String senha = lGUI.getSenha();
	             if(senha.isEmpty()||login.isEmpty()){
	            	 JOptionPane.showMessageDialog(null,"Preencha Todos os Campos","Impossivel Continuar",2);
	             }
	             else {
	            	 Login Login1 = new Login(login,senha);
	            	 JOptionPane.showMessageDialog(null,"Login Feito Com Sucesso","",1);
	             }
			}
			else {
				if(e.getActionCommand() == "LIMPAR"){
					lGUI.limparCampos();
				}
			}
		}
		
	}
}
