package ogrenciNotSistemi;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int matSozlu, int fizikSozlu, int kimyaSozlu) {

        if ((mat >= 0 && mat <= 100) && (matSozlu >= 0 && matSozlu <= 100)){
            this.mat.note = mat;
            this.mat.sozluNot = matSozlu;
        }

        if ((fizik >= 0 && fizik <= 100) && (fizikSozlu >= 0 && fizikSozlu <= 100)) {
            this.fizik.note = fizik;
            this.fizik.sozluNot = fizikSozlu;
        }

        if ((kimya >= 0 && kimya <= 100) && (kimyaSozlu >= 0 && kimyaSozlu <= 100)) {
            this.kimya.note = kimya;
            this.kimya.sozluNot = kimyaSozlu;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sinifi Gecti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (  (this.mat.note * this.mat.notKatSayi + this.mat.sozluNot * this.mat.sozluNotKatSayi)
                            + (this.fizik.note * this.fizik.notKatSayi + this.fizik.sozluNot * this.fizik.sozluNotKatSayi)
                            + (this.kimya.note * this.kimya.notKatSayi + this.kimya.sozluNot * this.kimya.sozluNotKatSayi)
                       ) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sozlusu: " + this.mat.sozluNot);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sozlusu: " + this.fizik.sozluNot);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sozlusu: " + this.kimya.sozluNot);
    }

}
