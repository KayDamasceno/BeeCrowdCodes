#include <bits/stdc++.h>
#include <math.h>
#include <iostream>

using namespace std;

int main (){

    int c; cin >> c;
    vector<char> order{'B', 'R', 'G'};
    while (c--){
        int P; cin >> P;
        int golG = 0, golR = 0, golB = 0;

        for(int i = 0; i < P; i++){
            char M, S; cin >> M >> S;

            if (M == 'B'){
                if (S == 'R'){
                    golB = golB+ 2;
                }
                if (S == 'G'){
                    golB = golB+ 1;
                }
            }
            else if (M == 'R'){
                if (S == 'G'){
                    golR = golR+ 2;
                }
                if (S == 'B'){
                    golR = golR+ 1;
                }
            }
            else if (M == 'G'){
                if (S == 'B'){
                    golG = golG+ 2;
                }
                if (S == 'R'){
                    golG = golG+ 1;
                }
            }
            

        }
      
        if (golB == golG && golG == golR){
            cout << "trempate" << endl;
        }
        else if (golB > golG && golB > golR){
                cout << "blue" << endl;
        }
        else if (golG>  golB && golG > golR){
                cout << "green" << endl;
            }
        else if (golR>  golB && golG < golR){
                cout << "red" << endl;
            }
        
        else {
            if (golB == golG){
            cout << "empate" << endl;
        }
            else if (golB == golR){
            cout << "empate" << endl;
        }
            else if (golG == golR){
            cout << "empate" << endl;
        }
        }
    }
   
}
