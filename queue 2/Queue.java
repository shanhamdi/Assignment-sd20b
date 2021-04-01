public class Queue {
    String[] data;
    int tail = 0;
    public Queue(int n) {
        data = new String[n];
    }
    public void enqueue(String value) {
        // Tulis kode disini
        data[tail++] = value;
    }
    
    public String dequeue() {
        String value  = data[0];
        for (int i = 0; i < tail - 1; i++) {
          data[i] = data[i + 1];
        }
        
        tail--;
        return value;
    }
    public int getTail() {
        return tail;
    }
    public int getLength() {
        return data.length;
    }
    
    public String getData(int i) {
        return data[i];
    }
}