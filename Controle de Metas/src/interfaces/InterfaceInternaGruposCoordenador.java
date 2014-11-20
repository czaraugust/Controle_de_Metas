package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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

import principal.Funcionário;
import principal.Grupo;

import java.awt.SystemColor;
import java.awt.Font;

import principal.Grupo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Set;
<<<<<<< HEAD
=======
import javax.swing.JEditorPane;
>>>>>>> origin/master
public class InterfaceInternaGruposCoordenador extends JFrame {

	private JPanel contentPane;
	private String usuario, grupo;
	private JTable tablemetas, tablemembros;	
	private DefaultTableModel modelometas, modelomebros;
	private JTextField MetatextField;
	private JTextField AddMembroTextField;
	private JTextField DatatextField;
	private String selecao;


	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the frame.
	 */
	public InterfaceInternaGruposCoordenador(String usuario, String grupo) {
		setTitle("Grupo");
		this.usuario = usuario;
		this.grupo = grupo;

		Grupo essegrupo = new Grupo("");
		Funcionário esseFuncionário = new Funcionário("nome", 0, false, "login");

		modelomebros = new DefaultTableModel();  
		modelomebros.setColumnIdentifiers(new String []{"Membros"});
		tablemembros = new JTable(modelomebros);
<<<<<<< HEAD
		tablemembros.setBorder(new LineBorder(new Color(0, 0, 0)));
		tablemembros.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tablemembros.setBackground(SystemColor.menu);
		tablemembros.setBounds(10, 62, 218, 148);
=======
		tablemembros.setBounds(10, 60, 198, 148);
		tablemembros.setBorder(new LineBorder(new Color(0, 0, 0)));
		tablemembros.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tablemembros.setBackground(SystemColor.menu);
>>>>>>> origin/master

		modelometas = new DefaultTableModel();  
		modelometas.setColumnIdentifiers(new String []{"Metas", "Data", "%"});
		tablemetas = new JTable(modelometas);
		tablemetas.setBorder(new LineBorder(new Color(0, 0, 0)));
		tablemetas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tablemetas.setBackground(SystemColor.menu);
<<<<<<< HEAD
		tablemetas.setBounds(10, 58, 269, 175);
=======
		tablemetas.setBounds(10, 58, 295, 175);
>>>>>>> origin/master

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
<<<<<<< HEAD
		panelmetas.setBounds(10, 40, 289, 375);
=======
		panelmetas.setBounds(10, 40, 315, 375);
>>>>>>> origin/master
		panelmetas.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panelmetas);
		panelmetas.setLayout(null);
		panelmetas.add(tablemetas);
		JButton btnAddMeta = new JButton("Add Meta");
		btnAddMeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String textoMetas = MetatextField.getText().trim();
				String textoData = DatatextField.getText().trim();
				if(!essegrupo.listadegrupos.get(grupo).getListademetas().containsKey(textoMetas) ){
					valmetas.addRow(new String [] {textoMetas, textoData, "0%"});
					essegrupo.listadegrupos.get(grupo).addMeta(grupo, textoMetas, textoData, usuario);
					MetatextField.setText("");
					DatatextField.setText("");
					JOptionPane.showMessageDialog(null, "Meta adicionada");


				}				
			}
		});
<<<<<<< HEAD
		btnAddMeta.setBounds(27, 341, 99, 23);
=======
		btnAddMeta.setBounds(10, 341, 89, 23);
>>>>>>> origin/master
		panelmetas.add(btnAddMeta);

		JButton btnExcluiMeta = new JButton("Exclui Meta");
		btnExcluiMeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int selecionada = tablemetas.getSelectedRow();
				selecao = tablemetas.getValueAt(selecionada, 0).toString();
				modelometas.removeRow(selecionada);
				essegrupo.listadegrupos.get(grupo).excluiMetas(selecao, grupo);
				JOptionPane.showMessageDialog(null, "Meta deletada!");
			}
		});
<<<<<<< HEAD
		btnExcluiMeta.setBounds(158, 341, 103, 23);
		panelmetas.add(btnExcluiMeta);

		JTextPane txtpnMetas = new JTextPane();
		txtpnMetas.setBounds(118, 11, 53, 23);
=======
		btnExcluiMeta.setBounds(99, 341, 99, 23);
		panelmetas.add(btnExcluiMeta);

		JTextPane txtpnMetas = new JTextPane();
		txtpnMetas.setBounds(129, 11, 53, 23);
>>>>>>> origin/master
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
		
		JTextPane txtpnMeta_1 = new JTextPane();
		txtpnMeta_1.setBackground(SystemColor.menu);
		txtpnMeta_1.setText("  Meta");
<<<<<<< HEAD
		txtpnMeta_1.setBounds(10, 37, 89, 20);
		panelmetas.add(txtpnMeta_1);
		txtpnMeta_1.setBorder(new LineBorder(new Color(0, 0, 0)));
=======
		txtpnMeta_1.setBounds(29, 37, 60, 20);
		panelmetas.add(txtpnMeta_1);
		txtpnMeta_1.setBorder(null);
>>>>>>> origin/master
		
		JTextPane txtpnDatalimite = new JTextPane();
		txtpnDatalimite.setBackground(SystemColor.menu);
		txtpnDatalimite.setText("Data-Limite");
<<<<<<< HEAD
		txtpnDatalimite.setBounds(99, 37, 89, 20);
		txtpnDatalimite.setBorder(new LineBorder(new Color(0, 0, 0)));
=======
		txtpnDatalimite.setBounds(128, 37, 79, 20);
		txtpnDatalimite.setBorder(null);
>>>>>>> origin/master
		panelmetas.add(txtpnDatalimite);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setText("        %");
<<<<<<< HEAD
		textPane_1.setBounds(180, 37, 99, 20);
		textPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelmetas.add(textPane_1);

		JPanel panelmembros = new JPanel();
		panelmembros.setBounds(314, 40, 245, 375);
=======
		textPane_1.setBounds(220, 37, 69, 20);
		textPane_1.setBorder(null);
		panelmetas.add(textPane_1);
		
		JButton AbrirMeta = new JButton("Abrir Meta");
		AbrirMeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int selecionada = tablemetas.getSelectedRow();
				selecao = tablemetas.getValueAt(selecionada, 2).toString();
				String selecaometa = tablemetas.getValueAt(selecionada, 0).toString();
				
				String meta;
				meta = JOptionPane.showInputDialog("Altere andamento da meta!");
				if (meta != null){
					tablemetas.setValueAt(meta, selecionada, 2);
					essegrupo.listadegrupos.get(grupo).getListademetas().get(selecaometa).setPorcentagem(meta);;
				}
				
			}
		});
		AbrirMeta.setBounds(199, 341, 106, 23);
		panelmetas.add(AbrirMeta);

		JPanel panelmembros = new JPanel();
		panelmembros.setBounds(335, 40, 224, 375);
>>>>>>> origin/master
		panelmembros.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panelmembros);
		panelmembros.setLayout(null);
		panelmembros.add(tablemembros);


		DefaultTableModel valmembros = (DefaultTableModel) tablemembros.getModel();
		if (essegrupo.listadegrupos.get(grupo).getArray().isEmpty()== false){
			Set<String> chaves = essegrupo.listadegrupos.get(grupo).getArray().keySet();
			for (String chave : chaves){
				if (essegrupo.listadegrupos.get(grupo).getArray().containsKey(chave)){
					valmembros.addRow(new String []{essegrupo.listadegrupos.get(grupo).getArray().get(chave).getLogin()});
					
				}
			}


		}

		JButton btnAddMembro = new JButton("Add Membro");
<<<<<<< HEAD
=======
		btnAddMembro.setBounds(10, 250, 93, 23);
>>>>>>> origin/master
		btnAddMembro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String addmembro = AddMembroTextField.getText().trim();
				if (esseFuncionário.listadefuncionarios.containsKey(addmembro)){
					valmembros.addRow(new String []{esseFuncionário.listadefuncionarios.get(addmembro).getLogin()});
					essegrupo.addMembro(esseFuncionário.listadefuncionarios.get(addmembro), essegrupo.listadegrupos.get(grupo));
					JOptionPane.showMessageDialog(null, "Membro adicionado!");
				}
				else{
					JOptionPane.showMessageDialog(null, "Nome de usuário inválido. Forneça um nome de usuario exsitente!");
				}

				AddMembroTextField.setText("");
			}
		});
<<<<<<< HEAD
		btnAddMembro.setBounds(10, 250, 108, 23);
		panelmembros.add(btnAddMembro);

		JButton btnExcluiMembro = new JButton("Exclui Membro");
=======
		panelmembros.add(btnAddMembro);

		JButton btnExcluiMembro = new JButton("Exclui Membro");
		btnExcluiMembro.setBounds(107, 250, 101, 23);
>>>>>>> origin/master
		btnExcluiMembro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				int selecionada = tablemembros.getSelectedRow();
				selecao = tablemembros.getValueAt(selecionada, 0).toString();
				modelomebros.removeRow(selecionada);
				essegrupo.listadegrupos.get(grupo).removeMembro(esseFuncionário.listadefuncionarios.get(selecao), grupo);
				JOptionPane.showMessageDialog(null, "Membro excluído");
				}
				catch (ArrayIndexOutOfBoundsException e){
					JOptionPane.showMessageDialog(null, "Não há membros nesse grupo");

				}
			}
		});
<<<<<<< HEAD
		btnExcluiMembro.setBounds(117, 250, 118, 23);
		panelmembros.add(btnExcluiMembro);

		JTextPane txtpnMembros = new JTextPane();
		txtpnMembros.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnMembros.setBackground(SystemColor.menu);
		txtpnMembros.setText("MEMBROS");
		txtpnMembros.setBounds(94, 11, 69, 23);
		panelmembros.add(txtpnMembros);

		AddMembroTextField = new JTextField();
		AddMembroTextField.setBounds(10, 219, 218, 20);
=======
		panelmembros.add(btnExcluiMembro);

		JTextPane txtpnMembros = new JTextPane();
		txtpnMembros.setBounds(94, 11, 69, 23);
		txtpnMembros.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnMembros.setBackground(SystemColor.menu);
		txtpnMembros.setText("MEMBROS");
		panelmembros.add(txtpnMembros);

		AddMembroTextField = new JTextField();
		AddMembroTextField.setBounds(10, 219, 198, 20);
>>>>>>> origin/master
		panelmembros.add(AddMembroTextField);
		AddMembroTextField.setColumns(10);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(190, 11, 109, 25);
		contentPane.add(textPane);
		textPane.setText(grupo);


	}
}
