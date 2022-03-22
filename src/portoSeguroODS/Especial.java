package portoSeguroODS;

public class Especial extends QuizMatematica implements PerguntaQuiz, Calculo {
	// Gerador de numeros
	public Especial() {
		super();
		// Gerador de n�meros aleat�rio entre 1 a 19
		setA(geradorDeNumeros.ints(1, 1, 20).findFirst().getAsInt());
		setB(geradorDeNumeros.ints(1, 1, 20).findFirst().getAsInt());
		setC(geradorDeNumeros.ints(1, 1, 20).findFirst().getAsInt());
		setD(geradorDeNumeros.ints(1, 1, 20).findFirst().getAsInt());
	}

	// Polimorfismo - metodo pergunta para usuario
	@Override
	public void fazerQuiz() {
		while (QuizMatematica.getPontuacao() == 9 && QuizMatematica.getVida().size() > 0) {

			// Imprime quantidade de vidas
			System.out.println("\nVidas: " + getVida());

			// Referencia a interface Calculo e cria��o do objeto Especial, especial recebe
			// todos os metodos de Especial
			Calculo especial = new Especial();

			// Objeto criado referenciado o metodo calcularQuiz
			especial.calcularQuiz();

			// Verifica a condi��o se � true
			if (perdeuEspecial()) {
				break;
			}
		}
	}

	// Polimorfismo - metodo calcular express�o especial
	@Override
	public void calcularQuiz() {
		// Condi��o para tratamento das perguntas aleat�rias
		if (getA() > getB()) {
			System.out.println("Qual � o resultado desta opera��o: ");
			// a� + (a - b) x (c + d) + raiz quadrada de4
			System.out.println(getA() + "� + (" + getA() + " - " + getB() + ") x (" + getC() + "+" + getD()
					+ ") + raiz quadrada de 4?");

			// gera a resposta do sistema
			setRespostaCorreta((int) Math.pow(getA(), 2) + (getA() - getB()) * (getC() + getD()) + (int) Math.sqrt(4));

			// M�todo para avaliar a resposta do usu�rio e do sistema
			checarRespostaQuiz();
		} else {
			System.out.println("Qual � o resultado desta opera��o: ");
			// a² + (b - a) x (c + d) + raiz quadrade de 9
			System.out.println(getA() + "� + (" + getB() + " - " + getA() + ") x (" + getC() + "+" + getD()
					+ ") + raiz quadrada de 9?");

			// Gera a resposta do sistema
			setRespostaCorreta((int) Math.pow(getA(), 2) + (getB() - getA()) * (getC() + getD()) + (int) Math.sqrt(9));

			// M�todo para avaliar a resposta do usu�rio e do sistema
			checarRespostaQuiz();
		}
	}

	// Polimorfismo - M�todo para avaliar a resposta do usu�rio e do sistema
	@Override
	public void checarRespostaQuiz() {
		// Entrada de valor do usu�rio
		setRespostaDoUsuario(0);

		// Condi��o para tratamento da resposta do usuario e do sistema
		if (getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			// M�todo pontua��o de soma +1
			setPontuacao(1);
			// M�todo imprime a pontua��o.
			mostreAPontuacao();
			// M�todo apresenta janela Parabens quando atingir a pontua��o m�xima.
			parabens();
		} else {
			System.out.println("\nResposta incorreta!" + "\nA resposta �: " + getRespostaCorreta());
			System.out.println("\nVoc� perdeu uma vida!\n");
			// M�todo perde vidas.
			removeVidas();
		}
	}

	// Polimorfismo - Foi obrigado a implantar o m�todo, mas esta sem uso.
	@Override
	public void execCalculadora() {
	}
}