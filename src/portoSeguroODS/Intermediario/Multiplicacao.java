package portoSeguroODS.Intermediario;

import java.math.RoundingMode;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Multiplicacao extends QuizMatematica implements Calculo {
	// Construtor
	public Multiplicacao() {
		super();
		// Gera numeros aleat�rios entre 2 a 99
		setA(geradorDeNumeros.ints(1, 2, 100).findFirst().getAsInt());
		setB(geradorDeNumeros.ints(1, 2, 10).findFirst().getAsInt());
	}

	// Polimorfismo - Sobrescreve o m�todo da interface Calculo
	@Override
	public void calcularQuiz() {
		System.out.println("\nQuanto � " + getA() + " * " + getB() + "?");
		// Gera a resposta do sistema
		setRespostaCorreta(getA() * getB());
		// M�todo para avaliar a resposta do usu�rio e do sistema
		checarRespostaQuiz();
	}

	// Polimorfismo - Sobrescreve o m�todo da interface Calculo
	@Override
	public void checarRespostaQuiz() {
		// Entrada de valor inserido pelo usuario
		setRespostaDoUsuario(0);
		// Condi��o de compara��o com a resposta do usu�rio e do sistema
		if (getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			// M�todo de pontua��o recebe +1
			setPontuacao(1);
			// M�todo para imprimir a pontua��o
			mostreAPontuacao();
		} else {
			System.out.println("\nResposta incorreta!" + "\nA resposta �: " + getRespostaCorreta());
			System.out.println("\nVoc� perdeu uma vida!\n");
			// M�todo que remove vida -1
			removeVidas();
		}
	}

	// Polimorfismo - Sobrescreve o m�todo da interface Calculo
	// M�todo de calculo de multiplica��o
	@Override
	public void execCalculadora() {
		// a * b = x
		System.out.println("[ a * b ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);

		System.out.println("\nDigite o valor de b: ");
		setcB(cB);

		scanner.nextLine();

		// Gera a resposta do sistema referente a multiplica��o da calculadora
		setRespostaCorretaCalculadora(getcA().multiply(getcB()));

		if (getcB().doubleValue() < 0) {
			System.out.println("\n" + getcA() + " * (" + getcB() + ") = " + getRespostaCorretaCalculadora());
		} else {
			System.out.println("\n" + getcA() + " * " + getcB() + " = " + getRespostaCorretaCalculadora());
		}
	}
}
