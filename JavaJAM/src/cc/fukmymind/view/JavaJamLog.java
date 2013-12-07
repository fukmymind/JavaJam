/*package cc.fukmymind.view;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Button;

public class JavaJamLog extends Dialog {

	protected Object result;
	protected Shell shlServerLog;
	private Table table;

	*//**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 *//*
	public JavaJamLog(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	*//**
	 * Open the dialog.
	 * @return the result
	 *//*
	public Object open() {
		createContents();
		shlServerLog.open();
		shlServerLog.layout();
		Display display = getParent().getDisplay();
		while (!shlServerLog.isDisposed()) {
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
		shlServerLog = new Shell(getParent(), getStyle());
		shlServerLog.setSize(450, 474);
		shlServerLog.setText("Server Log");
		
		table = new Table(shlServerLog, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(10, 10, 424, 402);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setResizable(false);
		tblclmnNewColumn.setWidth(69);
		tblclmnNewColumn.setText("Time");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setResizable(false);
		tblclmnNewColumn_1.setWidth(350);
		tblclmnNewColumn_1.setText("Text");
		
		Button btnCloseLog = new Button(shlServerLog, SWT.NONE);
		btnCloseLog.setBounds(10, 418, 424, 25);
		btnCloseLog.setText("Close Log");

	}

}
*/