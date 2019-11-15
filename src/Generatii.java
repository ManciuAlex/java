import java.util.Scanner;

public class Generatii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti varsta ");
        int age = in.nextInt();
        String generatia = null;
        if (age <= 25) {
            //generatia="valoarea incorecta";"
            System.out.println("Varsta incorecta");
            return;
        } else if (age > 0 && age < 6) {
            System.out.println("Generatia este Alfa");
        } else if (age <= 20) {
            generatia = "z";
        } else {
            generatia = "builders";
        }
        System.out.println("Generatia este:" + generatia);

    }
}
