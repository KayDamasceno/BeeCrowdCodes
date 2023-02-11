#include <iostream>
#include <bits/stdc++.h>
#include <vector>
#include <algorithm>
using namespace std;

int main(int argc, char** argv)
{
    int A, B, n;

    while(cin >> A >> B && (A != 0 && B != 0))
    {
        vector<int> vA, vB, vC, vD;

        vector<int>::iterator it, st; //iterator




        //Lendo vetor A;
        for(int i = 0; i < A; i++)
        {
            cin >> n;
            vA.push_back(n);

        }
        //Lendo vetor B;
        for(int i = 0; i < B; i++)
        {
            cin >> n;
            vB.push_back(n);
        }

        for(unsigned int i = 0; i < vA.size(); i++)
        {
            if((find(vB.begin(), vB.end(), vA.at(i)) != vB.end()) == false)
            {
                if((find(vC.begin(), vC.end(), vA.at(i)) != vC.end()) == false)
                    vC.push_back(vA.at(i));

            }
        }



        for(unsigned int i = 0; i < vB.size(); i++)
        {
            if((find(vA.begin(), vA.end(), vB.at(i)) != vA.end()) == false)
            {
                if((find(vD.begin(), vD.end(), vB.at(i)) != vD.end()) == false)
                    vD.push_back(vB.at(i));

            }
        }
        
        
        cout << min(vC.size(), vD.size()) << endl;

    }
    return 0;
}

