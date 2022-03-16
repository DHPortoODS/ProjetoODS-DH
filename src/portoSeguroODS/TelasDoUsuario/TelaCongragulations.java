package portoSeguroODS.TelasDoUsuario;

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

import portoSeguroODS.QuizMatematica;

public class TelaCongragulations extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public TelaCongragulations() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botaoSair = new JButton("Sair");
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		botaoSair.setBounds(314, 237, 89, 23);
		contentPane.add(botaoSair);
		
		JButton botaoJogarNovamente = new JButton("Jogar");
		botaoJogarNovamente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				QuizMatematica.perguntaNome();
			}
		});
		botaoJogarNovamente.setBounds(83, 237, 89, 23);
		contentPane.add(botaoJogarNovamente);
		
		JLabel vidas = new JLabel("Pontos: "+ QuizMatematica.getPontuacao());
		vidas.setForeground(Color.WHITE);
		vidas.setFont(new Font("Arial Black", Font.PLAIN, 16));
		vidas.setBounds(10, 38, 107, 19);
		contentPane.add(vidas);
		
		JLabel pontos = new JLabel("Vidas: "+ QuizMatematica.getVida());
		pontos.setForeground(Color.RED);
		pontos.setFont(new Font("Arial Black", Font.PLAIN, 16));
		pontos.setBounds(346, 34, 128, 23);
		contentPane.add(pontos);
		
		JLabel fundoWin = new JLabel("New label");
		fundoWin.setIcon(new ImageIcon("C:\\workspace-eclipse\\workspace\\ProejtoQuiz\\img\\congratulations.gif"));
		fundoWin.setBounds(0, 0, 634, 280);
		contentPane.add(fundoWin);
	}
}
