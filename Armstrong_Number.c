#include<stdio.h>
#include<math.h>
int main(){
    int n;
    scanf("%d",&n);
    int m=n;
    int sum=0;
    while(n!=0){
        sum+=(pow(n%10,3));
        n/=10;
    }
    if(sum==m){
        printf("Yes");
    }else{
        printf("No");
    }
}

/*
153
Yes
*/