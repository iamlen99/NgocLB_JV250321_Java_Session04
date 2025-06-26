import java.util.Scanner;

public class DeleteAndReplaceElement {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello, Java World!");
        System.out.println("Chuoi ban dau: " + str);
        System.out.println("Chuoi sau khi xoa: " + str.delete(5, 10));
        str.replace(7, 12, "Universe");
        System.out.println("Chuoi sau khi thay the: " + str);
    }
}
