public class CircularQueue {
    private int head = 0, tail = 0;
    private int length = 0;
    private int[] data;

    public CircularQueue(int max) {
        data = new int[max];
    }

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public int getData(int index) {
        return data[index];
    }

    public void enqueue(int value) {
        data[tail] = value;
        tail++;
    }

    public int dequeue() {
        int u = data[0];
        for (int i = 0; i < tail; i++){
          data[i] = data[i + 1];
        }
        
        tail--;
        head++;
        return u;
    }
}