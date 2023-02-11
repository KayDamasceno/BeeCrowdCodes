using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>


int main(){

    int x, y, m, x1, y1;
    
    while( cin >> x >> y >> m){
         
         for(int i = 0; i < m; i++){
             cin >> x1 >> y1;
             
             if (min(x1, y1)<=min(x,y) && max(x1,y1) <= max(x,y))
                cout << "Sim" << endl;
             else
                cout << "Nao" << endl;
         }
     }
}
