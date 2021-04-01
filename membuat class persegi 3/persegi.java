//Tulis class Persegi disini
public class Persegi {
 private int panjang;
 private int lebar;
 
 public Persegi(){}
 public Persegi(int panjang, int lebar){
   this.panjang = panjang;
   this.lebar = lebar;
 }
 
 public void setPanjang(int panjang){
   this.panjang = panjang;
 }
 
 public int getPanjang(){
   return panjang;
 }
 
 public void setLebar(int lebar){
   this.lebar = lebar;
 }
 
 public int getLebar(){
   return lebar;
 }
 
 public int getLuas(){
   return panjang*lebar;
 }
 
 public int getKeliling(){
   return 2*(panjang + lebar);
 }
}
