package portoSeguroODS.TelasDoUsuario;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import portoSeguroODS.MenuQuiz;

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
				MenuQuiz menu = new MenuQuiz();
				menu.executarMenu();
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
