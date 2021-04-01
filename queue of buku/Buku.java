public class Buku {
    public String judul;
    public String penulis;
    public String penerbit;
    public int tahunTerbit;

    public Buku(String judul, String penulis, String penerbit, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
}
