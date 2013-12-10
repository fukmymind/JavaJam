package cc.fukmymind.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.AbstractListModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;

public class newJavaJam {

	private JFrame frmJavajam;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newJavaJam window = new newJavaJam();
					window.frmJavajam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public newJavaJam() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavajam = new JFrame();
		frmJavajam.setTitle("JavaJam");
		frmJavajam.setBounds(100, 100, 660, 413);
		frmJavajam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		frmJavajam.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JScrollPane scrollPaneHome = new JScrollPane();
		tabbedPane.addTab("Home", null, scrollPaneHome, null);
		
		table = new JTable();
		table.setBackground(new Color(224, 255, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				" \u2116", "  Server name:", " Public:", " Genre:", "Required play skill:"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(34);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(357);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(49);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(109);
		scrollPaneHome.setViewportView(table);
		
		JMenuBar menuBar = new JMenuBar();
		frmJavajam.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmRefresh = new JMenuItem("Refresh");
		mnFile.add(mntmRefresh);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);
		
		JMenuItem mntmAudioSettings = new JMenuItem("Audio settings");
		mnSettings.add(mntmAudioSettings);
		
		JMenuItem mntmUserSettings = new JMenuItem("User settings");
		mnSettings.add(mntmUserSettings);
		
		JMenuItem mntmStatus = new JMenuItem("Status:");
		mntmStatus.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mntmStatus.setForeground(Color.GRAY);
		mntmStatus.setHorizontalAlignment(SwingConstants.TRAILING);
		menuBar.add(mntmStatus);
	}
}
