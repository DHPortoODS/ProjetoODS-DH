package portoSeguroODS.Intermediario;

import portoSeguroODS.Calculo;
import portoSeguroODS.PerguntaQuiz;
import portoSeguroODS.QuizMatematica;

public class Intermediario extends QuizMatematica implements PerguntaQuiz {

	private Calculo tipoDeCalculo;

	public Intermediario() {
		super();
	}

	// Polimorfismo - sobrescreve o m�todo da interface PerguntaQuiz
	@Override
	public void fazerQuiz() {
		// Repita enquanto a pontua��o for maior ou igual 3 e menor que 6 e a vida maior
		// que 0
		while (QuizMatematica.getPontuacao() >= 3 && QuizMatematica.getPontuacao() < 6
				&& QuizMatematica.getVida().size() > 0) {

			// Imprime quantidade de vidas
			System.out.println("\nVidas: " + getVida());

			// Gerador de n�mero aleat�rio de 0 a 1,99
			double multiplicacaoOuDivisao = Math.random() * 2;

			// O n�mero aleat�rio gerado � convertido para inteiro de 0 a 1
			switch ((int) multiplicacaoOuDivisao) {
			// Op��o 0 - Perguntas sobre Multiplica��o
			case 0:
				// Criando objeto Adi��o
				this.tipoDeCalculo = new Multiplicacao();
				// objeto chama o m�todo calcularQuiz
				tipoDeCalculo.calcularQuiz();
				break;
			// Op��o 1 - Perguntas sobre divis�o
			case 1:
				// Criando objeto divis�o
				this.tipoDeCalculo = new Divisao();
				// objeto chama o m�todo calcular quiz
				tipoDeCalculo.calcularQuiz();
				break;
			}

			// Tratamento converte o tipo da variavel tipoDeCalculo para QuizMatematica
			// permitindo
			// acessar o m�todo perdeu para verificar se a vida for igual a 0
			if (((QuizMatematica) tipoDeCalculo).perdeu()) {
				break;
			}

		}

	}

}
