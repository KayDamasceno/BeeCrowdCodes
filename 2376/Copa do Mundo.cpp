using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>


int main(){
    int x, y, k;
    vector <char> first; 
    vector <char> second;
    vector <char> third;
    vector <char> fourth;
    first.push_back('A');
    first.push_back('B');
    first.push_back('C');
    first.push_back('D');
    first.push_back('E');
    first.push_back('F');
    first.push_back('G');
    first.push_back('H');
    first.push_back('I');
    first.push_back('J');
    first.push_back('K');
    first.push_back('L');
    first.push_back('M');
    first.push_back('N');
    first.push_back('O');
    first.push_back('P');
    
    k = 0;
    for (int i = 0; i < 8 ; i++){
        cin >> x >> y;
        if (x > y){
            second.push_back(first[k]);
        }else{
            second.push_back(first[k+1]);
        }
        k = k + 2;
    }
    k = 0;
    for (int i = 0; i < 4 ; i++){
        cin >> x >> y;
        if (x > y){
            third.push_back(second[k]);
        }else{
            third.push_back(second[k+1]);
        }
        k = k + 2;
    }
    k = 0;
    for (int i = 0; i < 2 ; i++){
        cin >> x >> y;
        if (x > y){
            fourth.push_back(third[k]);
        }else{
            fourth.push_back(third[k+1]);
        }
        k = k + 2;
    }
    
    cin >> x >> y;
    
    if (x > y){
        cout << fourth[0] << endl;
    }else
    {
        cout << fourth[1] << endl;
    }
}
