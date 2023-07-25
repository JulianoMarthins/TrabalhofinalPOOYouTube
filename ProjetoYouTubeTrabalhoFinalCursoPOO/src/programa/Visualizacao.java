package programa;

public class Visualizacao {

	// Atributos
	private Usuario espectador;
	private Video filme;

	
	// Contrutores
	public Visualizacao(Usuario espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}

	// Metodos
	
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}

	public void avaliar(int num) {
		this.filme.setAvaliacao(num);
	}
	
	public void avaliar(float porcentagem) {
		int total = 0;
		if(porcentagem <= 20) {
			total = 3;
		} else if ( porcentagem <= 50) {
			total = 5;
		} else if(porcentagem <=90) {
			total = 8;
		} else {
			total = 10;
		}
		this.filme.setAvaliacao(total);
	}
	// Getters & Setters
	public Usuario getEspectador() {
		return espectador;
	}

	public void setEspectador(Usuario espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	// toString
	@Override
	public String toString() {
		return "Espectador = " + espectador + ", filme = " + filme;
	}

}
