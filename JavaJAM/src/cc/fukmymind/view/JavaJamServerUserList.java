/*package cc.fukmymind.view;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class JavaJamServerUserList extends Dialog {

	protected Object result;
	protected Shell shlUserlist;
	private Table table;

	*//**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 *//*
	public JavaJamServerUserList(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	*//**
	 * Open the dialog.
	 * @return the result
	 *//*
	public Object open() {
		createContents();
		shlUserlist.open();
		shlUserlist.layout();
		Display display = getParent().getDisplay();
		while (!shlUserlist.isDisposed()) {
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
		shlUserlist = new Shell(getParent(), getStyle());
		shlUserlist.setSize(450, 300);
		shlUserlist.setText("Set userlist");
		
		table = new Table(shlUserlist, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(10, 10, 424, 226);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnUsername = new TableColumn(table, SWT.NONE);
		tblclmnUsername.setResizable(false);
		tblclmnUsername.setWidth(100);
		tblclmnUsername.setText("Username");
		
		TableColumn tblclmnPassword = new TableColumn(table, SWT.NONE);
		tblclmnPassword.setResizable(false);
		tblclmnPassword.setWidth(100);
		tblclmnPassword.setText("Password");
		
		TableColumn tblclmnRights = new TableColumn(table, SWT.NONE);
		tblclmnRights.setResizable(false);
		tblclmnRights.setWidth(218);
		tblclmnRights.setText("Rights");
		
		Button btnAddUser = new Button(shlUserlist, SWT.NONE);
		btnAddUser.setBounds(10, 242, 75, 25);
		btnAddUser.setText("Add User");
		
		Button btnDeleteUser = new Button(shlUserlist, SWT.NONE);
		btnDeleteUser.setBounds(91, 242, 75, 25);
		btnDeleteUser.setText("Delete User");

	}
}
*/