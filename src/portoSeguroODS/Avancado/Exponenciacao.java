package portoSeguroODS.Avancado;

import java.math.RoundingMode;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Exponenciacao extends QuizMatematica implements Calculo {

	public Exponenciacao() {
		super();
		setA(geradorDeNumeros.ints(1, 2, 11).findFirst().getAsInt());
	}
	
	@Override
	public void calcularQuiz() {
		System.out.println("Quanto é " + getA() + "²?");
		setRespostaCorreta((int) Math.pow(getA(), 2));
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
		// a ^ b = x
		System.out.println("[ a ^ b ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);

		System.out.println("\nDigite o valor de b: ");
		setcB(cB);
		while(getcB().doubleValue() != getcB().intValue()) {
			System.out.println("\nDigite um número inteiro!");
			setcB(cB);
		}

		scanner.nextLine();

		setRespostaCorretaCalculadora(getcA().pow(getcB().intValue()));

		if (getcB().doubleValue() < 0) {
			System.out.println("\n" + getcA() + " ^ (" + getcB() + ") = " + getRespostaCorretaCalculadora());
		} else {
			System.out.println("\n" + getcA() + " ^ " + getcB() + " = " + getRespostaCorretaCalculadora());
		}
		
	}

}
