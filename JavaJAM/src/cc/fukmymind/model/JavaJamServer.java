package cc.fukmymind.model;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class JavaJamServer {
	private String hostname;
	private int serverPort;
	private ServerSocket serverSocket;
	private boolean isServerRunned;

	public JavaJamServer(String host, int jamServerPort) {
		this.hostname = host;
		this.serverPort = jamServerPort;
		StartServer();
	}

	public void StartServer() {
			try {
				serverSocket = new ServerSocket(serverPort, 0,
						InetAddress.getByName(hostname));
			} catch (UnknownHostException e) {
				JOptionPane.showMessageDialog(null, "This host isn't exist. At least in this network.");
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "IOException was successfully caught. Keep on working :3");
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Server on " + hostname + ":" + serverPort
					+ " was successfully started!");
	}

	public void StopServer() {
		if (isServerRunned == true) {
			try {
				serverSocket.close();
				isServerRunned = false;
				System.out.println("Server on " + hostname + ":" + serverPort
						+ " was successfully stopped!");
			} catch (IOException e) {
				System.out.println("Error! Couldn't stop the server!");
			}
		}
	}

	public void RestartServer() throws UnknownHostException, IOException {
		if (serverSocket.isClosed() == true) {

			isServerRunned = true;
			StartServer();

		}
	}
}
