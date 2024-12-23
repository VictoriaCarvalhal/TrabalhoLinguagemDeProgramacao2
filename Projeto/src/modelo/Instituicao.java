/**
 * Classe modelo Instituicao
 * @author Victoria, Hugo, Davi;
 * data de criacao:21/12/2024;
 */

package modelo;

public class Instituicao {
	private String codigoDoMec, nome, tipo;
	private int anoDeFundacao;
	
	/**
	 * construtor da classe Instituicao;
	 * @param codigoDoMec
	 * @param nome
	 * @param tipo
	 * @param anoDeFundacao
	 */
	
	public Instituicao(String codigoDoMec, String nome, String tipo, int anoDeFundacao) {
		this.codigoDoMec = codigoDoMec;
		this.nome = nome;
		this.tipo = tipo;
		this.anoDeFundacao = anoDeFundacao;
	}
	
	/**
	 * metodo que pega getCodigoDoMec;
	 * @return codigoDoMec;
	 */
	
	public String getCodigoDoMec() {
		return codigoDoMec;
	}
	
	/**
	 * metodo que definir getCodigoDoMec = codigoDoMec;
	 */
	
	public void setCodigoDoMec(String codigoDoMec) {
		this.codigoDoMec = codigoDoMec;
	}
	
	/**
	 * metodo que pega o nome;
	 * @return nome;
	 */
	
	public String getNome() {
		return nome;
	}
	
	/**
	 * metodo que define nome;
	 */
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * metodo que pega o tipo;
	 * @return tipo;
	 */
	
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * metodo que define o tipo;
	 */
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * metodo que pega o AnoDeFundacao;
	 * @return AnoDeFundacao;
	 */
	
	public int getAnoDeFundacao() {
		return anoDeFundacao;
	}
	
	/**
	 * metodo que define o AnoDeFundacao;
	 */
	
	public void setAnoDeFundacao(int anoDeFundacao) {
		this.anoDeFundacao = anoDeFundacao;
	}

	
}
