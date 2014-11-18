package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JTextPane;

import java.awt.SystemColor;
import java.awt.Font;

public class InterfaceInternaGruposCoordenador extends JFrame {

	private JPanel contentPane;
	private String usuario, grupo;
	private JTable metas, membros;	
	public DefaultTableModel modelometas, modelomebros;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceInternaGruposCoordenador frame = new InterfaceInternaGruposCoordenador("", "");
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
	public InterfaceInternaGruposCoordenador(String usuario, String grupo) {
		setTitle("Grupo");
		this.usuario = usuario;
		this.grupo = grupo;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 523, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//contentPane.sett
		
		JPanel panelmetas = new JPanel();
		panelmetas.setBounds(10, 58, 232, 266);
		panelmetas.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panelmetas);
		panelmetas.setLayout(null);
		
		JButton btnAddMeta = new JButton("Add Meta");
		btnAddMeta.setBounds(10, 232, 99, 23);
		panelmetas.add(btnAddMeta);
		
		JButton btnExcluiMeta = new JButton("Exclui Meta");
		btnExcluiMeta.setBounds(119, 232, 103, 23);
		panelmetas.add(btnExcluiMeta);
		
		JTextPane txtpnMetas = new JTextPane();
		txtpnMetas.setBounds(78, 11, 53, 23);
		txtpnMetas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnMetas.setBackground(SystemColor.menu);
		txtpnMetas.setText("METAS");
		panelmetas.add(txtpnMetas);
		
		textField = new JTextField();
		textField.setBounds(76, 201, 86, 20);
		panelmetas.add(textField);
		textField.setColumns(10);
		
		JPanel panelmembros = new JPanel();
		panelmembros.setBounds(252, 58, 245, 266);
		panelmembros.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panelmembros);
		panelmembros.setLayout(null);
		
		JButton btnAddMembro = new JButton("Add Membro");
		btnAddMembro.setBounds(10, 232, 108, 23);
		panelmembros.add(btnAddMembro);
		
		JButton btnExcluiMembro = new JButton("Exclui Membro");
		btnExcluiMembro.setBounds(117, 232, 118, 23);
		panelmembros.add(btnExcluiMembro);
		
		JTextPane txtpnMembros = new JTextPane();
		txtpnMembros.setBackground(SystemColor.menu);
		txtpnMembros.setText("MEMBROS");
		txtpnMembros.setBounds(86, 11, 69, 23);
		panelmembros.add(txtpnMembros);
		
		textField_1 = new JTextField();
		textField_1.setBounds(74, 201, 86, 20);
		panelmembros.add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(190, 11, 109, 25);
		contentPane.add(textPane);
		textPane.setText(grupo);
		
		JButton btnDesafzer = new JButton("Desafzer");
		btnDesafzer.setBounds(408, 11, 89, 23);
		contentPane.add(btnDesafzer);
	}
}
