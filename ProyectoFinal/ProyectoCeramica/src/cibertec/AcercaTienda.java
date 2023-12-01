package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Label;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class AcercaTienda extends JDialog implements ActionListener {
	private JLabel lblTienda;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnCerrar;
	private JLabel lblDecermico;

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
					AcercaTienda dialog = new AcercaTienda();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public AcercaTienda() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajo\\iconos\\informacion.png"));
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 534, 396);
		getContentPane().setLayout(null);
		
		lblTienda = new JLabel("Sistema de venta");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTienda.setBounds(95, 43, 328, 25);
		lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblTienda);

		lblDecermico = new JLabel("de Cer\u00E1mico 1.0");
		lblDecermico.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecermico.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDecermico.setBounds(68, 79, 382, 25);
		getContentPane().add(lblDecermico);
		
		separator = new JSeparator();
		separator.setBounds(16, 115, 485, 2);
		getContentPane().add(separator);
		
		lblNewLabel = new JLabel("Autores");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(224, 128, 70, 20);
		lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Rodrigo Cruz Rojas Vincent\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(175, 159, 231, 14);
		lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Christian Huarcaya Palacios");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(175, 184, 220, 14);
		lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Junior Dominguez Montero");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(175, 209, 231, 14);
		lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Jhuli Trujillo Meza");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(207, 234, 188, 14);
		lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Sara Quispe Sumari");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(200, 259, 179, 14);
		lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel_5);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnCerrar.setIcon(new ImageIcon("D:\\trabajo\\iconos\\cerrar-ventana.png"));
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(214, 311, 89, 23);
		lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(btnCerrar);
		

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
