package portoSeguroODS.Avancado;

import portoSeguroODS.Calculo;
import portoSeguroODS.PerguntaQuiz;
import portoSeguroODS.QuizMatematica;

public class Avancado extends QuizMatematica implements PerguntaQuiz {

	private Calculo tipoDeCalculo;

	public Avancado() {
		super();
	}

	// Polimorfismo - sobrescreve o m�todo da interface PerguntaQuiz
	@Override
	public void fazerQuiz() {
		// Repita enquanto a pontua��o for maior que 0 e maior ou igual e vidas maior
		// que 0
		while (QuizMatematica.getPontuacao() >= 6 && QuizMatematica.getPontuacao() < 9
				&& QuizMatematica.getVida().size() > 0) {

			// Imprime quantidade de vidas
			System.out.println("\nVidas: " + getVida());

			// Gerador de n�mero aleat�rio de 0 a 1,99 decimal
			double potenciaOuRaiz = Math.random() * 2;

			// O n�mero aleat�rio gerado � convertido para inteiro de 0 a 1
			switch ((int) potenciaOuRaiz) {
			// Op��o 0 - Perguntas sobre exponencia��o
			case 0:
				// Criando objeto exponenci��o
				this.tipoDeCalculo = new Exponenciacao();
				// objeto chama o m�todo calcularQuiz
				tipoDeCalculo.calcularQuiz();
				break;
			// Op��o 1 - Perguntas sobre raiz
			case 1:
				// Criando objeto raiz
				this.tipoDeCalculo = new Raiz();
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
