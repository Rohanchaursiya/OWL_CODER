import java.util.*;
public class FactorialOfLargeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        for(int i=2;i<=n;i++){
           int carry=0;
           for(int j=0;j<ans.size();j++){
                int num=ans.get(j)*i+carry;
                int digit=num%10;
                carry=num/10;
                //Replacing the jth index value with new digit
                ans.set(j, digit);
           }
           while(carry!=0){
                ans.add(carry%10);
                carry/=10;
           }
        }
        Collections.reverse(ans);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i));
        }
    }
}
