package cc.fukmymind.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;

public class newJavaJamAudioSettings extends JDialog {
	
	private static newJavaJamAudioSettings instance = new newJavaJamAudioSettings();

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	private static void main(String[] args) {
		try {
			newJavaJamAudioSettings dialog = new newJavaJamAudioSettings();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	private newJavaJamAudioSettings() {
		setTitle("JavaJam Audio settings");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 452, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnReturnToDefault = new JButton("Return to default settings");
				buttonPane.add(btnReturnToDefault);
			}
			{
				JButton okButton = new JButton("Save audio settings");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Discard audio settings");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public static newJavaJamAudioSettings getInstance() {
		return instance;
	}

}
