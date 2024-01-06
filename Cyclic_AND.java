import java.util.*;
public class Cyclic_AND {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int set_bits=0;
            for(int j=0;j<32;j++){
                if((arr[i] & (1<<j))>0){
                    set_bits++;
                }
            }

            if(set_bits>=3){
                ans=1;
                break;
            }else{
                ans=0;
            }
        }
        if(ans==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
