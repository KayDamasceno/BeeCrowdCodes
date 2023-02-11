#include <bits/stdc++.h>
using namespace std;

int main(){
    int M, N;
    cin >> M >> N;
    char grid[M][N];
    int costas = 0;

    for (int i = 0; i < M; i++){
        for (int j = 0; j < N; j++){
            char c;
            cin >> c;
            grid[i][j] = c;
        }
    }
    
    int total = 0;
    for (int i = 0; i < M; i++){
        for (int j = 0; j < N; j++){
            int water = 0;
            int land = 0;

            if (grid[i][j] == '#') total+=1;

            if (i - 1 >= 0){
                
                if (grid[i-1][j] == '.') water++;
                else land++;
                
            }
            if (i + 1 < M){
                
                if (grid[i+1][j] == '.') water++;
                else land++;
               
            }
            if (j - 1 >= 0){
                
                if (grid[i][j-1] == '.') water++;
                else land++;
               
            }
            if (j + 1 < N){
                
                if (grid[i][j+1] == '.') water++;
                else land++;
                
            }
            
            

            if (grid[i][j] == '#' && land == 4)
                costas++;

            

        }
    }
    cout << total-costas << endl;
}
