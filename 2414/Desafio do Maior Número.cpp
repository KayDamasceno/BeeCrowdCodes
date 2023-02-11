using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
int main(){
    vector< int >arr;
    string input;
    getline(cin, input);
    istringstream is(input);
    int num;
    while(is>>num) arr.push_back(num);
    
    cout << *max_element(arr.begin(), arr.end()) << endl;
        
}
