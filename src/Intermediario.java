
public class Intermediario extends QuizMatematica implements Situacao {

	@Override
	public void PerguntaInicial() {
		System.out.println("Qual é o resultado desta operação");
		Operacao();
	}

	@Override
	public void check() {
		if (getResposta() == getResultado() || getResp() == getResultado() ) {
			System.out.println("Correto");
			setPontucao(1);
			System.out.println("Pontos: " + getPontucao());

		} else {
			System.out.println("Resposta incorreta");
			vidas();
		}
	}

	@Override
	public void vidas() {
		getVida().remove(getVida().size() - 1);
		System.out.println(getVida());
	}

	@Override
	public boolean perdeu() {
		if (getVida().size() == 0) {
			System.out.println("GAME OVER");
			System.out.println("Pontuação: " + getPontucao());
			return true;
		}
		return false;
	}

	@Override
	public void Operacao() {
		while (true) {
			if (getA() > getB()) {
				System.out.println("Quanto é " + getA() + " / " + getB());
				System.out.println("Qtd vidas: " + getVida());
				setResposta();
				setResultado(getA() / getB());
				setA(numero.nextInt(10));
				setB(numero.nextInt(10));
				check();

			} else {
				if (getA() < getB()) {
					System.out.println("Quanto é " + getA() + " x " + getB());
					System.out.println("Qtd vidas: " + getVida());
					setResposta();
					setResultado(getA() * getB());
					setA(numero.nextInt(10));
					setB(numero.nextInt(10));
					check();
				}
			}
			if (perdeu()) {
				break;
			}
			if(getPontucao() == 2 && getVida().size() > 0) {
				break;
			}
		}

	}



}
