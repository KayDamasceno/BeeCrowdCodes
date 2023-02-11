#include <bits/stdc++.h>
using namespace std;







int main (){

    int t; cin >> t;
    double minor = 1000.00*1000;

    double p;
    int g;

    while (t--){
        
        cin >> p >> g;
        

        if ((1000*p)/g < minor)
            minor = (1000*p)/g;


    }

    cout << setprecision(2) << fixed;
    cout << minor << endl;

}
