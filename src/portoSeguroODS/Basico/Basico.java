package portoSeguroODS.Basico;

import portoSeguroODS.Calculo;
import portoSeguroODS.PerguntaQuiz;
import portoSeguroODS.QuizMatematica;

public class Basico extends QuizMatematica implements PerguntaQuiz {

	private Calculo tipoDeCalculo;

	public Basico() {
		super();
	}

	// Polimorfismo - sobrescreve o m�todo da interface PerguntaQuiz
	@Override
	public void fazerQuiz() {
		// Repita enquanto a pontua��o for menor 3 e a vida maior que 0
		while (QuizMatematica.getPontuacao() < 3 && QuizMatematica.getVida().size() > 0) {

			// Imprime quantidade de vidas
			System.out.println("\nVidas: " + getVida());

			// Gerador de n�mero aleat�rio de 0 a 1,99
			double somaOuSubtracao = Math.random() * 2;

			// O n�mero aleat�rio gerado � convertido para inteiro de 0 a 1
			switch ((int) somaOuSubtracao) {
			// Op��o 0 - Perguntas sobre Adi��o
			case 0:
				// Criando objeto Adi��o
				this.tipoDeCalculo = new Adicao();
				// objeto chama o m�todo calcularQuiz
				tipoDeCalculo.calcularQuiz();
				break;
			// Op��o 1 - Perguntas sobre Subtra��o
			case 1:
				// Criando objeto Subtra��o
				this.tipoDeCalculo = new Subtracao();
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
