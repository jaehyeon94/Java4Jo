package Test_20210121;
import java.util.Scanner;

class Histogram2{
   int[] freq;
   int size;
   
   public Histogram2(int size){
      this.size = size;
      freq = new int[size];
   }
   
   public void print(){
      for(int i = 0; i < size; i++){
         System.out.print((i * 10 + 1) + "-" + (i + 1) * 10 + ": ");
         for(int j = 0; j < freq[i]; j++){
            System.out.print("*");
         }
      System.out.println("");
      }
   }
   
   public void input(){
      Scanner scan = new Scanner(System.in);
      System.out.print("점수를 입력하시오: ");
      int s = 0;
      
      do{
         s = scan.nextInt();
         if(s > 100){
            System.out.println("1-100 사이의 숫자로 다시입력하세요.");
         }
      }while (s > 100);
      
      if(s != 0){
         freq[(s-1)/10]++;
      }else{
         freq[0]++;
      }
      
   }
}

public class HistorgramTest{
   public static void main(String[] args){
      Histogram2 t = new Histogram2(10);
      for(int i = 0; i <10; i++){
         t.input();
      }
      t.print();
   }
}