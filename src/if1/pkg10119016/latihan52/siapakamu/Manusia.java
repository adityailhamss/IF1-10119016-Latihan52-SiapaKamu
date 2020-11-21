package if1.pkg10119016.latihan52.siapakamu;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 * menampilkan biodata dosen & mahasiswa
 */
public class Manusia {
    protected String nama;
    protected int umur;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public void siapaKamu(){
        System.out.println("Saya manusia");
    }
}
