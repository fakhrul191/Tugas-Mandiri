import ModelInterface.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4,6,0);

        System.out.println("------------");
        System.out.println("Hasil Pertambahan : ");
        int tambah = s.hasilTambah(4,6);
        System.out.println(tambah);

        System.out.println("--------------");
        System.out.println("Hasil Perkalian : ");
        int kali = s.hasilKali(4,6);
        System.out.println(kali);
    }
}
