import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    private List<Person> persons = new ArrayList<>();

    public Person getPerson(int id){
        for(Person p : persons)
            if(p.getID()==id)
                return p;
        return null;
    }
    public void addPerson(Person p){

        for(Person pe : persons)
            if(pe.equals(p))
                return;
        persons.add(p);
    }

    public void removePerson(int id){
        Person toBeRemoved = null;
        for(Person p : persons){
            if(p.getID()==id){
                toBeRemoved = p;
            }
            break;

        }
        persons.remove(toBeRemoved);
    }

    public List<Person> getAllPersons() {
        return persons;
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        for(Person p : persons)
            if(p instanceof Student){
                students.add((Student) p);
            }
        return students;
    }
    public List<Teacher> getAllTeachers(){
        List<Teacher> teachers = new ArrayList<>();
        for(Person p : persons)
            if(p instanceof Teacher){
                teachers.add((Teacher) p);
            }
        return teachers;
    }

    @Override
    public String toString() {
        String out = "ID" + "         " + "Name" + "                " + "Email\n";
        for(Person currentPerson : persons)
            out += currentPerson + "\n";
        return out;
    }
}
