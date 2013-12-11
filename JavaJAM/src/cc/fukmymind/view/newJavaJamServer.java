package cc.fukmymind.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class newJavaJamServer {

	private JFrame frmJavaJamServer;
	private JTextField textFieldServerName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newJavaJamServer window = new newJavaJamServer();
					window.frmJavaJamServer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public newJavaJamServer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaJamServer = new JFrame();
		frmJavaJamServer.setResizable(false);
		frmJavaJamServer.setTitle("Java Jam server");
		frmJavaJamServer.setBounds(100, 100, 632, 311);
		frmJavaJamServer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmJavaJamServer.getContentPane().add(panel, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panelServer = new JPanel();
		
		JLabel labelAddress = new JLabel("Address:");
		
		JSpinner spinnerPort = new JSpinner();
		spinnerPort.setModel(new SpinnerNumberModel(2013, 2013, 65535, 1));
		
		JLabel label_1 = new JLabel(":");
		
		JFormattedTextField formattedTextFieldAddress = new JFormattedTextField();
		formattedTextFieldAddress.setText("###.###.###.###");
		
		JLabel labelServerName = new JLabel("Server name:");
		
		textFieldServerName = new JTextField();
		textFieldServerName.setColumns(10);
		
		JLabel labelMaxUsers = new JLabel("Max. users:");
		
		JSpinner spinnerMaxUsers = new JSpinner();
		spinnerMaxUsers.setModel(new SpinnerNumberModel(2, 2, 16, 1));
		
		JToggleButton toggleButtonStartStopServer = new JToggleButton("Start server");
		
		JButton buttonRestartServer = new JButton("Restart server");
		
		JCheckBox checkBoxAllowAnons = new JCheckBox("Allow anonymous");
		
		JLabel labelPreferedGenre = new JLabel("Prefered genre:");
		
		JComboBox comboBoxPreferedGenre = new JComboBox();
		comboBoxPreferedGenre.setModel(new DefaultComboBoxModel(new String[] {"Any", "Rock", "Pop", "Metal", "Blues", "Jazz"}));
		
		JLabel labelDescriptionGroup = new JLabel("Description of group:");
		
		JEditorPane editorPaneDescriptionGroup = new JEditorPane();
		editorPaneDescriptionGroup.setContentType("text/html");
		
		JLabel labelPreferedSkill = new JLabel("Prefered skill:");
		
		JComboBox comboBoxPreferedSkill = new JComboBox();
		comboBoxPreferedSkill.setModel(new DefaultComboBoxModel(new String[] {"Newbie", "Intermediate", "Professional", "Rockstar"}));
		
		JCheckBox chckbxMakePrivate = new JCheckBox("Make private");
		GroupLayout gl_panelServer = new GroupLayout(panelServer);
		gl_panelServer.setHorizontalGroup(
			gl_panelServer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelServer.createSequentialGroup()
					.addGroup(gl_panelServer.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelServer.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_panelServer.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelServer.createSequentialGroup()
									.addComponent(labelServerName)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldServerName, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
								.addGroup(gl_panelServer.createSequentialGroup()
									.addComponent(labelAddress)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(formattedTextFieldAddress, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(spinnerPort, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelServer.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panelServer.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panelServer.createSequentialGroup()
											.addComponent(labelPreferedGenre)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBoxPreferedGenre, 0, 248, Short.MAX_VALUE))
										.addGroup(gl_panelServer.createSequentialGroup()
											.addComponent(labelMaxUsers)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(spinnerMaxUsers, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(checkBoxAllowAnons)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(chckbxMakePrivate))
										.addGroup(gl_panelServer.createParallelGroup(Alignment.LEADING, false)
											.addGroup(gl_panelServer.createSequentialGroup()
												.addComponent(labelPreferedSkill)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(comboBoxPreferedSkill, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addGroup(gl_panelServer.createSequentialGroup()
												.addComponent(labelDescriptionGroup)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(editorPaneDescriptionGroup, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))))))
						.addGroup(gl_panelServer.createSequentialGroup()
							.addContainerGap()
							.addComponent(toggleButtonStartStopServer, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(buttonRestartServer, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))
					.addGap(117))
		);
		gl_panelServer.setVerticalGroup(
			gl_panelServer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelServer.createSequentialGroup()
					.addGroup(gl_panelServer.createParallelGroup(Alignment.BASELINE)
						.addComponent(spinnerPort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(labelAddress)
						.addComponent(formattedTextFieldAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelServer.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelServerName)
						.addComponent(textFieldServerName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelServer.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelMaxUsers)
						.addComponent(spinnerMaxUsers, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxMakePrivate)
						.addComponent(checkBoxAllowAnons))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelServer.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelPreferedGenre)
						.addComponent(comboBoxPreferedGenre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelServer.createParallelGroup(Alignment.LEADING)
						.addComponent(labelDescriptionGroup)
						.addComponent(editorPaneDescriptionGroup, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelServer.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelPreferedSkill)
						.addComponent(comboBoxPreferedSkill, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panelServer.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelServer.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(buttonRestartServer, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panelServer.createSequentialGroup()
							.addGap(18)
							.addComponent(toggleButtonStartStopServer)
							.addContainerGap())))
		);
		panelServer.setLayout(gl_panelServer);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 639, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panelServer, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 323, Short.MAX_VALUE)
				.addComponent(panelServer, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
		);
		
		JList listServerLog = new JList();
		listServerLog.setBackground(new Color(250, 250, 210));
		scrollPane.setViewportView(listServerLog);
		
		panel.setLayout(gl_panel);
		
		JMenuBar menuBar = new JMenuBar();
		frmJavaJamServer.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenuItem mntmStatus = new JMenuItem("Status:");
		mntmStatus.setEnabled(false);
		mntmStatus.setForeground(Color.GRAY);
		mntmStatus.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		menuBar.add(mntmStatus);
	}

}
