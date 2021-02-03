package Test_20210121;

import java.util.Scanner;

public class Theater {

	private int[][] seat;
	private Scanner sc = new Scanner(System.in);

	public Theater() {
		this.seat = new int[10][2];
		for (int i = 0; i < this.seat.length; i++) {
			this.seat[i][0] = (i + 1);
			this.seat[i][1] = 0;
		}
	}

	public int[][] getSeat() {
		return seat;
	}

	public void setSeat(int[][] seat) {
		this.seat = seat;
	}

	public void reservation() {
		int number;
		while (true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
			number = sc.nextInt();
			if (number == 1) {
				seatShow();
				doReservation();
			} else if (number == 0) {
				break;
			} else {
				System.out.println("�Է��� �߸��߽��ϴ�.");
			}
		}
	}

	private void seatShow() {
		System.out.println("������ ���� ���´� ������ �����ϴ�.");
		System.out.println("-------------------------");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i][0] + " ");
		}
		System.out.println("\n-------------------------");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i][1] + " ");
		}
		System.out.println("");
	}

	private void doReservation() {
		int number;
		System.out.print("���° �¼��� �����ϰڽ��ϱ�?");
		number = sc.nextInt();
		if (0 < number && number < 11) {
			if (seat[number-1][1] == 1) {
				System.out.println("���� ����Ǿ� �ִ� �¼��Դϴ�.");
			} else {
				System.out.println("����Ǿ����ϴ�.");
				seat[number-1][1] = 1;
			}
		} else {
			System.out.println("���� �¼��Դϴ�.");
		}
	}

}
