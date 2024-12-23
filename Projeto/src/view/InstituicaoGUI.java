/**
 * Classe criada para servir como base da tela de cadastro;
 * data de criacao:21/12/2024;
 * @author Victoria, Hugo e Davi;
 */

package view;

/**
 * Importacoes de pacotes e classes necessa
 */

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
	    setTitle("Cadastro de Instituicoes de Ensino\r\n");
	    setBounds(100, 100, 337, 509);
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);

	    /**
	     * adiciona o texto para o codigo;
	     */
	    contentPane.setLayout(null);
	    lblCodMec = new JLabel("Codigo do MEC");
	    lblCodMec.setBounds(26, 11, 113, 28);
	    lblCodMec.setFont(new Font("Calibri", Font.PLAIN, 17));
	    contentPane.add(lblCodMec);

	    /**
	     * adiciona o campo para codigo;
	     */
	    textFieldCod = new JTextField();
	    textFieldCod.setBounds(26, 38, 216, 20);
	    contentPane.add(textFieldCod);
	    textFieldCod.setColumns(10);

	    /**
	     * adiciona o texto para nome;
	     */
	    lblNome = new JLabel("Nome\r\n");
	    lblNome.setBounds(26, 69, 93, 28);
	    lblNome.setFont(new Font("Calibri", Font.PLAIN, 17));
	    contentPane.add(lblNome);

	    /**
	     * adiciona o campo para nome;
	     */
	    textFieldNome = new JTextField();
	    textFieldNome.setBounds(26, 98, 216, 20);
	    contentPane.add(textFieldNome);
	    textFieldNome.setColumns(10);

	    /**
	     * adiciona o texto para o ano de fundacao;
	     */
	    lblAnoDeFundacao = new JLabel("Ano de Fundacao");
	    lblAnoDeFundacao.setBounds(26, 129, 127, 28);
	    lblAnoDeFundacao.setFont(new Font("Calibri", Font.PLAIN, 17));
	    contentPane.add(lblAnoDeFundacao);

	    /**
	     * adiciona o campo para o ano de fundacao;
	     */
	    textFieldAno = new JTextField();
	    textFieldAno.setBounds(26, 159, 216, 20);
	    contentPane.add(textFieldAno);
	    textFieldAno.setColumns(10);

	    /**
	     * adiciona o texto para o tipo de instituicao;
	     */
	    
	    lblTipo = new JLabel("Tipo:");
	    lblTipo.setBounds(26, 190, 59, 20);
	    lblTipo.setFont(new Font("Calibri", Font.PLAIN, 17));
	    contentPane.add(lblTipo);

	    /**
	     * adiciona a caixa para os tipos de instituicao;
	     */
	    
	    setComboBoxTipo(new JComboBox());
	    getComboBoxTipo().setBounds(26, 223, 216, 28);
	    getComboBoxTipo().setModel(new DefaultComboBoxModel(new String[] {
	        "Educacao Infantil", "Ensino Fundamental", "Ensino Medio",
	        "Educacao Infantil e Ensino Fundamental", "Educacao Infantil, Ensino Fundamental e Ensino M�dio",
	        "Ensino Superior"
	    }));
	    getComboBoxTipo().setFont(new Font("Calibri", Font.PLAIN, 10));
	    contentPane.add(getComboBoxTipo());

	    /**
	     * adiciona o bot�o para enviar;
	     */
	    btnEnviar = new JButton("ENVIAR");
	    btnEnviar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            // L�gica do botao ENVIAR
	        }
	    });
	    btnEnviar.setBounds(26, 262, 89, 23);
	    btnEnviar.setFont(new Font("Calibri", Font.PLAIN, 17));
	    contentPane.add(btnEnviar);

	    /**
	     * adiciona o botao para limpar;
	     */
	    btnlimpar = new JButton("LIMPAR"); // Use o atributo da classe
	    btnlimpar.setBounds(153, 262, 89, 23);
	    btnlimpar.setFont(new Font("Calibri", Font.PLAIN, 17));
	    contentPane.add(btnlimpar);
	    
	    definirColunas();
	    String[] titulo = {"nome", "codigo do MEC", "Ano de Fundacao", "tipo"};
		tabela = new JTable(tabletabela);
	    tabela.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	    tabela.setFont(new Font("Calibri", Font.PLAIN, 11));
	    tabela.setBounds(36, 297, 206, 162);
	    contentPane.add(tabela);
	    
	    scrollPane = new JScrollPane(tabela);
	    scrollPane.setBounds(26, 296, 216, 163);
	    contentPane.add(scrollPane);
	    
	}

	public void adicionarOuvinteInstituicao(ActionListener ouvinte) {
		btnEnviar.setActionCommand("ENVIAR");
		btnEnviar.addActionListener(ouvinte);

		btnlimpar.setActionCommand("LIMPAR");
		btnlimpar.addActionListener(ouvinte);
	}

	public String getTextFieldCod() {
		return textFieldCod.getText();
	}

	public String getTextFieldNome() {
		return textFieldNome.getText();
	}

	public String getTextFieldAno() {
		return textFieldAno.getText();
	}
	
	
	public void limparCampos() {
		
		textFieldCod.setText("");
		textFieldNome.setText("");
		textFieldAno.setText("");
		JOptionPane.showMessageDialog(null, "Campos limpos!", "Informacao!", JOptionPane.INFORMATION_MESSAGE);
	}

	public JComboBox getComboBoxTipo() {
		return comboBoxTipo;
	}

	public void setComboBoxTipo(JComboBox comboBoxTipo) {
		this.comboBoxTipo = comboBoxTipo;
	}
	 
	public void definirColunas() {
		
		tabletabela = new DefaultTableModel();
		tabletabela.addColumn("nome");
		tabletabela.addColumn("codigo do MEC");	
		tabletabela.addColumn("ano de fundacao");	
		tabletabela.addColumn("tipo");
		
	}
	
	public void adicionarInfo(String nome, String codigoDoMec, int anoDeFundacao, String tipo) {
		String AnDFund = Integer.toString(anoDeFundacao);
		Object[] dados = {nome, codigoDoMec, AnDFund, tipo};
		tabletabela.addRow(dados);
		if(!scrollPane.isVisible()) {
			scrollPane.setVisible(true);
		}
	}
	
}




