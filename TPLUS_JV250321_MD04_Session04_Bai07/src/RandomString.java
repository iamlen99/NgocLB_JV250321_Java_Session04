import java.util.Scanner;

public class RandomString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so nguye bat ki n (1 <=n <=1000)");
        int n = input.nextInt();
        StringBuilder characters = new StringBuilder();

        for (char i = 'a'; i < 'z'; i++) {
            characters.append(i);
        }

        for (char i = 'A'; i < 'Z'; i++) {
            characters.append(i);
        }

        for (char i = '0'; i < '9'; i++) {
            characters.append(i);
        }

//        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz"
//                + "0123456789";

        System.out.println(characters);
        String randomString = new String();
        for (int i = 1; i <= n; i++) {
            randomString += characters.charAt((int) (Math.random() * characters.length()));
        }
        System.out.println(randomString);
    }
}
