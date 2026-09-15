public class Main {
    public static void main(String[] args){

        Student student = new Student("Amina", 25);
        Student secondStudent = new Student("Leo", 31);


        student.printInfo();
        secondStudent.printInfo();

        System.out.println("\nFörsta studenten heter: " + student.getName());
        System.out.println("Första studentens åldens är: " + student.getAge());

        System.out.println("\nUrsprunglig ålder: " + student.getAge());

        student.setAge(26);

        System.out.println("Efter giltig ändring: " + student.getAge());

        student.setAge(-5);

        System.out.println("Efter ogiltig ändring; " + student.getAge());
    }
}
