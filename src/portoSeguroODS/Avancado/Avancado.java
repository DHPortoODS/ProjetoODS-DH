package portoSeguroODS.Avancado;

import portoSeguroODS.Calculo;
import portoSeguroODS.PerguntaQuiz;
import portoSeguroODS.QuizMatematica;

public class Avancado extends QuizMatematica implements PerguntaQuiz {

	private Calculo tipoDeCalculo;

	public Avancado() {
		super();
	}

	// Polimorfismo - sobrescreve o método da interface PerguntaQuiz
	@Override
	public void fazerQuiz() {
		// Repita enquanto a pontuação for maior que 0 e maior ou igual e vidas maior
		// que 0
		while (QuizMatematica.getPontuacao() >= 6 && QuizMatematica.getPontuacao() < 9
				&& QuizMatematica.getVida().size() > 0) {

			// Imprime quantidade de vidas
			System.out.println("\nVidas: " + getVida());

			// Gerador de número aleatório de 0 a 1,99 decimal
			double potenciaOuRaiz = Math.random() * 2;

			// O número aleatório gerado é convertido para inteiro de 0 a 1
			switch ((int) potenciaOuRaiz) {
			// Opção 0 - Perguntas sobre exponenciação
			case 0:
				// Criando objeto exponencição
				this.tipoDeCalculo = new Exponenciacao();
				// objeto chama o método calcularQuiz
				tipoDeCalculo.calcularQuiz();
				break;
			// Opção 1 - Perguntas sobre raiz
			case 1:
				// Criando objeto raiz
				this.tipoDeCalculo = new Raiz();
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
