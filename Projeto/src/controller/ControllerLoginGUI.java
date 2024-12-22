package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.LoginGUI;

public class ControllerLoginGUI {
	private LoginGUI lGUI;
	public ControllerLoginGUI() {
		lGUI = new LoginGUI();
		lGUI.adicionarOuvinteLogin(new OuvinteLogin());
	}
	
	class OuvinteLogin implements ActionListener{
		@Override 
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand() == ""){
				
			}
		}
		
	}
}
