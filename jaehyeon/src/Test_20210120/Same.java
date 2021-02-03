package Test_20210120;

public class Same {

	private int[] number_A;
	private int[] number_B;
	private boolean same;

	Same(int[] number_A, int[] number_B) {
		this.number_A = number_A;
		this.number_B = number_B;
		this.same = same();
	}

	public int[] getNumber_A() {
		return number_A;
	}

	public void setNumber_A(int[] number_A) {
		this.number_A = number_A;
	}

	public int[] getNumber_B() {
		return number_B;
	}

	public void setNumber_B(int[] number_B) {
		this.number_B = number_B;
	}

	public boolean isSame() {
		return same;
	}

	public void setSame(boolean same) {
		this.same = same;
	}

	private boolean same() {
		int ck = 0;
		;
		if (this.number_A.length == this.number_B.length) {
			for (int i = 0; i < this.number_A.length; i++) {
				if (this.number_A[i] != this.number_B[i]) {
					ck++;
					break;
				}
			}
		} else {
			ck++;
		}
		if (ck == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equalsArray(int[] arr, int[] arr2) {
		boolean ck = true;
		if (arr != null && arr2 != null) {
			if (arr.length == arr2.length) {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != arr2[i]) {
						ck = false;
						break;
					}
				}
			} else {
				ck = false;
			}
		} else {
			ck = false;
		}
		return ck;
	}

}
