package QuizMath;

public class Intermediario extends QuizMatematica implements Perguntas {

	public Intermediario() {
		super();
		
		/*
		 * O método .ints() retorna um stream de números (long) Os números que retornam
		 * são definidos no parâmetro: (quantidadeDeNumeros, numeroInicial, numeroFinal)
		 * .findFirst().getAsInt() são para converter o Stream para valor do tipo int
		 */
	}

	@Override
	public void fazPergunta() {
		while (true) {
			System.out.println(getVida()); // Imprime a quantidad de vidas
			double divisaoOuMultiplicacao = Math.random() * 2;

			switch ((int) divisaoOuMultiplicacao) {
			case 0:
				System.out.println("\nQuanto é " + getA() + " / " + getB() + "?");
				setRespostaCorreta(getA() / getB());
				checaResposta();
				setA(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
				setB(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
				break;
			case 1:
				System.out.println("\nQuanto é " + getA() + " * " + getB() + "?");
				setRespostaCorreta(getA() * getB());
				checaResposta();
				setA(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
				setB(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
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
