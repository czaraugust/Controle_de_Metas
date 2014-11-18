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

import principal.Funcionário;

import java.awt.SystemColor;
import java.awt.Font;
import java.util.Set;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

import principal.Grupo;

public class Interface2 extends JFrame {

	private JPanel contentPane;
	private static String nome;
	private JTable table;
	private JTextField Camponome;
	private JTextField CampoCoordenador;
	private String usuario;


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
		
		//QUERO PEGAR AQUELE VALOR DE USUARIO E RECEBER ELE AQUI DENTRO
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 470, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setEnabled(false);
		table.setBounds(20, 71, 228, 218);
		
		

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
		
		
		System.out.println("STRING" +usuario );
		JTextPane txtpnNomeDoGrupo = new JTextPane();
		txtpnNomeDoGrupo.setBackground(SystemColor.menu);
		txtpnNomeDoGrupo.setText("                       Nome do Grupo");
		txtpnNomeDoGrupo.setBounds(10, 35, 196, 20);
		panel.add(txtpnNomeDoGrupo);
		txtpnNomeDoGrupo.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JTextPane TextoUsuario = new JTextPane();
		TextoUsuario.setBackground(SystemColor.menu);
		TextoUsuario.setBounds(79, 11, 109, 20);
		panel.add(TextoUsuario);
		TextoUsuario.setText(usuario);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(290, 11, 154, 322);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JTextPane NomedoGrupo = new JTextPane();
		NomedoGrupo.setBackground(SystemColor.menu);
		NomedoGrupo.setText("Nome do Grupo");
		NomedoGrupo.setBounds(24, 25, 98, 20);
		panel_1.add(NomedoGrupo);

		Camponome = new JTextField();
		Camponome.setBounds(24, 56, 86, 20);
		panel_1.add(Camponome);
		Camponome.setColumns(10);

		CampoCoordenador = new JTextField();
		CampoCoordenador.setBounds(24, 136, 86, 20);
		panel_1.add(CampoCoordenador);
		CampoCoordenador.setColumns(10);

		JTextPane CoordenadordoGrupo = new JTextPane();
		CoordenadordoGrupo.setBackground(SystemColor.menu);
		CoordenadordoGrupo.setText("Coordenador");
		CoordenadordoGrupo.setBounds(22, 105, 88, 20);
		panel_1.add(CoordenadordoGrupo);
		
		Grupo grupo = new Grupo(nome);
		
		JButton btnCriarNovoGrupo = new JButton("Criar Novo Grupo");
		btnCriarNovoGrupo.setBounds(10, 201, 138, 23);
		panel_1.add(btnCriarNovoGrupo);
		btnCriarNovoGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = Camponome.getText().trim();
				String coordenador = CampoCoordenador.getText().trim();
				
				DefaultTableModel val = (DefaultTableModel) table.getModel();
				val.addRow(new String []{nome, coordenador});
				Funcionário func = new Funcionário("", 0, false, "");

				func = func.listadefuncionarios.get(usuario);

				System.out.println("Nome " + func.getNome());
				
				grupo.criarGrupo(nome, func);
				
			
				
				CampoCoordenador.setText("");
				Camponome.setText("");
				
				
			}
		});
		table.setModel(new DefaultTableModel(
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
			contentPane.add(table);
			
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
