package cc.fukmymind.model;

import java.net.Socket;

public class ClientThread extends Thread {

	public ClientThread(Socket clientSocket) {
		this.start();
	}
	
	@Override
	public void run() {
		//Реализация получения клиентом общего аудиопотока.
		System.out.println("Here must be exchange streams with clients, but now it isn't. \nOh, the thread started successfully.");
	}

}
