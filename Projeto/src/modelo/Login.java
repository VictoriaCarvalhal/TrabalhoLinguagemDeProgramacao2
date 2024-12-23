package modelo;
/**
 * Classe modelo para o login.
 */
public class Login {
	/**
	 * Atributos do login
	 */
    private String login;
    private String senha;
    /**
     * Metodo construtor para o login.
     * @param login
     * @param senha
     */
    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    /**
     * Metodos getter e setter para o login.
     */
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
