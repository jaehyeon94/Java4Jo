package Test_20210121;


import java.util.Scanner;
class Histogram1 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int[] arr = new int[10];
     /* int count = 0;
      int count1 = 0;
      int count2 = 0;
      int count3 = 0;
      int count4 = 0;
      int count5 = 0;
      int count6 = 0;
      int count7 = 0;
      int count8 = 0;
      int count9 = 0; */
      
      int[] count = new int[10]; 
            
      for (int i = 0; i < arr.length; i++) {
         System.out.print("숫자를 입력하시오: ");
         arr[i] = scan.nextInt();
         count[i] = 0;
      }
      
      for (int i : arr) {
         if (i > 0 && i < 11) {
            count[0]++;
         } else if (i > 10 && i < 21) {
            count[1]++;
         } else if (i > 20 && i < 31) {
            count[2]++;
         } else if (i > 30 && i < 41) {
            count[3]++;
         } else if (i > 40 && i < 51) {
            count[4]++;
         } else if (i > 50 && i < 61) {
            count[5]++;
         } else if (i > 60 && i < 71) {
            count[6]++;
         } else if (i > 70 && i < 81) {
            count[7]++;
         } else if (i > 80 && i < 91) {
            count[8]++;
         } else if (i > 90 && i < 101) {
            count[9]++;
         }
      }
      int num = 10;
		for (int i = 1; i < 11; i++) {
			System.out.print("사용자가 입력한 수가 "+(((i * num) + 1) - 10) + " - " + (i * num) + " 사이 ");
			for (int j = 0; j < count[i - 1]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

   }
}