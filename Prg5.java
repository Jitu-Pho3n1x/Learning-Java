//wap to convert char array to string and vice versa
import java.lang.*;
import java.util.*;
public class Prg5
{
    public static void main(String[] args) {
        char[] a = {'J','i','t','e','n','d','r','a',' ','K','a','k','u'};
        String b = new String(a);
        System.out.println("String = "+b);
        char[] c = b.toCharArray();
        System.out.println(b.length());
        for(int i=0;i<(b.length());i++)
            System.out.print(c[i]);
    }
}
