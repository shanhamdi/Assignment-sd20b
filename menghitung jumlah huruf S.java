import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Tulis kode disini
    Scanner in = new Scanner(System.in);
    
    int count = 0;
    String teks = in.nextLine();
    for (char ch: teks.toCharArray()) {
      if (ch == 'S' || ch == 's') {
        count++;
      }
    }
    System.out.println(count);
  }
}