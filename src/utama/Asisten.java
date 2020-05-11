package utama;

public class Asisten extends Calon implements Nilai{
    protected int nilai_microteaching;
    protected double nilai_rata;
    public Asisten(String nama,int nim,int nilai_tulis,int nilai_coding,int nilai_wawancara,int nilai_microteaching) {
        super(nama, nim, nilai_tulis, nilai_coding, nilai_wawancara);
        this.nilai_microteaching = nilai_microteaching;
        menghitungNilai();
    }

    @Override
    public void menghitungNilai() {
        nilai_rata = (super.nilai_coding + super.nilai_tulis + super.nilai_wawancara + nilai_microteaching)/4;
    }
}
