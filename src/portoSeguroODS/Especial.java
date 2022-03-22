package portoSeguroODS;

public class Especial extends QuizMatematica implements PerguntaQuiz, Calculo {
	// Gerador de numeros
	public Especial() {
		super();
		// Gerador de números aleatório entre 1 a 19
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

			// Referencia a interface Calculo e criação do objeto Especial, especial recebe
			// todos os metodos de Especial
			Calculo especial = new Especial();

			// Objeto criado referenciado o metodo calcularQuiz
			especial.calcularQuiz();

			// Verifica a condição se é true
			if (perdeuEspecial()) {
				break;
			}
		}
	}

	// Polimorfismo - metodo calcular expressão especial
	@Override
	public void calcularQuiz() {
		// Condição para tratamento das perguntas aleatórias
		if (getA() > getB()) {
			System.out.println("Qual é o resultado desta operação: ");
			// a² + (a - b) x (c + d) + raiz quadrada de4
			System.out.println(getA() + "² + (" + getA() + " - " + getB() + ") x (" + getC() + "+" + getD()
					+ ") + raiz quadrada de 4?");

			// gera a resposta do sistema
			setRespostaCorreta((int) Math.pow(getA(), 2) + (getA() - getB()) * (getC() + getD()) + (int) Math.sqrt(4));

			// Método para avaliar a resposta do usuário e do sistema
			checarRespostaQuiz();
		} else {
			System.out.println("Qual é o resultado desta operação: ");
			// aÂ² + (b - a) x (c + d) + raiz quadrade de 9
			System.out.println(getA() + "² + (" + getB() + " - " + getA() + ") x (" + getC() + "+" + getD()
					+ ") + raiz quadrada de 9?");

			// Gera a resposta do sistema
			setRespostaCorreta((int) Math.pow(getA(), 2) + (getB() - getA()) * (getC() + getD()) + (int) Math.sqrt(9));

			// Método para avaliar a resposta do usuário e do sistema
			checarRespostaQuiz();
		}
	}

	// Polimorfismo - Método para avaliar a resposta do usuário e do sistema
	@Override
	public void checarRespostaQuiz() {
		// Entrada de valor do usuário
		setRespostaDoUsuario(0);

		// Condição para tratamento da resposta do usuario e do sistema
		if (getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			// Método pontuação de soma +1
			setPontuacao(1);
			// Método imprime a pontuação.
			mostreAPontuacao();
			// Método apresenta janela Parabens quando atingir a pontuação máxima.
			parabens();
		} else {
			System.out.println("\nResposta incorreta!" + "\nA resposta é: " + getRespostaCorreta());
			System.out.println("\nVocê perdeu uma vida!\n");
			// Método perde vidas.
			removeVidas();
		}
	}

	// Polimorfismo - Foi obrigado a implantar o método, mas esta sem uso.
	@Override
	public void execCalculadora() {
	}
}