package cc.fukmymind.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server extends Thread {

	private Socket serverSocket;
	private int serverID;
	private byte audioData[] = new byte[4096];
	private static int serverPort;

	public Server(Socket socket, int id) {
		super();
		serverSocket = socket;
		try {
			serverSocket.setSoTimeout(60000);
		} catch (SocketException se) {
		}

		serverID = id;
	}

	public void run() {
		InputStream in = null;
		OutputStream out = null;
		OutputStreamWriter writer = null;

		try {
			in = serverSocket.getInputStream();
			out = serverSocket.getOutputStream();
			writer = new OutputStreamWriter(out);

			while (true) {
				int dataLength = 0;
				int data = 0;
				do {
					data = in.read();
					if (data < 0)
						throw new IOException("Server <" + serverID
								+ "> is closed or isnt' exist");
					if (data != '\n')
						audioData[dataLength++] = (byte) data;
				} while (data != '\n');

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String... args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(serverPort);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}

		int serverID = 1;

		while (true) {
			Socket socket = null;
			try {
				socket = serverSocket.accept();
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(1);
			}
			if(socket != null)
				new Server(socket, serverID++).start();
		}
	}
}
