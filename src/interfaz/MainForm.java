package interfaz;

import java.awt.EventQueue;

import javax.naming.LimitExceededException;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
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

public class MainForm {

	private JFrame frame;
	private JTextField letra1;
	private JTextField letra2;
	private JTextField letra3;
	private JTextField letra4;
	private JTextField letra5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
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
	public MainForm() {
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

		letra1 = new JTextField();
		letra1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if ((int) e.getKeyChar() < 123 && (int) e.getKeyChar() > 96  || (int) e.getKeyChar() < 91 && (int) e.getKeyChar() > 64 ) {
					letra1.setText(String.valueOf(e.getKeyChar()).toUpperCase());
					letra2.requestFocus();
					letra1.setEnabled(false);
				} else {
					e.consume();
				}
			}
		});
		letra1.setHorizontalAlignment(SwingConstants.CENTER);
		letra1.setColumns(10);
		letra1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		letra1.setBounds(103, 51, 45, 45);

		frame.getContentPane().add(letra1);

		letra2 = new JTextField();
		letra2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if ((int) e.getKeyChar() < 123 && (int) e.getKeyChar() > 96 || (int) e.getKeyChar() < 91 && (int) e.getKeyChar() > 64) {
					letra2.setText(String.valueOf(e.getKeyChar()).toUpperCase());
					letra3.requestFocus();
					letra2.setEnabled(false);
				} else {
					e.consume();
				}
			}
		});
		letra2.setHorizontalAlignment(SwingConstants.CENTER);
		letra2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		letra2.setColumns(10);
		letra2.setBounds(155, 51, 45, 45);
		frame.getContentPane().add(letra2);

		letra3 = new JTextField();
		letra3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if ((int) e.getKeyChar() < 123 && (int) e.getKeyChar() > 96 || (int) e.getKeyChar() < 91 && (int) e.getKeyChar() > 64) {
					letra3.setText(String.valueOf(e.getKeyChar()).toUpperCase());
					letra4.requestFocus();
					letra3.setEnabled(false);
				} else {
					e.consume();
				}

			}
		});

		letra3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		letra3.setHorizontalAlignment(SwingConstants.CENTER);
		letra3.setColumns(10);
		letra3.setBounds(207, 51, 45, 45);
		frame.getContentPane().add(letra3);

		letra4 = new JTextField();
		letra4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if ((int) e.getKeyChar() < 123 && (int) e.getKeyChar() > 96 || (int) e.getKeyChar() < 91 && (int) e.getKeyChar() > 64) {
					letra4.setText(String.valueOf(e.getKeyChar()).toUpperCase());
					letra5.requestFocus();
					letra4.setEnabled(false);
				} else {
					e.consume();
				}
			}
		});
		letra4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		letra4.setHorizontalAlignment(SwingConstants.CENTER);
		letra4.setColumns(10);
		letra4.setBounds(259, 51, 45, 45);
		frame.getContentPane().add(letra4);

		letra5 = new JTextField();
		letra5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if ((int) e.getKeyChar() < 123 && (int) e.getKeyChar() > 96 || (int) e.getKeyChar() < 91 && (int) e.getKeyChar() > 64) {
					letra5.setText(String.valueOf(e.getKeyChar()).toUpperCase());
					letra5.setEnabled(false);
				} else {
					e.consume();
				}
			}
		});
		letra5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		letra5.setHorizontalAlignment(SwingConstants.CENTER);
		letra5.setColumns(10);
		letra5.setBounds(311, 51, 45, 45);
		frame.getContentPane().add(letra5);

		
	}

}
