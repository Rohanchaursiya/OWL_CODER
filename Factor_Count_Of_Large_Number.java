import java.util.*;
public class Factor_Count_Of_Large_Number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int prod=1;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                prod*=a[i];
            }
            int factor=1;
            for(int i=1;i<=prod/2;i++){
                if(prod%i==0){
                    factor++;
                }
            }
            System.out.println(factor);
             
        }
    }

}