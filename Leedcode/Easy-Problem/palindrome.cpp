#include<bits/stdc++.h>
using namespace std;    
int main(){
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    int rem=0,rev=0;
    while(n>0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
    cout<<"Reverse Number:"<<rev;
}