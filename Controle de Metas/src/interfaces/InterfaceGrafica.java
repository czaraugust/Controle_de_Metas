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

public class InterfaceGrafica extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(235, 58, 162, 227);
		getContentPane().add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(28, 58, 162, 232);
		getContentPane().add(panel);
		setFont(new Font("Arial", Font.PLAIN, 12));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426,384);
	}
}
