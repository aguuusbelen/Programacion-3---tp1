package wordle;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Perder extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Perder dialog = new Perder("");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Perder(String palabra) {
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblGanaste = new JLabel("PERDISTE :(");
			lblGanaste.setBackground(new Color(0, 0, 0));
			lblGanaste.setHorizontalAlignment(SwingConstants.CENTER);
			lblGanaste.setFont(new Font("Tahoma", Font.PLAIN, 34));
			lblGanaste.setBounds(61, 24, 264, 68);
			contentPanel.add(lblGanaste);
		}
		{
			JButton btnNewButton = new JButton("JUGAR DE NUEVO");
			btnNewButton.setBackground(new Color(153, 255, 204));
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton.setBounds(61, 151, 264, 52);
			contentPanel.add(btnNewButton);
		}
		{
			JLabel lblNewLabel = new JLabel("La palabra era: " + palabra);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel.setBounds(61, 92, 264, 29);
			contentPanel.add(lblNewLabel);
		}
	}

}
