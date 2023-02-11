using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>
#include <map>

int main(){

    
    stack <char> s;
    
    string a;
    
    getline(cin, a);
    
    for (int i = 0; i < a.size(); i++){
        if (a[i] == '('){
            s.push('(');
        }else{
            if (s.size() > 0){
                s.pop();
            }
        }
    }
    
    
    if( s.size() == 0)
        cout << "Partiu RU!" << endl;
    else
        cout << "Ainda temos "<<s.size()<<" assunto(s) pendente(s)!"<<endl;
}
