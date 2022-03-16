package portoSeguroODS.TelasDoUsuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import portoSeguroODS.Principal;
import portoSeguroODS.QuizMatematica;

public class TelaGameOver extends JFrame {

	private Principal principal;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaGameOver() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel FundoGameOver = new JPanel();
		FundoGameOver.setBounds(0, 0, 450, 261);
		contentPane.setLayout(null);

		JButton botaoSair = new JButton("Sair");
		botaoSair.setBackground(Color.LIGHT_GRAY);

		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == botaoSair) {

					System.exit(0);
				}
				// Fecha apenas essa janela sem interromper toda a execução

			}
		});

		// Botão link estudo
		JButton link = new JButton("Link Estudo");
		link.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// fecha janela atual
				dispose();

				// passa para a janela de link de acordo com a pontuação
				if (QuizMatematica.getPontuacao() < 3) {
					new TelaLinkBasico().setVisible(true);
				} else if (QuizMatematica.getPontuacao() >= 3 && QuizMatematica.getPontuacao() < 6) {
					new TelaLinkIntermediario().setVisible(true);
				} else if (QuizMatematica.getPontuacao() >= 6 && QuizMatematica.getPontuacao() < 9) {
					new TelaLinkAvancado().setVisible(true);
				}
				;
			}
		});
		link.setBounds(272, 227, 134, 23);
		contentPane.add(link);
		botaoSair.setBounds(96, 227, 89, 23);
		contentPane.add(botaoSair);

		JLabel pontos = new JLabel("Pontos: " + QuizMatematica.getPontuacao());
		pontos.setFont(new Font("Arial Black", Font.PLAIN, 16));
		pontos.setForeground(Color.WHITE);
		pontos.setBounds(195, 29, 84, 14);
		contentPane.add(pontos);

		JLabel fundoGameOver = new JLabel();
		fundoGameOver.setBounds(0, -10, 480, 270);
		fundoGameOver.setIcon(new ImageIcon("C:\\workspace-eclipse\\workspace\\ProejtoQuiz\\img\\gameOver.gif"));
		contentPane.add(fundoGameOver);
		FundoGameOver.setLayout(new BorderLayout(0, 0));
	}
}
