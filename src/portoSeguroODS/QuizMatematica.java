package portoSeguroODS;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import portoSeguroODS.TelasDoUsuario.TelaCongragulations;
import portoSeguroODS.TelasDoUsuario.TelaGameOver;
import portoSeguroODS.TelasDoUsuario.TelaPrincipal;

public class QuizMatematica {

	// Atributos
	private int a;
	private int b;
	private int c;
	private int d;
	private int respostaCorreta;
	private int respostaDoUsuario;
	private static int pontuacao = 0;
	private static ArrayList<String> vida = new ArrayList<>(Arrays.asList("♥", "♥", "♥"));

	Random geradorDeNumeros = new Random();
	Scanner scanner = new Scanner(System.in);

	// Construtor

	public QuizMatematica() {
		this.a = geradorDeNumeros.nextInt(10);
		this.b = geradorDeNumeros.nextInt(10);
		this.c = geradorDeNumeros.nextInt(10);
		this.d = geradorDeNumeros.nextInt(10);
	}

	// Getters e Setters

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(int respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}

	public int getRespostaDoUsuario() {
		return respostaDoUsuario;
	}

	public void setRespostaDoUsuario(int respostaDoUsuario) {
	    boolean continua = true;
	    
	    do{
	      try{
	        this.respostaDoUsuario = (int) scanner.nextDouble();

	        continua = false;

	      }catch (InputMismatchException erro1) {
	        System.err.println("Não é permitido inserir letras, informe apenas números!");
	        scanner.nextLine(); //descarta a entrada errada do usuário
	      }
		    
	    }while(continua);
		
	  }

	public static int getPontuacao() {
		return pontuacao;
	}

	public static void setPontuacao(int pontuacao) {
		QuizMatematica.pontuacao += pontuacao;
	}

	public static ArrayList<String> getVida() {
		return vida;
	}

	public static void setVida(ArrayList<String> vida) {
		QuizMatematica.vida = vida;

	}

	// Métodos da classe mãe

	public static void perguntaNome() {
		// Abre a interface para perguntar o nome
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
	}
	
	public void removeVidas() {
		getVida().remove(getVida().size() - 1);
	}

	public boolean perdeu() {
		if (getVida().size() == 0) {

			// Abre a Interface de Game Over
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						TelaGameOver frame = new TelaGameOver();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			return true;
		} else {
			return false;
		}
	}

	public static void parabens() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCongragulations frame = new TelaCongragulations();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// Função para quando perder 3 vezes no módulo básico
	public boolean perdeuBasico() {
		if (getVida().size() == 0) {
			System.out.println("Pontuação: " + getPontuacao());
			System.out.println("\n Você precisa estudar mais."
					+ "\n Sugerimos estes links:"
					+ "\n https://www.youtube.com/watch?v=AUzyuZdg68Y&ab_channel=ProfessoraAlineSantana"
					+ "\n https://trilhante.com.br/curso/operacoes-basicas/aula/operacoes-basicas-adicao-subtracao-multiplicacao-e-divisao#:~:text=A%20ADI%C3%87%C3%83O%20pode%20ser%20entendida,somado%20com%20um%20n%C3%BAmero%20POSITIVO.");
			return true;
		} else {
			return false;
		}

	}

	// Função para quando perder 3 vezes no módulo Intermediário
	public boolean perdeuIntermediario() {
		if (getVida().size() == 0) {
			System.out.println("Pontuação: " + getPontuacao());
			System.out.println("\n Você precisa estudar mais." 
					+ "\n Sugerimos estes links:" 
					+ "\n https://www.youtube.com/watch?v=GsHAXCgbhm4&ab_channel=Matem%C3%A1ticaF%C3%A1cil"
					+ "\n https://mundoeducacao.uol.com.br/matematica/multiplicacao.htm" 
					+ "\n https://brasilescola.uol.com.br/matematica/divisao.htm");
			return true;
		} else {
			return false;
		}

	}

	// Função para quando perder 3 vezes no módulo Avançado
	public boolean perdeuAvancado() {
		if (getVida().size() == 0) {
			System.out.println("Pontuação: " + getPontuacao());
			System.out.println("\nVocê precisa estudar mais."
					+ "\nSugerimos estes links: " 
					+ "\n https://www.youtube.com/watch?v=P1HdAS_nBHE"
					+ "\n https://www.todamateria.com.br/potenciacao-e-radiciacao/");
			return true;
		} else {
			return false;
		}
	}

	public void mostreAPontuacao() {
		System.out.println("\nSua pontuação é: " + getPontuacao() + "\n");
	}

}
