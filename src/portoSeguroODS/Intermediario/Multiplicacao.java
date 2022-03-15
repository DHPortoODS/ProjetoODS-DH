package portoSeguroODS.Intermediario;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Multiplicacao extends QuizMatematica implements Calculo {
	public Multiplicacao() {
		super();
		setA(geradorDeNumeros.ints(1, 2, 100).findFirst().getAsInt());
		setB(geradorDeNumeros.ints(1, 2, 10).findFirst().getAsInt());
	}

	@Override
	public void calcular() {
		System.out.println("\nQuanto é " + getA() + " * " + getB() + "?");
		setRespostaCorreta(getA() * getB());
		checarResposta();
	}

	@Override
	public void checarResposta() {
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
}
