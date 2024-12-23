/**
 * Classe controller para a interface do cadastro de instituicoes.
 */

package controller;
/**
 * Importacoes necessarias para o funcionamento da classe.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.InstituicaoGUI;
import modelo.Instituicao;
import view.InstituicaoGUI;

public class ControllerInstituicaoGUI {
	
	
	private InstituicaoGUI iGUI;
	
	/**
	 * Metodo construtor do ControllerInstituicaoGUI;
	 * Cria uma instancia da interface.
	 */
	
	public ControllerInstituicaoGUI() {
		iGUI = new InstituicaoGUI();
		iGUI.adicionarOuvinteInstituicao(new ouvinteInstituicao());
		iGUI.setVisible(true);
	}
	
	/**
	 * Metodo cadastraInstituicao;
	 * Confere se os parametros inseridos sao validos ou nao;
	 * Se forem validos, cria um objeto do tipo instituicao com os dados fornecidos e retorna true;
	 * Se forem invalidos, retorna o aviso para preencher corretamente e retorna false.
	 * @param codigoDoMec
	 * @param nome
	 * @param tipo
	 * @param anoDeFundacao
	 * @return 
	 */
	
	public boolean cadastraInstituicao(String codigoDoMec, String nome, String tipo, int anoDeFundacao) {
		if (codigoDoMec.isEmpty() || nome.isEmpty() || tipo.isEmpty() || anoDeFundacao<=0) {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
			return false;
		}
		
		Instituicao instituicao = new Instituicao(codigoDoMec, nome, tipo, anoDeFundacao);
		JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
		return true;
		
	}
	
	/**
	 * Metodo getInstituicao;
	 * Retorna o objeto Instituicao.
	 * @return 
	 */
	public InstituicaoGUI getInstituicao() {
		return iGUI;
	}
	/**
	 * Classe ouvinteInstituicao;
	 * Configura os eventos dos botoes ENVIAR e LIMPAR da interface de cadastro;
	 * Botao ENVIAR chama o metodo cadastraInstituicao e passa os dados inseridos na interface como parametro;
	 * Botao LIMPAR limpa os dados inseridos na interface;
	 * Try e Catch tratam erros que podem ocorrer ao inserir os dados.
	 */
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
	                iGUI.adicionarInfo(nomeInstituicao, codigoMec, anoDeFundacao, tipo);
	                
	                // Validacoes para o campo ano
	                if (!cadastraInstituicao(codigoMec, nomeInstituicao, tipo, anoDeFundacao)) {
	                    JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente!", "Erro", JOptionPane.ERROR_MESSAGE);
	                }
	                
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "O campo 'Ano de Fundacao deve conter apenas numeros!", "Erro", JOptionPane.ERROR_MESSAGE);
	            }
	        } else if (comando.equals("LIMPAR")) {
	            iGUI.limparCampos();
	        }
	    }
	}
}