import java.util.Scanner;

public class BitManipulation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("BitWise AND of A and B is:"+(a&b));
        System.out.println("BitWise OR of A and B is:"+(a|b));
        System.out.println("BitWise XOR A and B is:"+(a^b));
        System.out.println("1 Left Shift of A  is:"+(a<<1));
        System.out.println("1 Right Shift of A is:"+(a>>1));
        System.out.println("Invert of A is:"+(~a));
        
    }
    
}
