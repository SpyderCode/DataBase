package BaseDatos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.Action;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DataBase.Login;

//import Modelo.Paciente;

//import Modelo.Paciente;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Inv extends JFrame {
	JDesktopPane principal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inv frame = new Inv();
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
	public Inv() {
		Inv t = this;
		setTitle("TECNOLOGICO DE ZACATECAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1138, 753);
		principal = new JDesktopPane();
		principal.setBackground(Color.WHITE);
		setContentPane(principal);
		principal.setLayout(null);
		this.repaint();

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCuenta = new JMenu("Cuenta");
		menuBar.add(mnCuenta);
		
		JMenuItem mnLogin = new JMenuItem("Login");
		mnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login ventanaInterna=new Login("Login", true, true, false, t);
				principal.add(ventanaInterna);
				ventanaInterna.setVisible(true);
			}
		});
		mnCuenta.add(mnLogin);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mnCuenta.add(mntmLogout);
		
		JMenuItem mntmVerEsteUsuario = new JMenuItem("Ver este usuario");
		mnCuenta.add(mntmVerEsteUsuario);
		
		JMenu menu = new JMenu("Congresos");
		menuBar.add(menu);
		
		JMenu menu_1 = new JMenu("Admin");
		menu_1.setEnabled(false);
		menu.add(menu_1);
		
		JMenuItem menuItem = new JMenuItem("Dar de Alta");
		menu_1.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Dar de baja");
		menu_1.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("Modificar");
		menu_1.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("Mostrar Aceptacion");
		menu.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("Ver User reg");
		menu.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("Listar Trabajos");
		menu.add(menuItem_5);
		
		JMenuItem menuItem_6 = new JMenuItem("Listar congreso");
		menu.add(menuItem_6);
		
		JMenu menu_2 = new JMenu("Revistas");
		menuBar.add(menu_2);

		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);

		JMenuItem mntmCopyright = new JMenuItem("Copyright");
		mntmCopyright.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "OC please no steal", "Copyright - es mio prro", JOptionPane.OK_OPTION);
			}
		});
		mnAbout.add(mntmCopyright);

		JMenuItem mntmAboutUs = new JMenuItem("About us");
		mntmAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Creador: \nRicardo Echaniz\nEmmanuel\nYessenia\nGema\n\n\n"
						+ "Equipo: Error en linea 1", "About", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnAbout.add(mntmAboutUs);
	}
}