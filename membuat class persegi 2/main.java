public class Main {
  public static void main(String[] args) {
    
    // Step 3. Input panjang dan lebar
    int pjg=10;
    int lbr=8;
    
    // Hitung luas dan keliling via class Persegi 
    Persegi p = new Persegi();
    p.panjang = pjg;
    p.lebar = lbr;
    
    // Print luas
    System.out.println(p.getLuas());
    System.out.println(p.getKeliling());
  }
}