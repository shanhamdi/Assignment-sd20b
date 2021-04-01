import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int[] ass = new int[8];
    
    for(int i = 0; i < ass.length; i++){
      ass[i] = scan.nextInt();
    }
    
    int length = scan.nextInt();
    
    for(int i = length; i < ass.length; i++){
      System.out.print(ass[i]);
    }
  }
}