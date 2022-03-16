package portoSeguroODS.Basico;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Adicao extends QuizMatematica implements Calculo {

	public Adicao() {
		super();
		setA(geradorDeNumeros.nextInt(20) + 1);
		setB(geradorDeNumeros.nextInt(10) + 1);
	}
	
	@Override
	public void calcularQuiz() {
		System.out.println("\nQuanto é " + getA() + " + " + getB() + "?");
		setRespostaCorreta(getA() + getB());
		checarRespostaQuiz();
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
		// a + b = x
		System.out.println("[ a + b ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);
		
		System.out.println("\nDigite o valor de b: ");
		setcB(cB);
		
		scanner.nextLine();
		
		setRespostaCorretaCalculadora(getcA().add(getcB()));
		
		System.out.println("\n" + getcA() + " + " + getcB() + " = " + getRespostaCorretaCalculadora());
	}
	
}
