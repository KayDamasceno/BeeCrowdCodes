using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>

int countMoves(int n ){
    if(n==0){
        return 0;
    }
    
    return 2*countMoves(n-1)+1;
}
int main(){

    int n;
    cin >> n;
    int casos = 1;
    while(n!=0){
         cout << "Teste " << casos << endl;
         cout << countMoves(n) <<endl;
         
         cin >> n;
         casos++;
         cout << endl;
     }
     
    
    
}
