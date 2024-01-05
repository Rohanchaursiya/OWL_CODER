import java.util.*;
public class And_Blw_All_Given_index {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //length of an array
        int n=sc.nextInt();
        //array initialization
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //no of test case
        int t=sc.nextInt();
        while(t--!=0){
            int fi=sc.nextInt();
            int li=sc.nextInt();
            int ans=a[fi];
            if(fi>a.length && li>a.length){
                ans=-1;
            }else{
                 ans=a[fi];
                for(int i=fi+1;i<=li;i++){
                    ans&=a[i];
                }
            }
            System.out.println(ans);
        }
    }
}
/*
Enter the size of the array:
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
