package portoSeguroODS;

public class Basico extends QuizMatematica implements Perguntas {
	
	public Basico (){
		super();
	}

	@Override
	public void fazPergunta() {
		if(getA() > getB()) {
			System.out.println("Quanto é " + getA() + " - " + getB());
			//int respostaCorreta = getA() - getB();
			setRespostaCorreta(getA() - getB());
		} else {
			System.out.println("Quanto é " + getA() + " + " + getB());
			//int respostaCorreta = getA() + getB();
			setRespostaCorreta(getA() + getB());
		}
	}

	@Override
	public void checaResposta() {
		if(getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			setPontuacaoBasico(1);
		} else {
			System.out.println("\nResposta incorreta.\n A resposta é: " + getRespostaCorreta() + "!");
		}
	}
	
	

}
