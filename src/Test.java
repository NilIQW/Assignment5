import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public void start() {
        List<Person> people = new ArrayList<>();
        Person p1 = new Person(100, "Hans Nielsen");
        p1.setEmail("hni@easv.dk");
        Person p2 = new Person(101, "Niels Hansen");
        p2.setEmail("nha@easv.dk");
        Person p3 = new Person(102, "Ib Boesen");
        p3.setEmail("   ibo@easv.dk");
        people.add(p1);
        people.add(p2);
        people.add(p3);
        Teacher t1 = new Teacher(202, "Bent H. Pedersen", "bhp");
        t1.setEmail("bhp@easv.dk");
        t1.addSubjects("Programming");
        people.add(t1);
        System.out.println("ID" + "         " + "Name" + "                " + "Email");
        for (Person allPersons : people) {
            System.out.println(allPersons);

        }
    }
}
