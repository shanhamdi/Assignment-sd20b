import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n = 5;
    Stack stack = new Stack(n);
    
    for(int i=0; i < n; i++) {
        int data = inp.nextInt();
        stack.push(data);
    }
    
    for(int i=0; i < n; i++) {
        System.out.println(stack.pop());
    }
  }
}