//wap to convert integer to string and vice versa.
import java.util.*;
import java.lang.*;


public class Prg4
{
    public static void main(String[] args) {
        String str1 = "1234";
        String stemp;
        int itemp;
        int a = 10;
        itemp = Integer.parseInt(str1);
        stemp = String.valueOf(a);
        System.out.println("str1="+str1+"  itemp="+itemp);
        System.out.println("a="+a+"  stemp="+stemp);
    }
}