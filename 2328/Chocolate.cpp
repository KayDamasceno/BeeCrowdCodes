#include <bits/stdc++.h>
using i64 = long long;


int main(){
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n;
    std::cin >> n;
    int sum = 0;


    for (int i = 0; i < n; i++){
        int aux;
        std::cin >> aux;
        sum = sum + aux - 1;

    }

    std::cout<<sum<<std::endl;
}
