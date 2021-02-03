package Test_20210125;

public class Message {

	private String message;
	private String sendName;
	private String receiveName;
	
	
	public Message(String message, String sendName, String receiveName) {
		// TODO Auto-generated constructor stub
		this.message = message;
		this.sendName = sendName;
		this.receiveName = receiveName;	
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSendName() {
		return sendName;
	}
	public void setSendName(String sendName) {
		this.sendName = sendName;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}


	
}
