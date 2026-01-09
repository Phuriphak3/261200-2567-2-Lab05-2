import java.time.LocalDate;
public class Lec05 {
    public static void main(String[] args) {

        User john = new User("John", 1954, 2, 18);
        john.displayInfo();
        System.out.println();

        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        nicolas.displayInfo();
        System.out.println();

        System.out.println("----------------------");

        System.out.println("(True)");
        nicolas.displayInfo(true);

        System.out.println("\n(False)");
        nicolas.displayInfo(false);



    }
}
