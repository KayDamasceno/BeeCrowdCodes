#include <bits/stdc++.h>
using namespace std;


int main(){

    int t; cin >> t;
    vector<int> ingredientes;
    vector<int> pairs;
    while(t--){
        int d, i , b;
        cin >> d >> i >> b;
       
        
        
        for (int j = 0; j < i; j++){
            int aux; cin >> aux;
            ingredientes.push_back(aux);
        }
       
        int minBolos = 0;
        for(int f = 0; f < b; f++){
            int Qi; cin >> Qi;
            for(int k = 0; k < Qi*2 ; k++){
                int values; cin >> values;
                pairs.push_back(values);
            }
           
            int custos = 0;
            
            for (int j = 0; j < pairs.size(); j=j+2){
         
                custos = custos + (ingredientes[pairs[j]]*pairs[j+1]);
                
            }
           
            if (int (d/custos) > minBolos) minBolos = int(d/custos);
            pairs.clear();

        }

        cout << minBolos << endl;

        ingredientes.clear();
        
        
       


    }
}
