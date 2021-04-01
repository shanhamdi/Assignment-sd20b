public class Stack {
    
    public int[] data;
    int top = 0;
    
    public Stack(int n) {
        data = new int[n];
    }
    
    public int length() {
        return data.length;
    }
    
    public int getData(int id) {
        return data[id];
    }
    
    public void push(int value) {
        if( top < data.length ) {
            data[top++] = value;
        }
    }
    
    public int pop() throws Exception {
        if( top > 0 ) {
          return data[--top];
        } else {
            throw new Exception("Empty");
        }
        
    }
}