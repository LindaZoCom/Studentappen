import java.sql.SQLOutput;

public class Student {
    private static final int ADULT_AGE= 18;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
    @Override
    public String toString() {
        return name + ", " + age + " år";
    }

    public boolean isAdult() {
        return age >=ADULT_AGE;
    }


//    public void printInfo() {
//        System.out.println(name + " är " + age + " år.");
//    }
}
