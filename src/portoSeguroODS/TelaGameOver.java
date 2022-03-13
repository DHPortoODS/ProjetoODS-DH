package portoSeguroODS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;

public class TelaGameOver extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

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
		
		QuizMatematica.setPontuacao(9);
		JLabel pontos = new JLabel("Pontos: "+QuizMatematica.getPontuacao());
		pontos.setFont(new Font("Arial Black", Font.PLAIN, 16));
		pontos.setForeground(Color.WHITE);
		pontos.setBounds(195, 29, 84, 14);
		contentPane.add(pontos);
		
		JLabel fundoGameOver = new JLabel();
		fundoGameOver.setBounds(0, 0, 480, 270);
		fundoGameOver.setIcon(new ImageIcon("C:\\workspace-eclipse\\workspace\\ProejtoQuiz\\img\\gameOver.gif"));
		contentPane.add(fundoGameOver);
		FundoGameOver.setLayout(new BorderLayout(0, 0));
	}
}
