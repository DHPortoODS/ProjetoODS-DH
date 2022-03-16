package portoSeguroODS.Basico;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Subtracao extends QuizMatematica implements Calculo {

	public Subtracao() {
		super();
		setA(geradorDeNumeros.nextInt(20) + 1);
		setB(geradorDeNumeros.nextInt(10) + 1);
	}

	@Override
	public void calcularQuiz() {
		if (getA() > getB()) {
			System.out.println("\nQuanto é " + getA() + " - " + getB() + "?");
			setRespostaCorreta(getA() - getB());
			checarRespostaQuiz();
		} else {
			System.out.println("\nQuanto é " + getB() + " - " + getA() + "?");
			setRespostaCorreta(getB() - getA());
			checarRespostaQuiz();
		}
	}

	@Override
	public void checarRespostaQuiz() {
		setRespostaDoUsuario(0); // Scanner do Usuário

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
		// a - b = x
		System.out.println("[ a - b ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);
		
		System.out.println("\nDigite o valor de b: ");
		setcB(cB);
		
		scanner.nextLine();
		
		setRespostaCorretaCalculadora(getcA().subtract(getcB()));
		
		if(getcB().doubleValue() < 0) {
		System.out.println("\n" + getcA() + " - (" + getcB() + ") = " + getRespostaCorretaCalculadora());
		} else {
			System.out.println("\n" + getcA() + " - " + getcB() + " = " + getRespostaCorretaCalculadora());
		}
	}

}
