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

	// M�todo sem uso
	public MenuCalculadora() {
	}

	// Inicio - op��es calculadora
	public void escolherCalc() {
		// Inicio - Tratamento de op��es da calculadora
		do {
			System.out.println("\nO que voc� deseja fazer na calculadora: " + "\n1 - Adi��o" + "\n2 - Subtra��o"
					+ "\n3 - Multiplica��o" + "\n4 - Divis�o" + "\n5 - Exponencia��o" + "\n6 - Raiz quadrada"
					+ "\n0 - Para sair");

			boolean continua = true;

			// Inicio - Tratamento de entrada de dados do usuario
			do {
				try {
					opcao2 = scanner.nextInt();

					continua = false;

				} catch (InputMismatchException erro1) {
					System.err.println("N�o � permitido inserir letras, informe apenas n�meros!");
					scanner.nextLine(); // descarta a entrada errada do usu�rio
				}

			} while (continua);
			// Fim - Tratamento de entrada de dados do usuario

			switch (opcao2) {
			// Op��o 1 -Adi��o
			case 1:
				// Varivel referenciando Calculo(interface) e recebendo cria��o do objeto
				// adi��o(instancia)
				Calculo adicao = new Adicao();
				adicao.execCalculadora();
				break;
			// Op��o 2 - Subtra��o
			case 2:
				// Varivel referenciando Calculo(interface) e recebendo cria��o do objeto
				// subtra��o(instancia)
				Calculo subtracao = new Subtracao();
				subtracao.execCalculadora();
				break;
			// Op��o 3 - Multiplica��o
			case 3:
				// Varivel referenciando Calculo(interface) e recebendo cria��o do objeto
				// multiplica��o(instancia)
				Calculo multi = new Multiplicacao();
				multi.execCalculadora();
				break;
			// Op��o 4 - Divis�o
			case 4:
				// Varivel referenciando Calculo(interface) e recebendo cria��o do objeto
				// divis�o(instancia)
				Calculo divisao = new Divisao();
				divisao.execCalculadora();
				break;
			// Op��o 5 - Exponencia��o
			case 5:
				// Varivel referenciando Calculo(interface) e recebendo cria��o do objeto
				// exponencia��o(instancia)
				Calculo exp = new Exponenciacao();
				exp.execCalculadora();
				break;
			// Op��o 6 - Raiz
			case 6:
				// Varivel referenciando Calculo(interface) e recebendo cria��o do objeto
				// raiz(instancia)
				Calculo raiz = new Raiz();
				raiz.execCalculadora();
				break;
			// Caso nenhuma das op��es
			default:
				// tratamento para sair do sistema
				if (opcao2 == 0) {
					System.out.println("\nSaindo...");
					break;
				} else {
					// tratamento para caso o usuario escreva qualquer outro valor, retornando as
					// perguntas do menu
					System.out.println("\nOp��o inv�lida");
					break;
				}

			}
		} while (opcao2 != 0);
		// Fim - Tratamento de op��es da calculadora
	}
}
