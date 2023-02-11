#include <bits/stdc++.h>
#include <sstream>

using namespace std;

string convert_ASCII(string hex){
   string ascii = "";
   for (size_t i = 0; i < hex.length(); i += 2){
      //taking two characters from hex string
      string part = hex.substr(i, 2);
      //changing it into base 16
      char ch = stoul(part, nullptr, 16);
      //putting it into the ASCII string
      ascii += ch;
   }
   return ascii;
}

int main () {

    ios::sync_with_stdio(false);
    cin.tie(nullptr);


    int t; cin >> t;
    string s = "";
    

    for(int i = 0 ; i < t; i++){
        string aux;
        cin >> aux;
        s = s + convert_ASCII(aux);

    }

    cout << s << endl;
}
