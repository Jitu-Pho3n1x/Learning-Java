//wap to reverse string.
import java.util.*;
import java.lang.*;


public class Prg2
{
    public static void main(String[] args) {
        String str1,str2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to reverse.");
        str1 = scan.nextLine();
        str2 = new StringBuffer(str1).reverse().toString();
        System.out.println("Reverse of the string is: "+str2);   
    }
}