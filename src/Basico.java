package portoSeguroODS;

public class Basico extends QuizMatematica implements Perguntas {
	
	//Básico conterá contas de Subtração e Adição
	public Basico (){
		super();
		setA(geradorDeNumeros.nextInt(999));
		setB(geradorDeNumeros.nextInt(999));
	}

	@Override
	public void fazPergunta() {
		if(getA() > getB()) { 
			System.out.println("Quanto é " + getA() + " - " + getB() + "?");
			setRespostaCorreta(getA() - getB());
		} else {
			System.out.println("Quanto é " + getA() + " + " + getB() + "?");
			setRespostaCorreta(getA() + getB());
		}
	}

	@Override
	public void checaResposta() {
		setRespostaDoUsuario(0);
		if(getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			setPontuacaoBasico(1);
		} else {
			System.out.println("\nResposta incorreta!"
								+ "\nA resposta é: " + getRespostaCorreta() + "\n");
		}
	}
	
	public void mostreAPontuacao() {
		System.out.println("Sua pontuação é de: " + getPontuacaoBasico() + "\n");
	}

}
