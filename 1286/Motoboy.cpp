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
    int n, W, t, q;
    
    cin >> n; cin.ignore();
    int b[n];
    int w[n];
    while (n!=0){
        
        cin >> W; cin.ignore();
        
        for (int i = 0; i < n; i++){
            cin >> t >> q;
            b[i] = t;
            w[i] = q;
        }
        
        int value = knapsack(W,b,w,n);
    
        cout << value << " min." << endl;
        cin >> n;
        
    }
    
    
}
