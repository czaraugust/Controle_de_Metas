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
		txtpnGrupos.setBounds(181, 11, 58, 20);
		txtpnGrupos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnGrupos.setBackground(SystemColor.menu);
		txtpnGrupos.setText("Grupos");
		contentPane.add(txtpnGrupos);
		
		JButton btnAbrirGrupo = new JButton("Abrir Grupo");
		btnAbrirGrupo.setBounds(145, 266, 147, 23);
		contentPane.add(btnAbrirGrupo);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setBounds(77, 34, 114, 23);
		txtpnNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnNome.setBackground(SystemColor.menu);
		txtpnNome.setText(" Nome do Grupo");
		txtpnNome.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		contentPane.add(txtpnNome);
		
		JTextPane txtpnCoordenadorDoGrupo = new JTextPane();
		txtpnCoordenadorDoGrupo.setBackground(SystemColor.menu);
		txtpnCoordenadorDoGrupo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnCoordenadorDoGrupo.setText(" Coordenador do grupo");
		txtpnCoordenadorDoGrupo.setBounds(191, 34, 161, 23);
		txtpnCoordenadorDoGrupo.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(txtpnCoordenadorDoGrupo);
	}

}
