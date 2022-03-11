package portoSeguroODS;

public class Intermediario extends QuizMatematica implements Perguntas {
	
	public Intermediario (){
		super();
		setA(geradorDeNumeros.ints(1,10,100).findFirst().getAsInt());
		setB(geradorDeNumeros.ints(1,2,9).findFirst().getAsInt());
		/* O método .ints() retorna um stream de números (long)
		 * Os números que retornam são definidos no parâmetro: (quantidadeDeNumeros, numeroInicial, numeroFinal)
		 * .findFirst().getAsInt() são para converter o Stream para valor do tipo int
		 */
	}

	@Override
	public void fazPergunta() {
		double divisaoOuMultiplicacao = Math.random()*2;
		
		switch((int) divisaoOuMultiplicacao){		
		case 0: 
			System.out.println("\nQuanto é " + getA() + " / " + getB() + "?");
			setRespostaCorreta(getA() / getB());
			break;
		case 1:
			System.out.println("\nQuanto é " + getA()+ " * " + getB() + "?");
			setRespostaCorreta(getA() * getB());
			break;
		}
	}

	@Override
	public void checaResposta() {
		setRespostaDoUsuario(0);
		if(getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			setPontuacaoIntermediario(1);
		} else {
			System.out.println("\nResposta incorreta!"
								+ "\nA resposta é: " + getRespostaCorreta() + "\n");
		}
	}
	
	public void mostreAPontuacao() {
		System.out.println("Sua pontuação é de: " + getPontuacaoIntermediario() + "\n");
	}

}
