package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JPasswordField;

public class LogIn extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtUsuario;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JSeparator separator;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USUARIO\\Downloads\\trabajo\\trabajo\\iconos\\iniciar-sesion.png"));
		setTitle("Iniciar Sesi\u00F2n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Iniciar Sesi\u00F3n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(127, 11, 102, 33);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Usuario          :");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\trabajo\\trabajo\\iconos\\acceso.png"));
		lblNewLabel_1.setBounds(35, 73, 102, 22);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Contrase\u00F1a   :");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\trabajo\\trabajo\\iconos\\contrasena.png"));
		lblNewLabel_2.setBounds(35, 106, 102, 22);
		contentPane.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(147, 74, 165, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\trabajo\\trabajo\\iconos\\verificado.png"));
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(82, 171, 101, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\trabajo\\trabajo\\iconos\\cerrar-ventana.png"));
		btnCancelar.setBounds(193, 171, 102, 23);
		contentPane.add(btnCancelar);
		
		separator = new JSeparator();
		separator.setBounds(82, 43, 188, 14);
		contentPane.add(separator);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(147, 107, 165, 20);
		contentPane.add(passwordField);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		
		Tienda abrir = new Tienda();
		abrir.setVisible(true);
		abrir.setLocationRelativeTo(this);
		
		
		
		
		
		
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		int salir = JOptionPane.showConfirmDialog(this,"¿Desea Salir de la Aplicación?",
				"Confirmación", JOptionPane.YES_NO_OPTION);
		if(salir==JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null,"Gracias por utilizar el programa");
			System.exit(0);
		}
	}
}
