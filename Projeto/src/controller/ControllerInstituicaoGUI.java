package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.InstituicaoGUI;
import modelo.Instituicao;

public class ControllerInstituicaoGUI {
	private InstituicaoGUI iGUI;
	public ControllerInstituicaoGUI() {
		iGUI = new InstituicaoGUI();
		iGUI.adicionarOuvinteInstituicao(new OuvinteInstituicao());
	}
	
	class OuvinteInstituicao implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	public boolean cadastraInstituicao(String codigoDoMec, String nome, String tipo, String login, String senha, int anoDeFundacao) {
		if (codigoDoMec != null && codigoDoMec.length() > 0 && nome != null && nome.length() > 0 && tipo != null && tipo.length() > 0 && login != null && login.length() > 0 && senha != null && senha.length() > 0 && anoDeFundacao != 0) {
			Instituicao instituicao = new Instituicao(codigoDoMec, nome, tipo, login, senha, anoDeFundacao);
			
			return true;
			
		}else {
			return false;
		}
	}
	
	
}