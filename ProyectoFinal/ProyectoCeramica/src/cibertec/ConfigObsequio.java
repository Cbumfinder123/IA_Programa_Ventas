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
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;

public class ConfigObsequio extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtTipo;
	private JTextField txtUnidad1;
	private JTextField txtUnidad2;
	private JTextField txtUnidad3;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigObsequio dialog = new ConfigObsequio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigObsequio() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajo\\iconos\\configuraciones.png"));
		setTitle("Configurar Obsequios");
		setBounds(100, 100, 450, 185);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(UIManager.getColor("Button.background"));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTipo = new JLabel("Tipo de obsequio");
			lblTipo.setBounds(10, 11, 99, 22);
			contentPanel.add(lblTipo);
		}
		{
			JLabel lblUnidad1 = new JLabel("1 a 5 unidades");
			lblUnidad1.setBounds(10, 44, 99, 22);
			contentPanel.add(lblUnidad1);
		}
		{
			JLabel lblUnidad2 = new JLabel("6 a 10 unidades");
			lblUnidad2.setBounds(10, 77, 99, 22);
			contentPanel.add(lblUnidad2);
		}
		{
			JLabel lblUnidad3 = new JLabel("11 a m\u00E1s unidades");
			lblUnidad3.setBounds(10, 113, 115, 22);
			contentPanel.add(lblUnidad3);
		}
		{
			txtTipo = new JTextField();
			txtTipo.setBounds(150, 12, 99, 22);
			contentPanel.add(txtTipo);
			txtTipo.setColumns(10);
		}
		{
			txtUnidad1 = new JTextField();
			txtUnidad1.setColumns(10);
			txtUnidad1.setBounds(150, 45, 99, 21);
			contentPanel.add(txtUnidad1);
		}
		{
			txtUnidad2 = new JTextField();
			txtUnidad2.setColumns(10);
			txtUnidad2.setBounds(150, 78, 99, 21);
			contentPanel.add(txtUnidad2);
		}
		{
			txtUnidad3 = new JTextField();
			txtUnidad3.setColumns(10);
			txtUnidad3.setBounds(150, 114, 99, 21);
			contentPanel.add(txtUnidad3);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setHorizontalAlignment(SwingConstants.LEFT);
			btnAceptar.setIcon(new ImageIcon("D:\\trabajo\\iconos\\verificado.png"));
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(316, 11, 108, 22);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setIcon(new ImageIcon("D:\\trabajo\\iconos\\cerrar-ventana.png"));
			btnCancelar.setHorizontalAlignment(SwingConstants.LEFT);
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(316, 44, 108, 22);
			contentPanel.add(btnCancelar);
		}
		
		mostrarObsequio();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	
	//mostrar datos
	
		void mostrarObsequio() {
			txtTipo.setText("" + Tienda.tipoObsequio);
			txtUnidad1.setText("" + Tienda.obsequioCantidad1);
			txtUnidad2.setText("" + Tienda.obsequioCantidad2);
			txtUnidad3.setText("" + Tienda.obsequioCantidad3);
		}
		void guardarCambios() {
			Tienda.tipoObsequio = txtTipo.getText();
			Tienda.obsequioCantidad1 = Integer.parseInt(txtUnidad1.getText());
			Tienda.obsequioCantidad2 = Integer.parseInt(txtUnidad2.getText());
			Tienda.obsequioCantidad3 = Integer.parseInt(txtUnidad3.getText());
			
		}
	
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		
		
		
		int salir = JOptionPane.showConfirmDialog(this,"¿Estas seguro de guardar el cambio?",
				"Confirmación", JOptionPane.YES_NO_OPTION);
		if(salir==JOptionPane.YES_OPTION)
		{
			guardarCambios();
			JOptionPane.showMessageDialog(null,"Guardado exitoso" , "Aviso", 1,	null);
			dispose();
		}
		
		
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
