package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.InstituicaoGUI;
import modelo.Instituicao;

public class ControllerInstituicaoGUI {
	
	private InstituicaoGUI iGUI;
	
	public ControllerInstituicaoGUI() {
		iGUI = new InstituicaoGUI();
		iGUI.adicionarOuvinteInstituicao(new ouvinteInstituicao());
		iGUI.setVisible(true);
	}
	
	
	public boolean cadastraInstituicao(String codigoDoMec, String nome, String tipo, int anoDeFundacao) {
		if (codigoDoMec.isEmpty() || nome.isEmpty() || tipo.isEmpty() || anoDeFundacao<=0) {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
			return false;
		}
		Instituicao instituicao = new Instituicao(codigoDoMec, nome, tipo, anoDeFundacao);
		JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
		return true;
	}
	public InstituicaoGUI getInstituicao() {
		return iGUI;
	}
	
	class ouvinteInstituicao implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        String comando = e.getActionCommand();
	        if (comando.equals("ENVIAR")) {
	            try {
	                String codigoMec = iGUI.getTextFieldCod();
	                String nomeInstituicao = iGUI.getTextFieldNome();
	                String anoStr = iGUI.getTextFieldAno().trim();
	                String tipo = (String) iGUI.getComboBoxTipo().getSelectedItem();
	                int anoDeFundacao = Integer.parseInt(anoStr);

	                // Valida��es para o campo ano
	                if (!cadastraInstituicao(codigoMec, nomeInstituicao, tipo, anoDeFundacao)) {
	                    JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente!", "Erro", JOptionPane.ERROR_MESSAGE);
	                }
	                
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "O campo 'Ano de Funda��o' deve conter apenas n�meros!", "Erro", JOptionPane.ERROR_MESSAGE);
	            }
	        } else if (comando.equals("LIMPAR")) {
	            iGUI.limparCampos();
	        }
	    }
	}

}