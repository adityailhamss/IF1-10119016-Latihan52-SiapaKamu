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

public class Mahasiswa extends Manusia{
    
    private String nim;
    private String kelas;
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya " + nama + " umur " + umur + " sedang belajar di kelas " + kelas);
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya mahasiswa");
    }
}
