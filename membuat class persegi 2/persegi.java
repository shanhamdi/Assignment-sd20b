public class Persegi {
    // Step 1. Buat field panjang dan lebar (public)
    public int panjang;
    public int lebar;
    
    // Step 2. Buat method luas dan keliling (public)
    public int getLuas(){
      return panjang*lebar;
    }
    
    public int getKeliling(){
      return 2* (panjang+lebar);
    }
}