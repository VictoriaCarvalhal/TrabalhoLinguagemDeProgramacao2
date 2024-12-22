/**
 * Classe criada para servir como base da tela de cadastro;
 * data de criação:21/12/2024;
 * @author Victória, Hugo e Davi;
 */

package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	
	/**
	 * inicializa a janela.
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
		 * Adicionando tamanho, nome e limites da janela;
		 */
		
		setTitle("Cadastro de Institiucao de Ensino");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 337, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		 * adiciona o texto para o código;
		 */
		
		lblCodMec = new JLabel("Codigo do MEC");
		lblCodMec.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblCodMec.setBounds(26, 11, 113, 28);
		contentPane.add(lblCodMec);
		
		/**
		 * adiciona o campo para código;
		 */
		
		textFieldCod = new JTextField();
		textFieldCod.setBounds(26, 38, 216, 20);
		contentPane.add(textFieldCod);
		textFieldCod.setColumns(10);
		
		/**
		 * adiciona o texto para nome;
		 */
		
		lblNome = new JLabel("Nome\r\n");
		lblNome.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblNome.setBounds(26, 69, 93, 28);
		contentPane.add(lblNome);
		
		/**
		 * adiciona o campo para nome;
		 */
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(26, 98, 216, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		/**
		 * adiciona o texto para o ano de fundação;
		 */
		
		lblAnoDeFundacao = new JLabel("Ano de Fundacao");
		lblAnoDeFundacao.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblAnoDeFundacao.setBounds(26, 129, 127, 28);
		contentPane.add(lblAnoDeFundacao);
		
		/**
		 * adiciona o campo para o ano de fundação;
		 */
		
		textFieldAno = new JTextField();
		textFieldAno.setBounds(26, 159, 216, 20);
		contentPane.add(textFieldAno);
		textFieldAno.setColumns(10);
		
		/**
		 * adiciona o texto para o tipo de instituição;
		 */
		
		lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblTipo.setBounds(26, 190, 59, 20);
		contentPane.add(lblTipo);
		
		/**
		 * adiciona a caixa para os tipos de instituição;
		 */
		
		comboBoxTipo = new JComboBox();
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"Educação Infantil", "Ensino Fundamental", "Ensino Médio", "Educação Infantil e Ensino Fundamental", "Educação Infantil, Ensino Fundamental e Ensino Médio", "Ensino Superior"}));
		comboBoxTipo.setFont(new Font("Calibri", Font.PLAIN, 10));
		comboBoxTipo.setBounds(26, 223, 216, 28);
		contentPane.add(comboBoxTipo);
		
		/**
		 * adiciona o botão para enviar;
		 */
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Calibri", Font.PLAIN, 17));
		btnEnviar.setBounds(26, 262, 89, 23);
		contentPane.add(btnEnviar);
		
		/**
		 * adiciona o botão para limpar;
		 */
		
		JButton btnlimpar = new JButton("Limpar");
		btnlimpar.setFont(new Font("Calibri", Font.PLAIN, 17));
		btnlimpar.setBounds(153, 262, 89, 23);
		contentPane.add(btnlimpar);
	}
}
