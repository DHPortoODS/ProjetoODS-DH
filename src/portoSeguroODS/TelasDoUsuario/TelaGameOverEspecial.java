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

public class TelaGameOverEspecial extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaGameOverEspecial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botaoBasico = new JButton("Básico");
		botaoBasico.setFont(new Font("Arial", Font.PLAIN, 11));
		botaoBasico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaLinkBasico().setVisible(true);
			}
		});
		
		JLabel pontos = new JLabel("Pontuação: "+ QuizMatematica.getPontuacao());
		pontos.setFont(new Font("Arial Black", Font.PLAIN, 16));
		pontos.setForeground(Color.WHITE);
		pontos.setBounds(10, 11, 141, 23);
		contentPane.add(pontos);
		botaoBasico.setBounds(10, 215, 89, 23);
		contentPane.add(botaoBasico);
		
		JButton botaoIntermediario = new JButton("Intermediário");
		botaoIntermediario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaLinkIntermediario().setVisible(true);
			}
		});
		botaoIntermediario.setFont(new Font("Arial", Font.PLAIN, 11));
		botaoIntermediario.setBounds(178, 215, 113, 23);
		contentPane.add(botaoIntermediario);
		
		JButton botaoAvancado = new JButton("Avançado");
		botaoAvancado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaLinkAvancado().setVisible(true);
			}
		});
		botaoAvancado.setFont(new Font("Arial", Font.PLAIN, 11));
		botaoAvancado.setBounds(365, 215, 89, 23);
		contentPane.add(botaoAvancado);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kevim\\eclipse-workspace\\portoSeguroODS\\img\\fimEspecial.png"));
		lblNewLabel.setBounds(0, 0, 480, 261);
		contentPane.add(lblNewLabel);
	}

}
