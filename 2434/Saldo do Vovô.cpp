using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>


int main(){
    int n, s, f;
    vector <int> saldo;
    cin >> n >> s; cin.ignore();
    saldo.push_back(s);
    
    int menor = saldo[0];
    int soma = 0;
    for (int i = 0; i < n; i++){
        cin >> f;
        saldo.push_back(f);
    }
    for (int i = 0; i < n+1 ; i++){
           soma = soma + saldo[i];
           if(soma <= menor){
               menor = soma;
           }    
    }
    
    cout << menor << endl;
}
