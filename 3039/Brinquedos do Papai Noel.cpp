using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>


int main(){

    int t, mo = 0, ma = 0;
    string nome, sexo;
    
    cin >> t; cin.ignore();
    
    while (t--){
        cin >> nome >> sexo;
        
        if (sexo == "F")
            ma++;
        else
            mo++;
    }
    
    cout << mo << " carrinhos" << endl;
    cout << ma << " bonecas" << endl;
    
    
}
