package portoSeguroODS;

import java.util.InputMismatchException;
import java.util.Scanner;

import portoSeguroODS.Avancado.Exponenciacao;
import portoSeguroODS.Avancado.Raiz;
import portoSeguroODS.Basico.Adicao;
import portoSeguroODS.Basico.Subtracao;
import portoSeguroODS.Intermediario.Divisao;
import portoSeguroODS.Intermediario.Multiplicacao;

public class MenuCalculadora {

	private int opcao2;
	Scanner scanner = new Scanner(System.in);

	// Método sem uso
	public MenuCalculadora() {
	}

	// Inicio - opções calculadora
	public void escolherCalc() {
		// Inicio - Tratamento de opções da calculadora
		do {
			System.out.println("\nO que você deseja fazer na calculadora: " + "\n1 - Adição" + "\n2 - Subtração"
					+ "\n3 - Multiplicação" + "\n4 - Divisão" + "\n5 - Exponenciação" + "\n6 - Raiz quadrada"
					+ "\n0 - Para sair");

			boolean continua = true;

			// Inicio - Tratamento de entrada de dados do usuario
			do {
				try {
					opcao2 = scanner.nextInt();

					continua = false;

				} catch (InputMismatchException erro1) {
					System.err.println("Não é permitido inserir letras, informe apenas números!");
					scanner.nextLine(); // descarta a entrada errada do usuário
				}

			} while (continua);
			// Fim - Tratamento de entrada de dados do usuario

			switch (opcao2) {
			// Opção 1 -Adição
			case 1:
				// Varivel referenciando Calculo(interface) e recebendo criação do objeto
				// adição(instancia)
				Calculo adicao = new Adicao();
				adicao.execCalculadora();
				break;
			// Opção 2 - Subtração
			case 2:
				// Varivel referenciando Calculo(interface) e recebendo criação do objeto
				// subtração(instancia)
				Calculo subtracao = new Subtracao();
				subtracao.execCalculadora();
				break;
			// Opção 3 - Multiplicação
			case 3:
				// Varivel referenciando Calculo(interface) e recebendo criação do objeto
				// multiplicação(instancia)
				Calculo multi = new Multiplicacao();
				multi.execCalculadora();
				break;
			// Opção 4 - Divisão
			case 4:
				// Varivel referenciando Calculo(interface) e recebendo criação do objeto
				// divisão(instancia)
				Calculo divisao = new Divisao();
				divisao.execCalculadora();
				break;
			// Opção 5 - Exponenciação
			case 5:
				// Varivel referenciando Calculo(interface) e recebendo criação do objeto
				// exponenciação(instancia)
				Calculo exp = new Exponenciacao();
				exp.execCalculadora();
				break;
			// Opção 6 - Raiz
			case 6:
				// Varivel referenciando Calculo(interface) e recebendo criação do objeto
				// raiz(instancia)
				Calculo raiz = new Raiz();
				raiz.execCalculadora();
				break;
			// Caso nenhuma das opções
			default:
				// tratamento para sair do sistema
				if (opcao2 == 0) {
					System.out.println("\nSaindo...");
					break;
				} else {
					// tratamento para caso o usuario escreva qualquer outro valor, retornando as
					// perguntas do menu
					System.out.println("\nOpção inválida");
					break;
				}

			}
		} while (opcao2 != 0);
		// Fim - Tratamento de opções da calculadora
	}
}
