import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Tulis kode disini
    Stack fs = new Stack(20);
    
    Scanner in = new Scanner(System.in);
    String rumus = in.next();
    
    for(int a = 0; a < rumus.length(); a++) {
      if (rumus.charAt(a) == '(' || rumus.charAt(a) == ')' || rumus.charAt(a) == '{' || rumus.charAt(a) == '}') {
        fs.push(rumus.charAt(a));
      }
    }
    boolean valid = fs.isValid();
    
    if(valid) {
      System.out.println("valid");
    } else {
      System.out.println("tidak valid");
    }
  }
}