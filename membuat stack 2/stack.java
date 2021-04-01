public class Stack {
    
    public int[] data;
    
    int top;
    
    boolean isEmpty(){
      return (top < 0);
    }
    
    boolean isFull(){
      return (top >= (length() - 1));
    }
    
    public Stack(int n) {
        data = new int[n];
        top = -1;
    }
    
    public int length() {
        return data.length;
    }
    
    public int getData(int id) {
        return data[id];
    }
    
    public void push(int value) {
      if (isFull()){
        System.out.println("StackOverFlow");
      } else {
        data[++top] = value;
      }
    }
}