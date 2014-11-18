package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

import java.awt.SystemColor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import principal.Grupo;

import java.awt.Color;
import java.util.Set;

public class InterfaceGruposFuncionario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private String usuario;
	public DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGruposFuncionario frame = new InterfaceGruposFuncionario();
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
	public InterfaceGruposFuncionario() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//contentPane.add(table);
		
		modelo = new DefaultTableModel();  
		modelo.setColumnIdentifiers(new String []{"Nome do Grupo"});
		table = new JTable(modelo);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setBackground(SystemColor.menu);
		table.setBounds(106, 76, 215, 166);
		contentPane.add(table);
		
		Grupo grupo = new Grupo("");
		DefaultTableModel val = (DefaultTableModel) table.getModel();
		if (grupo.listadegrupos.isEmpty() == false){





		Set<String> chaves = grupo.listadegrupos.keySet();
			for (String chave : chaves){
				
				val.addRow(new String []{grupo.listadegrupos.get(chave).getNome()});
				

			}
		}
		
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
		txtpnNome.setBounds(106, 42, 215, 23);
		txtpnNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnNome.setBackground(SystemColor.menu);
		txtpnNome.setText("               Nome do Grupo");
		txtpnNome.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		contentPane.add(txtpnNome);
		
		
	}

}
