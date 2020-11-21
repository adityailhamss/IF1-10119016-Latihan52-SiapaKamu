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
public class Program {

    public static void main(String[] args) {
       Manusia oo1 = new Manusia();
        
        Dosen oo2 = new Dosen();
        oo2.setNip("41227829930");
        oo2.setNama("Rizki Adam Kurniawan");
        oo2.setUmur(27);
        oo2.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : " + oo2.getNip());
        oo2.siapaKamu();
        oo2.mengajarApa();
        
        System.out.println();
        
        Mahasiswa oo3 = new Mahasiswa();
        oo3.setNim("10119016");
        oo3.setNama("Aditya Ilham Subagja");
        oo3.setUmur(19);
        oo3.setKelas("PBO1");
        System.out.println("NIM MAHASISWA : " + oo3.getNim());
        oo3.siapaKamu();
        oo3.kelasApa();
        
        }
}
