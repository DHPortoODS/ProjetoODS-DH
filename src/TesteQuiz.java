
public class TesteQuiz {

	public static void main(String[] args) {
		Iniciante i = new Iniciante();
		Intermediario t = new Intermediario();
		Avançado a = new Avançado();

		i.PerguntaInicial();

		System.out.println("Parabens! Agora as perguntas serão um pouco dificeis a partir de agora");
		t.PerguntaInicial();

		System.out.println("Parabens! Voce é um genio agora as perguntas serao extremamente dificeis!");
		a.PerguntaInicial();

	}
}
