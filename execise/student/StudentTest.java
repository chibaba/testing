public class StudentTest {
    public static void main(String...args) {

    Student student1 = new Student("jane Nneka", 90);
    Student student2 = new Student("jasper japa", 56.65);

    System.out.printf("%s's letter grade is: %s%n", student1.getName(),
    student1.getLetterGrade());
    System.out.printf("%s's letter grade is : %s%n", student2.getName(),
    student2.getLetterGrade());
}
}