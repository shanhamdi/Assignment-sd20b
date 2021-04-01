import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a = " ";
    int x = in.nextInt();
    String s = String.valueOf(x);
    
    int j = 1;
    
    for(int i = 1; i < x; i++){
      a+= s + "+" + String.valueOf(i) + ")*";
      j++;
    }
    
    a+= x+"+" +j;
    System.out.println(a);
  }
}