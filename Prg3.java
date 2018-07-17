//wap to show substring of a string
import java.util.*;
import java.lang.*;


public class Prg3
{
    public static void main(String[] args) {
        String str1 = new String("Maharashtra");
        System.out.println(str1.substring(5)); // starts from 5th index and prints remaining characters.
        System.out.println(str1.substring(2,6)); // starts from 2nd index and ends at 5th index.
    }
}