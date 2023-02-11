#include <bits/stdc++.h>

using namespace std;
typedef long long ll;
ll find (vector<ll> peso, int n){

    ll b = 0;
    ll e = n;

    while (b <= e){
        ll mid = int((b+e)/2);
        ll leftSum = 0;
        ll rightSum = 0;
        ll weightLeft = mid + 1;
        ll weightRight = 1;

        for (int i = 0; i < (mid + 1); i++){
            leftSum = leftSum + weightLeft*peso[i];
            weightLeft--;
        }

        for (int i = (mid+1); i < n; i++){
            rightSum = rightSum + weightRight*peso[i];
            weightRight++;
        }

        if (leftSum == rightSum){
            return mid;
        } else if (leftSum > rightSum){
            e = mid - 1;
        } else {
            b = mid + 1;
        }

    
    }

    return -1;
}

int main (){
    ios_base :: sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    string nome;
    vector <ll> pesos;
    vector <string> nomes;
    while (n!=0){
        
    

        for(int i = 0; i < n; i++){
            ll soma = 0;
            cin >> nome;
            nomes.push_back(nome);

            for (int j = 0; j < nome.size(); j++){
                soma = soma + ll(nome[j]);
            }

            pesos.push_back(soma);
            
        }


        ll mid = find(pesos, n);
        if (mid!=-1) {
            cout << nomes[mid] << endl;
        }
        else {
            cout << "Impossibilidade de empate.\n";
        }
        pesos.clear();
        nomes.clear();
        cin >> n;
        
    }
}
