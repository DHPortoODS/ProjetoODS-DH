package portoSeguroODS.TelasDoUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import portoSeguroODS.QuizMatematica;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JButton botaoSair = new JButton("Sair");
		botaoSair.setBackground(Color.LIGHT_GRAY);
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botaoSair.setBounds(195, 227, 89, 23);
		contentPane.add(botaoSair);
		JLabel pontos = new JLabel("Pontos: "+QuizMatematica.getPontuacao());
		pontos.setFont(new Font("Arial Black", Font.PLAIN, 16));
		pontos.setForeground(Color.WHITE);
		pontos.setBounds(195, 29, 100, 14);
		contentPane.add(pontos);
		
		JLabel fundoGameOver = new JLabel();
		fundoGameOver.setBounds(0, -10, 480, 270);
		fundoGameOver.setIcon(new ImageIcon("C:\\Users\\Kevim\\eclipse-workspace\\portoSeguroODS\\img\\gameOver.gif"));
		contentPane.add(fundoGameOver);
		FundoGameOver.setLayout(new BorderLayout(0, 0));
	}
}
