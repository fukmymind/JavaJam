package cc.fukmymind.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Window.Type;

public class newJavaJamPopup extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField passwordField;
	private JPasswordField passwordFieldSecretWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			newJavaJamPopup dialog = new newJavaJamPopup();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public newJavaJamPopup() {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setType(Type.POPUP);
		setResizable(false);
		setTitle("JavaJam privacy settings");
		setBounds(100, 100, 459, 162);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			passwordField = new JPasswordField();
			passwordField.setEchoChar('_');
		}
		JLabel lblYourPassword = new JLabel("Your password:");
		JLabel lblYourSecretWord = new JLabel("Your secret word:");
		JCheckBox chckbxSerializeData = new JCheckBox("Serialize data");
		JCheckBox chckbxMakeAHash = new JCheckBox("Make a hash for password");
		JCheckBox chckbxMaximumPrivacy = new JCheckBox("Maximum privacy");
		
		passwordFieldSecretWord = new JPasswordField();
		passwordFieldSecretWord.setEchoChar('_');
		
		JSeparator separator = new JSeparator();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
							.addGap(20))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblYourPassword)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblYourSecretWord)
						.addComponent(chckbxSerializeData))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
							.addComponent(chckbxMakeAHash)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxMaximumPrivacy)
							.addContainerGap())
						.addComponent(passwordFieldSecretWord, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(2, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblYourPassword))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblYourSecretWord)
						.addComponent(passwordFieldSecretWord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxSerializeData)
						.addComponent(chckbxMakeAHash)
						.addComponent(chckbxMaximumPrivacy))
					.addContainerGap())
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JCheckBox chckbxBashMaskPassword = new JCheckBox("Bash mask pass");
				chckbxBashMaskPassword.setToolTipText("Password mask like in Bash (when you are not see, what you type)");
				chckbxBashMaskPassword.setHorizontalAlignment(SwingConstants.RIGHT);
				buttonPane.add(chckbxBashMaskPassword);
			}
			{
				JButton btnReadTermsOf = new JButton("Read terms of privacy");
				buttonPane.add(btnReadTermsOf);
			}
			{
				JButton okButton = new JButton("Yes, it's true!");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Forget it");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
