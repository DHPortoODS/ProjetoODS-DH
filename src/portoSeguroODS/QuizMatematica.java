package portoSeguroODS;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import portoSeguroODS.TelasDoUsuario.TelaCongragulations;
import portoSeguroODS.TelasDoUsuario.TelaGameOver;
import portoSeguroODS.TelasDoUsuario.TelaGameOverEspecial;
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

	protected Random geradorDeNumeros = new Random();
	Scanner scanner = new Scanner(System.in);

	// Construtor

	public QuizMatematica() {

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
		this.respostaDoUsuario = (int) scanner.nextDouble();
		/*
		 * Utilização do Scanner na resposta do usuário. A resposta muitas vezes poderá
		 * ter casas decimais, então o scanner lê o valor em double e faz o cast
		 * (converte) para o tipo inteiro
		 */
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

					// centralizar janela na tela
					frame.setLocationRelativeTo(null);
					// aparece janela
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
						// Centraliza janela
						frame.setLocationRelativeTo(null);
						// Aparece janala
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
					// Apresenta janela
					frame.setVisible(true);

					// centralizar janela na tela
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public boolean perdeuEspecial() {
		if (getVida().size() == 0) {

			// Abre a Interface de Game Over
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						TelaGameOverEspecial frame = new TelaGameOverEspecial();
						// Centraliza janela
						frame.setLocationRelativeTo(null);
						// Aparece janala
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

	public void mostreAPontuacao() {
		System.out.println("\nSua pontuação é: " + getPontuacao() + "\n");
	}

}
