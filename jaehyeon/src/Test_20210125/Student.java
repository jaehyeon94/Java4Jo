package Test_20210125;

public class Student {

	private Message[] receiveMessage = new Message[100];
	private String name;
	private int no;
	
	
	public Message[] getReceiveMessage() {
		return receiveMessage;
	}

	public void setReceiveMessage(Message[] receiveMessage) {
		this.receiveMessage = receiveMessage;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void receiveMessage(String message, String sendName) {
		for(int i = 0; i < message.length(); i++ ) {
			if(this.receiveMessage[i] == null) {
				this.receiveMessage[i].setMessage(message);
				this.receiveMessage[i].setSendName(name);
				this.receiveMessage[i].setReceiveName(sendName);
				break;
			}
		}
	}
	
	
}
