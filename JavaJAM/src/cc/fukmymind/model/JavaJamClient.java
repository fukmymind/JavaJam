package cc.fukmymind.model;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class JavaJamClient {
	public String serverURL;
	public int serverPort;
	public Socket clientSocket;

	public void ConnectToServer(String serverURL, short serverPort) {
		try {
			clientSocket = new Socket(serverURL, serverPort);
		} catch (UnknownHostException e) {
			System.err.append("Error: This host isn't exist. At least in this network.");
		} catch (IOException e) {
			System.err.append("Error: Counldn't connect to "+serverURL+":"+serverPort+".");
			e.printStackTrace();
		}
	}

}
