package Test_20210121;

import java.util.Scanner;

class MovieTheater {
   public int[] arr = new int[10];
   Scanner scan = new Scanner(System.in);
      
   public void reservation() {
      int seat;
      while (true) {
         System.out.print("�¼��� �����Ͻðڽ��ϱ�? (1 �Ǵ� 0) ");
         seat = scan.nextInt();
         if (seat == 1) {
            show();
         }else if (seat == 0) {
            break;
         }
      }
   }
   
   public void show() {
      System.out.println("������ ���� ���´� ������ �����ϴ�.");
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
    	 System.out.print("���° �¼��� �����Ͻðڽ��ϱ�? ");
    	 number = scan.nextInt();
         isOk = number > 0 && number < 11;
         if (isOk && arr[number-1] == 0) {
            System.out.println("����Ǿ����ϴ�.");
            this.arr[number-1] = 1;
            break;
         } else if(isOk && arr[number-1] == 1) {
        	 System.out.println("���� ������ �Ǿ��ִ� �¼��Դϴ�..");
         } else {
        	 System.out.println("���� �¼��Դϴ�.");
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