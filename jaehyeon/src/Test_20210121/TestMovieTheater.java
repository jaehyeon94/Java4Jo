package Test_20210121;

import java.util.Scanner;

class MovieTheater {
   public int[] arr = new int[10];
   Scanner scan = new Scanner(System.in);
      
   public void reservation() {
      int seat;
      while (true) {
         System.out.print("좌석을 예약하시겠습니까? (1 또는 0) ");
         seat = scan.nextInt();
         if (seat == 1) {
            show();
         }else if (seat == 0) {
            break;
         }
      }
   }
   
   public void show() {
      System.out.println("현재의 예약 상태는 다음과 같습니다.");
      System.out.println("---------------------------------");
      System.out.println("1 2 3 4 5 6 7 8 9 10");
      System.out.println("---------------------------------");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
      Reservation2();
   }
   
   public void Reservation2() {
      int number = 0;
      boolean isOk = true;
     
      do{
    	 System.out.print("몇번째 좌석을 예약하시겠습니까? ");
    	 number = scan.nextInt();
         isOk = number > 0 && number < 11;
         if (isOk && arr[number-1] == 0) {
            System.out.println("예약되었습니다.");
            this.arr[number-1] = 1;
            break;
         } else if(isOk && arr[number-1] == 1) {
        	 System.out.println("현재 예약이 되어있는 좌석입니다..");
         } else {
        	 System.out.println("없는 좌석입니다.");
         }
      } while(isOk);
      
   }
      
}
class TestMovieTheater {
   public static void main(String[] args) {            
      MovieTheater m = new MovieTheater();
      m.reservation();
      
   }
}