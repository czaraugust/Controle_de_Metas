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

import principal.Grupo;

import java.awt.SystemColor;
import java.awt.Font;

import principal.Grupo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Set;
public class InterfaceInternaGruposCoordenador extends JFrame {

	private JPanel contentPane;
	private String usuario, grupo;
	private JTable tablemetas, tablemembros;	
	public DefaultTableModel modelometas, modelomebros;
	private JTextField MetatextField;
	private JTextField textField_1;
	private JTextField DatatextField;

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
		
		Grupo essegrupo = new Grupo("");
		
		modelomebros = new DefaultTableModel();  
		modelomebros.setColumnIdentifiers(new String []{"Membros"});
		tablemembros = new JTable(modelomebros);
		tablemembros.setBorder(new LineBorder(new Color(0, 0, 0)));
		tablemembros.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tablemembros.setBackground(SystemColor.menu);
		tablemembros.setBounds(10, 45, 218, 165);
		
		modelometas = new DefaultTableModel();  
		modelometas.setColumnIdentifiers(new String []{"Metas", "Data", "%"});
		tablemetas = new JTable(modelometas);
		tablemetas.setBorder(new LineBorder(new Color(0, 0, 0)));
		tablemetas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tablemetas.setBackground(SystemColor.menu);
		tablemetas.setBounds(10, 45, 269, 188);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 585, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//contentPane.sett
		
		
		DefaultTableModel valmetas = (DefaultTableModel) tablemetas.getModel();
		if (essegrupo.listadegrupos.get(grupo).getListademetas().isEmpty() == false){

			Set<String> chaves = essegrupo.listadegrupos.get(grupo).getListademetas().keySet();
			for (String chave : chaves){
				valmetas.addRow(new String []{essegrupo.listadegrupos.get(grupo).getListademetas().get(chave).getMeta(), 
						essegrupo.listadegrupos.get(grupo).getListademetas().get(chave).getData(), 
						essegrupo.listadegrupos.get(grupo).getListademetas().get(chave).getPorcentagem()});


				
			}
		}
		JPanel panelmetas = new JPanel();
		panelmetas.setBounds(10, 40, 289, 375);
		panelmetas.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panelmetas);
		panelmetas.setLayout(null);
		panelmetas.add(tablemetas);
		JButton btnAddMeta = new JButton("Add Meta");
		btnAddMeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String textoMetas = MetatextField.getText().trim();
				String textoData = DatatextField.getText().trim();
				if(!essegrupo.listadegrupos.get(grupo).getListademetas().containsKey(textoMetas)){
					valmetas.addRow(new String [] {textoMetas, textoData, "0%"});
					
				}
				
			}
		});
		btnAddMeta.setBounds(27, 341, 99, 23);
		panelmetas.add(btnAddMeta);
		
		JButton btnExcluiMeta = new JButton("Exclui Meta");
		btnExcluiMeta.setBounds(158, 341, 103, 23);
		panelmetas.add(btnExcluiMeta);
		
		JTextPane txtpnMetas = new JTextPane();
		txtpnMetas.setBounds(118, 11, 53, 23);
		txtpnMetas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnMetas.setBackground(SystemColor.menu);
		txtpnMetas.setText("METAS");
		panelmetas.add(txtpnMetas);
		
		MetatextField = new JTextField();
		MetatextField.setBounds(88, 244, 191, 20);
		panelmetas.add(MetatextField);
		MetatextField.setColumns(10);
		
		JTextPane txtpnMeta = new JTextPane();
		txtpnMeta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnMeta.setBackground(SystemColor.menu);
		txtpnMeta.setText("Meta:");
		txtpnMeta.setBounds(10, 244, 49, 20);
		panelmetas.add(txtpnMeta);
		
		JTextPane txtpnDatalimiteddmmaaaa = new JTextPane();
		txtpnDatalimiteddmmaaaa.setBackground(SystemColor.menu);
		txtpnDatalimiteddmmaaaa.setText("Data-Limite (DD/MM/AAAA");
		txtpnDatalimiteddmmaaaa.setBounds(10, 275, 79, 39);
		panelmetas.add(txtpnDatalimiteddmmaaaa);
		
		DatatextField = new JTextField();
		DatatextField.setBounds(89, 285, 132, 23);
		panelmetas.add(DatatextField);
		DatatextField.setColumns(10);
		
		JPanel panelmembros = new JPanel();
		panelmembros.setBounds(314, 40, 245, 375);
		panelmembros.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panelmembros);
		panelmembros.setLayout(null);
		panelmembros.add(tablemembros);
		
		JButton btnAddMembro = new JButton("Add Membro");
		btnAddMembro.setBounds(10, 250, 108, 23);
		panelmembros.add(btnAddMembro);
		
		JButton btnExcluiMembro = new JButton("Exclui Membro");
		btnExcluiMembro.setBounds(117, 250, 118, 23);
		panelmembros.add(btnExcluiMembro);
		
		JTextPane txtpnMembros = new JTextPane();
		txtpnMembros.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnMembros.setBackground(SystemColor.menu);
		txtpnMembros.setText("MEMBROS");
		txtpnMembros.setBounds(94, 11, 69, 23);
		panelmembros.add(txtpnMembros);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 219, 218, 20);
		panelmembros.add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(190, 11, 109, 25);
		contentPane.add(textPane);
		textPane.setText(grupo);
		
		JButton btnDesafzer = new JButton("Desafzer");
		btnDesafzer.setBounds(470, 13, 89, 23);
		contentPane.add(btnDesafzer);
		
		
	}
}
