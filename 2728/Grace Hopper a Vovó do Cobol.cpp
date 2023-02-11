#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;


int main()
{
    string word, input;
    vector<string> list;
    while (cin >> input)
    {




        bool cobol = false;
        stringstream sentence(input);

        while (getline(sentence, word, '-'))
        {
            list.push_back(word);
        }


        if (tolower(list[0][0]) == 'c' || tolower(list[0][list[0].size() - 1]) == 'c')
        {
            if (tolower(list[1][0]) == 'o' || tolower(list[1][list[1].size() - 1]) == 'o')
            {
                if (tolower(list[2][0]) == 'b' || tolower(list[2][list[2].size() - 1]) == 'b')
                {
                    if (tolower(list[3][0]) == 'o' || tolower(list[3][list[3].size() - 1]) == 'o')
                    {
                        if (tolower(list[4][0]) == 'l' || tolower(list[4][list[4].size() - 1]) == 'l')
                        {
                            cobol = true;
                        }
                    }
                }
            }

        }

        if (cobol)
        {
            cout << "GRACE HOPPER" << endl;

        }
        else
        {
            cout << "BUG" << endl;
        }
        list.clear();
    }
}

