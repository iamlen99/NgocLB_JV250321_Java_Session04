import java.util.Scanner;
import java.util.regex.Pattern;

public class IsValidEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap email: ");
        String email = sc.nextLine();
        String emailRegex = "^[a-zA-Z0-9._\\s]+@[a-zA-Z0-9.]+\\.[a-zA-Z\\s]{2,6}$";
        if(Pattern.matches(emailRegex, email)){
            System.out.println("Email hop le");
        } else {
            System.out.println("Email khong hop le");
        }
    }
}
