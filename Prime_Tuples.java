import java.util.*;
public class Prime_Tuples {
    public static Solve(long a,long b){
        if(b==0)
    }
    public static void main(String args[] {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            ArrayList<Integer> li=new ArrayList<Integer>();
            boolean isPrime[]=new boolean[n+1];
            Arrays.fill(isPrime,true);
            for(int i=2;i<n;i++){
                if(isPrime[i]){
                    li.add(i);
                    for(int j=2*i;j<n;j+=i){
                        isPrime[j]=false;
                    }
                }
            }
            
        }
    })
    
}
