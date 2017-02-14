package people;

/**
 * Created by vatva on 14.02.2017.
 */
public class Person {
    private String name;
    private int old;
    private int idTicket;

    Person(int old,int idTicket){
        this.old = old;
        this.idTicket = idTicket;
    }

    static int generateOld(){
        return (int) (Math.random()*100);
    }

    static int generateTicket(){
        return (int) (Math.random()*1000);
    }

   public static Person createPerson(){
        return new Person(generateOld(),generateTicket());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", idTicket=" + idTicket +
                '}';
    }
}
