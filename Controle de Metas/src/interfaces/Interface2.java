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
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class Interface2 extends JFrame {

	private JPanel contentPane;
	private static String nome;
	private JTable table;
	private JTextField Camponome;
	private JTextField CampoCoordenador;


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

		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setBounds(20, 64, 228, 208);
		
		

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 257, 322);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);

		JTextPane txtpnGrupos = new JTextPane();
		txtpnGrupos.setBounds(98, 6, 46, 22);
		panel.add(txtpnGrupos);
		txtpnGrupos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnGrupos.setBackground(SystemColor.menu);
		txtpnGrupos.setText("Grupos");


		JButton btnNewButton = new JButton("Abrir Grupo");
		btnNewButton.setBounds(10, 275, 109, 23);
		panel.add(btnNewButton);

		JButton btnExcluirGrupo = new JButton("Excluir Grupo");
		btnExcluirGrupo.setBounds(129, 275, 118, 23);
		panel.add(btnExcluirGrupo);
		
		JTextPane txtpnNomeDoGrupo = new JTextPane();
		txtpnNomeDoGrupo.setBackground(SystemColor.menu);
		txtpnNomeDoGrupo.setText(" Nome do Grupo");
		txtpnNomeDoGrupo.setBounds(10, 30, 103, 20);
		panel.add(txtpnNomeDoGrupo);
		txtpnNomeDoGrupo.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JTextPane txtpnCoordenador = new JTextPane();
		txtpnCoordenador.setBackground(SystemColor.menu);
		txtpnCoordenador.setText("   Coordenador");
		txtpnCoordenador.setBounds(108, 30, 130, 20);
		panel.add(txtpnCoordenador);
		txtpnCoordenador.setBorder(new LineBorder(new Color(0, 0, 0)));

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


		JButton btnCriarNovoGrupo = new JButton("Criar Novo Grupo");
		btnCriarNovoGrupo.setBounds(10, 201, 138, 23);
		panel_1.add(btnCriarNovoGrupo);
		btnCriarNovoGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = Camponome.getText().trim();
				String coordenador = CampoCoordenador.getText().trim();
				
				DefaultTableModel val = (DefaultTableModel) table.getModel();
				val.addRow(new String []{nome, coordenador});
				CampoCoordenador.setText("");
				Camponome.setText("");
				
				
			}
		});
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					nome, "coordenador"
				}
			));
			table.getColumnModel().getColumn(1).setPreferredWidth(99);
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.setBorder(new LineBorder(new Color(0, 0, 0)));
			table.setBackground(SystemColor.menu);
			contentPane.add(table);
		

		//System.out.println("Nomedentro" + InterfaceGrafica.logins.pop());


	}

	/*public void envia (String nome){
	textNomeUsuario.setText(nome);
	nome = textNomeUsuario.getText();
	System.out.println("Nome" +nome);

	}	

	public String getNome(){
		return  nome;

	}*/
}
