public class Person {
    private int ID;
    private String name;
    private String email;

    public Person(int ID, String name) {
    this.ID = ID;
    this.name = name;
    }

    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){

        return ID + "        " + name + "        " + email + "        ";
    }
}
