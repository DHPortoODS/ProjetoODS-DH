package portoSeguroODS.Avancado;

import java.math.MathContext;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Raiz extends QuizMatematica implements Calculo {

	public Raiz() {
		super();
		setA(geradorDeNumeros.ints(1, 2, 100).findFirst().getAsInt());
	}
	
	@Override
	public void calcularQuiz() {
		System.out.println("Quanto é √" + getA() + "?\n");
		setRespostaCorreta((int) Math.sqrt(getA()));
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
			System.out.println("\nResposta incorreta!" + "\nA resposta Ã©: " + getRespostaCorreta());
			System.out.println("\nVocÃª perdeu uma vida!\n");
			removeVidas();
		}
	}

	@Override
	public void execCalculadora() {
		// √a = x
		System.out.println("[ √a ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);
		
		while(getcA().intValue() < 0) {
			System.out.println("\nDigite um número positivo!");
			setcA(cA);
		}

		scanner.nextLine();

		MathContext mc = new MathContext(6);
		setRespostaCorretaCalculadora(getcA().sqrt(mc));

			System.out.println("\n√" + getcA() + " = " + getRespostaCorretaCalculadora());
	}

}
