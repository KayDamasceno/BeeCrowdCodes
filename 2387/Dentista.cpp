#include <bits/stdc++.h>
using namespace std;

bool sortbysec(const pair<int,int> &a,
              const pair<int,int> &b)
{
    return (a.second < b.second);
}

int main(){

    int n; cin >> n;
    vector<pair<int,int>> horarios;
    int x, y;

    while (n--){

        cin >> x >> y;

        horarios.push_back(make_pair(x,y));
    }

    sort(horarios.begin(), horarios.end(), sortbysec);
    int max = 1;
    int j = 0;
    for (int i = 1; i < horarios.size(); i++){
        if (horarios[i].first >= horarios[j].second){
            max++;
            j = i;
        }
    }

    cout << max << endl;
}
