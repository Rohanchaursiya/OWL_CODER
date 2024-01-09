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




// import java.util.Scanner;

// public class BitSwapping {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input format: X P1 P2 N
//         int X = scanner.nextInt();
//         int P1 = scanner.nextInt();
//         int P2 = scanner.nextInt();
//         int N = scanner.nextInt();

//         // Close the scanner as it's no longer needed
//         scanner.close();

//         // Call the function to perform bit swapping
//         int result = swapBits(X, P1, P2, N);

//         // Output the result
//         System.out.println(result);
//     }

//     // Function to swap N bits at positions P1 and P2 in the binary representation of X
//     private static int swapBits(int X, int P1, int P2, int N) {
//         // Create masks for the bits to be swapped
//         int mask1 = ((1 << N) - 1) << (P1 - N);
//         int mask2 = ((1 << N) - 1) << (P2 - N);

//         // Extract the bits to be swapped
//         int bits1 = (X & mask1) >> (P1 - N);
//         int bits2 = (X & mask2) >> (P2 - N);

//         // Clear the bits to be swapped
//         X = X & ~(mask1 | mask2);

//         // Set the swapped bits
//         X = X | (bits1 << (P2 - N)) | (bits2 << (P1 - N));

//         return X;
//     }
// }




// //import java.util.*;
// public class OwlCoder{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         long n=sc.nextLong();
//         int bits=32;
//         long ans=0;
//         while(bits--!=0){
//             ans=ans|(n&1);
//             ans<<=1;
//             n>>=1;
//         }
//         ans>>=1;
//         System.out.println(ans);
//     }
// }