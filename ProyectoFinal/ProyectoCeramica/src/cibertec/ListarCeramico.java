package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class ListarCeramico extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;
	private JButton btnListar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarCeramico dialog = new ListarCeramico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarCeramico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajo\\iconos\\lista-de-verificacion.png"));
		setTitle("Listado de Ceramicos");
		setBounds(100, 100, 615, 534);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnCerrar.setIcon(new ImageIcon("D:\\trabajo\\iconos\\cerrar-ventana.png"));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(186, 458, 105, 26);
		contentPanel.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.setIcon(new ImageIcon("D:\\trabajo\\iconos\\lista-de-verificacion.png"));
		btnListar.addActionListener(this);
		btnListar.setBounds(312, 458, 105, 26);
		contentPanel.add(btnListar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 579, 436);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	void mostrarLista() {
		txtS.setText("");
		imprir(" LISTADO DE CERÁMICOS");
		imprir("");
		imprir(" Modelo \t: " + Tienda.modelo0);
		imprir(" Precio \t: " + Tienda.precio0);
		imprir(" Ancho (cm) \t: " + Tienda.ancho0 + " cm");
		imprir(" Largo (cm) \t: " + Tienda.largo0 + " cm");
		imprir(" Espesor (mm) \t: " + Tienda.espesor0 + " mm");
		imprir(" Contenido \t: " + Tienda.contenido0 + " unidades");
		imprir("");
		imprir(" Modelo \t: " + Tienda.modelo1);
		imprir(" Precio \t: " + Tienda.precio1);
		imprir(" Ancho (cm) \t: " + Tienda.ancho1 + " cm");
		imprir(" Largo (cm) \t: " + Tienda.largo1 + " cm");
		imprir(" Espesor (mm) \t: " + Tienda.espesor1 + " mm");
		imprir(" Contenido \t: " + Tienda.contenido1 + " unidades");
		imprir("");
		imprir(" Modelo \t: " + Tienda.modelo2);
		imprir(" Precio \t: " + Tienda.precio2);
		imprir(" Ancho (cm) \t: " + Tienda.ancho2 + " cm");
		imprir(" Largo (cm) \t: " + Tienda.largo2 + " cm");
		imprir(" Espesor (mm) \t: " + Tienda.espesor2 + " mm");
		imprir(" Contenido \t: " + Tienda.contenido2 + " unidades");
		imprir("");
		imprir(" Modelo \t: " + Tienda.modelo3);
		imprir(" Precio \t: " + Tienda.precio3);
		imprir(" Ancho (cm) \t: " + Tienda.ancho3 + " cm");
		imprir(" Largo (cm) \t: " + Tienda.largo3 + " cm");
		imprir(" Espesor (mm) \t: " + Tienda.espesor3 + " mm");
		imprir(" Contenido \t: " + Tienda.contenido3 + " unidades");
		imprir("");
		imprir(" Modelo \t: " + Tienda.modelo4);
		imprir(" Precio \t: " + Tienda.precio4);
		imprir(" Ancho (cm) \t: " + Tienda.ancho4 + " cm");
		imprir(" Largo (cm) \t: " + Tienda.largo4 + " cm");
		imprir(" Espesor (mm) \t: " + Tienda.espesor4 + " mm");
		imprir(" Contenido \t: " + Tienda.contenido4 + " unidades");
	}
	
	void imprir(String cad) {
		txtS.append(cad + "\n");
	}
	
		
	protected void actionPerformedBtnListar(ActionEvent e) {
		
	mostrarLista();
	
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
