import java.time.LocalDate;

public class Admin extends User {


    public Admin() {
        super();
    }

    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin.");
    }


    public void displayInfo(boolean full) {
        if (full) {
            int age = LocalDate.now().getYear() - this.dob.getYear();
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
            this.displayInfo();
            System.out.println("Today's date: " + LocalDate.now());
        } else {
            int age = LocalDate.now().getYear() - this.dob.getYear();
            System.out.println("Happy birthday " );
            System.out.println("Name: " + this.name);
        }
    }



}
