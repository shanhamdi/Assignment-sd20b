import java.util.ArrayList;
import java.util.Scanner;

class Main{
  public static void main (String []args) {
    Scanner in = new Scanner (System.in);
    
    int a = in.nextInt();
    int nilai [] = new int [a];
    
      for (int i = 0 ; i < a ; i++) {
        nilai [i] = in.nextInt();
      }
      for (int i = nilai.length - 1 ; i>=0 ; i--){
        System.out.println(nilai[i]);
        
      }
  }
}