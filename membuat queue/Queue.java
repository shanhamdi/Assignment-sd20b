public class Queue {
    int[] data;
    int tail = 0;
    public Queue(int n) {
        data = new int[n];
    }
    public void enqueue(int value) {
          data[tail] = value;
          tail++;
    }
    
    public int dequeue() {
        int y = data[0];
        for (int i = 0; i < tail; i++){
          data[i] = data[i + 1];
        }
        
        tail--;
        return y;
    }
    
    public int getTail() {
        return tail;
    }
    public int getLength() {
        return data.length;
    }
    
    public int getData(int i) {
        return data[i];
    }
}