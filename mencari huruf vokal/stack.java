public class Stack {

    public String[] data;
    public int top;

    public Stack(int jumlah) {
        data = new String[jumlah];
        top = 0;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public boolean isFull() {
        return top >= data.length;
    }

    public void push(String value) {
        if ( !isFull() ) {
            data[top++] = value;
        }
    }

    public String pop() {
        String result = null;
        if ( !isEmpty() ) {
            result = data[--top];
            data[top] = null;
        }
        return result;
    }

}
