import java.time.LocalDate;

public class User {

    protected String name;
    protected LocalDate dob;


    public User() {
        this.name = null;
        this.dob = LocalDate.now(); // current date
    }

    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + dob);
    }

    public boolean isBirthday() {
        LocalDate x = LocalDate.now();
        return this.dob.getMonth() == x.getMonth() && this.dob.getDayOfMonth() == x.getDayOfMonth();
    }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }


}
