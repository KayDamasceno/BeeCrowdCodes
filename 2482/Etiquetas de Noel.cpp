using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>
#include <map>

int main(){

    map <string, string> languages;
    
    string idiom;
    int n ;
    cin >> n; cin.ignore();
    for (int i = 0; i < n; i++){
         
         string translate;
         getline(cin,idiom);
         getline(cin,translate);
         
         languages.insert(make_pair(idiom, translate));
         
     }
     
     int m;
     cin >> m; cin.ignore();
     
     for (int i = 0; i < m; i++){
         string name;
         getline(cin,name);
         getline(cin,idiom);
         auto it = languages.find(idiom);
         
         cout << name << endl;
         cout << it->second << endl;
         cout << endl;
     }
     
    
    
}
