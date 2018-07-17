import java.util.*;

class Aprg1{
    public static void main(String[] args) {
        int a[] = new int[]{11,23,56,79,12,98,35,85,92,45,77,46};
        int s = a[0];
        int b = a[0];
        for(int i=0; i<a.length;i++){
            if (a[i]< s) {
                s = a[i];
            }
            if(a[i]>b){
                b = a[i];
            }
        }
        System.out.println("Smallest in array = "+s);
        System.out.println("Biggest in array = "+b);
    }
}