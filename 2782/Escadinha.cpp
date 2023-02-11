using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>


int main(){

    int x, k;
    
    cin >> x;
    
    int numbers[x];
    
    for (int i = 0; i < x; i++){
        cin >> k;
        numbers[i] = k;
    }
    
    if (x == 1){
        cout << 1 << endl;
        
    } else {
        int dif = numbers[1] - numbers[0];
        int esc = 0;
        
        for (int i = 0; i < x-1; i++){
            if((numbers[i+1] - numbers[i])!=dif){
                esc++;
                dif = numbers[i+1] - numbers[i];
            }
        }
        
        cout << esc + 1 << endl;
    }
    
}
