#include <bits/stdc++.h>
#include <stdlib.h>

void solve(){
    int a, b, result, sum;
    char signal, equal;

    std::cin >> a >> signal >> b >> equal >> result;

    if (signal == '+') 
        sum = a + b;
    else if (signal == '-')
        sum = a - b;
    else
        sum = a * b;

   

    int digits = abs(sum - result);

    std::cout << "E" << std::string(digits,'r') << "ou!" << std::endl;

}



int main(){
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);


    

    int t;

    std::cin >> t;

    while (t--){
        solve();
    }


}
