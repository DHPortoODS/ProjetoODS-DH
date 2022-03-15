package Especial;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class CalculoEspecial2 extends QuizMatematica implements Calculo {
	public CalculoEspecial2() {
		super();
		setA(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
		setB(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
		setC(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
		setD(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
	}

	@Override
	public void calcular() {
		System.out.println("Qual é o resultado desta operação: ");
		// a² + (b - a) x (c + d) + √9
		System.out.println(getA() + "² + (" + getB() + " - " + getA() + ") x (" + getC() + "+" + getD() + ") + √9?");
		setRespostaCorreta((int) Math.pow(getA(), 2) + (getA() - getB()) * (getC() + getD()) + (int) Math.sqrt(4));
		checarResposta();
	}

	@Override
	public void checarResposta() {
		setRespostaDoUsuario(0);
		if (getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			setPontuacao(1);
			QuizMatematica.parabens();
		} else {
			System.out.println("\nResposta incorreta!" + "\nA resposta é: " + getRespostaCorreta());
			System.out.println("\nVocê perdeu uma vida!\n");
			removeVidas();
		}
	}

}
