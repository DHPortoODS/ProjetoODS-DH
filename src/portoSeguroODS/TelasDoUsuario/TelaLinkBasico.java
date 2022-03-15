package portoSeguroODS.TelasDoUsuario;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaLinkBasico extends JFrame {
	// private JLabel hyperlink = new JLabel(text);
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaLinkBasico() throws HeadlessException {
		super();
		setTitle("LinkDemo");

		// Dimensionamento da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Centraliza��o da janela
		setLocationRelativeTo(null);

		// texto da label = link1
		String text1 = "Video sobre Soma e Subtração";
		String text2 = "Conteudo para leitura sobre operações basicas";

		// Objeto links criado com text armazenado
		JLabel link1 = new JLabel(text1);
		JLabel link2 = new JLabel(text2);

		// Posicionamento da caixa label
		link1.setBounds(75, 29, 226, 36);
		link2.setBounds(73, 76, 273, 27);

		// Adicionando o conteudo do link
		contentPane.add(link1);
		contentPane.add(link2);

		// Personaliza��o do links apresentando na cor azul
		link1.setForeground(Color.BLUE.darker());
		link1.setCursor(new Cursor(Cursor.HAND_CURSOR));

		link2.setForeground(Color.BLUE.darker());
		link2.setCursor(new Cursor(Cursor.HAND_CURSOR));

		JButton botaoSair = new JButton("Sair");
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Comando encerra toda a aplica��o
				//System.exit(0);
				dispose();
			}
		});

		// Deslocamento e dimensionamento do bot�o
		botaoSair.setBounds(153, 127, 89, 23);
		contentPane.add(botaoSair);

		JLabel nomeLink1 = new JLabel("Link 1:");
		nomeLink1.setBounds(9, 40, 46, 14);
		contentPane.add(nomeLink1);

		JLabel nomeLink2 = new JLabel("Link 2:");
		nomeLink2.setBounds(9, 82, 39, 14);
		contentPane.add(nomeLink2);

		// Evento para acesso link1
		link1.addMouseListener(new MouseAdapter() {

			// Evento de clique mouse permite acesso ao link
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(
							new URI("https://www.youtube.com/watch?v=AUzyuZdg68Y&ab_channel=ProfessoraAlineSantana"));
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

			// Mouse quando n�o estiver por cima do link, o sublinhado some
			@Override
			public void mouseExited(MouseEvent e) {
				link1.setText(text1);
			}

			// Mouse passa por cima o texto fica sublinhado hyperlink
			@Override
			public void mouseEntered(MouseEvent e) {
				link1.setText("<html><a href=''>" + text1 + "</a></html>");
			}
		});

		// Evento para acesso link2
		link2.addMouseListener(new MouseAdapter() {
			// Evento de clique mouse permite acesso ao link
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI(
							"https://trilhante.com.br/curso/operacoes-basicas/aula/operacoes-basicas-adicao-subtracao-multiplicacao-e-divisao#:~:text=A%20ADI%C3%87%C3%83O%20pode%20ser%20entendida,somado%20com%20um%20n%C3%BAmero%20POSITIVO."));
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

			// Mouse quando n�o estiver por cima do link, o sublinhado some
			@Override
			public void mouseExited(MouseEvent e) {
				link2.setText(text2);
			}

			// Mouse passa por cima o texto fica sublinhado
			@Override
			public void mouseEntered(MouseEvent e) {
				link2.setText("<html><a href=''>" + text2 + "</a></html>");
			}
		});

	}

}
