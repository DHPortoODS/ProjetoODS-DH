package portoSeguroODS;

import java.util.InputMismatchException;
import java.util.Scanner;

import portoSeguroODS.Avancado.Avancado;
import portoSeguroODS.Avancado.Exponenciacao;
import portoSeguroODS.Avancado.Raiz;
import portoSeguroODS.Basico.Adicao;
import portoSeguroODS.Basico.Basico;
import portoSeguroODS.Basico.Subtracao;
import portoSeguroODS.Intermediario.Divisao;
import portoSeguroODS.Intermediario.Intermediario;
import portoSeguroODS.Intermediario.Multiplicacao;

public class MenuQuiz {

	public MenuQuiz() {

	}

	Scanner scanner = new Scanner(System.in);
	private int opcao;

	public void executarMenu() {
		
		do {

			System.out.println("\nOlá, escolha qual opção você quer: " + "\n1 - Calculadora"
					+ "\n2 - Testar os conhecimentos com um Quiz" + "\n0 - Sair");
			boolean continua = true;
			do {
				try {
					opcao = scanner.nextInt();
					
					continua = false;

				} catch (InputMismatchException erro1) {
					System.err.println("N�o � permitido inserir letras, informe apenas n�meros!");
					scanner.nextLine(); // descarta a entrada errada do usu�rio
				}

			} while (continua);
			

			switch (opcao) {
			case 1:
				MenuCalculadora testecalc = new MenuCalculadora();
				testecalc.escolherCalc();
				break;
			case 2:
				QuizMatematica.setPontuacao(2);
				Basico basico = new Basico();
				basico.fazerQuiz();

				if (QuizMatematica.getPontuacao() == 3) {
					System.out.println("\nParabéns, você avançou para a próxima etapa!"
							+ "\nAgora as perguntas são de nível Intermediário!");
					Intermediario intermediario = new Intermediario();
					intermediario.fazerQuiz();
				}

				if (QuizMatematica.getPontuacao() == 6) {
					System.out.println("\nParabéns, você avançou para a próxima etapa!"
							+ "\nAgora as perguntas são de nível Avançado!");
					Avancado avancado = new Avancado();
					avancado.fazerQuiz();
				}

				if (QuizMatematica.getPontuacao() == 9) {
					System.out.println(
							"\nParabéns, você avançou para última etapa!" + "\nResponda a esta pergunta especial!");
					Especial especial = new Especial();
					especial.fazerQuiz();
				}

				break;
			case 0:
				System.out.println("Encerrando Aplica��o!");
				break;

			default:
				System.out.println("Erro!");

			}

		} while (opcao != 0 && opcao != 2);

	}

}
