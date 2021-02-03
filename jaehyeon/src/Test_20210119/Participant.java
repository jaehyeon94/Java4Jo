package Test_20210119;

public class Participant {

	private int no;
	private int[] number;
	private boolean fair;
	private int sum;

	public Participant() {
	}

	public Participant(int no, int[] number) {
		// TODO Auto-generated constructor stub
		this.no = no;
		this.number = number;
	}

	public void Sum() {
		this.sum = number[0] + number[1];
	}

	public void Fair() {
		if (number[0] == number[1]) {
			this.fair = true;
		} else {
			this.fair = false;
		}
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int[] getNumber() {
		return number;
	}

	public void setNumber(int[] number) {
		this.number = number;
	}

	public boolean isFair() {
		return fair;
	}

	public void setFair(boolean fair) {
		this.fair = fair;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

}
