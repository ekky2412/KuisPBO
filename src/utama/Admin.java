package utama;

public class Admin extends Calon implements Nilai{
    protected int nilai_praktek;
    protected double nilai_rata;
    public Admin(String nama,int nim,int nilai_tulis,int nilai_coding,int nilai_wawancara,int nilai_praktek) {
        super(nama, nim, nilai_tulis, nilai_coding, nilai_wawancara);
        this.nilai_praktek = nilai_praktek;
        menghitungNilai();
    }

    @Override
    public void menghitungNilai() {
        nilai_rata = (super.nilai_coding + super.nilai_tulis + super.nilai_wawancara + nilai_praktek)/4;
    }
    
}
