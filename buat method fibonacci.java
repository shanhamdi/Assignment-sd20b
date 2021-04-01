import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      // Tulis kode disini
      int a, b = 0;
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();
      for ( a = 0; a <= input; a++){
        System.out.print(fibo(b)+" ");
        b++;
      }
      System.out.println( );
    }
    
    public static int fibo (int input) {
      if (input == 0 || input == 1) {
        return input;
      }
      else{
        return(fibo (input-1) + fibo (input-2));
      }
    }
}
