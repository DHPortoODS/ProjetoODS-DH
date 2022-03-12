package portoSeguroODS;

public class Intermediario extends QuizMatematica implements Perguntas {

	public Intermediario() {
		super();
		setA(geradorDeNumeros.ints(1, 10, 100).findFirst().getAsInt());
		setB(geradorDeNumeros.ints(1, 2, 10).findFirst().getAsInt());
		/*
		 * O método .ints() retorna um stream de números (long) Os números que retornam
		 * são definidos no parâmetro: (quantidadeDeNumeros, numeroInicial, numeroFinal)
		 * .findFirst().getAsInt() são para converter o Stream para valor do tipo int
		 */
	}

	@Override
	public void fazPergunta() {
		while (true) {
			double divisaoOuMultiplicacao = Math.random() * 2;

			switch ((int) divisaoOuMultiplicacao) {
			case 0:
				System.out.println("\nQuanto é " + getA() + " / " + getB() + "?");
				setRespostaCorreta(getA() / getB());
				checaResposta();
				mostreAPontuacao();
				break;
			case 1:
				System.out.println("\nQuanto é " + getA() + " * " + getB() + "?");
				setRespostaCorreta(getA() * getB());
				checaResposta();
				mostreAPontuacao();
				break;
			}
			
			if (perdeu()) {
				break;
			} else if (getPontuacao() == 6 && getVida().size() > 0) {
				getPontuacao();
				break;
			}
		}

	}

	@Override
	public void checaResposta() {
		setRespostaDoUsuario(0);
		if (getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			setPontuacao(1);
			mostreAPontuacao();
		} else {
			System.out.println("\nResposta incorreta!" + "\nA resposta é: " + getRespostaCorreta() + "\n");
			System.out.println("\nVocê perdeu uma vida: ");
			removeVidas();
		}
	}

	
}