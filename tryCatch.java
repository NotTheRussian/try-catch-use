import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {

        try {
            System.console().readLine("Type special keyword: ");
            System.out.println("Keyword Accepted.");
        } catch (NullPointerException e) {
           Scanner scanner = new Scanner(System.in);
            System.out.println("Type special keyword: ");
            scanner.nextLine();
            System.out.println("Keyword Accepted.");
        }
    }
}