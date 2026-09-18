import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Amina", 25));
        students.add(new Student("Leo", 17));
        students.add(new Student("Samira", 31));
        students.add(new Student ("Noah", 22));

        System.out.println("Antal studenter: " + students.size());

        System.out.println("\n===Alla studenter===");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\n===Myndiga studenter===");

        for(Student student : students) {
            if(student.isAdult()) {
                System.out.println(student);
            }
        }

        }
    }

