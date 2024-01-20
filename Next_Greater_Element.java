import java.util.*;
public class Next_Greater_Element {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=new int[arr.length];
        ans[n-1]=-1;
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
