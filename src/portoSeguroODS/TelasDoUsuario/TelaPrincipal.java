package portoSeguroODS.TelasDoUsuario;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import portoSeguroODS.Calculo;
import portoSeguroODS.Especial;
import portoSeguroODS.QuizMatematica;
import portoSeguroODS.Avancado.Avancado;
import portoSeguroODS.Avancado.Exponenciacao;
import portoSeguroODS.Avancado.Raiz;
import portoSeguroODS.Basico.Adicao;
import portoSeguroODS.Basico.Basico;
import portoSeguroODS.Basico.Subtracao;
import portoSeguroODS.Intermediario.Divisao;
import portoSeguroODS.Intermediario.Intermediario;
import portoSeguroODS.Intermediario.Multiplicacao;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {

		Canvas canvas = new Canvas();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(428, 5, 1, 251);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel jpngFundo = new JPanel();
		jpngFundo.setBounds(0, 0, 434, 261);
		contentPane.add(jpngFundo);
		jpngFundo.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(98, 103, 46, 14);
		jpngFundo.add(canvas);
		canvas.setLayout(null);

		txtNome = new JTextField();
		txtNome.setBounds(182, 135, 170, 20);
		canvas.add(txtNome);
		txtNome.setColumns(10);

		JLabel tituloNome = new JLabel("INSIRA SEU NOME:");
		tituloNome.setFont(new Font("Arial Black", Font.PLAIN, 12));
		tituloNome.setBounds(182, 104, 170, 20);
		canvas.add(tituloNome);

		JButton buttonEntrar = new JButton("ENTRAR");
		buttonEntrar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Bem vindo: " + txtNome.getText());
				dispose();

				Scanner scanner = new Scanner(System.in);
				System.out.println("Olá, escolha qual opção você quer: " + "\n1 - Calculadora"
						+ "\n2 - Testar os conhecimentos com um Quiz");
				int opcao = scanner.nextInt();

				do {
					switch (opcao) {
					case 1:
						System.out.println("\nO que você deseja fazer na calculadora: " + "\n1 - Adição"
								+ "\n2 - Subtração" + "\n3 - Multiplicação" + "\n4 - Divisão" + "\n5 - Exponenciação"
								+ "\n6 - Raíz quadrada" + "\n0 - Para sair");

						int opcao2 = scanner.nextInt();

						while (opcao2 != 0) {
							switch (opcao2) {
							case 0:
								break;
							case 1:
								Calculo adicao = new Adicao();
								adicao.execCalculadora();
								break;
							case 2:
								Calculo subtracao = new Subtracao();
								subtracao.execCalculadora();
								break;
							case 3:
								Calculo multi = new Multiplicacao();
								multi.execCalculadora();
								break;
							case 4:
								Calculo divisao = new Divisao();
								divisao.execCalculadora();
								break;
							case 5:
								Calculo exp = new Exponenciacao();
								exp.execCalculadora();
								break;
							case 6:
								Calculo raiz = new Raiz();
								raiz.execCalculadora();
								break;
							}
							
						}

						if (opcao2 == 0) {
							System.out.println("\nDeseja testar o nosso quiz? (S/N)");
							char opcao3 = scanner.next().charAt(0);
							switch (opcao3) {
							case 'S', 's':
								break;
							case 'N', 'n':
								System.out.println("\nObrigado por testar nosso programa!");
								System.exit(0);
							}
						}

					case 2:
						Basico basico = new Basico();
						basico.fazerQuiz();

						if (QuizMatematica.getPontuacao() == 3) {
							System.out.println("\nParabéns, você avançou para a próxima etapa!"
									+ "\nAgora as perguntas são de nível Intermediário!");
						}
						Intermediario intermediario = new Intermediario();
						intermediario.fazerQuiz();

						if (QuizMatematica.getPontuacao() == 6) {
							System.out.println("\nParabéns, você avançou para a próxima etapa!"
									+ "\nAgora as perguntas são de nível Avançado!");
						}
						Avancado avancado = new Avancado();
						avancado.fazerQuiz();

						if (QuizMatematica.getPontuacao() == 9) {
							System.out.println("\nParabéns, você avançou para última etapa!"
									+ "\nResponda a esta pergunta especial!");
						}
						Especial especial = new Especial();
						especial.fazerQuiz();

						opcao = 0;
					case 0:
						break;
					}
				} while (opcao != 0);
			}
		});
		buttonEntrar.setBounds(222, 168, 89, 23);
		canvas.add(buttonEntrar);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
}
