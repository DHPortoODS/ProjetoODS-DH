package portoSeguroODS.Basico;

import portoSeguroODS.Calculo;
import portoSeguroODS.PerguntaQuiz;
import portoSeguroODS.QuizMatematica;

public class Basico extends QuizMatematica implements PerguntaQuiz {

	private Calculo tipoDeCalculo;

	public Basico() {
		super();
	}

	// Polimorfismo - sobrescreve o método da interface PerguntaQuiz
	@Override
	public void fazerQuiz() {
		// Repita enquanto a pontuação for menor 3 e a vida maior que 0
		while (QuizMatematica.getPontuacao() < 3 && QuizMatematica.getVida().size() > 0) {

			// Imprime quantidade de vidas
			System.out.println("\nVidas: " + getVida());

			// Gerador de número aleatório de 0 a 1,99
			double somaOuSubtracao = Math.random() * 2;

			// O número aleatório gerado é convertido para inteiro de 0 a 1
			switch ((int) somaOuSubtracao) {
			// Opção 0 - Perguntas sobre Adição
			case 0:
				// Criando objeto Adição
				this.tipoDeCalculo = new Adicao();
				// objeto chama o método calcularQuiz
				tipoDeCalculo.calcularQuiz();
				break;
			// Opção 1 - Perguntas sobre Subtração
			case 1:
				// Criando objeto Subtração
				this.tipoDeCalculo = new Subtracao();
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
