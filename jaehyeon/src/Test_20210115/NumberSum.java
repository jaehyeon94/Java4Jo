package Test_20210115;

import java.util.Scanner;
public class NumberSum {

	private int[] number;
	Scanner sc = new Scanner(System.in);
	public int[] getMunber() {
		return number;
	}

	public void setMunber(int[] number) {
		this.number = number;
	}

	public int[] sum(int number1[], int number2[]) {
		if(number1.length < number2.length) {
			this.number = new int[number2.length];
		} else {
			this.number = new int[number1.length];
		}
		
		for(int i = 0; i < number.length; i++ ) {
			if(number1.length < number2.length) {
				if(i < number1.length) {
					this.number[i] = number1[i] + number2[i]; 
				} else {
					this.number[i] = number2[i]; 
				}
			}
			else if(number1.length > number2.length) {
				if(i < number2.length) {
					this.number[i] = number1[i] + number2[i]; 
				} else {
					this.number[i] = number1[i]; 
				}
			} else {
				this.number[i] = number1[i] + number2[i];
			}
		}
		return number;
	}
	
	public int[] square(int numberLength) {
		System.out.print("������ ������ �Է����ּ��� : ");
		int number1 = sc.nextInt();
		this.number = new int[numberLength];
		for(int i = 0; i < numberLength; i++ ) {
			number[i] = (int) Math.pow(number1, (i));
		}
		return number;
	}
	
	public int[] print() {
		this.number = new int[10];
		int i = 0;
		int num;
		System.out.println("0�� �Է¹����� ���� ������ �Է��մϴ�.");
		while(true) {
			System.out.print("������ �Է����ּ��� :");
			num =  sc.nextInt();
			if(num == 0) {
				break;
			}
			number[i] = num; 
			if(i < 9) {
				i++;
			} else  { 
				i = 0;
			}
		}
		return number;
	}
}