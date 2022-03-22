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

	// M�todo
	// Inicio - Executa menu
	public void executarMenu() {

		// Inicio - Tratamento de dados de entrada do usu�rio
		do {
			System.out.println("QUIZ MATEMATICA\n");
			System.out.println("\nOl�!, escolha qual op��o voc� quer: " + "\n1 - Calculadora"
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
			// Fim - Tramento de dados de entrada do usu�rio

			switch (opcao) {
			// Op��o 1 - Calculadora
			case 1:
				// Cria��o do objeto menu calculadora
				MenuCalculadora testecalc = new MenuCalculadora();
				testecalc.escolherCalc();
				break;
			// Op��o 2 - Quiz Matematica
			case 2:
				// Cria��o dos objetos - perguntas de matematica
				// Menor que 3 pontos perguntas de nivel basico
				if (QuizMatematica.getPontuacao() < 3) {
					System.out.println("As seguintes quest�es ser�o de n�vel B�sico!");
					Basico basico = new Basico();
					basico.fazerQuiz();
				}
				// Maior ou igual a 3 e menor que 6 pontos perguntas de nivel intermedi�rioe
				if (QuizMatematica.getPontuacao() >= 3 && QuizMatematica.getPontuacao() < 6) {
					System.out.println("\nParabens, voc� avan�ou para a pr�xima etapa!"
							+ "\nAgora as perguntas ser�o de n�vel Intermedi�rio");
					Intermediario intermediario = new Intermediario();
					intermediario.fazerQuiz();
				}
				// Maior ou igual a 6 e menor que 9 pontos perguntas de nivel avan�ado
				if (QuizMatematica.getPontuacao() >= 6 && QuizMatematica.getPontuacao() < 9) {
					System.out.println("\nParabens, voc� avan�ou para a pr�xima etapa!"
							+ "\nAgora as perguntas s�o de n�vel Avan�ado!");
					Avancado avancado = new Avancado();
					avancado.fazerQuiz();
				}
				// Maior ou igual 9 e menor ou igual que 10 pontos pergunta de nivel especial
				if (QuizMatematica.getPontuacao() >= 9 && QuizMatematica.getPontuacao() <= 10) {
					System.out.println(
							"\nParabens, voc� avan�ou para a ultima etapa!" + "\nResponda a esta pergunta especial!");
					Especial especial = new Especial();
					especial.fazerQuiz();
				}
				break;
			// Op��o 0 - Encerra API
			case 0:
				System.out.println("Encerrando Aplica��o!");
				break;
			// Tratamento caso o usu�rio digite algum valor errado
			default:
				System.out.println("Erro!");
			}

		} while (opcao != 0 && opcao != 2);
		// Fim - Executa menu
	}

}
