public class Employe {

    String firstName;
    String lastName;
    byte age;
    char gender;
    {
        System.out.println("Google company employee details");
    }

    public Employe(String firstName, String lastName, char gender, byte age) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.gender=gender;
    }

    public String getAge(){
      return lastName;
    }

    public char getGender(){
        return gender;
    }
    public String getFirstName(){
        return firstName;

    }
    public String  getlastName(){
        return lastName;

    }
}

