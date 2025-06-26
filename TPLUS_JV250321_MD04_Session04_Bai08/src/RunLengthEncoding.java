import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi bat ky: ");
        String str = input.nextLine();
        StringBuilder newString = new StringBuilder();

        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                newString.append(str.charAt(i));
                newString.append(count);
                count = 1;
            }
            if (i == str.length() - 2) {
                newString.append(str.charAt(i));
                newString.append(count);
            }
        }
        System.out.println(newString);
    }
}
