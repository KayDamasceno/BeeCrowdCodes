using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>
#include <map>

int main(){

    map <string, int> languages;
    
    string idiom;
    int n, m ;
    cin >> n >> m; cin.ignore();
    
    for (int i = 0; i < n; i++){
         string a;
         int b;
         
         cin >> a >> b;
         
         languages.insert(make_pair(a,b));
     }
     
     
     int count = 0;
    while (count!=m){
        int soma  = 0;
        cin >> idiom;
        while (idiom!="."){
            if (languages.find(idiom)!=languages.end()){
                auto it = languages.find(idiom);
                soma = soma + it->second;
            }
            cin >> idiom;
        }
        
        count++;
        cout << soma << endl;
        
    }
    
}
