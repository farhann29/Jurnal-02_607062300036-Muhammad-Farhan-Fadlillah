public class Atk implements Comparable<Atk>{
    private String kodeBarang, jenisBarang, namaBarang, stokBarang;
    public Atk(String kodeBarang, String jenisBarang, String namaBarang, String stokBarang) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }
    public String getKodeBarang() {
        return kodeBarang;
    }
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }
    public String getJenisBarang() {
        return jenisBarang;
    }
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public String getStokBarang() {
        return stokBarang;
    }
    public void setStokBarang(String stokBarang) {
        this.stokBarang = stokBarang;
    }
    @Override
    public int compareTo(Atk o) {
        // TODO Auto-generated method stub
        return this.kodeBarang.compareTo(kodeBarang);
    }
    

    
}