/**
 * Classe criada para servir como base da tela de cadastro;
 * data de criacao:21/12/2024;
 * @author Victoria, Hugo e Davi;
 */

package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

public class InstituicaoGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCod;
	private JTextField textFieldNome;
	private JTextField textFieldAno;
	private JLabel lblCodMec;
	private JLabel lblNome;
	private JLabel lblAnoDeFundacao;
	private JLabel lblTipo;
	private JComboBox comboBoxTipo;
	private JButton btnEnviar;
	private JButton btnlimpar; 
	private JTable tabela;
	private DefaultTableModel tabletabela;
	private JScrollPane scrollPane;
	/**
	 * inicializa a janela;
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InstituicaoGUI frame = new InstituicaoGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Construtor para os componentes da janela de cadastro.
	 */
	
	public InstituicaoGUI() {
		 /**
	     * Seta a tela, seu titulo e todos os seus atributos importantes
	     */
	    setTitle("Cadastro de Instituicoes de Ensino\r\n");
	    setBounds(100, 100, 337, 509);
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
	    
	    contentPane.setLayout(null);

	    /**
	     * Cria o texto do codigo do mec na tela e seta todos os atributos dele 
	     */
	    
	    lblCodMec = new JLabel("Codigo do MEC");
	    lblCodMec.setBounds(26, 11, 113, 28);
	    lblCodMec.setFont(new Font("Calibri", Font.PLAIN, 17));
	    contentPane.add(lblCodMec);

	    /**
	     * Cria a caixa de texto do codigo do mec e seta todos os atributos importantes
	     */
	    
	    textFieldCod = new JTextField();
	    textFieldCod.setBounds(26, 38, 216, 20);
	    contentPane.add(textFieldCod);
	    textFieldCod.setColumns(10);

	    /**
	     * Cria o texto do nome na tela e define todos os atributos dele
	     */
	    
	    lblNome = new JLabel("Nome\r\n");
	    lblNome.setBounds(26, 69, 93, 28);
	    lblNome.setFont(new Font("Calibri", Font.PLAIN, 17));
	    contentPane.add(lblNome);

	    /**
	     * Cria a caixa de texto para o nome da institucao e define todos os atributos dele
	     */
	    
	    textFieldNome = new JTextField();
	    textFieldNome.setBounds(26, 98, 216, 20);
	    contentPane.add(textFieldNome);
	    textFieldNome.setColumns(10);

	    /**
	     * Cria o texto do ano de fundacao na tela e define todos os atributos dele
	     */
	    
	    lblAnoDeFundacao = new JLabel("Ano de Fundacao");
	    lblAnoDeFundacao.setBounds(26, 129, 127, 28);
	    lblAnoDeFundacao.setFont(new Font("Calibri", Font.PLAIN, 17));
	    contentPane.add(lblAnoDeFundacao);

	    /**
	     * Cria a caida de texto do ano de funcacao na tela e define todos os atributos dele
	     */
	    
	    textFieldAno = new JTextField();
	    textFieldAno.setBounds(26, 159, 216, 20);
	    contentPane.add(textFieldAno);
	    textFieldAno.setColumns(10);

	    /**
	     * Cria o texto dos tipos na tela e define seus atibutos
	     */
	    
	    lblTipo = new JLabel("Tipo:");
	    lblTipo.setBounds(26, 190, 59, 20);
	    lblTipo.setFont(new Font("Calibri", Font.PLAIN, 17));
	    contentPane.add(lblTipo);

	    /**
	     * Cria a combobox dos tipos da instituicao de ensino e define seus atributos
	     */
	    
	    setComboBoxTipo(new JComboBox());
	    getComboBoxTipo().setBounds(26, 223, 216, 28);
	    getComboBoxTipo().setModel(new DefaultComboBoxModel(new String[] {
	        "Educacao Infantil", "Ensino Fundamental", "Ensino Medio",
	        "Educacao Infantil e Ensino Fundamental", "Educacao Infantil, Ensino Fundamental e Ensino Mï¿½dio",
	        "Ensino Superior"
	    }));
	    getComboBoxTipo().setFont(new Font("Calibri", Font.PLAIN, 10));
	    contentPane.add(getComboBoxTipo());

	    /**
	     * Cria o botão para enviar na tela e define seus atributos
	     */
	    
	    btnEnviar = new JButton("ENVIAR");
	    btnEnviar.setBounds(26, 262, 89, 23);
	    btnEnviar.setFont(new Font("Calibri", Font.PLAIN, 17));
	    contentPane.add(btnEnviar);

	    /**
	     * Cria o botão de limpar na tela e define seus atributos
	     */
	    
	    btnlimpar = new JButton("LIMPAR");
	    btnlimpar.setBounds(153, 262, 89, 23);
	    btnlimpar.setFont(new Font("Calibri", Font.PLAIN, 17));
	    contentPane.add(btnlimpar);
	    
	    /**
	     * Cria a tabela na tela e define seus atributos
	     */
	    
	    definirColunas();
	    String[] titulo = {"nome", "codigo do MEC", "Ano de Fundacao", "tipo"};
		tabela = new JTable(tabletabela);
	    tabela.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	    tabela.setFont(new Font("Calibri", Font.PLAIN, 11));
	    tabela.setBounds(36, 297, 206, 162);
	    contentPane.add(tabela);
	    
	    /**
	     * Cria a barra de descer e subir e define seus atributos
	     */
	    
	    scrollPane = new JScrollPane(tabela);
	    scrollPane.setBounds(26, 296, 216, 163);
	    contentPane.add(scrollPane);
	    
	    
	}

	/**
     * Metodo que cria os ouvites para os eventos. 
     * Esse é o metodo responsavel por disparar os eventos ao clicarem nos botões
     */
	
	public void adicionarOuvinteInstituicao(ActionListener ouvinte) {
		btnEnviar.setActionCommand("ENVIAR");
		btnEnviar.addActionListener(ouvinte);

		btnlimpar.setActionCommand("LIMPAR");
		btnlimpar.addActionListener(ouvinte);
	}

	/**
     * Metodo que pega o texto de dentro das caixas de texto do codigo
     */
	public String getTextFieldCod() {
		return textFieldCod.getText();
	}

	/**
     * Metodo que pega o texto de dentro das caixas de texto do nome 
     */
	
	public String getTextFieldNome() {
		return textFieldNome.getText();
	}

	/**
     * Metodo que pega o texto de dentro das caixas de texto do ano
     */
	
	public String getTextFieldAno() {
		return textFieldAno.getText();
	}
	
	/**
     * Metodo que limpa todas as caixas de texto
     */
	
	public void limparCampos() {
		
		textFieldCod.setText("");
		textFieldNome.setText("");
		textFieldAno.setText("");
		JOptionPane.showMessageDialog(null, "Campos limpos!", "Informacao!", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
     * Metodo que pega o tipo selecionado na Combox
     */
	public JComboBox getComboBoxTipo() {
		return comboBoxTipo;
	}

	/**
     * Metodo que define o tipo da combox
     */
	public void setComboBoxTipo(JComboBox comboBoxTipo) {
		this.comboBoxTipo = comboBoxTipo;
	}
	 
	/**
     * Metodo que cria as colunas da tabela
     */
	
	public void definirColunas() {
		
		tabletabela = new DefaultTableModel();
		tabletabela.addColumn("nome");
		tabletabela.addColumn("codigo do MEC");	
		tabletabela.addColumn("ano de fundacao");	
		tabletabela.addColumn("tipo");
		
	}
	
	/**
     * Metodo que coloca as informacoes escritas pelos usuarios dentro da tabela
     */
	
	public void adicionarInfo(String nome, String codigoDoMec, int anoDeFundacao, String tipo) {
		String AnDFund = Integer.toString(anoDeFundacao);
		Object[] dados = {nome, codigoDoMec, AnDFund, tipo};
		tabletabela.addRow(dados);
		if(!scrollPane.isVisible()) {
			scrollPane.setVisible(true);
		}
	}
	
}

