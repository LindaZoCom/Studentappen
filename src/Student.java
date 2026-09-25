import java.sql.SQLOutput;

public class Student {
    private static final int ADULT_AGE= 18;
    private String name;
    private int age;
    private StudyLevel level;

    public Student(String name, int age, StudyLevel level) {
        setName(name);
        setAge(age);
        setLevel(level);
    }

    public void setName(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Namn måste anges.");
        }
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>120) {
            throw new IllegalArgumentException("Ålder måste vara mellan 0 och 120.");

        }
        this.age = age;
    }

    public StudyLevel getLevel() {
        return level;
    }

    public void setLevel(StudyLevel level) {
        if(level == null) {
            throw new IllegalArgumentException("Studienivå måste anges.");
        }
        this.level = level;
    }

    @Override
    public String toString() {
        return name + ", " + age + " år " + level;
    }

    public boolean isAdult() {
        return age >=ADULT_AGE;
    }


//    public void printInfo() {
//        System.out.println(name + " är " + age + " år.");
//    }
}
