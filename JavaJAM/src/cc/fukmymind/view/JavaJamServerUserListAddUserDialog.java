/*package cc.fukmymind.view;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;

public class JavaJamServerUserListAddUserDialog extends Dialog {

	protected Object result;
	protected Shell shlAddUser;
	private Text text;
	private Text text_1;

	*//**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 *//*
	public JavaJamServerUserListAddUserDialog(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	*//**
	 * Open the dialog.
	 * @return the result
	 *//*
	public Object open() {
		createContents();
		shlAddUser.open();
		shlAddUser.layout();
		Display display = getParent().getDisplay();
		while (!shlAddUser.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	*//**
	 * Create contents of the dialog.
	 *//*
	private void createContents() {
		shlAddUser = new Shell(getParent(), getStyle());
		shlAddUser.setSize(230, 155);
		shlAddUser.setText("Add user");
		
		Label lblUsername = new Label(shlAddUser, SWT.NONE);
		lblUsername.setBounds(10, 7, 55, 15);
		lblUsername.setText("Username:");
		
		text = new Text(shlAddUser, SWT.BORDER);
		text.setBounds(71, 4, 147, 21);
		
		Label lblPassword = new Label(shlAddUser, SWT.NONE);
		lblPassword.setBounds(10, 31, 55, 15);
		lblPassword.setText("Password:");
		
		text_1 = new Text(shlAddUser, SWT.BORDER);
		text_1.setBounds(71, 28, 147, 21);
		
		Group grpRights = new Group(shlAddUser, SWT.NONE);
		grpRights.setText("Rights");
		grpRights.setBounds(10, 52, 208, 42);
		
		Button btnUser = new Button(grpRights, SWT.RADIO);
		btnUser.setBounds(10, 16, 44, 16);
		btnUser.setText("User");
		
		Button btnModerator = new Button(grpRights, SWT.RADIO);
		btnModerator.setBounds(60, 16, 77, 16);
		btnModerator.setText("Moderator");
		
		Button btnAdmin = new Button(grpRights, SWT.RADIO);
		btnAdmin.setBounds(143, 16, 55, 16);
		btnAdmin.setText("Admin");
		
		Button btnAdd = new Button(shlAddUser, SWT.NONE);
		btnAdd.setBounds(143, 99, 75, 25);
		btnAdd.setText("Add");
		
		Button btnCancel = new Button(shlAddUser, SWT.NONE);
		btnCancel.setBounds(62, 100, 75, 25);
		btnCancel.setText("Go back");

	}
}
*/