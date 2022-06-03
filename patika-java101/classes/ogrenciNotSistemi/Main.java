package ogrenciNotSistemi;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Ahmet", "90550000000", "MAT");
        Teacher t2 = new Teacher("Mehmet", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Eda", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(100,90,40, 100, 90, 85);
        s1.isPass();

        Student s2 = new Student("Asaf", 3, "140144016", mat, fizik, kimya);
        s2.addBulkExamNote(50,30,40, 50, 50, 50);
        s2.isPass();

    }
}
