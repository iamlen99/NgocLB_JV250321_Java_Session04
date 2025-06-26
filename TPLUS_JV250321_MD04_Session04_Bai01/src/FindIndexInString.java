import java.util.Scanner;

public class FindIndexInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi van ban:");
        String str = sc.nextLine();
        System.out.println("Nhap tu can tim trong chuoi:");
        String word = sc.nextLine();
        int index = str.indexOf(word);
        if (index != -1) {
            System.out.printf("Tu \"%s\" xuat hien tai vi tri %d trong chuoi", word, index);
        } else {
            System.out.printf("Khong tim thay tu \"%s\" trong chuoi", word);
        }
    }
}
