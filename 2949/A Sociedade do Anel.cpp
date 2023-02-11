using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>


int main(){

    int t;
    cin >> t;
    string nome, tipo;
    int hob = 0, hu = 0, ma = 0, el = 0, an = 0;
    for(int i = 0; i < t; i++){
         cin >> nome >> tipo;
         
         if (tipo == "A")
            an++;
         if (tipo == "E")
            el++;
         if (tipo == "H")
            hu++;
         if (tipo == "M")
            ma++;
         if (tipo == "X")
            hob++;
         
     }
    cout << hob <<" Hobbit(s)"<< endl;
    cout << hu <<" Humano(s)"<< endl;
    cout << el <<" Elfo(s)"<< endl;
    cout << an <<" Anao(s)"<< endl;
    cout << ma <<" Mago(s)"<< endl;
}
