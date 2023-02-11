#include <iostream>
#include <list>

using namespace std;

class Graph{
private:
    //number of verticies
    int V;
    //pointer to adjacent list
    list<int> *adj;

public:
    //Constructor
    Graph(int V);

    //Add an edge
    void addEdge(int v, int w);

    //Method for BFS transversal given a start
    bool BFS(int s, int end);
};

Graph::Graph(int v){
    V = v;
    adj = new list<int>[v];

}

void Graph::addEdge(int v, int w){
    adj[v].push_back(w);
}

bool Graph::BFS(int s, int end){
    //all vertices as not visited
    bool *visited = new bool[V];
    int *level = new int[V];
   
    for (int i = 0; i < V; i++){
        visited[i] = false;
        level[i] = -1;
    }
    //queue for BFS
    list<int> queue;
    visited[s] = true;
    level[s] = 0;
    queue.push_back(s);

    while (!queue.empty()){
        // get the front of queue and remove it
        s = queue.front();
        queue.pop_front();

        //cout << "Checking adjacents for vertex " << s << endl;

        for (auto i = adj[s].begin(); i!=adj[s].end(); i++){
            //check only nodes not visited
            if (!visited[*i]){
                //Mark as visited
                //cout << "Visited and enqueue " << *i << endl;
                visited[*i] = true;
                level[*i] = level[s] + 1;
                //cout << level[*i] << endl;
                queue.push_back(*i);

                if (*i == end){
                    cout << level[*i] << endl;
                    return true;
                }
            }
        }

    }

    cout << "use the stairs" << endl;
    return false;
}

int main (){

    int f, s, g, u, d;
    cin >> f >> s >> g >> u >> d;
    
    
    Graph graph(f+1);

    for (int i = 1; i <= f; i++){
        if (i + u <= f) graph.addEdge(i,i+u);
        if (i - d >= 1) graph.addEdge(i,i-d);
    }
    if (s == g){
        cout << "0" << endl;
    } else
        graph.BFS(s, g);
}
