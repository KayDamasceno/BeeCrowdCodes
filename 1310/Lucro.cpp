using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>


int kadane(vector<int>& list){
    
    int max_cust = list[0];
    int max_current = list[0];
    
    for (int i = 1; i < list.size(); i++){
        //cout << max_current << " " << max_cust << endl;
        max_current = max(max_current+list[i],list[i]);
        max_cust = max(max_current, max_cust);
    }
    
    
    return max_cust;
}
int main(){
    int n, custo, k;
    vector<int> numbers;
    while (cin>>n){
        cin >> custo;
        //scout << custo;
        for (int i = 0; i < n; i++){
            cin >> k;
            numbers.push_back(k-custo);
        }
        
        
        int value = kadane(numbers);
        
        if (value <=0){
            cout << 0 << endl;
        } else{
            cout << value << endl;
        }
        
        numbers.clear();
    }
}
