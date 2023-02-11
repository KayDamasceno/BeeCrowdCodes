using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>


int main(){

    int m, k;
    vector <int> minutes;
    vector <int> songs;
    vector <int> songsHeard;
    int minutesHeard = 0;
     
    
    while (cin >> m >> k){
        
        for (int i = 0; i < m; i++){
            int temp;
            cin >> temp;
            minutes.push_back(temp);
        }
        
        for (int i = 0; i <k; i++){
            int temp;
            cin >> temp;
            songs.push_back(temp);
        }
        
        for (int i = 0; i < k; i++){
            if (songsHeard.size() >= m)
                break;
            else
            {
                if (find(songsHeard.begin(), songsHeard.end(), songs[i]) == songsHeard.end()){
                    songsHeard.push_back(songs[i]);
                }
                
                minutesHeard+=minutes[songs[i]-1];
            }
        }
        
        if (songsHeard.size() < m)
            cout << -1 << endl;
        else
            cout << minutesHeard << endl;
        
        minutes.clear();
        songs.clear();
        songsHeard.clear();
        minutesHeard = 0;
    }
     
    
    
}
