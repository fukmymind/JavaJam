package cc.fukmymind.view.swingTests;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;

import cc.fukmymind.model.JavaJamServer;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestWindowToJavaJAM {

	Random rand;
	private JFrame frame;
	JavaJamServer server;
	String hostname;
	int port;
	JSpinner spinnerPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestWindowToJavaJAM window = new TestWindowToJavaJAM();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestWindowToJavaJAM() {
		initialize();
		//comment
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(240, 320);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		
		JLabel lblPort = new JLabel("Port:");
		
		spinnerPort = new JSpinner();
		spinnerPort.setModel(new SpinnerNumberModel(1000, 1000, 65535, 1));
		
		JButton btnRandomize = new JButton("Randomize");
		btnRandomize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hlhlh");
				
				int random_val = rand.nextInt(65535);
				spinnerPort.setValue((int)random_val);
				
			}
		});
		
		JButton btnStartServer = new JButton("Start Server");
		
		JButton btnStopServer = new JButton("Stop Server");
		
		JLabel lblStatus = new JLabel("Status");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPort)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinnerPort, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRandomize, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnStartServer)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnStopServer))
						.addComponent(lblStatus))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPort)
						.addComponent(spinnerPort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRandomize))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnStartServer)
						.addComponent(btnStopServer))
					.addPreferredGap(ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
					.addComponent(lblStatus)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
