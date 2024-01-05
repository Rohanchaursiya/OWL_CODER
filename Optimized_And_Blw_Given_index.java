import java.util.*;
public class Optimized_And_Blw_Given_index {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        System.out.println("Array:");
        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i] =sc.nextInt();
        }

        int[][] bits=new int[n][32];
        for (int i=0;i<n;i++) {
            for (int j=0;j<32;j++) {
                bits[i][j] =(a[i] & (1 << j)) != 0 ? 1 : 0;
            }
        }

        int[][] preSum = new int[n][32];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 32; j++) {
                if (i == 0) {
                    preSum[i][j] = bits[i][j];
                } else {
                    preSum[i][j] = preSum[i - 1][j] + bits[i][j];
                }
            }
        }

        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter the query (l r):");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = 0;

            if (l == 0) {
                for (int i = 0; i < 32; i++) {
                    if (preSum[r][i] >= 1) {
                        ans = ans | (1 << i);
                    }
                }
            } else {
                int len = r - l + 1;
                for (int i = 0; i < 32; i++) {
                    if ((preSum[r][i] - preSum[l - 1][i]) >= 1) {
                        ans = ans | (1 << i);
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
/*Enter the size of the array:
6
Array:
7 2 7 2 3 1
Enter the number of queries:
3
Enter the query (l r):
1 3
7
Enter the query (l r):
2 4
7
Enter the query (l r):
1 5
7
*/
