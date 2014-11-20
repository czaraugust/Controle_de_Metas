package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

import java.awt.SystemColor;
import java.awt.Font;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import principal.Grupo;

import java.awt.Color;
import java.util.Set;

public class InterfaceInternaGruposFuncionario extends JFrame {

	private JPanel contentPane;
	private String grupo;
	private JTable tablemetas, tablemembros;	
	private DefaultTableModel modelometas, modelomebros;
	
	public InterfaceInternaGruposFuncionario(String grupo) {
		this.grupo  = grupo;
		
		Grupo essegrupo = new Grupo("");
		modelomebros = new DefaultTableModel();  
		modelomebros.setColumnIdentifiers(new String []{"Membros"});
		tablemembros = new JTable(modelomebros);
		tablemembros.setBorder(new LineBorder(new Color(0, 0, 0)));
		tablemembros.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tablemembros.setBackground(SystemColor.menu);
		tablemembros.setBounds(29, 42, 160, 184);

		modelometas = new DefaultTableModel();  
		modelometas.setColumnIdentifiers(new String []{"Metas", "Data", "%"});
		tablemetas = new JTable(modelometas);
		tablemetas.setBorder(new LineBorder(new Color(0, 0, 0)));
		tablemetas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tablemetas.setBackground(SystemColor.menu);
		tablemetas.setBounds(10, 44, 209, 171);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	
		JPanel panelMetas = new JPanel();
		panelMetas.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMetas.setBounds(10, 11, 229, 259);
		contentPane.add(panelMetas);
		panelMetas.add(tablemetas);
		panelMetas.setLayout(null);
		
		JTextPane txtpnMetas = new JTextPane();
		txtpnMetas.setBounds(90, 11, 40, 22);
		panelMetas.add(txtpnMetas);
		txtpnMetas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnMetas.setBackground(SystemColor.menu);
		txtpnMetas.setText("Metas");
		
		JPanel panelMembros = new JPanel();
		panelMembros.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMembros.setBounds(262, 11, 212, 259);
		contentPane.add(panelMembros);
		panelMembros.add(tablemembros);
		panelMembros.setLayout(null);
		
		JTextPane txtpnMembros = new JTextPane();
		txtpnMembros.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnMembros.setBackground(SystemColor.menu);
		txtpnMembros.setText("Membros");
		txtpnMembros.setBounds(79, 11, 70, 20);
		panelMembros.add(txtpnMembros);
		
		DefaultTableModel valmetas = (DefaultTableModel) tablemetas.getModel();
		if (essegrupo.listadegrupos.get(grupo).getListademetas().isEmpty() == false){

			Set<String> chaves = essegrupo.listadegrupos.get(grupo).getListademetas().keySet();
			for (String chave : chaves){
				valmetas.addRow(new String []{essegrupo.listadegrupos.get(grupo).getListademetas().get(chave).getMeta(), 
						essegrupo.listadegrupos.get(grupo).getListademetas().get(chave).getData(), 
						essegrupo.listadegrupos.get(grupo).getListademetas().get(chave).getPorcentagem()});



			}
		}
		
		DefaultTableModel valmembros = (DefaultTableModel) tablemembros.getModel();
		if (essegrupo.listadegrupos.get(grupo).getArray().isEmpty()== false){
			Set<String> chaves = essegrupo.listadegrupos.get(grupo).getArray().keySet();
			for (String chave : chaves){
				if (essegrupo.listadegrupos.get(grupo).getArray().containsKey(chave)){
					valmembros.addRow(new String []{essegrupo.listadegrupos.get(grupo).getArray().get(chave).getLogin()});
					
				}
			}


		}
	}
}
