package portoSeguroODS;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ClasseTeste {

	public static void main(String[] args) {
		Basico basico = new Basico();
		Intermediario intermediario = new Intermediario();
		Avancado avancado = new Avancado();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}		
			}
		});

		basico.fazPergunta();
		if (QuizMatematica.getVida().size() > 0) {
			intermediario.fazPergunta();
		}
		if (QuizMatematica.getVida().size() > 0) {
			avancado.fazPergunta();
		} else {
			System.out.println("Acabou");
		}
	}

}
