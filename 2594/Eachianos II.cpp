using namespace std;
#include <iostream>
#include <vector>
#include<bits/stdc++.h>
#include <algorithm>
#include <string>
#include <map>
#include <sstream>
#include <regex>
int main()
{
    int n;
    cin >> n; cin.ignore();
    string s, word;
    vector <int> founds;
    while (n--)
    {
        getline(cin, s);
        getline(cin, word);
        regex rgx("\\b" + word+"\\b");


        for(auto it = std::sregex_iterator(s.begin(), s.end(), rgx);
                it != std::sregex_iterator();
                ++it)
        {
            founds.push_back(it->position());
        }
        

        if (founds.size() == 0)
        {
            cout << -1 << endl;

        }
        else
        {

            for(int i = 0; i < founds.size() - 1; i++)
            {
                cout << founds[i] << " ";
            }
            cout << founds[founds.size() - 1] << endl;
        }
        
        founds.clear();
    }
}

