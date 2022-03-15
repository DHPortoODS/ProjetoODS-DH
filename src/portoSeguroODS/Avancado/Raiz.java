package portoSeguroODS.Avancado;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Raiz extends QuizMatematica implements Calculo {

	public Raiz() {
		super();
		setA(geradorDeNumeros.ints(1, 2, 10).findFirst().getAsInt());
		setB(geradorDeNumeros.ints(1, 2, 100).findFirst().getAsInt());
	}
	
	@Override
	public void calcular() {
		System.out.println("Quanto Ã© √" + getB() + "?\n");
		setRespostaCorreta((int) Math.sqrt(getB()));
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
