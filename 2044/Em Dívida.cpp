using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>


int main(){
    
    int n, k;
    cin >> n;
    
    while(n!= -1){
    int soma = 0;
    int count = 0;
    for (int i = 0; i < n; i++){
        cin >> k;
        soma = soma + k;
        
        if (soma % 100 == 0){
            count++;
        }
    }
    cout << count << endl;
    cin >> n;
    }
}
