
package models;

/**
 *
 * @author LENOVO
 */
public class FasilitasUmum extends Fasilitas{
    private String jenis;
    
    public FasilitasUmum(int id, String nama, String kondisi, int jumlah, String jenis){
        super(id, nama, kondisi, jumlah);
        setJenis(jenis);
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public void setJenis(String jenis){
        if (jenis == null || jenis.trim(). isEmpty()){
            throw new IllegalArgumentException("Jenis tidak boleh kosong!");
        }
        this.jenis = jenis;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jenis   : " + jenis);
    }
}
