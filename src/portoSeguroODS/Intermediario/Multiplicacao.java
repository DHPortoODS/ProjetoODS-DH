package portoSeguroODS.Intermediario;

import java.math.RoundingMode;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Multiplicacao extends QuizMatematica implements Calculo {
	public Multiplicacao() {
		super();
		setA(geradorDeNumeros.ints(1, 2, 100).findFirst().getAsInt());
		setB(geradorDeNumeros.ints(1, 2, 10).findFirst().getAsInt());
	}

	@Override
	public void calcularQuiz() {
		System.out.println("\nQuanto é " + getA() + " * " + getB() + "?");
		setRespostaCorreta(getA() * getB());
		checarRespostaQuiz();
	}

	@Override
	public void checarRespostaQuiz() {
		setRespostaDoUsuario(0);
		if (getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			setPontuacao(1);
			mostreAPontuacao();
		} else {
			System.out.println("\nResposta incorreta!" + "\nA resposta é: " + getRespostaCorreta());
			System.out.println("\nVocê perdeu uma vida!\n");
			removeVidas();
		}
	}

	@Override
	public void execCalculadora() {
		// a * b = x
		System.out.println("[ a * b ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);

		System.out.println("\nDigite o valor de b: ");
		setcB(cB);

		scanner.nextLine();

		setRespostaCorretaCalculadora(getcA().multiply(getcB()));

		if (getcB().doubleValue() < 0) {
			System.out.println("\n" + getcA() + " * (" + getcB() + ") = " + getRespostaCorretaCalculadora());
		} else {
			System.out.println("\n" + getcA() + " * " + getcB() + " = " + getRespostaCorretaCalculadora());
		}
	}
}
