package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Font;

public class InterfaceGrupo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGrupo frame = new InterfaceGrupo();
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
	public InterfaceGrupo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 0, 232, 324);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAddMeta = new JButton("Add Meta");
		btnAddMeta.setBounds(20, 290, 89, 23);
		panel.add(btnAddMeta);
		
		JButton btnExcluiMeta = new JButton("Exclui Meta");
		btnExcluiMeta.setBounds(119, 290, 89, 23);
		panel.add(btnExcluiMeta);
		
		JTextPane txtpnMetas = new JTextPane();
		txtpnMetas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnMetas.setBackground(SystemColor.menu);
		txtpnMetas.setText("METAS");
		txtpnMetas.setBounds(85, 11, 53, 23);
		panel.add(txtpnMetas);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(264, 0, 233, 324);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAddMembro = new JButton("Add Membro");
		btnAddMembro.setBounds(10, 290, 100, 23);
		panel_1.add(btnAddMembro);
		
		JButton btnExcluiMembro = new JButton("Exclui Membro");
		btnExcluiMembro.setBounds(115, 290, 108, 23);
		panel_1.add(btnExcluiMembro);
		
		JTextPane txtpnMembros = new JTextPane();
		txtpnMembros.setBackground(SystemColor.menu);
		txtpnMembros.setText("MEMBROS");
		txtpnMembros.setBounds(89, 11, 61, 23);
		panel_1.add(txtpnMembros);
	}
}
