package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class Logeo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblUsuario;
	private JLabel lblContraseņa;
	private JTextField txtUsuario;
	private JButton btnIniciar;
	private JLabel lblNewLabel_3;
	private JPasswordField jpassClave;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logeo frame = new Logeo();
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
	public Logeo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajo\\iconos\\usuario (1).png"));
		setTitle("Iniciar Sesion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 329);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Iniciar Sesi\u00F3n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(22, 11, 229, 40);
		contentPane.add(lblNewLabel);
		
		lblUsuario = new JLabel("Usuario :");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsuario.setBounds(22, 49, 79, 27);
		contentPane.add(lblUsuario);
		
		lblContraseņa = new JLabel("Contrase\u00F1a:");
		lblContraseņa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContraseņa.setBounds(22, 121, 79, 27);
		contentPane.add(lblContraseņa);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(22, 86, 229, 24);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		btnIniciar = new JButton("Iniciar sesi\u00F3n");
		btnIniciar.addActionListener(this);
		btnIniciar.setForeground(Color.WHITE);
		btnIniciar.setBackground(Color.BLACK);
		btnIniciar.setBounds(22, 213, 229, 40);
		contentPane.add(btnIniciar);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\trabajo\\iconos\\si (1).png"));
		lblNewLabel_3.setBounds(262, 33, 205, 220);
		contentPane.add(lblNewLabel_3);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(22, 159, 229, 24);
		contentPane.add(jpassClave);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIniciar) {
			actionPerformedBtnIniciar(e);
		}
	}
	protected void actionPerformedBtnIniciar(ActionEvent e) {
		char[] clave = jpassClave.getPassword();
		String claveFinal = new String(clave);
		
		if(txtUsuario.getText().equals("cibertec") && claveFinal.equals("123")) {
			dispose();
			JOptionPane.showMessageDialog(null,"Bienvenido al Programa","INGRESASTE",
					JOptionPane.INFORMATION_MESSAGE);
			Tienda t = new Tienda();
			t.setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(null,"Usuario o contraseņa incorrectos","Error",
					JOptionPane.ERROR_MESSAGE);
			txtUsuario.setText("");
			jpassClave.setText("");
			txtUsuario.requestFocus();
		}
	}
}
