import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private String initials;
    private String main;
    private double salary;
    private List<String> subjects = new ArrayList<>();

    public String getInitials() {
        return initials;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void addSubjects(String subject) {
        subjects.add(subject);
    }

    public Teacher(int ID, String name, String initials) {
        super(ID, name);
        this.initials = initials;
    }
    @Override
    public String toString() {
        return super.toString()+ initials + "      " + subjects.get(0);
    }
}


