import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    int a = scan.nextInt();
    int hasil = (a - 1) * a;
    
    for(int i = 2 ; i < a; i++){
      hasil = (hasil - i) * a;
    }
    System.out.print(hasil - a);
    
  }
}