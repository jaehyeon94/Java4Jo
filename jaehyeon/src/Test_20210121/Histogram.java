package Test_20210121;

import java.util.Scanner;

public class Histogram {

	private int number[];
	private Scanner sc = new Scanner(System.in);

	public Histogram() {
		number = new int[10];
		for (int i = 0; i < number.length; i++) {
			number[i] = 0;
		}
		inPut();
	}

	public int[] getNumber() {
		return number;
	}

	public void setNumber(int[] number) {
		this.number = number;
	}

	private void inPut() {
		int number1;
		int ck;
		for (int i = 0; i < 10; i++) {
			System.out.println("("+(i+1)+")1~100까지 정수를 입력해주세요 : ");
			ck = sc.nextInt();
			while (ck > 100 && ck < 0) {
				System.out.println("1~100까지의 정수가 아닙니다.");
				System.out.println("다시 입력해주세요.");
				ck = sc.nextInt();
			} 
			number1 = ck / 10;
			for(int j = 0; j < 11; j++) {
				if(ck == (10*j))  {
					number1--;
					break;
				} 
			}
			//System.out.println(number1);
			number[number1]++;

		}
	}
	public void show() {
		int num = 10;
		for (int i = 1; i < 11; i++) {
			System.out.print(((i * num) + 1) - 10 + " - " + (i * num) + ": ");
			for (int j = 0; j < number[i - 1]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
