import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
      int [] array = new int [5];
      
      Scanner input = new Scanner(System.in);
      
      for( int i = 0; i < array.length; i++ ){
        array[i] = input.nextInt();
      }
      
      int temp = array[0];
      
      for(int i = 1; i < array.length; i++) {
        array[i - 1] = array[i];
        System.out.println(array[i] + " ");
      }
      
  }
}
    