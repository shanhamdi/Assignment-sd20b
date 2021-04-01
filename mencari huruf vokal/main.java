import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    
    int jumlah = inp.nextInt();
    Stack stack = new Stack(jumlah);
    
    for(int i=0; i < jumlah; i++) {
        String teks = inp.next();
        if( isMulaiDenganHurufVokal(teks) ) {
            stack.push(teks);
        }
    }
    
    while(!stack.isEmpty()) {
        System.out.println(stack.pop());
    }
    
  }
  
  public static boolean isMulaiDenganHurufVokal(String teks) {
      return (teks.charAt(0) == 'a' || teks
      .charAt(0) == 'i' || teks.charAt(0) ==
      'u' || teks.charAt(0) == 'e' || teks
      .charAt(0) == 'o');
  }
}