package Hospital;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HospitalData {
	ClientInfo ClientHead = new ClientInfo();
	Stack<Character> ClientStack = new Stack<Character>(); 
	Queue ClientQueue = new LinkedList();

public void addUserNode(String clientName, int seatNumber, int age){
		ClientInfo currNode = new ClientInfo(clientName,seatNumber,age);
		if(ClientHead == null) {
			ClientHead = currNode;
		}
		else {
			ClientInfo last = ClientHead;
			while(last.next != null) {
				last = last.next;
			}
			last.next = currNode;
		}	
	}
	
public void addUserQueue (String clientName, int seatNumber, int age) {
	
	}

public void addUserStack (String clientName, int seatNumber, int age) {
	
	}

public void addAll (String clientName, int seatNumber, int age) {
	addUserStack (clientName ,seatNumber, age);
	addUserQueue(clientName, seatNumber, age);
	addUserNode(clientName, seatNumber, age);
	}

}
