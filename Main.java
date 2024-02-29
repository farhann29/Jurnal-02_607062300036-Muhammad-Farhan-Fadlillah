import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Listbarang<Atk> Atkbarang = new Listbarang<Atk>();
    Listbarang<Bag> Bagbarang = new Listbarang<Bag>();
    Atkbarang.add(new Atk("A001", "Spidol", "Snowman", "10"));
    Atkbarang.add(new Atk("A002", "Pencil", "Fabercastel", "7"));
    Atkbarang.add(new Atk("A003", "penghapus", "Fabercastel", "8"));
    Atkbarang.add(new Atk("B001", "Buku", "IDX", "10"));
    Atkbarang.add(new Atk("B002", "karton", "Karton", "9"));

    Bagbarang.add(new Bag("C001", "Kotak Pensil", "Bitcoin", "10"));
    Bagbarang.add(new Bag("C002", "Tas", "Polo", "7"));
    Bagbarang.add(new Bag("C003", "Kaos Kaki", "Faber", "8"));
    Bagbarang.add(new Bag("C004", "Dasi", "Butik", "10"));
    Bagbarang.add(new Bag("C005", "Seragam", "SD", "9"));

    Atkbarang.sorting();
    for ( int i = 0; i < Atkbarang.size();i++){
        System.out.println("Barang " +( i + 1 )+ " : ");
        System.out.println(" kode barang = "+Atkbarang.getIndex(i).getKodeBarang());
        System.out.println(" jenis barang = "+Atkbarang.getIndex(i).getJenisBarang());
        System.out.println(" Nama barang = "+Atkbarang.getIndex(i).getNamaBarang());
        System.out.println(" Stok barang = "+Atkbarang.getIndex(i).getStokBarang());
    }
    for ( int i = 0; i < Bagbarang.size();i++){
        System.out.println("Barang " +( i + 1 )+ " : ");
        System.out.println(" kode barang = "+Bagbarang.getIndex(i).getKodeBarang());
        System.out.println(" jenis barang = "+Bagbarang.getIndex(i).getJenisBarang());
        System.out.println(" Nama barang = "+Bagbarang.getIndex(i).getNamaBarang());
        System.out.println(" Stok barang = "+Bagbarang.getIndex(i).getStokBarang());
    }
    // Collections.sort();
    }
}