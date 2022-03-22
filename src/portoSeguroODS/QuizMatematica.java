package portoSeguroODS;

import java.awt.EventQueue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import portoSeguroODS.TelasDoUsuario.TelaCongragulations;
import portoSeguroODS.TelasDoUsuario.TelaGameOver;
import portoSeguroODS.TelasDoUsuario.TelaGameOverEspecial;
import portoSeguroODS.TelasDoUsuario.TelaPrincipal;

public class QuizMatematica {

	// Atributos Quiz
	private int a;
	private int b;
	private int c;
	private int d;
	private int respostaCorreta;
	private int respostaDoUsuario;
	private static int pontuacao = 0;
	private static ArrayList<String> vida = new ArrayList<>(Arrays.asList("♥", "♥", "♥"));

	// Atributos Calculadora

	protected BigDecimal cA;
	protected BigDecimal cB;
	protected BigDecimal respostaCorretaCalculadora;

	protected Random geradorDeNumeros = new Random();
	protected Scanner scanner = new Scanner(System.in);

	// Construtor

	public QuizMatematica() {
	}

	// Inicio - Getters e Setters Quiz

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
		// Inicio - Tratamento de dados do usuário
		do {
			try {
				this.respostaDoUsuario = (int) scanner.nextDouble();

				continua = false;

			} catch (InputMismatchException erro1) {
				System.err.println("Não é permitido inserir letras, informe apenas números!");
				scanner.nextLine(); // descarta a entrada errada do usuário
			}

		} while (continua);
		// Fim - Tratamento de dados do usúario
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

	// Getters e Setter Calculadora

	public BigDecimal getcA() {
		return cA;
	}

	public void setcA(BigDecimal cA) {
		boolean continua = true;

		// Inicio - Tratamento de dados do usuário
		do {
			try {
				this.cA = scanner.nextBigDecimal();

				continua = false;

			} catch (InputMismatchException erro1) {
				System.err.println("Não é permitido inserir letras, informe apenas números!");
				scanner.nextLine(); // descarta a entrada errada do usuário
			}

		} while (continua);
		// Fim - Tratamento de dados do usuário
	}

	public BigDecimal getcB() {
		return cB;
	}

	public void setcB(BigDecimal cB) {
		boolean continua = true;
		// Inicio - Tratamento de dados do usuário
		do {
			try {
				this.cB = scanner.nextBigDecimal();

				continua = false;

			} catch (InputMismatchException erro1) {
				System.err.println("Não é permitido inserir letras, informe apenas números!");
				scanner.nextLine(); // descarta a entrada errada do usuário
			}

		} while (continua);
		// Fim - Tratamento de dados do usuário
	}

	public BigDecimal getRespostaCorretaCalculadora() {
		return respostaCorretaCalculadora;
	}

	public void setRespostaCorretaCalculadora(BigDecimal respostaCorretaCalculadora) {
		this.respostaCorretaCalculadora = respostaCorretaCalculadora;
	}
	// Fim - Getters e Setters Quiz

	// Inicio - Métodos da classe mãe

	// Abre a interface para perguntar o nome do usuário
	public static void perguntaNome() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();

					// centralizar janela na tela
					frame.setLocationRelativeTo(null);
					// aparece janela
					frame.setVisible(true);
				} catch (Exception e) {
					// Interrompe a execução da API caso de problemas
					e.printStackTrace();
				}
			}
		});
	}

	// Remove vidas -1
	public void removeVidas() {
		getVida().remove(getVida().size() - 1);
	}

	// Abre a Interface de Game Over quando o usuario perder todas as vidas
	public boolean perdeu() {
		// Tratamento quando as vidas chegarem a 0.
		if (getVida().size() == 0) {

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

	// Abre a Interface Parabens quando o usuario acertar todas as questões
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

	// Abre a Interface Perdeu Especial para o usuario atingir 9 pontos
	public boolean perdeuEspecial() {
		// Tratamento quando as vidas chegarem 0
		if (getVida().size() == 0) {
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

	// Mostra a pontuação do usuario
	public void mostreAPontuacao() {
		System.out.println("\nSua pontuação é: " + getPontuacao() + "\n");
	}

	// Fim - Método classe mãe

}
