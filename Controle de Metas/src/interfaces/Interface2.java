package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;

import java.awt.SystemColor;
import java.awt.Font;

public class Interface2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface2 frame = new Interface2();
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
	public Interface2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 470, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnGrupos = new JTextPane();
		txtpnGrupos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnGrupos.setBackground(SystemColor.menu);
		txtpnGrupos.setText("Grupos");
		txtpnGrupos.setBounds(202, 11, 54, 20);
		contentPane.add(txtpnGrupos);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 289, 434, 44);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Abrir Grupo");
		btnNewButton.setBounds(10, 11, 109, 23);
		panel.add(btnNewButton);
		
		JButton btnExcluirGrupo = new JButton("Excluir Grupo");
		btnExcluirGrupo.setBounds(144, 11, 118, 23);
		panel.add(btnExcluirGrupo);
		
		JButton btnCriarNovoGrupo = new JButton("Criar Novo Grupo");
		btnCriarNovoGrupo.setBounds(286, 11, 138, 23);
		panel.add(btnCriarNovoGrupo);
		
		
	}
	public static String retornaUser (String string){
		return string;
	
		
	}
	

}
