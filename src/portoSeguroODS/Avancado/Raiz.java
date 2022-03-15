package portoSeguroODS.Avancado;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Raiz extends QuizMatematica implements Calculo {

	public Raiz() {
		super();
		setA(geradorDeNumeros.ints(1, 2, 100).findFirst().getAsInt());
	}
	
	@Override
	public void calcular() {
		System.out.println("Quanto é √" + getA() + "?\n");
		setRespostaCorreta((int) Math.sqrt(getA()));
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
			System.out.println("\nResposta incorreta!" + "\nA resposta Ã©: " + getRespostaCorreta());
			System.out.println("\nVocÃª perdeu uma vida!\n");
			removeVidas();
		}
	}

}
