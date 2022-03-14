package portoSeguroODS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class TelaCongragulations extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		
		JLabel vidas = new JLabel("Pontos: "+ QuizMatematica.getPontuacao());
		vidas.setForeground(Color.WHITE);
		vidas.setFont(new Font("Arial Black", Font.PLAIN, 16));
		vidas.setBounds(10, 38, 107, 19);
		contentPane.add(vidas);
		
		JLabel pontos = new JLabel("Vidas: "+ QuizMatematica.getVida());
		pontos.setForeground(Color.WHITE);
		pontos.setFont(new Font("Arial Black", Font.PLAIN, 16));
		pontos.setBounds(346, 34, 128, 23);
		contentPane.add(pontos);
		
		JLabel fundoWin = new JLabel("New label");
		fundoWin.setIcon(new ImageIcon("C:\\workspace-eclipse\\workspace\\ProejtoQuiz\\img\\congragulations.gif"));
		fundoWin.setBounds(0, 0, 634, 280);
		contentPane.add(fundoWin);
	}

}
