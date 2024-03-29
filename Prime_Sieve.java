import java.util.*;
public class Prime_Sieve {
    public static ArrayList<Long> sieve(long n){
        ArrayList<Long> li=new ArrayList<>();
        boolean isPrime[]=new boolean[(int)n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i<(long)n;i++){
            if(isPrime[i]){
                li.add((long)i);
                for(int j=2*i;j<(long)n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int c=0;

        for(int i=2;i<n;i++){
            c=0;
            if(isPrime[i] && isPrime[i]){
                c++;
            }
        }
        return li;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            Long n = sc.nextLong();
            ArrayList<Long> li=sieve((long)n);
            for(int i=0;i<li.size();i++){
                System.out.print(li.get(i)+" ");
            }
        // }
        
        
    } 
    
}
