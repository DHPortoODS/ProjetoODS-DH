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
	public void calcular() {
		if (getA() > getB()) {
			System.out.println("\nQuanto é " + getA() + " - " + getB() + "?");
			setRespostaCorreta(getA() - getB());
			checarResposta();
		} else {
			System.out.println("\nQuanto é " + getB() + " - " + getA() + "?");
			setRespostaCorreta(getB() - getA());
			checarResposta();
		}
	}

	@Override
	public void checarResposta() {
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

}
