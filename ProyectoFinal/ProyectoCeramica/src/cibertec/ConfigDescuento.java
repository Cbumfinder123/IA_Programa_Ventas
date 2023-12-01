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
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;

public class ConfigDescuento extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUnidad1;
	private JLabel lblPorcentaje1;
	private JLabel lblUnidad2;
	private JTextField txtUnidad2;
	private JLabel lblPorcentaje2;
	private JLabel lblUnidad3;
	private JTextField txtUnidad3;
	private JLabel lblPorcentaje3;
	private JLabel lblUnidad4;
	private JTextField txtUnidad4;
	private JLabel lblPorcentaje3_1;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigDescuento dialog = new ConfigDescuento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Create the dialog.
	 */
	public ConfigDescuento() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajo\\iconos\\configuraciones.png"));
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 450, 185);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(UIManager.getColor("Button.background"));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		contentPanel.setLayout(null);
		{
			JLabel lblUnidad1 = new JLabel("1 a 5 unidades");
			lblUnidad1.setBounds(10, 11, 99, 22);
			contentPanel.add(lblUnidad1);
		}
		
		txtUnidad1 = new JTextField();
		txtUnidad1.setBounds(134, 12, 99, 20);
		contentPanel.add(txtUnidad1);
		txtUnidad1.setColumns(10);
		
		lblPorcentaje1 = new JLabel("%");
		lblPorcentaje1.setBounds(243, 11, 22, 22);
		contentPanel.add(lblPorcentaje1);
		
		lblUnidad2 = new JLabel("6 a 10 unidades");
		lblUnidad2.setBounds(10, 44, 99, 22);
		contentPanel.add(lblUnidad2);
		
		txtUnidad2 = new JTextField();
		txtUnidad2.setBounds(134, 45, 99, 20);
		contentPanel.add(txtUnidad2);
		txtUnidad2.setColumns(10);
		
		lblPorcentaje2 = new JLabel("%");
		lblPorcentaje2.setBounds(243, 44, 22, 22);
		contentPanel.add(lblPorcentaje2);
		
		lblUnidad3 = new JLabel("11 a 15 unidades");
		lblUnidad3.setBounds(10, 77, 99, 22);
		contentPanel.add(lblUnidad3);
		
		txtUnidad3 = new JTextField();
		txtUnidad3.setColumns(10);
		txtUnidad3.setBounds(134, 78, 99, 20);
		contentPanel.add(txtUnidad3);
		
		lblPorcentaje3 = new JLabel("%");
		lblPorcentaje3.setBounds(243, 77, 22, 22);
		contentPanel.add(lblPorcentaje3);
		
		lblUnidad4 = new JLabel("M\u00E1s de 15 unidades");
		lblUnidad4.setBounds(10, 110, 117, 22);
		contentPanel.add(lblUnidad4);
		
		txtUnidad4 = new JTextField();
		txtUnidad4.setColumns(10);
		txtUnidad4.setBounds(134, 111, 99, 20);
		contentPanel.add(txtUnidad4);
		
		lblPorcentaje3_1 = new JLabel("%");
		lblPorcentaje3_1.setBounds(243, 110, 22, 22);
		contentPanel.add(lblPorcentaje3_1);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setIcon(new ImageIcon("D:\\trabajo\\iconos\\verificado.png"));
		btnAceptar.setHorizontalAlignment(SwingConstants.LEFT);
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(315, 11, 109, 22);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon("D:\\trabajo\\iconos\\cerrar-ventana.png"));
		btnCancelar.setHorizontalAlignment(SwingConstants.LEFT);
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(315, 44, 109, 22);
		contentPanel.add(btnCancelar);
		
		// mostrar los datos por defecto
		mostrarPorcentaje();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	
	
	//mostrar porcentaje
	
	void mostrarPorcentaje() {
		txtUnidad1.setText("" + Tienda.porcentaje1);
		txtUnidad2.setText("" + Tienda.porcentaje2);
		txtUnidad3.setText("" + Tienda.porcentaje3);
		txtUnidad4.setText("" + Tienda.porcentaje4);
	}
	void guardarPorcentaje() {
		Tienda.porcentaje1 = Double.parseDouble(txtUnidad1.getText());
		Tienda.porcentaje2 = Double.parseDouble(txtUnidad2.getText());
		Tienda.porcentaje3 = Double.parseDouble(txtUnidad3.getText());
		Tienda.porcentaje4 = Double.parseDouble(txtUnidad4.getText());
		
	}
	
	
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		
		 
		 int salir = JOptionPane.showConfirmDialog(this,"¿Estas seguro de guardar el cambio?",
					"Confirmación", JOptionPane.YES_NO_OPTION);
			if(salir==JOptionPane.YES_OPTION)
			{
				guardarPorcentaje();
				JOptionPane.showMessageDialog(null,"Guardado exitoso" , "Aviso", 1,	null);
				dispose();
			}
		
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
