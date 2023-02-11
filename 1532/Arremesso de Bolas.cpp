#include <bits/stdc++.h>
using namespace std;

int main (){

    int N, V;
    cin >> N >> V;
    
    while (N!=0 && V!=0){
        bool possible = false;
        for (int j = V; j > 0; j--){
            int value = j;
            int i = j;
            int saltos = 1;
            while (value < N && i!=0){



                if (saltos == i){
                    saltos = 0;
                    i--;
                }
                value = value + i;  
                saltos++;
                //cout << value << endl;
            }
            
            if (value == N){
                possible = true;
                break;
            }
        

        }
          
        if (possible) cout << "possivel\n";
        else cout << "impossivel\n";

        cin >> N >> V;
    }
}
