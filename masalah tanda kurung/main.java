import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Stack st = new Stack(20);
    
    Scanner scan = new Scanner(System.in);
    
    String rumus = scan.next();
    
    for (int i = 0; i < rumus.length(); i++){
      if (rumus.charAt(i) == '(' || rumus.charAt(i) == ')'){
        st.push(rumus.charAt(i));
      }
    }
    
    boolean valid = st.isValid();
    
    if(valid){
      System.out.print("valid");
      
    } else {
      System.out.print("tidak valid");
    }
  }
}