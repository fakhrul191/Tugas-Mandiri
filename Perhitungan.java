package ModelInterface;

import Interface.ContohInterface;

public class Perhitungan implements ContohInterface {
    private int a;
    private int b;
    private int Hasil;

    public Perhitungan(int _a, int _b, int _Hasil){
        this.a = _a;
        this.b = _b;
        _Hasil = 0;
        this.Hasil = _Hasil;
        printJudulClass("Print judul dalam Class Perhitungan");
    }
    private void printJudulClass(String jdl){
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        System.out.println("Judul Dalam Interface");
    }

    @Override
    public void HitungTambah() {
        this.Hasil = this.a + this.b;
    }

    @Override
    public void HitungKali() {
        this.Hasil = this.a * this.b;
    }

    public int hasilTambah(int _a, int _b){
        this.a = _a;
        this.b = _b;
        HitungTambah();
        return this.Hasil;
    }

    public int hasilKali(int _a, int _b){
        this.a = _a;
        this.b = _b;
        HitungKali();
        return this.Hasil;
    }
}
