
public class Avançado extends QuizMatematica implements Situacao {

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
			if (getC() > getD()) {
				System.out.println("Quanto é a potência de " + (int) getC() + " ao quadrado. ");
				System.out.println("Qtd vidas: " + getVida());
				setResposta();
				setResultado((int) Math.pow((int) getC(), 2));
				setC(numero.nextDouble((int) 10));
				setD(numero.nextDouble((int) 10));
				check();

			} else {
				if (getC() < getD()) {
					System.out.println("Quanto é a raiz quadrada de " + (int) getD());
					System.out.println("Qtd vidas: " + getVida());
					setResposta();
					setResultado((int) Math.sqrt((int) getD()));
					setC(numero.nextDouble((int) 10));
					setD(numero.nextDouble((int) 10));
					check();
				}
			}
			if (perdeu()) {
				break;
			}
		}
	}
}
