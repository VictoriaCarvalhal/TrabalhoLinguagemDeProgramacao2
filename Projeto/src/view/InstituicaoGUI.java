package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class InstituicaoGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCod;
	private JTextField textFieldNome;
	private JTextField textFieldAno;
	private JLabel lblCodMec;
	private JLabel lblNome;
	private JLabel lblAnoDeFundação;
	private JLabel lblTipo;
	/**
	 * Launch the application.
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
	 * Create the frame.
	 */
	public InstituicaoGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCodMec = new JLabel("Código do MEC");
		lblCodMec.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblCodMec.setBounds(26, 11, 113, 28);
		contentPane.add(lblCodMec);
		
		textFieldCod = new JTextField();
		textFieldCod.setBounds(26, 38, 216, 20);
		contentPane.add(textFieldCod);
		textFieldCod.setColumns(10);
		
		lblNome = new JLabel("Nome\r\n");
		lblNome.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblNome.setBounds(26, 69, 93, 28);
		contentPane.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(26, 98, 216, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		lblAnoDeFundação = new JLabel("Ano de Fundação");
		lblAnoDeFundação.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblAnoDeFundação.setBounds(26, 129, 127, 28);
		contentPane.add(lblAnoDeFundação);
		
		textFieldAno = new JTextField();
		textFieldAno.setBounds(26, 159, 216, 20);
		contentPane.add(textFieldAno);
		textFieldAno.setColumns(10);
		
		lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblTipo.setBounds(26, 190, 59, 20);
		contentPane.add(lblTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(26, 221, 216, 22);
		contentPane.add(comboBox);
	}
}
