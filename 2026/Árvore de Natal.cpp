#include <bits/stdc++.h>
using namespace std;

void max_self(int& a, int b){
    a = max(a,b);
}
int main (){
    int t;
    cin >> t;
    int k = 1;
    int n, W;
    while (t>0){
        cin >> n >> W;
        vector<int> dp(W+1);
    
        
        for (int item = 0; item < n; item++){
            int value, weight;
            cin >> value >> weight;

            for (int weight_already = W; weight_already>=0; weight_already--){
                
                //cout << "wa " << weight_already <<"w " <<weight <<"wa+ w " << weight_already+weight << endl;
                //cout << "dp wa + value " << dp[weight_already] + value << endl;
                if (weight_already+weight < (W+1))
                    max_self(dp[weight_already+weight],dp[weight_already]+value);
                
            
            }
            
            
        }
       
        int answer = 0;
        for (int i = 0; i <= W; i++){
            max_self(answer, dp[i]);
        }
        cout << "Galho " << k << ":"<<endl;
        cout << "Numero total de enfeites: " << answer << endl;
        cout << endl;
        k++;
        dp.clear();
        t--;
    }
}
