package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;

import java.awt.Dimension;
import java.awt.Window.Type;

import javax.swing.JRadioButton;
import javax.swing.JDesktopPane;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JLayeredPane;

import java.awt.Label;

import javax.swing.JComboBox;
import javax.swing.Box;
import javax.swing.JEditorPane;

import java.awt.Panel;

import javax.swing.UIManager;

import java.awt.SystemColor;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;

import principal.Funcionário;

public class InterfaceGrafica extends JFrame {
	private JPasswordField passwordField;
	private JTextField UserField;
	private JTextField CampoNome;
	private JTextField CampoUsuario;
	private JTextField CampoSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try 
				{

					InterfaceGrafica frame = new InterfaceGrafica();
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
	public InterfaceGrafica() {
		setBackground(Color.LIGHT_GRAY);
		setTitle("Gerenciador de Metas");
		setForeground(Color.LIGHT_GRAY);
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(235, 58, 162, 227);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setBackground(SystemColor.menu);
		txtpnNome.setFont(new Font("Tahoma", Font.PLAIN, 9));
		txtpnNome.setText("Nome");
		txtpnNome.setBounds(36, 30, 46, 17);
		panel_1.add(txtpnNome);

		JTextPane txtpnCadastrar = new JTextPane();
		txtpnCadastrar.setBounds(51, 6, 71, 24);
		txtpnCadastrar.setFont(new Font("Arial", Font.PLAIN, 15));
		txtpnCadastrar.setBackground(SystemColor.menu);
		txtpnCadastrar.setText("Cadastrar");
		panel_1.add(txtpnCadastrar);

		CampoNome = new JTextField();
		CampoNome.setBounds(36, 50, 86, 20);
		panel_1.add(CampoNome);
		CampoNome.setColumns(10);

		JTextPane txtpnUsurio_1 = new JTextPane();
		txtpnUsurio_1.setBackground(SystemColor.menu);
		txtpnUsurio_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		txtpnUsurio_1.setText("Usu\u00E1rio");
		txtpnUsurio_1.setBounds(36, 71, 86, 17);
		panel_1.add(txtpnUsurio_1);

		CampoUsuario = new JTextField();
		CampoUsuario.setBounds(36, 91, 86, 20);
		panel_1.add(CampoUsuario);
		CampoUsuario.setColumns(10);

		JTextPane txtpnSenha_1 = new JTextPane();
		txtpnSenha_1.setBackground(SystemColor.menu);
		txtpnSenha_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		txtpnSenha_1.setText("Senha (apenas n\u00FAmeros)");
		txtpnSenha_1.setBounds(36, 111, 116, 17);
		panel_1.add(txtpnSenha_1);

		CampoSenha = new JTextField();
		CampoSenha.setBounds(36, 132, 86, 20);
		panel_1.add(CampoSenha);
		CampoSenha.setColumns(10);


		JRadioButton isCoordenador = new JRadioButton("Coordenador?");
		isCoordenador.setBounds(36, 159, 109, 23);
		panel_1.add(isCoordenador);

		//CADASTRO
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String usuario = CampoUsuario.getText();
				String nome = CampoNome.getText();
				int senha = Integer.parseInt(CampoSenha.getText());

				Funcionário funcionario = new Funcionário(nome, senha, isCoordenador.isSelected(), usuario);
				String message = funcionario.criarFuncionario(funcionario);
				JOptionPane.showMessageDialog(null, message);

				//LIMPAR CAMPOS DEPOIS DO OK

			}
		});
		btnCadastrar.setBounds(33, 193, 100, 23);
		panel_1.add(btnCadastrar);

		JPanel panel = new JPanel();
		panel.setBounds(28, 58, 162, 232);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(panel);
		panel.setLayout(null);

		JTextPane txtpnEntrar = new JTextPane();
		txtpnEntrar.setBounds(52, 6, 46, 24);
		txtpnEntrar.setBackground(SystemColor.menu);
		txtpnEntrar.setFont(new Font("Arial", Font.PLAIN, 15));
		txtpnEntrar.setText("Entrar");
		panel.add(txtpnEntrar);

		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(32, 131, 86, 20);
		panel.add(passwordField);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				//JOptionPane.showMessageDialog(null, "      OK!");

			}
		});
		btnEntrar.setBounds(35, 177, 83, 23);
		panel.add(btnEntrar);

		JTextPane txtpnSenha = new JTextPane();
		txtpnSenha.setBackground(SystemColor.menu);
		txtpnSenha.setFont(new Font("Tahoma", Font.PLAIN, 9));
		txtpnSenha.setText("Senha (apenas n\u00FAmeros)");
		txtpnSenha.setBounds(35, 100, 117, 20);
		panel.add(txtpnSenha);

		JTextPane txtpnUsurio = new JTextPane();
		txtpnUsurio.setBackground(SystemColor.menu);
		txtpnUsurio.setFont(new Font("Tahoma", Font.PLAIN, 9));
		txtpnUsurio.setText("Usu\u00E1rio");
		txtpnUsurio.setBounds(35, 41, 68, 17);
		panel.add(txtpnUsurio);

		UserField = new JTextField();
		UserField.setBounds(35, 69, 86, 20);
		panel.add(UserField);
		UserField.setColumns(10);
		setFont(new Font("Arial", Font.PLAIN, 12));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426,384);
	}
}
