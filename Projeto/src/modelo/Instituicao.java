package modelo;

public class Instituicao {
	private String codigoDoMec, nome, tipo, login, senha;
	private int anoDeFundacao;
	
	public Instituicao(String codigoDoMec, String nome, String tipo, String login, String senha, int anoDeFundacao) {
		this.codigoDoMec = codigoDoMec;
		this.nome = nome;
		this.tipo = tipo;
		this.login = login;
		this.senha = senha;
		this.anoDeFundacao = anoDeFundacao;
	}
	
	public String getCodigoDoMec() {
		return codigoDoMec;
	}
	
	public void setCodigoDoMec(String codigoDoMec) {
		this.codigoDoMec = codigoDoMec;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getAnoDeFundacao() {
		return anoDeFundacao;
	}
	public void setAnoDeFundacao(int anoDeFundacao) {
		this.anoDeFundacao = anoDeFundacao;
	}

	
}
