public class Stack {
  
    public char[] data;
    public int top;
    public int count = 0;
    
    public Stack(int jumlah) {
      data = new char [jumlah];
      top = 0;
    }
    
    public boolean isEmpty() {
      return (top <= 0);
    }
    
    public boolean isFull() {
      return (top >= data.length);
    }
    
    public void push(char value) {
      if ( !isFull() ) {
        data[top++] = value;
        count++;
      }
    }
    
    public char pop() {
      char result;
      if ( !isEmpty() ) {
          result = data[--top];
          // data[top];
          return result;
      } else {
        return ' ';
      }
    }
    
    public boolean isValid(){
      return (count % 2 == 0);
    }
    
}