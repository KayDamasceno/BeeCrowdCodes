#include <bits/stdc++.h>
using namespace std;

int main (){

    int V, W;
    cin >> V  >> W;

    unordered_map<int, list<pair<int,int>>> adj;

    for (int i = 0; i < W; i++){
        int a, b, c;
        cin >> a >> b >> c;

        adj[a].push_back(make_pair(b,c));
        adj[b].push_back(make_pair(a,c));

    }

    vector<int> key(V+1,INT_MAX);
    vector<bool> mst(V+1, false);
    vector<int> parent(V+1, -1);

    key[1] = 0;
    parent[1] = -1;

    for(int i = 1; i < V; i++){

        int mini = INT_MAX;
        int u;
        //cout << "i " << i << endl;

        for (int v = 1; v <= V; v++){
            //cout << "v " << v << endl;
            if (mst[v] == false && key[v] < mini){
                u = v;
                mini = key[v];
                //cout << "u " << u << endl;
                //cout << "mini " << mini <<endl;
            }
        }

        mst[u] = true;

        for (auto it:adj[u]){
            int v = it.first;
            int w = it.second;
            //cout << "v, w " << v << " " << w << endl;
            //cout << "key[v] " << key[v] << endl;
            //cout << "mst[v] " << mst[v] << endl;
            if (mst[v] == false && w < key[v]){
                parent[v] = u;
                key[v] = w;
            }
        }

    

    }
    int sum = 0;
    for (int i = 2; i<=V; i++){
        sum+=key[i];
    }
    cout << sum << endl;
    

    /*
    for (auto const pair:adj){
        cout << pair.first << endl;
       for (auto const list:pair.second){
        cout << list.first << " " << list.second << endl;
       }
    }
    */
}
