public class StudentMain {

	public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Aliye", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Melek Uzun", 4, "140144015", mat, fizik, kimya);
        s1.addBulExamNote(50,20,40);
        s1.addBulVerbalNote(60,70,30);
        s1.isPass();

        Student s2 = new Student("Necmi Bakan", 4, "2211133", mat, fizik, kimya);
        s2.addBulExamNote(100,50,40);
        s2.addBulVerbalNote(40, 50, 60);
        s2.isPass();

        Student s3 = new Student("Esra Gergin", 4, "221121312", mat, fizik, kimya);
        s3.addBulExamNote(50,20,40);
        s3.addBulVerbalNote(80,50,60);
        s3.isPass();

	}

}
