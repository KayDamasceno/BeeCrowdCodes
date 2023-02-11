#include <bits/stdc++.h>
using namespace std;



int main (){

    int n; cin >> n;

    vector<pair<int,int>> values;
    vector<int> result;
    int d, t;

    while (n--){
        cin >> d >> t;
        values.push_back(make_pair(d,t));


    }

    sort(values.begin(), values.end());

    for (int i = 0 ; i < values.size(); i++){
        result.push_back(values[i].second);
    }


    if (is_sorted(result.begin(), result.end(), greater<int>())){
        cout << "S\n";

    }
    else
        cout << "N\n";



}
