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
			System.out.print("좌석을 예약하시겠습니까?(1 또는 0)");
			number = sc.nextInt();
			if (number == 1) {
				seatShow();
				doReservation();
			} else if (number == 0) {
				break;
			} else {
				System.out.println("입력을 잘못했습니다.");
			}
		}
	}

	private void seatShow() {
		System.out.println("현재의 예약 상태는 다음과 같습니다.");
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
		System.out.print("몇번째 좌석을 예약하겠습니까?");
		number = sc.nextInt();
		if (0 < number && number < 11) {
			if (seat[number-1][1] == 1) {
				System.out.println("현재 예약되어 있는 좌석입니다.");
			} else {
				System.out.println("예약되었습니다.");
				seat[number-1][1] = 1;
			}
		} else {
			System.out.println("없는 좌석입니다.");
		}
	}

}
