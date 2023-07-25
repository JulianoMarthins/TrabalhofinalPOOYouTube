package programa;

public class Usuario extends Pessoa {

	private String login;
	private int totAssistido;

	// Contrutures
	public Usuario(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}

	// Getters & Setters
	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	

	// toString
	@Override
	public String toString() {
		return "Usuario: " + super.toString() + " Login = " + login + ", Vídeos Assistido = "
	+ totAssistido + "";
	}

	
}
