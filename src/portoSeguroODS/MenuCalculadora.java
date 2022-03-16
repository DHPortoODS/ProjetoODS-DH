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

	public MenuCalculadora() {

	}

	public void escolherCalc() {
		do {
			System.out.println("\nO que voc√™ deseja fazer na calculadora: " + "\n1 - Adi√ß√£o" + "\n2 - Subtra√ß√£o"
					+ "\n3 - Multiplica√ß√£o" + "\n4 - Divis√£o" + "\n5 - Exponencia√ß√£o" + "\n6 - Ra√≠z quadrada"
					+ "\n0 - Para sair");

			boolean continua = true;

			do {
				try {
					opcao2 = scanner.nextInt();

					continua = false;

				} catch (InputMismatchException erro1) {
					System.err.println("N„o È permitido inserir letras, informe apenas n˙meros!");
					scanner.nextLine(); // descarta a entrada errada do usu·rio
				}

			} while (continua);

			switch (opcao2) {
			case 1:
				Calculo adicao = new Adicao();
				adicao.execCalculadora();
				break;
			case 2:
				Calculo subtracao = new Subtracao();
				subtracao.execCalculadora();
				break;
			case 3:
				Calculo multi = new Multiplicacao();
				multi.execCalculadora();
				break;
			case 4:
				Calculo divisao = new Divisao();
				divisao.execCalculadora();
				break;
			case 5:
				Calculo exp = new Exponenciacao();
				exp.execCalculadora();
				break;
			case 6:
				Calculo raiz = new Raiz();
				raiz.execCalculadora();
				break;
			default:
				if (opcao2 == 0) {
					System.out.println("\nSaindo...");
					break;
				} else {
					System.out.println("\nOpÁ„o inv·lida");
					break;
				}

			}
		} while (opcao2 != 0);

	}
}
