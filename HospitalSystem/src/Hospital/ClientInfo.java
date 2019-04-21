package Hospital;

import java.util.LinkedList;

import javax.xml.soap.Node;

public class ClientInfo{
	ClientInfo next;
	String clientName;
	int seatNumber;
	int age;
	
	
		
	public ClientInfo(){
		int counter;
		next = null;
		clientName = null;
		seatNumber = 0;
		age = 0;
		}
		
	public ClientInfo(String clientName,int seatNumber,int age) {
		this.clientName = clientName;
		this.seatNumber = seatNumber;
		this.age = age;
	}
	public static void setClientName(String clientName) {
		clientName = clientName;
		System.out.println("Client Name is now "+clientName);
	}
}
	
	
	