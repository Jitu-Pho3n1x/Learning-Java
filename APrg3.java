//wap array sorting
import java.lang.*;
import java.util.*;

class APrg3{
    public static void main(String[] args) {
        int i,j=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int len = Integer.parseInt(sc.nextLine());
        int a[] = new int[len];
        int b[] = new int[len];
        for(i=0;i<len;i++){
            a[i] = Integer.parseInt(sc.nextLine());//accept values in array.
        }
        for(i=0;i<len;i++){
            b[i]=a[i];//copy array a to array b.
        }
        System.out.println("Enter values for Array:");
        do {
            for(i=0;i<len-1;i++){//Bubble Sort to sort in ascending order.
                if(a[i]>a[i+1]){
                    temp = a[i];
                 a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            j++;
        }while (j<len-1);
        for(j=0;j<len;j++){
            System.out.println(a[j]);
        }
    }
}