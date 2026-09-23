
package models;

/**
 *
 * @author LENOVO
 */
public class FasilitasOlahraga extends Fasilitas{
    private String jenisOlahraga;
    
    public FasilitasOlahraga(int id, String nama, String kondisi, int jumlah, String jenisOlahraga){
        super(id, nama, kondisi, jumlah);
        setJenisOlahraga(jenisOlahraga);
    }
    
    public String getJenisOlahraga(){
        return jenisOlahraga;
    }
    
    public void setJenisOlahraga(String jenisOlahraga){
        if (jenisOlahraga == null || jenisOlahraga.trim().isEmpty()){
            throw new IllegalArgumentException("Jenis olahraga tidak boleh kosong!");
        }
        this.jenisOlahraga = jenisOlahraga;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Olahraga: " + jenisOlahraga);
    }
    
}
