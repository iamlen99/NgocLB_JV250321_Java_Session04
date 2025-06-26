import java.util.Scanner;

public class ReplaceMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str = sc.nextLine();
        String s = str.replaceAll("[0-9]", "*");
        System.out.println(s);
    }
}
