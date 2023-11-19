import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public void start() {
        List<Person> people = new ArrayList<>();
        PersonManager pm = new PersonManager();
        System.out.println(pm);
        Teacher t1 = new Teacher(202, "Bent H. Pedersen", "bhp");
        t1.setEmail("bhp@easv.dk");
        t1.addSubjects("Programming");
        people.add(t1);
        Student s1 = new Student(105, "Bo Ibsen", "CS");
        s1.setEmail("bib@easv.dk");
        s1.addGrade(new GradeInfo("CS", 10));
        s1.addGrade(new GradeInfo("SDE", 7));
        people.add(s1);
        System.out.println("ID" + "         " + "Name" + "                " + "Email");
        for (Person allPersons : people) {
            System.out.println(allPersons);
        }

    }
}
