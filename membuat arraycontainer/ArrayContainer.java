public class ArrayContainer {
    // Field
    public int[] container;
    
    // constructor
    public ArrayContainer(int jumlah) {
        
        container = new int[jumlah];
    }
    
    // method
    public int length() {
        return container.length;
    }
}