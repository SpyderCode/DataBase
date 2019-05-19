package BaseDatos;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
//import javax.swing.JDialog;
//import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.jar.JarOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;

public class Login extends JInternalFrame {
	// Obtener el contexto del Frame principal Hospital
	public Inv principal;
	public JPanel contentPanel;

	public Login(String titulo, boolean tamaño, boolean cerrar, boolean maximizar, Inv padre) {
		super(titulo, tamaño, cerrar, maximizar);
		getContentPane().setBackground(Color.DARK_GRAY);
		setVisible(true);
		principal = padre;
		contentPanel = (JPanel) this.getContentPane();
		contentPanel.setLayout(null);

		setBounds(100, 100, 674, 369);
	}

}
