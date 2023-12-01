package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;

public class ConfigCantidad extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidadU;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigCantidad dialog = new ConfigCantidad();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigCantidad() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajo\\iconos\\configuraciones.png"));
		setTitle("Configurar cantidad \u00F3ptima");
		setBounds(100, 100, 450, 120);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(UIManager.getColor("Button.background"));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCantidadU = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
			lblCantidadU.setBounds(10, 4, 237, 40);
			contentPanel.add(lblCantidadU);
		}
		{
			txtCantidadU = new JTextField();
			txtCantidadU.setBounds(249, 12, 48, 25);
			contentPanel.add(txtCantidadU);
			txtCantidadU.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setHorizontalAlignment(SwingConstants.LEFT);
			btnAceptar.setIcon(new ImageIcon("D:\\trabajo\\iconos\\verificado.png"));
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(319, 13, 105, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setHorizontalAlignment(SwingConstants.LEFT);
			btnCancelar.setIcon(new ImageIcon("D:\\trabajo\\iconos\\cerrar-ventana.png"));
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(319, 47, 105, 23);
			contentPanel.add(btnCancelar);
		}
		
		txtCantidadU.setText("" + Tienda.cantidadOptima);
		
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
		
	
		int salir = JOptionPane.showConfirmDialog(this,"¿Estas seguro de guardar el cambio?",
				"Confirmación", JOptionPane.YES_NO_OPTION);
		if(salir==JOptionPane.YES_OPTION)
		{
			Tienda.cantidadOptima = Integer.parseInt(txtCantidadU.getText());
			JOptionPane.showMessageDialog(null,"Guardado exitoso" , "Aviso", 1,	null);
			dispose();
		}
		
		
		
		
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
		
	}
}
