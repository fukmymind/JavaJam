/*package cc.fukmymind.view;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class JavaJamServerListAvilableHosts extends Dialog {

	protected Object result;
	protected Shell shlListOfAvilable;
	private Table table;
	private Table table_1;

	*//**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 *//*
	public JavaJamServerListAvilableHosts(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	*//**
	 * Open the dialog.
	 * @return the result
	 *//*
	public Object open() {
		createContents();
		shlListOfAvilable.open();
		shlListOfAvilable.layout();
		Display display = getParent().getDisplay();
		while (!shlListOfAvilable.isDisposed()) {
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
		shlListOfAvilable = new Shell(getParent(), getStyle());
		shlListOfAvilable.setSize(450, 300);
		shlListOfAvilable.setText("List of avilable hosts");
		
		Button btnConnect = new Button(shlListOfAvilable, SWT.NONE);
		btnConnect.setBounds(359, 242, 75, 25);
		btnConnect.setText("Connect");
		
		Button btnGoBack = new Button(shlListOfAvilable, SWT.NONE);
		btnGoBack.setBounds(278, 242, 75, 25);
		btnGoBack.setText("Go back");
		
		Label lblStatistics = new Label(shlListOfAvilable, SWT.NONE);
		lblStatistics.setFont(SWTResourceManager.getFont("Monotype Corsiva", 12, SWT.ITALIC));
		lblStatistics.setBounds(3, 245, 269, 18);
		lblStatistics.setText("Statistics: %s servers online, %s players online");
		
		TabFolder tabFolder = new TabFolder(shlListOfAvilable, SWT.NONE);
		tabFolder.setBounds(0, 0, 434, 236);
		
		TabItem tbtmPublic = new TabItem(tabFolder, SWT.NONE);
		tbtmPublic.setText("Public:");
		
		table = new Table(tabFolder, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		tbtmPublic.setControl(table);
		
		TableColumn tableColumn = new TableColumn(table, SWT.NONE);
		tableColumn.setWidth(167);
		tableColumn.setText("Server");
		tableColumn.setResizable(false);
		
		TableColumn tableColumn_1 = new TableColumn(table, SWT.NONE);
		tableColumn_1.setWidth(51);
		tableColumn_1.setText("Status:");
		tableColumn_1.setResizable(false);
		
		TableColumn tableColumn_2 = new TableColumn(table, SWT.NONE);
		tableColumn_2.setWidth(76);
		tableColumn_2.setText("Type:");
		tableColumn_2.setResizable(false);
		
		TableColumn tableColumn_3 = new TableColumn(table, SWT.NONE);
		tableColumn_3.setWidth(52);
		tableColumn_3.setText("Users:");
		tableColumn_3.setResizable(false);
		
		TableColumn tableColumn_4 = new TableColumn(table, SWT.NONE);
		tableColumn_4.setWidth(72);
		tableColumn_4.setText("Ping:");
		tableColumn_4.setResizable(false);
		
		TabItem tbtmLocal = new TabItem(tabFolder, SWT.NONE);
		tbtmLocal.setText("Local:");
		
		table_1 = new Table(tabFolder, SWT.BORDER | SWT.FULL_SELECTION);
		table_1.setLinesVisible(true);
		table_1.setHeaderVisible(true);
		tbtmLocal.setControl(table_1);
		
		TableColumn tableColumn_5 = new TableColumn(table_1, SWT.NONE);
		tableColumn_5.setWidth(167);
		tableColumn_5.setText("Server");
		tableColumn_5.setResizable(false);
		
		TableColumn tableColumn_6 = new TableColumn(table_1, SWT.NONE);
		tableColumn_6.setWidth(51);
		tableColumn_6.setText("Status:");
		tableColumn_6.setResizable(false);
		
		TableColumn tableColumn_7 = new TableColumn(table_1, SWT.NONE);
		tableColumn_7.setWidth(76);
		tableColumn_7.setText("Type:");
		tableColumn_7.setResizable(false);
		
		TableColumn tableColumn_8 = new TableColumn(table_1, SWT.NONE);
		tableColumn_8.setWidth(52);
		tableColumn_8.setText("Users:");
		tableColumn_8.setResizable(false);
		
		TableColumn tableColumn_9 = new TableColumn(table_1, SWT.NONE);
		tableColumn_9.setWidth(72);
		tableColumn_9.setText("Ping:");
		tableColumn_9.setResizable(false);

	}
}
*/