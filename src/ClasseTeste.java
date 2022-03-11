package portoSeguroODS;

public class ClasseTeste {

	public static void main(String[] args) {

		/*for(int i = 0; i < 10; i++) {
		Basico testeBasico = new Basico();
		testeBasico.fazPergunta();
		testeBasico.checaResposta();
		testeBasico.mostreAPontuacao();
	}*/
		/* A criação do objeto ficou dentro do loop para que ele instancie o objeto com números aleatórios, 
		 * do contrário ele iria instanciar um objeto com os mesmos valores em todas as perguntas
		 */
		
		for(int i = 0; i < 10; i++) {
			Intermediario testeInt = new Intermediario();
			testeInt.fazPergunta();
			testeInt.mostreAPontuacao();
			
		}
	}

}
