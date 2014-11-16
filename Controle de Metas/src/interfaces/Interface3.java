package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Interface3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface3 frame = new Interface3();
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
	public Interface3() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnGrupos = new JTextPane();
		txtpnGrupos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnGrupos.setBackground(SystemColor.menu);
		txtpnGrupos.setText("Grupos");
		txtpnGrupos.setBounds(181, 11, 58, 20);
		contentPane.add(txtpnGrupos);
		
		JButton btnAbrirGrupo = new JButton("Abrir Grupo");
		btnAbrirGrupo.setBounds(145, 266, 147, 23);
		contentPane.add(btnAbrirGrupo);
	}

}
