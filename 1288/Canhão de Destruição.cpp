using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>

int knapsack(int W, int b[], int wt[], int n){
    
    
    int V[n+1][W+1];
    
    for (int i = 0; i<=W; i++){
        V[0][i] = 0;
    }
    for (int i = 1; i<=n; i++){
        V[i][0] = 0;
    }
    
    for (int i = 1; i <= n; i++){
        for (int j = 1; j<=W; j++){
            if (wt[i-1] <= j){
                if ((b[i-1] + V[i-1][j-wt[i-1]])>V[i-1][j]){
                    V[i][j] =b[i-1] + V[i-1][j-wt[i-1]];
                }else{
                    V[i][j] = V[i-1][j];
                }
            }else{
                V[i][j] = V[i-1][j];
            }
        }
    }
    
    return V[n][W];
    
}
int main(){
    int n, W, t, q, m,r;
    
    cin >> n; cin.ignore();
    int b[n];
    int w[n];
    while (n--){
        cin >> m; cin.ignore();
        
        
        for (int i = 0; i < m ;i++){
            cin >> t >> q;
            b[i] = t;
            w[i] = q;
        }
        cin >> W; cin.ignore();
        cin >> r; cin.ignore();
        int value = knapsack(W,b,w,m);
    
        if (value>=r)
            cout << "Missao completada com sucesso" << endl;
        else
            cout << "Falha na missao" << endl;
        
        
        
    }
    
    
}
