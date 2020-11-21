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
public class Dosen extends Manusia{
   private String nip;
    private String mataKuliah;
    
    public String getNip(){
        return nip;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getMataKuliah(){
        return mataKuliah;
    }
    
    public void setMataKuliah(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya " + nama + " umur " + umur + " mengajar " + mataKuliah);
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya dosen");
    }
}