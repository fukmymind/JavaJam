/*package cc.fukmymind.view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.wb.swt.SWTResourceManager;

import cc.fukmymind.model.JavaJamServer;

public class JavaJamApp {

	protected Shell shlJavajam;
	private Text txtMyJamServer;
	private Text txtServerHost;
	private Text txtClientNickname;
	private Text txtClientPassword;
	private Text textSendMessageInChat;

	*//**
	 * Launch the application.
	 * @param args
	 *//*
	public static void main(String[] args) {
		try {
			JavaJamApp window = new JavaJamApp();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	*//**
	 * Open the window.
	 *//*
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlJavajam.open();
		shlJavajam.layout();
		while (!shlJavajam.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	*//**
	 * Create contents of the window.
	 *//*
	protected void createContents() {
		shlJavajam = new Shell();
		shlJavajam.setTouchEnabled(true);
		shlJavajam.setSize(948, 489);
		shlJavajam.setText("JavaJAM v 0.1");
		shlJavajam.setLayout(new FormLayout());
		
		Group grpServer = new Group(shlJavajam, SWT.NONE);
		grpServer.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 9, SWT.NORMAL));
		grpServer.setText("Server");
		FormData fd_grpServer = new FormData();
		fd_grpServer.left = new FormAttachment(0, 10);
		fd_grpServer.top = new FormAttachment(0, 10);
		fd_grpServer.bottom = new FormAttachment(100, -24);
		grpServer.setLayoutData(fd_grpServer);
		
		Label lblPort = new Label(grpServer, SWT.NONE);
		lblPort.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		lblPort.setText("Port:");
		lblPort.setBounds(10, 26, 25, 15);
		
		Group grpClient = new Group(shlJavajam, SWT.NONE);
		grpClient.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 9, SWT.NORMAL));
		fd_grpServer.right = new FormAttachment(100, -654);
		
		Label lblMaxUsers = new Label(grpServer, SWT.NONE);
		lblMaxUsers.setBounds(10, 54, 55, 15);
		lblMaxUsers.setText("Max users:");
		
		Spinner spinMaxUsers = new Spinner(grpServer, SWT.BORDER);
		spinMaxUsers.setTextLimit(2);
		spinMaxUsers.setMaximum(10);
		spinMaxUsers.setSelection(10);
		spinMaxUsers.setBounds(71, 51, 186, 22);
		
		Spinner spinPort = new Spinner(grpServer, SWT.BORDER);
		spinPort.setMaximum(99999);
		spinPort.setMinimum(1000);
		spinPort.setSelection(1000);
		spinPort.setTextLimit(5);
		spinPort.setBounds(41, 23, 216, 22);
		
		Label lblMaxChannels = new Label(grpServer, SWT.NONE);
		lblMaxChannels.setBounds(10, 82, 77, 15);
		lblMaxChannels.setText("Max channels:");
		
		Spinner spinMaxChannels = new Spinner(grpServer, SWT.BORDER);
		spinMaxChannels.setTextLimit(2);
		spinMaxChannels.setMaximum(32);
		spinMaxChannels.setSelection(32);
		spinMaxChannels.setBounds(93, 79, 164, 22);
		
		Label lblServerLicense = new Label(grpServer, SWT.NONE);
		lblServerLicense.setBounds(10, 112, 77, 15);
		lblServerLicense.setText("Server license:");
		
		Button buttonSelectLicense = new Button(grpServer, SWT.NONE);
		buttonSelectLicense.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD | SWT.ITALIC));
		buttonSelectLicense.setBounds(93, 107, 164, 20);
		buttonSelectLicense.setText("Select license...");
		
		Combo comboAnonUsers = new Combo(grpServer, SWT.NONE);
		comboAnonUsers.setItems(new String[] {"Yes", "No", "Multi"});
		comboAnonUsers.setBounds(124, 138, 133, 23);
		comboAnonUsers.select(0);
		
		Label lblAnonymousUsers = new Label(grpServer, SWT.NONE);
		lblAnonymousUsers.setBounds(10, 141, 108, 15);
		lblAnonymousUsers.setText("Anonymous users:");
		
		Combo comboAnonChat = new Combo(grpServer, SWT.NONE);
		comboAnonChat.setItems(new String[] {"Yes", "No", "Multi"});
		comboAnonChat.setBounds(134, 167, 123, 23);
		comboAnonChat.select(0);
		
		Label lblAnonymousCanChat = new Label(grpServer, SWT.NONE);
		lblAnonymousCanChat.setText("Anonymous can chat:");
		lblAnonymousCanChat.setBounds(10, 170, 118, 15);
		
		Combo comboAnonMaskIP = new Combo(grpServer, SWT.NONE);
		comboAnonMaskIP.setItems(new String[] {"Yes", "No", "Multi"});
		comboAnonMaskIP.setBounds(134, 196, 123, 23);
		comboAnonMaskIP.select(0);
		
		Label lblAnonymousMaskIps = new Label(grpServer, SWT.NONE);
		lblAnonymousMaskIps.setText("Anonymous mask IPs:");
		lblAnonymousMaskIps.setBounds(10, 199, 118, 15);
		
		Label lblAllowHiddenUsers = new Label(grpServer, SWT.NONE);
		lblAllowHiddenUsers.setBounds(10, 228, 118, 15);
		lblAllowHiddenUsers.setText("Allow hidden users:");
		
		Combo comboAllowHidden = new Combo(grpServer, SWT.NONE);
		comboAllowHidden.setItems(new String[] {"Yes", "No"});
		comboAllowHidden.setBounds(124, 225, 133, 23);
		comboAllowHidden.select(0);
		
		Button btnSetUserlist = new Button(grpServer, SWT.NONE);
		btnSetUserlist.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD | SWT.ITALIC));
		btnSetUserlist.addSelectionListener(new SelectionAdapter() {
			int spinport = spinPort.getSelection();
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnSetUserlist.setBounds(10, 249, 247, 28);
		btnSetUserlist.setText("Set userlist");
		
		Label lblServerDescription = new Label(grpServer, SWT.NONE);
		lblServerDescription.setBounds(10, 283, 100, 15);
		lblServerDescription.setText("Server Description:");
		
		txtMyJamServer = new Text(grpServer, SWT.BORDER);
		txtMyJamServer.setText("My JAM Server");
		txtMyJamServer.setBounds(110, 280, 147, 21);
		
		Label lblDefaultBpm = new Label(grpServer, SWT.NONE);
		lblDefaultBpm.setBounds(10, 310, 77, 15);
		lblDefaultBpm.setText("Default BPM:");
		
		Spinner spinDefaultBPM = new Spinner(grpServer, SWT.BORDER);
		spinDefaultBPM.setTextLimit(3);
		spinDefaultBPM.setMaximum(320);
		spinDefaultBPM.setMinimum(60);
		spinDefaultBPM.setSelection(90);
		spinDefaultBPM.setBounds(85, 307, 172, 22);
		
		Label lblDefaultBpi = new Label(grpServer, SWT.NONE);
		lblDefaultBpi.setBounds(10, 338, 77, 15);
		lblDefaultBpi.setText("Default BPI:");
		
		Spinner spinDefaultBPI = new Spinner(grpServer, SWT.BORDER);
		spinDefaultBPI.setEnabled(false);
		spinDefaultBPI.setMaximum(10);
		spinDefaultBPI.setSelection(8);
		spinDefaultBPI.setTextLimit(3);
		spinDefaultBPI.setBounds(85, 335, 172, 22);
		
		Spinner spinSessionArchive = new Spinner(grpServer, SWT.BORDER);
		spinSessionArchive.setBounds(139, 361, 118, 22);
		
		Label lblSessionArchive = new Label(grpServer, SWT.NONE);
		lblSessionArchive.setBounds(10, 364, 123, 15);
		lblSessionArchive.setText("Session archive (mins):");
		
		Button btnStartServer = new Button(grpServer, SWT.NONE);
		btnStartServer.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				JavaJamServer jamServer = new JavaJamServer();
				jamServer.StartServer();
			}
		});
		btnStartServer.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.ITALIC));
		btnStartServer.setBounds(10, 396, 77, 18);
		btnStartServer.setText("Start");
		
		Button btnStopServer = new Button(grpServer, SWT.NONE);
		btnStopServer.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.ITALIC));
		btnStopServer.setBounds(93, 396, 75, 18);
		btnStopServer.setText("Stop");
		
		Button btnRestartServer = new Button(grpServer, SWT.NONE);
		btnRestartServer.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.ITALIC));
		btnRestartServer.setBounds(174, 396, 84, 18);
		btnRestartServer.setText("Restart");
		grpClient.setText("Client");
		FormData fd_grpClient = new FormData();
		fd_grpClient.left = new FormAttachment(grpServer, 6);
		fd_grpClient.bottom = new FormAttachment(grpServer, 0, SWT.BOTTOM);
		fd_grpClient.top = new FormAttachment(0, 10);
		grpClient.setLayoutData(fd_grpClient);
		
		Label lblConnectToHost = new Label(grpClient, SWT.NONE);
		lblConnectToHost.setBounds(10, 26, 88, 15);
		lblConnectToHost.setText("Connect to host:");
		
		txtServerHost = new Text(grpClient, SWT.BORDER);
		txtServerHost.setBounds(104, 23, 130, 21);
		
		Label lblClientPort = new Label(grpClient, SWT.NONE);
		lblClientPort.setBounds(240, 26, 30, 15);
		lblClientPort.setText("Port:");
		
		Spinner spinClientPort = new Spinner(grpClient, SWT.BORDER);
		spinClientPort.setTextLimit(5);
		spinClientPort.setMaximum(99999);
		spinClientPort.setMinimum(1000);
		spinClientPort.setSelection(1000);
		spinClientPort.setBounds(267, 23, 75, 22);
		
		Button btnConnectAsAnonymous = new Button(grpClient, SWT.CHECK);
		btnConnectAsAnonymous.setBounds(194, 50, 148, 16);
		btnConnectAsAnonymous.setText("Connect as Anonymous");
		
		Group grpLoginSettings = new Group(grpClient, SWT.NONE);
		grpLoginSettings.setText("Login Settings");
		grpLoginSettings.setBounds(10, 72, 332, 99);
		
		Label lbClientlNickname = new Label(grpLoginSettings, SWT.NONE);
		lbClientlNickname.setText("Nickname:");
		lbClientlNickname.setBounds(10, 27, 63, 15);
		
		txtClientNickname = new Text(grpLoginSettings, SWT.BORDER);
		txtClientNickname.setBounds(79, 24, 243, 21);
		
		Label lblClientPassword = new Label(grpLoginSettings, SWT.NONE);
		lblClientPassword.setText("Password:");
		lblClientPassword.setBounds(10, 54, 63, 15);
		
		txtClientPassword = new Text(grpLoginSettings, SWT.BORDER | SWT.PASSWORD);
		txtClientPassword.setBounds(79, 51, 243, 21);
		
		Button btnRememberMe = new Button(grpLoginSettings, SWT.CHECK);
		btnRememberMe.setBounds(217, 75, 105, 16);
		btnRememberMe.setText("Remember me");
		
		Button btnConnectToServer = new Button(grpLoginSettings, SWT.NONE);
		btnConnectToServer.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.ITALIC));
		btnConnectToServer.setBounds(10, 76, 105, 16);
		btnConnectToServer.setText("Connect");
		
		Button btnDisconnectFromServer = new Button(grpLoginSettings, SWT.NONE);
		btnDisconnectFromServer.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.ITALIC));
		btnDisconnectFromServer.setBounds(121, 76, 90, 16);
		btnDisconnectFromServer.setText("Disconnect");
		
		Group grpOnline = new Group(grpClient, SWT.NONE);
		grpOnline.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 9, SWT.NORMAL));
		grpOnline.setText("Online:");
		grpOnline.setBounds(240, 177, 102, 230);
		grpOnline.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		List listUsersOnline = new List(grpOnline, SWT.BORDER);
		
		Button btnShowAllAvilable = new Button(grpClient, SWT.NONE);
		btnShowAllAvilable.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.ITALIC));
		btnShowAllAvilable.setBounds(10, 47, 178, 19);
		btnShowAllAvilable.setText("Show all avilable hosts");
		
		Group group = new Group(shlJavajam, SWT.NONE);
		group.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 9, SWT.NORMAL));
		fd_grpClient.right = new FormAttachment(100, -298);
		group.setText("Audio Settings");
		FormData fd_group = new FormData();
		fd_group.bottom = new FormAttachment(grpServer, 0, SWT.BOTTOM);
		fd_group.left = new FormAttachment(grpClient, 6);
		fd_group.top = new FormAttachment(0, 10);
		
		Group group_1 = new Group(grpClient, SWT.NONE);
		group_1.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 9, SWT.NORMAL));
		group_1.setText("Chat:");
		group_1.setBounds(10, 177, 224, 230);
		
		List listChatBox = new List(group_1, SWT.BORDER);
		listChatBox.setBounds(10, 20, 204, 172);
		
		textSendMessageInChat = new Text(group_1, SWT.BORDER);
		textSendMessageInChat.setBounds(10, 200, 176, 21);
		
		Button btnSendMessage = new Button(group_1, SWT.NONE);
		btnSendMessage.setText("|->");
		btnSendMessage.setBounds(189, 198, 25, 25);
		fd_group.right = new FormAttachment(100, -10);
		group.setLayoutData(fd_group);
		
		CCombo comboSampleRate = new CCombo(group, SWT.BORDER);
		comboSampleRate.setBounds(84, 24, 78, 21);
		
		Label lblSampleRate = new Label(group, SWT.NONE);
		lblSampleRate.setBounds(10, 30, 68, 15);
		lblSampleRate.setText("Sample Rate:");
		
		CCombo comboBitrate = new CCombo(group, SWT.BORDER);
		comboBitrate.setBounds(210, 24, 62, 21);
		
		Label lblCoding = new Label(group, SWT.NONE);
		lblCoding.setText("Bitrate:");
		lblCoding.setBounds(168, 30, 36, 15);
		
		Label lblAudioDriver = new Label(group, SWT.NONE);
		lblAudioDriver.setText("Audio Driver:");
		lblAudioDriver.setBounds(10, 57, 68, 15);
		
		CCombo comboAudioDriver = new CCombo(group, SWT.BORDER);
		comboAudioDriver.setBounds(84, 51, 188, 21);
		
		Button btnApplyAudioSettings = new Button(group, SWT.NONE);
		btnApplyAudioSettings.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.ITALIC));
		btnApplyAudioSettings.setBounds(197, 78, 75, 25);
		btnApplyAudioSettings.setText("Apply");

	}
}
*/