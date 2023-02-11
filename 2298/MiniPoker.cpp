#include <bits/stdc++.h>

using namespace std;


void solve(int n){
    cout << "Teste " << n << endl;
    vector<int> seq, unic;
    int number, points = 0;

    for (int i = 0; i < 5; i++){
        cin >> number;
        seq.push_back(number);
        unic.push_back(number);
    }
    
    sort(unic.begin(), unic.end());
    unic.erase(unique(unic.begin(), unic.end()), unic.end());
    /*
    for (int i = 0; i < unic.size(); i++){
        cout << unic[i] << endl;
    } */

    if (unic.size() == 5 ){
        if (unic[4]-unic[0] == 4)
            points = 200 + unic[0];
    }
    else if (unic.size() == 2){
        int firstElement = count(seq.begin(), seq.end(), unic[0]);
        int secondElement = count(seq.begin(), seq.end(), unic[1]);

        if (firstElement == 4 || secondElement == 4){
            if (firstElement == 4){
                points = 180 + unic[0];
            }else{
                points = 180 + unic[1];
            }
        } else if ((firstElement == 3 && secondElement == 2) || (firstElement == 2 && secondElement == 3)){
            if (firstElement == 3){
                points = 160 + unic[0];
            }else{
                points = 160 + unic[1];
            }
        } 

    } else if (unic.size() == 3){
        int firstElement = count(seq.begin(), seq.end(), unic[0]);
        int secondElement = count(seq.begin(), seq.end(), unic[1]);
        int thirdElement = count(seq.begin(), seq.end(), unic[2]);
        
        if (firstElement == 3){
            points = 140 + unic[0];
        } else if (secondElement == 3){
            points = 140 + unic[1];
        } else if (thirdElement == 3){
            points = 140 + unic[2];
        } else if ((firstElement == 2) && (secondElement == 2)){
            if (unic[0]>unic[1]){
                points = 3*unic[0] + 2*unic[1] + 20;
            }else {
                points = 3*unic[1] + 2*unic[0] + 20;
            }
        } else if ((firstElement == 2) && (thirdElement == 2)){
            if (unic[0]>unic[2]){
                points = 3*unic[0] + 2*unic[2] + 20;
            }else {
                points = 3*unic[2] + 2*unic[0] + 20;
            }
        } else if ((secondElement == 2) && (thirdElement == 2)){
            if (unic[1]>unic[2]){
                points = 3*unic[1] + 2*unic[2] + 20;
            }else {
                points = 3*unic[2] + 2*unic[1] + 20;
            }
        } 
    } else if (unic.size() == 4 ){
        int firstElement = count(seq.begin(), seq.end(), unic[0]);
        int secondElement = count(seq.begin(), seq.end(), unic[1]);
        int thirdElement = count(seq.begin(), seq.end(), unic[2]);
        int fourthElement = count(seq.begin(), seq.end(), unic[3]);

        if (firstElement == 2){
            points = unic[0];

        } else if (secondElement == 2){
            points = unic[1];
        } else if (thirdElement == 2){
            points = unic[2];
        } else {
            points = unic[3];
        }
    
    }

        
    cout << points << endl;
    cout << endl;


}
int main (){

    int n; cin >> n;

    for (int i = 1; i <= n; i++){
        
        solve(i);
    }
}
