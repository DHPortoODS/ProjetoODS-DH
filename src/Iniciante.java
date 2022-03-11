
public class Iniciante extends QuizMatematica implements Situacao {

	public Iniciante() {
		super();
	}

	@Override
	public void PerguntaInicial() {
		System.out.println("Qual é o resultado desta operação");
		Operacao();

	}

	@Override
	public void check() {
		if (getResposta() == getResultado()) {
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
				System.out.println("Quanto é " + getA() + " - " + getB());
				System.out.println("Qtd vidas: " + getVida());
				setResposta();
				setResultado(getA() - getB());
				setA(numero.nextInt(10)+1);
				setB(numero.nextInt(10)+1);
				check();

			} else {
				if (getA() < getB()) {
					System.out.println("Quanto é " + getA() + " + " + getB());
					System.out.println("Qtd vidas: " + getVida());
					setResposta();
					setResultado(getA() + getB());
					setA(numero.nextInt(10)+1);
					setB(numero.nextInt(10)+1);
					check();
				}
			}
			if (perdeu()) {
				break;
			}
			if (getPontucao() == 3 && getVida().size() > 0) {
				getPontucao();
				break;
			}
		}
	}

}
