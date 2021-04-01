public class Queue {
    public Buku[] data;
    public int tail;

    public Queue(int n) {
        data = new Buku[n];
        tail = 0;
    }

    public int getTail() {
        return tail;
    }

    public int getLength() {
        return data.length;
    }

    public Buku getData(int i) {
        return data[i];
    }

    public void enqueue(Buku v) {
        data[tail] = v;
        tail++;
    }

    public Buku dequeue() {
        Buku p = data[0];
        for (int i = 0; i < tail; i++){
          data[i] = data[i + 1];
        }
        
        tail--;
        return p;
    }
}