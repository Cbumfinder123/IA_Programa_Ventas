package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class GenerarReporte extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblTipo;
	private JComboBox cboTipo;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GenerarReporte dialog = new GenerarReporte();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GenerarReporte() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajo\\iconos\\crear.png"));
		setTitle("Generar Reportes");
		setFont(new Font("Monospaced", Font.PLAIN, 13));
		setBounds(100, 100, 603, 302);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblTipo = new JLabel("Tipo de Reporte");
		lblTipo.setBounds(10, 12, 99, 25);
		contentPanel.add(lblTipo);
		
		cboTipo = new JComboBox();
		cboTipo.addActionListener(this);
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Comparaci\u00F3n de precio con el precio promedio", "Comparaci\u00F3n de cajas vendidas con la cantidad \u00F3ptima", "Estadistica sobre el precio"}));
		cboTipo.setBounds(107, 12, 348, 25);
		contentPanel.add(cboTipo);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setIcon(new ImageIcon("D:\\trabajo\\iconos\\cerrar-ventana.png"));
		btnCerrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(478, 14, 99, 23);
		contentPanel.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 57, 567, 195);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	//Variables

	
	//Fin
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboTipo) {
			actionPerformedCboTipo(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	
	
	// varibles globale
	double precioprom = (Tienda.precio0 + Tienda.precio1 + Tienda.precio2 + Tienda.precio3 + Tienda.precio4)/5;
	double anchoprom = (Tienda.ancho0 + Tienda.ancho1 + Tienda.ancho2 + Tienda.ancho3 + Tienda.ancho4)/5;
	
	DecimalFormat formato1 = new DecimalFormat("0.00");
	//tipo de reporte del cbo}
	
	void tipoReporte() {
		// String tipoReporte = cboTipo.getSelectedItem().toString();
		
		int tipo = cboTipo.getSelectedIndex();
				
		 switch (tipo) {
	        case 0:
	            generarReporteVentasPorModelo();
	            break;
	        case 1:
	            generarReporteComparacionPrecio();
	            break;
	        case 2:
	            generarReporteComparacionCantidadOptima();
	            break;
	        case 3:
	            generarReporteEstadisticaPrecio();
	            break;
		 }
	}
	
	//generar reporte por modelo
	void generarReporteVentasPorModelo() {
		
		
		 txtS.setText("VENTAS POR MODELO \n\n");
		 txtS.append("Modelo                      : " + Tienda.modelo0 + "\n");
		 txtS.append("Cantidad de ventas          : " + Tienda.contadorVenta0 + "\n");
		 txtS.append("Cantidad de cajas vendidas  : " + Tienda.cantUniVendidas0 + "\n");
		 txtS.append("Importe total vendido       : S/. " + formato1.format(Tienda.importeAcumulado0) + "\n");
		 txtS.append("Aporte a la cuota diaria    : " + formato1.format(Tienda.porcentajeCuota0) + "%\n\n");
		 
		 txtS.append("Modelo                      : " + Tienda.modelo1 + "\n");
		 txtS.append("Cantidad de ventas          : " + Tienda.contadorVenta1 + "\n");
		 txtS.append("Cantidad de cajas vendidas  : " + Tienda.cantUniVendidas1 + "\n");
		 txtS.append("Importe total vendido       : S/. " + formato1.format(Tienda.importeAcumulado1) + "\n");
		 txtS.append("Aporte a la cuota diaria    : " + formato1.format(Tienda.porcentajeCuota1) + "%\n\n");
		 
		 txtS.append("Modelo                      : " + Tienda.modelo2 + "\n");
		 txtS.append("Cantidad de ventas          : " + Tienda.contadorVenta2 + "\n");
		 txtS.append("Cantidad de cajas vendidas  : " + Tienda.cantUniVendidas2 + "\n");
		 txtS.append("Importe total vendido       : S/. " + formato1.format(Tienda.importeAcumulado2) + "\n");
		 txtS.append("Aporte a la cuota diaria    : " + formato1.format(Tienda.porcentajeCuota2) + "%\n\n");
		 
		 txtS.append("Modelo                      : " + Tienda.modelo3 + "\n");
		 txtS.append("Cantidad de ventas          : " + Tienda.contadorVenta3 + "\n");
		 txtS.append("Cantidad de cajas vendidas  : " + Tienda.cantUniVendidas3 + "\n");
		 txtS.append("Importe total vendido       : S/. " + formato1.format(Tienda.importeAcumulado3) + "\n");
		 txtS.append("Aporte a la cuota diaria    : " + formato1.format(Tienda.porcentajeCuota3) + "%\n\n");
		 
		 txtS.append("Modelo                      : " + Tienda.modelo4 + "\n");
		 txtS.append("Cantidad de ventas          : " + Tienda.contadorVenta4 + "\n");
		 txtS.append("Cantidad de cajas vendidas  : " + Tienda.cantUniVendidas4 + "\n");
		 txtS.append("Importe total vendido       : S/. " + formato1.format(Tienda.importeAcumulado4) + "\n");
		 txtS.append("Aporte a la cuota diaria    : " + formato1.format(Tienda.porcentajeCuota4) + "%\n\n");
		
		 txtS.setCaretPosition(0);
	}
	
	//generar reporte comparaci�n precio con precio promedio
	void generarReporteComparacionPrecio() {
		
		txtS.setText("COMPARACI�N DE PRECIOS CON EL PRECIO PROMEDIO\n\n" );
		
		txtS.append("Modelo            : " + Tienda.modelo0 + "\n");
		txtS.append("Precio            : S/. " + formato1.format(Tienda.precio0) + "\n");
		txtS.append("Precio promedio   : S/. " + formato1.format(precioprom) + "\n");
		if(Tienda.precio0 < precioprom) {
			txtS.append("Comparaci�n       : S/. " + formato1.format((Tienda.precio0 - precioprom) * -1) + " menos que el promedio\n\n");
		}else if(Tienda.precio0 > precioprom) {
			txtS.append("Comparaci�n       : S/. " + formato1.format(Tienda.precio0 - precioprom) + " m�s que el promedio\n\n");
		}else{
			txtS.append("Comparaci�n       : "  + "igual que el promedio\n\n");
		}
		
		txtS.append("Modelo            : " + Tienda.modelo1 + "\n");
		txtS.append("Precio            : S/. " + formato1.format(Tienda.precio1) + "\n");
		txtS.append("Precio promedio   : S/. " + formato1.format(precioprom) + "\n");
		if(Tienda.precio1 < precioprom) {
			txtS.append("Comparaci�n       : S/. " + formato1.format((Tienda.precio1 - precioprom) * -1) + " menos que el promedio\n\n");
		}else if(Tienda.precio1 > precioprom) {
			txtS.append("Comparaci�n       : S/. " + formato1.format(Tienda.precio1 - precioprom) + " m�s que el promedio\n\n");
		}else{
			txtS.append("Comparaci�n       : "  + "igual que el promedio\n\n");
		}
		
		txtS.append("Modelo            : " + Tienda.modelo2 + "\n");
		txtS.append("Precio            : S/. " + formato1.format(Tienda.precio2) + "\n");
		txtS.append("Precio promedio   : S/. " + formato1.format(precioprom) + "\n");
		if(Tienda.precio2 < precioprom) {
			txtS.append("Comparaci�n       : S/. " + formato1.format((Tienda.precio2 - precioprom) * -1) + " menos que el promedio\n\n");
		}else if(Tienda.precio2 > precioprom) {
			txtS.append("Comparaci�n       : S/. " + formato1.format(Tienda.precio2 - precioprom) + " m�s que el promedio\n\n");
		}else{
			txtS.append("Comparaci�n       : "  + "igual que el promedio\n\n");
		}
		
		txtS.append("Modelo            : " + Tienda.modelo3 + "\n");
		txtS.append("Precio            : S/. " + formato1.format(Tienda.precio3) + "\n");
		txtS.append("Precio promedio   : S/. " + formato1.format(precioprom) + "\n");
		if(Tienda.precio3 < precioprom) {
			txtS.append("Comparaci�n       : S/. " + formato1.format((Tienda.precio3 - precioprom) * -1) + " menos que el promedio\n\n");
		}else if(Tienda.precio3 > precioprom) {
			txtS.append("Comparaci�n       : S/. " + formato1.format(Tienda.precio3 - precioprom) + " m�s que el promedio\n\n");
		}else{
			txtS.append("Comparaci�n       : "  + "igual que el promedio\n\n");
		}
		
		txtS.append("Modelo            : " + Tienda.modelo4 + "\n");
		txtS.append("Precio            : S/. " + formato1.format(Tienda.precio4) + "\n");
		txtS.append("Precio promedio   : S/. " + formato1.format(precioprom) + "\n");
		if(Tienda.precio4 < precioprom) {
			txtS.append("Comparaci�n       : S/. " + formato1.format((Tienda.precio4 - precioprom) * -1) + " menos que el promedio\n\n");
		}else if(Tienda.precio4 > precioprom) {
			txtS.append("Comparaci�n       : S/. " + formato1.format(Tienda.precio4 - precioprom) + " m�s que el promedio\n\n");
		}else{
			txtS.append("Comparaci�n       : "  + "igual que el promedio\n\n");
		}
		
		txtS.setCaretPosition(0);	 
	}
	
	//generar reporte comparacion cajas vendidas con cantidad optima
	void generarReporteComparacionCantidadOptima() {
		
		txtS.setText("COMPARACI�N DE CAJAS VENDIDAS CON LA CANTIDAD �PTIMA\n\n");
		txtS.append("Modelo                      : " + Tienda.modelo0 + "\n");
		txtS.append("Cantidad de cajas vendidas  : " + Tienda.cantUniVendidas0 + "\n");
		txtS.append("Cantidad �ptima             : " + Tienda.cantidadOptima + "\n");
		if(Tienda.cantUniVendidas0 < Tienda.cantidadOptima) {
			txtS.append("Comparaci�n                 : " + ((Tienda.cantUniVendidas0 - Tienda.cantidadOptima) * -1) + " menos que la cantidad �ptima\n\n");
		}else if(Tienda.cantUniVendidas0 > Tienda.cantidadOptima) {
			txtS.append("Comparaci�n                 : " + (Tienda.cantUniVendidas0 - Tienda.cantidadOptima) + " m�s que la cantidad �ptima\n\n");
		}else {
			txtS.append("Comparaci�n                 : " +  "igual que la cantidad �ptima\n\n");
		}
		
		
		txtS.append("Modelo                      : " + Tienda.modelo1 + "\n");
		txtS.append("Cantidad de cajas vendidas  : " + Tienda.cantUniVendidas1 + "\n");
		txtS.append("Cantidad �ptima             : " + Tienda.cantidadOptima + "\n");
		if(Tienda.cantUniVendidas1 < Tienda.cantidadOptima) {
			txtS.append("Comparaci�n                 : " + ((Tienda.cantUniVendidas1 - Tienda.cantidadOptima) * -1) + " menos que la cantidad �ptima\n\n");
		}else if(Tienda.cantUniVendidas1 > Tienda.cantidadOptima) {
			txtS.append("Comparaci�n                 : " + (Tienda.cantUniVendidas1 - Tienda.cantidadOptima) + " m�s que la cantidad �ptima\n\n");
		}else {
			txtS.append("Comparaci�n                 : " +  "igual que la cantidad �ptima\n\n");
		}
		
		
		txtS.append("Modelo                      : " + Tienda.modelo2 + "\n");
		txtS.append("Cantidad de cajas vendidas  : " + Tienda.cantUniVendidas2 + "\n");
		txtS.append("Cantidad �ptima             : " + Tienda.cantidadOptima + "\n");
		if(Tienda.cantUniVendidas2 < Tienda.cantidadOptima) {
			txtS.append("Comparaci�n                 : " + ((Tienda.cantUniVendidas2 - Tienda.cantidadOptima) * -1) + " menos que la cantidad �ptima\n\n");
		}else if(Tienda.cantUniVendidas2 > Tienda.cantidadOptima) {
			txtS.append("Comparaci�n                 : " + (Tienda.cantUniVendidas2 - Tienda.cantidadOptima) + " m�s que la cantidad �ptima\n\n");
		}else {
			txtS.append("Comparaci�n                 : " +  "igual que la cantidad �ptima\n\n");
		}
		
		
		txtS.append("Modelo                      : " + Tienda.modelo3 + "\n");
		txtS.append("Cantidad de cajas vendidas  : " + Tienda.cantUniVendidas3 + "\n");
		txtS.append("Cantidad �ptima             : " + Tienda.cantidadOptima + "\n");
		if(Tienda.cantUniVendidas3 < Tienda.cantidadOptima) {
			txtS.append("Comparaci�n                 : " + ((Tienda.cantUniVendidas3 - Tienda.cantidadOptima) * -1) + " menos que la cantidad �ptima\n\n");
		}else if(Tienda.cantUniVendidas3 > Tienda.cantidadOptima) {
			txtS.append("Comparaci�n                 : " + (Tienda.cantUniVendidas3 - Tienda.cantidadOptima) + " m�s que la cantidad �ptima\n\n");
		}else {
			txtS.append("Comparaci�n                 : " +  "igual que la cantidad �ptima\n\n");
		}
		
		txtS.append("Modelo                      : " + Tienda.modelo4 + "\n");
		txtS.append("Cantidad de cajas vendidas  : " + Tienda.cantUniVendidas4 + "\n");
		txtS.append("Cantidad �ptima             : " + Tienda.cantidadOptima + "\n");
		if(Tienda.cantUniVendidas4 < Tienda.cantidadOptima) {
			txtS.append("Comparaci�n                 : " + ((Tienda.cantUniVendidas4 - Tienda.cantidadOptima) * -1) + " menos que la cantidad �ptima\n\n");
		}else if(Tienda.cantUniVendidas4 > Tienda.cantidadOptima) {
			txtS.append("Comparaci�n                 : " + (Tienda.cantUniVendidas4 - Tienda.cantidadOptima) + " m�s que la cantidad �ptima\n\n");
		}else {
			txtS.append("Comparaci�n                 : " +  "igual que la cantidad �ptima\n\n");
		}
		
		txtS.setCaretPosition(0);	
	}
	
	// estadisticas sobre el precio
	void generarReporteEstadisticaPrecio(){
		
		txtS.setText("ESTAD�STICA SOBRE EL PRECIO\n\n");
		//precio promedio
		txtS.append("Precio promedio  : S/. " + formato1.format(precioprom) + "\n");
		
		//precio mayor
		if(Tienda.precio0 >= Tienda.precio1 && Tienda.precio0 >= Tienda.precio2 && Tienda.precio0 >= Tienda.precio3 && Tienda.precio0 >= Tienda.precio4) {
			txtS.append("Precio mayor     : S/. " + Tienda.precio0 + "\n");
		}else if(Tienda.precio1 >= Tienda.precio0 && Tienda.precio1 >= Tienda.precio2 && Tienda.precio1 >= Tienda.precio3 && Tienda.precio1 >= Tienda.precio4) {
			txtS.append("Precio mayor     : S/. " + Tienda.precio1 + "\n");
		}else if(Tienda.precio2 >= Tienda.precio0 && Tienda.precio2 >= Tienda.precio1 && Tienda.precio2 >= Tienda.precio3 && Tienda.precio2 >= Tienda.precio4) {
			txtS.append("Precio mayor     : S/. " + Tienda.precio2 + "\n");
		}else if(Tienda.precio3 >= Tienda.precio0 && Tienda.precio3 >= Tienda.precio1 && Tienda.precio3 >= Tienda.precio2 && Tienda.precio3 >= Tienda.precio4) {
			txtS.append("Precio mayor     : S/. " + Tienda.precio3 + "\n");
		}else{
			txtS.append("Precio mayor     : S/. " + Tienda.precio4 + "\n");
		}
		
		//precio menor
		if(Tienda.precio0 <= Tienda.precio1 && Tienda.precio0 <= Tienda.precio2 && Tienda.precio0 <= Tienda.precio3 && Tienda.precio0 <= Tienda.precio4) {
			txtS.append("Precio menor     : S/. " + Tienda.precio0);
		}else if(Tienda.precio1 <= Tienda.precio0 && Tienda.precio1 <= Tienda.precio2 && Tienda.precio1 <= Tienda.precio3 && Tienda.precio1 <= Tienda.precio4) {
			txtS.append("Precio menor     : S/. " + Tienda.precio1);
		}else if(Tienda.precio2 <= Tienda.precio0 && Tienda.precio2 <= Tienda.precio1 && Tienda.precio2 <= Tienda.precio3 && Tienda.precio2 <= Tienda.precio4) {
			txtS.append("Precio menor     : S/. " + Tienda.precio2);
		}else if(Tienda.precio3 <= Tienda.precio0 && Tienda.precio3 <= Tienda.precio1 && Tienda.precio3 <= Tienda.precio2 && Tienda.precio3 <= Tienda.precio4) {
			txtS.append("Precio menor     : S/. " + Tienda.precio3);
		}else{
			txtS.append("Precio menor     : S/. " + Tienda.precio4);
		}
		
		txtS.setCaretPosition(0);	
	}
	
	protected void actionPerformedCboTipo(ActionEvent e) {
		
		tipoReporte();
		
	}
	
	
	
	
}
