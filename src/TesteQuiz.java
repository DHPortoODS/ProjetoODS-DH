
public class TesteQuiz {

	public static void main(String[] args) {
		Iniciante i = new Iniciante();
		Intermediario t = new Intermediario();
		Avan�ado a = new Avan�ado();

		i.PerguntaInicial();

		System.out.println("Parabens! Agora as perguntas ser�o um pouco dificeis a partir de agora");
		t.PerguntaInicial();

		System.out.println("Parabens! Voce � um genio agora as perguntas serao extremamente dificeis!");
		a.PerguntaInicial();

	}
}
