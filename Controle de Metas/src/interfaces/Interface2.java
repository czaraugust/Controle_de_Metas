package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;

import principal.Funcionário;

import java.awt.SystemColor;
import java.awt.Font;
import java.util.Set;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

import principal.Grupo;

public class Interface2 extends JFrame {

	private JPanel contentPane;
	private static String nome;
	private JTable table;
	private JTextField Camponome;
	private String usuario;
	public DefaultTableModel modelo;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface2 frame = new Interface2("");
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

	public Interface2(String usuario ) {
		this.usuario = usuario;
		modelo = new DefaultTableModel();  
		modelo.setColumnIdentifiers(new String []{"Nome do Grupo"});
		table = new JTable(modelo);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setBackground(SystemColor.menu);
		table.setBounds(32, 66, 196, 166);


		//QUERO PEGAR AQUELE VALOR DE USUARIO E RECEBER ELE AQUI DENTRO
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 470, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);






		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 257, 322);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);

		JTextPane txtpnGrupos = new JTextPane();
		txtpnGrupos.setBounds(10, 11, 71, 23);
		panel.add(txtpnGrupos);
		txtpnGrupos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnGrupos.setBackground(SystemColor.menu);
		txtpnGrupos.setText("Grupos de");


		JButton btnNewButton = new JButton("Abrir Grupo");
		btnNewButton.setBounds(10, 288, 109, 23);
		panel.add(btnNewButton);

		JButton btnExcluirGrupo = new JButton("Excluir Grupo");
		btnExcluirGrupo.setBounds(129, 288, 118, 23);
		panel.add(btnExcluirGrupo);



		JTextPane txtpnNomeDoGrupo = new JTextPane();
		txtpnNomeDoGrupo.setBounds(32, 35, 196, 20);
		txtpnNomeDoGrupo.setBackground(SystemColor.menu);
		txtpnNomeDoGrupo.setText("                       Nome do Grupo");
		panel.add(txtpnNomeDoGrupo);
		txtpnNomeDoGrupo.setBorder(new LineBorder(new Color(0, 0, 0)));

		JTextPane TextoUsuario = new JTextPane();
		TextoUsuario.setBounds(78, 11, 109, 20);
		TextoUsuario.setBackground(SystemColor.menu);
		panel.add(TextoUsuario);
		TextoUsuario.setText(usuario);



		panel.add(table);
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(290, 71, 154, 169);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JTextPane NomedoGrupo = new JTextPane();
		NomedoGrupo.setBackground(SystemColor.menu);
		NomedoGrupo.setText("Nome do Grupo");
		NomedoGrupo.setBounds(34, 25, 98, 20);
		panel_1.add(NomedoGrupo);

		Camponome = new JTextField();
		Camponome.setBounds(10, 56, 138, 20);
		panel_1.add(Camponome);
		Camponome.setColumns(10);

		Grupo grupo = new Grupo(nome);
		DefaultTableModel val = (DefaultTableModel) table.getModel();
		if (grupo.listadegrupos.isEmpty() == false){





		Set<String> chaves = grupo.listadegrupos.keySet();
			for (String chave : chaves){
				
				val.addRow(new String []{grupo.listadegrupos.get(chave).getNome()});
				

			}
		}

		JButton btnCriarNovoGrupo = new JButton("Criar Novo Grupo");
		btnCriarNovoGrupo.setBounds(10, 115, 138, 23);
		panel_1.add(btnCriarNovoGrupo);
		btnCriarNovoGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = Camponome.getText().trim();
			
				
				if (grupo.listadegrupos.containsValue(nome) == false){
				val.addRow(new String []{nome});
				Funcionário func = new Funcionário("", 0, false, "");

				func = func.listadefuncionarios.get(usuario);

				grupo.criarGrupo(nome, func);
				JOptionPane.showMessageDialog(null, "Grupo Criado com sucesso");

				}
				else{
					JOptionPane.showMessageDialog(null, "Grupo já existente");
				}

		
				Camponome.setText("");


			}
		});
		/*table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome do Grupo"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(116);
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.setBorder(new LineBorder(new Color(0, 0, 0)));
			table.setBackground(SystemColor.menu);
			contentPane.add(table);*/

		/*if (!grupo.listadegrupos.isEmpty()){
				Set<String> chaves = grupo.listadegrupos.keySet();
				for (String chave : chaves)  
				{
				table.setModel(new DefaultTableModel(
						new Object[][] {
						},
						new String[] {
							grupo.listadegrupos.get(chave).getNome(), "coordenador"
						}
					));

				}

			}*/


		//System.out.println("Nomedentro" + InterfaceGrafica.logins.pop());


	}
}
