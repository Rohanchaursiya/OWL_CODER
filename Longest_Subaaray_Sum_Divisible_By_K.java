import java.util.*;
public class Longest_Subaaray_Sum_Divisible_By_K {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();

        HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
        hm.put(0,-1);
        int cum_sum=0;
        int max_len=0;
        for(int i=0;i<n;i++){
            cum_sum+=a[i];
            int rem=cum_sum%k;
            if(rem<0){
                rem+=k;
            }
            if(hm.containsKey(rem)){
                max_len=Math.max(max_len,i-hm.get(rem));
            }
            if(!hm.containsKey(rem)){
                hm.put(rem,i);
            }
        }
        System.out.println(max_len);
    }
    
}
