package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class ConsultarCeramico extends JDialog implements ActionListener {
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblLargo;
	private JLabel lblEspesor;
	private JLabel lblContenido;
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JButton btnCerrar;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConsultarCeramico dialog = new ConsultarCeramico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarCeramico() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajo\\iconos\\consulta.png"));
		setTitle("Consultar Cer\u00E1mico");
		setBounds(100, 100, 457, 210);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 15, 77, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 40, 77, 14);
		getContentPane().add(lblPrecio);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 65, 77, 14);
		getContentPane().add(lblAncho);
		
		lblLargo = new JLabel("Largo (cm)");
		lblLargo.setBounds(10, 90, 77, 14);
		getContentPane().add(lblLargo);
		
		lblEspesor = new JLabel("Espesor (mm)");
		lblEspesor.setBounds(10, 115, 90, 14);
		getContentPane().add(lblEspesor);
		
		lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(10, 140, 77, 14);
		getContentPane().add(lblContenido);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa"}));
		cboModelo.setBounds(97, 11, 228, 22);
		getContentPane().add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(97, 37, 228, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setBounds(97, 62, 228, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtLargo = new JTextField();
		txtLargo.setEditable(false);
		txtLargo.setBounds(97, 87, 228, 20);
		getContentPane().add(txtLargo);
		txtLargo.setColumns(10);
		
		txtEspesor = new JTextField();
		txtEspesor.setEditable(false);
		txtEspesor.setBounds(97, 112, 228, 20);
		getContentPane().add(txtEspesor);
		txtEspesor.setColumns(10);
		
		txtContenido = new JTextField();
		txtContenido.setEditable(false);
		txtContenido.setBounds(97, 137, 228, 20);
		getContentPane().add(txtContenido);
		txtContenido.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnCerrar.setIcon(new ImageIcon("D:\\trabajo\\iconos\\cerrar-ventana.png"));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 11, 98, 23);
		getContentPane().add(btnCerrar);
		
		mostrarDatos();
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}
	
	
	void mostrarDatos() {
		int modelo = cboModelo.getSelectedIndex();
		switch (modelo) {
		case 0:
			// cinza plus
			txtPrecio.setText("" + Tienda.precio0);
			txtAncho.setText("" + Tienda.ancho0);
			txtLargo.setText("" + Tienda.largo0);
			txtEspesor.setText("" + Tienda.espesor0);
			txtContenido.setText("" + Tienda.contenido0);
			break;
		case 1:
			//luxury
			txtPrecio.setText("" + Tienda.precio1);
			txtAncho.setText("" + Tienda.ancho1);
			txtLargo.setText("" + Tienda.largo1);
			txtEspesor.setText("" + Tienda.espesor1);
			txtContenido.setText("" + Tienda.contenido1);
			break;
		case 2:
			//Austria
			
			txtPrecio.setText("" + Tienda.precio2);
			txtAncho.setText("" + Tienda.ancho2);
			txtLargo.setText("" + Tienda.largo2);
			txtEspesor.setText("" + Tienda.espesor2);
			txtContenido.setText("" + Tienda.contenido2);
			break;
		case 3:
			//Yungay Mix
			
			txtPrecio.setText("" + Tienda.precio3);
			txtAncho.setText("" + Tienda.ancho3);
			txtLargo.setText("" + Tienda.largo3);
			txtEspesor.setText("" + Tienda.espesor3);
			txtContenido.setText("" + Tienda.contenido3);
			break;
		default:
			//Thal�a
			
			txtPrecio.setText("" + Tienda.precio4);
			txtAncho.setText("" + Tienda.ancho4);
			txtLargo.setText("" + Tienda.largo4);
			txtEspesor.setText("" + Tienda.espesor4);
			txtContenido.setText("" + Tienda.contenido4);
		}
	}
	
	
	
	protected void actionPerformedCboModelo(ActionEvent e) {
		
		
		mostrarDatos();

		
		
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		
		dispose();
		
		
		
	}
}
