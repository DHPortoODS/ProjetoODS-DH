package portoSeguroODS.Intermediario;

import portoSeguroODS.Calculo;
import portoSeguroODS.PerguntaQuiz;
import portoSeguroODS.QuizMatematica;

public class Intermediario extends QuizMatematica implements PerguntaQuiz {

	private Calculo tipoDeCalculo;

	public Intermediario() {
		super();
	}

	// Polimorfismo - sobrescreve o método da interface PerguntaQuiz
	@Override
	public void fazerQuiz() {
		// Repita enquanto a pontuação for maior ou igual 3 e menor que 6 e a vida maior
		// que 0
		while (QuizMatematica.getPontuacao() >= 3 && QuizMatematica.getPontuacao() < 6
				&& QuizMatematica.getVida().size() > 0) {

			// Imprime quantidade de vidas
			System.out.println("\nVidas: " + getVida());

			// Gerador de número aleatório de 0 a 1,99
			double multiplicacaoOuDivisao = Math.random() * 2;

			// O número aleatório gerado é convertido para inteiro de 0 a 1
			switch ((int) multiplicacaoOuDivisao) {
			// Opção 0 - Perguntas sobre Multiplicação
			case 0:
				// Criando objeto Adição
				this.tipoDeCalculo = new Multiplicacao();
				// objeto chama o método calcularQuiz
				tipoDeCalculo.calcularQuiz();
				break;
			// Opção 1 - Perguntas sobre divisão
			case 1:
				// Criando objeto divisão
				this.tipoDeCalculo = new Divisao();
				// objeto chama o método calcular quiz
				tipoDeCalculo.calcularQuiz();
				break;
			}

			// Tratamento converte o tipo da variavel tipoDeCalculo para QuizMatematica
			// permitindo
			// acessar o método perdeu para verificar se a vida for igual a 0
			if (((QuizMatematica) tipoDeCalculo).perdeu()) {
				break;
			}

		}

	}

}
