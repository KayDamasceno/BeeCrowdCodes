#include <bits/stdc++.h>
using namespace std;


int main (){

    int n; cin >>n;
    int cont = 1;
    string a, b;
    int mao1, mao2;
    while (n!=0){
        cout << "Teste "<< cont << endl;
        cin >> a >> b;
        
        for (int i = 0; i < n; i++){
            cin >> mao1 >> mao2;

            if ((mao1 + mao2)%2 == 0){
                cout << a << endl;
            } else {
                cout << b << endl;
            }
        }
        

        cin >> n;
        cont+=1;
        cout << endl;
    }
}
