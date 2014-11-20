package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
<<<<<<< HEAD
=======
import javax.swing.JOptionPane;
>>>>>>> origin/master
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

<<<<<<< HEAD
=======
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

>>>>>>> origin/master
public class InterfaceInternaGruposFuncionario extends JFrame {

	private JPanel contentPane;
	private String grupo;
	private JTable tablemetas, tablemembros;	
	private DefaultTableModel modelometas, modelomebros;
<<<<<<< HEAD
=======
	private String selecao;
>>>>>>> origin/master
	
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
<<<<<<< HEAD
		tablemetas.setBounds(10, 44, 209, 171);
=======
		tablemetas.setBounds(10, 55, 209, 176);
>>>>>>> origin/master
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	
		JPanel panelMetas = new JPanel();
<<<<<<< HEAD
		panelMetas.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMetas.setBounds(10, 11, 229, 259);
=======
		panelMetas.setBackground(SystemColor.menu);
		panelMetas.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMetas.setBounds(10, 11, 229, 276);
>>>>>>> origin/master
		contentPane.add(panelMetas);
		panelMetas.add(tablemetas);
		panelMetas.setLayout(null);
		
		JTextPane txtpnMetas = new JTextPane();
		txtpnMetas.setBounds(90, 11, 40, 22);
		panelMetas.add(txtpnMetas);
		txtpnMetas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnMetas.setBackground(SystemColor.menu);
		txtpnMetas.setText("Metas");
		
<<<<<<< HEAD
		JPanel panelMembros = new JPanel();
		panelMembros.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMembros.setBounds(262, 11, 212, 259);
=======
		JButton AbrirMeta = new JButton("Abrir Meta");
		AbrirMeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int selecionada = tablemetas.getSelectedRow();
				selecao = tablemetas.getValueAt(selecionada, 2).toString();
				String selecaometa = tablemetas.getValueAt(selecionada, 0).toString();
				System.out.println("VALOR" + selecao);
				String meta;
				meta = JOptionPane.showInputDialog("Altere andamento da meta!");
				if (meta != null){
					tablemetas.setValueAt(meta, selecionada, 2);
					essegrupo.listadegrupos.get(grupo).getListademetas().get(selecaometa).setPorcentagem(meta);;
				}
			}
		});
		AbrirMeta.setBounds(29, 242, 150, 23);
		panelMetas.add(AbrirMeta);
		
		JTextPane txtpnMetas_1 = new JTextPane();
		txtpnMetas_1.setBackground(SystemColor.menu);
		txtpnMetas_1.setText("Metas");
		txtpnMetas_1.setBounds(10, 32, 48, 20);
		panelMetas.add(txtpnMetas_1);
		
		JTextPane txtpnDatalimite = new JTextPane();
		txtpnDatalimite.setText("   Data-Limite");
		txtpnDatalimite.setBackground(SystemColor.menu);
		txtpnDatalimite.setBounds(68, 32, 85, 20);
		panelMetas.add(txtpnDatalimite);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.menu);
		textPane.setText("%");
		textPane.setBounds(171, 32, 48, 20);
		panelMetas.add(textPane);
		
		JPanel panelMembros = new JPanel();
		panelMembros.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMembros.setBounds(262, 11, 212, 276);
>>>>>>> origin/master
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
