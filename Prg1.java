//wap to compare a string
import java.util.*;

public class Prg1
{
    public static void main(String[] args) {
        String str1, str2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 Strings.");
        str1 = scan.nextLine();
        str2 = scan.nextLine();
        if (str1.equals(str2))
            System.out.println("String are equal.");
        else
            System.out.println("String are not equal.");
    }
}