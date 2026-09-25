import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Amina", 25, StudyLevel.BEGINNER));
        students.add(new Student("Leo", 17, StudyLevel.BEGINNER));
        students.add(new Student("Samira", 31, StudyLevel.ADVANCED));
        students.add(new Student("Noah", 22, StudyLevel.INTERMEDIATE));

        System.out.println("Antal studenter: " + students.size());

        System.out.println("\n===Alla studenter===");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\n===Myndiga studenter===");

        for (Student student : students) {
            if (student.isAdult()) {
                System.out.println(student);
            }
        }


        try {
            Student invalidStudent = new Student("Anna", 15, null);

            System.out.println(invalidStudent);
        } catch (IllegalArgumentException exception) {
            System.out.println("Kunde inte skapa student " + exception.getMessage());
        }
    }
}

