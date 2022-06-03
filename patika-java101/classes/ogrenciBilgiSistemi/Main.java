package ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Eda Hoca", "TRH", "555");
        Teacher teacher2 = new Teacher("Asaf Hoca", "MAT", "554");
        Teacher teacher3 = new Teacher("Graham Bell", "FZK", "000");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(teacher1);

        Course matematik = new Course("Matematik", "102", "MAT");
        matematik.addTeacher(teacher2);

        Course fizik = new Course("Fizik", "103", "FZK");
        fizik.addTeacher(teacher3);

        Student student1 = new Student("Esra", "123", "4", tarih, matematik, fizik);
        student1.addBulkExamNote(100,50,70);
        student1.isPass();

        Student student2 = new Student("Ali", "456","3", tarih, matematik, fizik);
        student2.addBulkExamNote(50,80,20);
        student2.isPass();
    }
}