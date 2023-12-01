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
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;

public class ConfigCuota extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCuotaDiaria;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigCuota dialog = new ConfigCuota();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigCuota() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajo\\iconos\\configuraciones.png"));
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 450, 120);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(UIManager.getColor("Button.background"));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCuota = new JLabel("Cuota diaria espeada    (S./)");
			lblCuota.setBounds(10, 4, 170, 40);
			contentPanel.add(lblCuota);
		}
		{
			txtCuotaDiaria = new JTextField();
			txtCuotaDiaria.setColumns(10);
			txtCuotaDiaria.setBounds(179, 12, 126, 25);
			contentPanel.add(txtCuotaDiaria);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setIcon(new ImageIcon("D:\\trabajo\\iconos\\verificado.png"));
			btnAceptar.setHorizontalAlignment(SwingConstants.LEFT);
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(317, 13, 107, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setHorizontalAlignment(SwingConstants.LEFT);
			btnCancelar.setIcon(new ImageIcon("D:\\trabajo\\iconos\\cerrar-ventana.png"));
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(317, 47, 107, 23);
			contentPanel.add(btnCancelar);
		}
		// mostrar dato en el textfield
		
		txtCuotaDiaria.setText("" + Tienda.cuotaDiaria);
		
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
			Tienda.cuotaDiaria = Double.parseDouble(txtCuotaDiaria.getText());
			JOptionPane.showMessageDialog(null,"Guardado exitoso" , "Aviso", 1,	null);
			dispose();
		}
		
		
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
		
	}
}
