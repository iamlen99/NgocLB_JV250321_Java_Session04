import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap mat khau: ");
        String password = input.nextLine();
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$!%]).{8,}$";
        if (Pattern.matches(passwordRegex, password)) {
            System.out.println("Mat khau hop le");
        } else {
            System.out.println("Mat khau khong hop le");
        }
    }
}
