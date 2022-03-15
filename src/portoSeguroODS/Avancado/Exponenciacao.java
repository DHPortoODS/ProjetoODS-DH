package portoSeguroODS.Avancado;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Exponenciacao extends QuizMatematica implements Calculo {

	public Exponenciacao() {
		super();
		setA(geradorDeNumeros.ints(1, 2, 11).findFirst().getAsInt());
	}
	
	@Override
	public void calcular() {
		System.out.println("Quanto é " + getA() + "²?");
		setRespostaCorreta((int) Math.pow(getA(), 2));
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
