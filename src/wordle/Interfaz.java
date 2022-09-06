package wordle;

import java.awt.EventQueue;

import javax.naming.LimitExceededException;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;

public class Interfaz {

	private JFrame frame;
	private JTextField letra1;
	private JTextField letra2;
	private JTextField letra3;
	private JTextField letra4;
	private JTextField letra5;
	private JButton botonJugar;
	private Aplicacion aplicacion;
	private Ganar ganar;
	private Perder perder;
	private JTextField textField;
	private int indicePosicionYDeLetras;
	private int intentos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		indicePosicionYDeLetras = 10;
		intentos = 0;
		aplicacion = new Aplicacion();
		ganar = new Ganar(aplicacion.getPalabra());
		perder = new Perder(aplicacion.getPalabra());
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		generarJTextFieldLetras(indicePosicionYDeLetras);

		botonJugar = new JButton("JUGAR");
		botonJugar.setBackground(new Color(153, 255, 204));

		botonJugar.setForeground(new Color(0, 0, 0));
		botonJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (letra1.getText().length() == 1 && letra2.getText().length() == 1 && letra3.getText().length() == 1
						&& letra4.getText().length() == 1 && letra5.getText().length() == 1) {
					ColorLetra[] resultado = aplicacion.verificar(letra1.getText(), letra2.getText(), letra3.getText(),
							letra4.getText(), letra5.getText());
					cambiarColores(resultado);
					intentos += 1;
					if (aplicacion.getGano()) {
						// termina el juego
						botonJugar.setEnabled(false);
						ganar.setVisible(true);

					} else if (intentos == 6) {
						botonJugar.setEnabled(false);
						perder.setVisible(true);
							
					} else {
						indicePosicionYDeLetras += 55;
						generarJTextFieldLetras(indicePosicionYDeLetras);
						letra1.requestFocus();
					}
				}
			}
		});
		botonJugar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		botonJugar.setBounds(102, 406, 253, 45);
		frame.getContentPane().add(botonJugar);

	}

	private void cambiarColores(ColorLetra[] resultado) {
		letra1.setBackground(GetColor(resultado[0]));
		letra2.setBackground(GetColor(resultado[1]));
		letra3.setBackground(GetColor(resultado[2]));
		letra4.setBackground(GetColor(resultado[3]));
		letra5.setBackground(GetColor(resultado[4]));
	}

	public Color GetColor(ColorLetra colorLetra) {
		if (colorLetra.equals(ColorLetra.GRIS)) {
			return new Color(204, 204, 204);
		} else if (colorLetra.equals(ColorLetra.AMARILLO)) {
			return new Color(255, 255, 153);
		} else {
			return new Color(153, 255, 153);
		}
	}

	private void generarJTextFieldLetras(int y) {
		letra1 = new JTextField();
		letra1.setForeground(Color.BLACK);
		letra1.setBackground(Color.WHITE);
		letra1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				if ((int) e.getKeyChar() < 123 && (int) e.getKeyChar() > 96
						|| (int) e.getKeyChar() < 91 && (int) e.getKeyChar() > 64) {
					letra1.setText(String.valueOf(e.getKeyChar()).toUpperCase());
					letra2.requestFocus();
					letra1.setEnabled(false);
					letra1.setDisabledTextColor(Color.BLACK);
				} else {
					e.consume();
				}
			}
		});
		letra1.setHorizontalAlignment(SwingConstants.CENTER);
		letra1.setColumns(10);
		letra1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		letra1.setBounds(102, y, 45, 45);

		frame.getContentPane().add(letra1);

		letra2 = new JTextField();
		letra2.setForeground(Color.BLACK);
		letra2.setBackground(Color.WHITE);
		letra2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				if ((int) e.getKeyChar() < 123 && (int) e.getKeyChar() > 96
						|| (int) e.getKeyChar() < 91 && (int) e.getKeyChar() > 64) {
					letra2.setText(String.valueOf(e.getKeyChar()).toUpperCase());
					letra3.requestFocus();
					letra2.setEnabled(false);
					letra2.setDisabledTextColor(Color.BLACK);
				} else {
					e.consume();
				}
			}
		});
		letra2.setHorizontalAlignment(SwingConstants.CENTER);
		letra2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		letra2.setColumns(10);
		letra2.setBounds(154, y, 45, 45);
		frame.getContentPane().add(letra2);

		letra3 = new JTextField();
		letra3.setForeground(Color.BLACK);
		letra3.setBackground(Color.WHITE);
		letra3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				if ((int) e.getKeyChar() < 123 && (int) e.getKeyChar() > 96
						|| (int) e.getKeyChar() < 91 && (int) e.getKeyChar() > 64) {
					letra3.setText(String.valueOf(e.getKeyChar()).toUpperCase());
					letra4.requestFocus();
					letra3.setEnabled(false);
					letra3.setDisabledTextColor(Color.BLACK);
				} else {
					e.consume();
				}

			}
		});

		letra3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		letra3.setHorizontalAlignment(SwingConstants.CENTER);
		letra3.setColumns(10);
		letra3.setBounds(206, y, 45, 45);
		frame.getContentPane().add(letra3);

		letra4 = new JTextField();
		letra4.setForeground(Color.BLACK);
		letra4.setBackground(Color.WHITE);
		letra4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				if ((int) e.getKeyChar() < 123 && (int) e.getKeyChar() > 96
						|| (int) e.getKeyChar() < 91 && (int) e.getKeyChar() > 64) {
					letra4.setText(String.valueOf(e.getKeyChar()).toUpperCase());
					letra5.requestFocus();
					letra4.setEnabled(false);
					letra4.setDisabledTextColor(Color.BLACK);
				} else {
					e.consume();
				}
			}
		});
		letra4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		letra4.setHorizontalAlignment(SwingConstants.CENTER);
		letra4.setColumns(10);
		letra4.setBounds(258, y, 45, 45);
		frame.getContentPane().add(letra4);

		letra5 = new JTextField();
		letra5.setForeground(Color.BLACK);
		letra5.setBackground(Color.WHITE);
		letra5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				if ((int) e.getKeyChar() < 123 && (int) e.getKeyChar() > 96
						|| (int) e.getKeyChar() < 91 && (int) e.getKeyChar() > 64) {
					letra5.setText(String.valueOf(e.getKeyChar()).toUpperCase());

					letra5.setEnabled(false);
					letra5.setDisabledTextColor(Color.BLACK);
				} else {
					e.consume();
				}
			}
		});
		letra5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		letra5.setHorizontalAlignment(SwingConstants.CENTER);
		letra5.setColumns(10);
		letra5.setBounds(310, y, 45, 45);
		frame.getContentPane().add(letra5);
		frame.revalidate();
		frame.repaint();
	}
}
