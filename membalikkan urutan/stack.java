public class Stack {
    // TULIS KODE DISINI
    
    public int[] data;
    int top = 0;
    
    public Stack(int x) {
        data = new int[x];
    }
    
    public int length() {
        return data.length;
    }
    
    public int getData(int y) {
        return data[y];
    }
    
    public void push(int value) {
        if( top < data.length ) {
            data[top++] = value;
        }
    }
    
    public int pop() {
        if(top > 0){
          return data[--top];
        } else {
          return -1;
        }
        
    }
}