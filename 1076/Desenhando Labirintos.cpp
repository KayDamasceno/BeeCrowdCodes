#include <bits/stdc++.h>
using namespace std;

int main (){
    int t; cin >> t;
    

    while (t--){
        
        int node; cin >> node;
        int c, a; 
        cin >> c >> a;
        vector<int> adj[c];

        for (int i = 0; i < a; i++){
            int v, w;
            cin >> v >> w;
            adj[v].push_back(w);
            adj[w].push_back(v);
        }

        vector<int> sck;
        sck.push_back(node);
        set<int> visited;

        while (sck.size()!=0){
            int current = sck.back();
            sck.pop_back();
            visited.insert(current);

            for(auto neighbor: adj[current]){
                set<int> ::iterator it = visited.find(neighbor);
                if(it==visited.end()){
                    sck.push_back(neighbor);
                }
            }
        }

        cout << (visited.size()-1)*2 << endl;

        sck.clear();
        adj->clear();
        visited.clear();
    }
}
