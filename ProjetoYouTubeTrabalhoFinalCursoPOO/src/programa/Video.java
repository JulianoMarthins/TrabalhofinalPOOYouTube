package programa;

public class Video implements AcoesVideo {

	// Atributos
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzir;

	// Construtor
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.reproduzir = false;
	}
	
	
	
	
	// Metodos
	@Override
	public void play() {
		this.reproduzir = true;
		
	}

	@Override
	public void pause() {
		this.reproduzir = false;

	}

	@Override
	public void like() {
		this.curtidas++;
	}
	

	// Getters & Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = (int) (this.avaliacao + avaliacao) / this.views;
		this.avaliacao = nova;
	}

	public int getAvaliacao() {
		return avaliacao;

	}
	
	public void setViews(int views) {
		this.views = views;
	}
	
	public int getViews() {
		return views;
	}
	
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	public int getCurtidas() {
		return curtidas;
	}
	
	public void setReproduzir(boolean reproduzir) {
		this.reproduzir = reproduzir;
	}
	
	public boolean getReproduzir() {
		return reproduzir;
	}

	
	// ToString
	@Override
	public String toString() {
		return "Video: Titulo = " + titulo + ", Avaliações = " 
	+ avaliacao + ", Views = " + views + ", Curtidas = " + curtidas
				+ ", Reproduzir = " + reproduzir;
	}
	
	

}
