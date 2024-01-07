import java.util.*;
import java.io.*;
public class Count_Set_Bits {
    public static int set_bits(int a,int k){
        return (1<<k)|a;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int t=sc.nextInt();
        // while(t--!=0){
            int a=sc.nextInt();
            int k=sc.nextInt();
            System.out.println(set_bits(a,k));
            //System.out.println(Integer.bitCount(a));
        // }
    }
    
}


// public class Main {
//     public static int countBits(int[] nums, int k) {
//         int[] v = new int[32];
        
//         for (int i = 0; i < 32; i++) {
//             for (int j = 0; j < nums.length; j++) {
//                 if ((nums[j] & (1 << i)) != 0) {
//                     v[i]++;
//                 }
//             }
//         }
        
//         int op = 0;
//         for (int i = 0; i < 32; i++) {
//             if (v[i] % 2 != 0) {
//                 if ((k & (1 << i)) != 0) {
//                     continue;
//                 } else {
//                     op++;
//                 }
//             } else {
//                 if ((k & (1 << i)) != 0) {
//                     op++;
//                 }
//             }
//         }
        
//         return op;
//     }

//     public static void main(String[] args) {
//         int[] nums = { /* Your array of numbers here */ };
//         int k = /* Your value of k here */;

//         int result = countBits(nums, k);
//         System.out.println(result);
//     }
// }



