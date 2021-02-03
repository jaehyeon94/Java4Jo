package Test_20210115;

import java.util.Arrays;
import java.util.Scanner;
public class NumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number1 = {100,200,23};
		int[] number2 = {300,100,400};
		NumberSum numberSum = new NumberSum();
		
	
		System.out.println(Arrays.toString(numberSum.sum(number1, number2)));
		System.out.println(Arrays.toString(numberSum.square(10)));
		System.out.println(Arrays.toString(numberSum.print()));
	}

}
