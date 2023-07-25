package programa;

public class Main {

	public static void main(String[] args) {

		Video video[] = new Video[3];

		video[0] = new Video("Curso de Java");
		video[1] = new Video("Curso de POO");
		video[2] = new Video("Curso SpringBoot");

		System.out.println(video[0].toString());
		System.out.println(video[1].toString());
		System.out.println(video[2].toString());

		Usuario user[] = new Usuario[2];

		user[0] = new Usuario("Juliano", 41, "M", "JulianoMarthins");
		user[1] = new Usuario("Thiele", 36, "F", "ThieleTitita");

		System.out.println();

		System.out.println(user[0].toString());
		System.out.println(user[1].toString());
		System.out.println();
		
		Visualizacao visualizar[] = new Visualizacao[5];
		visualizar[0] = new Visualizacao(user[0], video[2]); // Juliano assistiu Curso SpringBoot
		visualizar[0].avaliar();
		
		System.out.println(visualizar[0].toString());

		visualizar[1] = new Visualizacao(user[0], video[1]); // Juliano assistiu curso Java POO
		System.out.println(visualizar[1].toString());
		visualizar[0].avaliar(75.7f);
		
		visualizar[0] = new Visualizacao(user[1], video[0]);
		visualizar[0].avaliar(8);
		System.out.println(visualizar[0].toString());
		
	}

}
