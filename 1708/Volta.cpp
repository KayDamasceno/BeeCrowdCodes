using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>


int main(){

    int x1, x2, faltando = 0, volta = 1;
    cin >> x1 >> x2;
    while(faltando<x1){
         faltando = volta*(x2-x1);
         volta++;
     }
     
     cout << volta << endl;
    
}
