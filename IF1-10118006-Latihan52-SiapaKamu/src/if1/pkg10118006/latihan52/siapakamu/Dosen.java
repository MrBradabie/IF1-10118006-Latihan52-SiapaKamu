
package if1.pkg10118006.latihan52.siapakamu;

/*
 * @author 
 * NAMA  : Alfarizi Rizki Pane
 * KELAS : IF 1
 * NIM   : 10118006
 */
public class Dosen extends Manusia{
    
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang "
                + "mengajar matakuliah "+mataKuliah);
    }
    
    @Override
    public void siapaKamu (){
        System.out.println("Saya Dosen");
    }
}
