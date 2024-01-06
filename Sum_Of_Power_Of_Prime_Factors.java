import java.util.*;
public class Sum_Of_Power_Of_Prime_Factors {
    public static long sumOfPowers(long a, long b) {
        // code here
        int prime[]=new int[(int)b+1];
        for(int i=2;i<=b;i++){
            if(prime[i]==0){
                for(int j=i;j<=b;j+=i){
                    prime[j]=i;
                }
            }
        }
        
        int ans=0;
        for(int i=(int)a;i<=b;i++){
            int num=i;
            while(num>1){
                num/=prime[num];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long ans=sumOfPowers(a, b);

       System.out.println(ans);
    }
    
}

 /* Output
    1 10
    15
    2 6
    7
  */
 
