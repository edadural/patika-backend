package ogrenciBilgiSistemi;

public class Teacher {
    String name;
    String branch;
    String mpNo;

    Teacher(String name, String branch, String mpNo){
        this.name = name;
        this.branch = branch;
        this.mpNo = mpNo;
    }

    void print(){
        System.out.println("Adi: " + this.name);
        System.out.println("Bolumu: " + this.branch);
        System.out.println("Telefonu: " + this.mpNo);
    }

}
