import java.util.*;
public class Longest_Increasing_Subsequence {
    public static int lengthOfLIS(int[] nums) {
        int temp[]=new int[nums.length];
        int size=0;
        for(int num : nums){
            int i=0,j=size;
            
            while(i!=j){
                int mid=(i+j)/2;
                if(temp[mid]<num){
                    i=mid+1;
                }else{
                    j=mid;
                }
            }
            temp[i]=num;
            if(i==size){
                size++;
            }
        }
        return size;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans=lengthOfLIS(a);
        System.out.println(ans);
    }
}
/*
Output
 5
3 2 4 5 6 
4
 */