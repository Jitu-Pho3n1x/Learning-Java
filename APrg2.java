import java.util.*;
import java.lang.*;


class APrg2{
    public static void main(String[] args) {
        int tot=0, len,i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        len = Integer.parseInt(sc.nextLine());
        int a[] = new int[len];
        System.out.println("Enter values for Array:");
        do {
            a[i]=Integer.parseInt(sc.nextLine());
            tot+=a[i];
            i++;
        } while (i<len);
        double avg = tot/len;
        System.out.println("Average of array = "+avg);
    }
}