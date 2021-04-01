public class Stack {
  
  public String[]data;
  int top = 0;
  
  public Stack(int a) {
    data = new String[a];
  }
  
  public int length() {
    return data.length;
  }
  
  public String getData(int b) {
    return data[b];
  }
  
  public void push(String value) {
    if ( top < data.length ) {
      data[top++] = value;
    }
  }
  
  public String pop() {
    if(top > 0){
      return data[--top];
    } else {
      return null;
    }
    
  }
}