package java4Jo;

public class Chief {
	private String order;

	public String getOrder() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}
}
