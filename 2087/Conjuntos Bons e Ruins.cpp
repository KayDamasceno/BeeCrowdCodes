#include <bits/stdc++.h>
#include <string>
#include <iostream>
using namespace std;

bool startsWith(std::string mainStr, std::string toMatch)
{
    // std::string::find returns 0 if toMatch is found at starting
    if(mainStr.find(toMatch) == 0)
        return true;
    else
        return false;
}

int main (){

    int n; 
    cin >> n;
    vector<string> wordsList;
    bool flag = false;
    
    
    while (n!=0){
        
        for(int i = 0; i < n; i++){
            string word;
            cin >> word;

            if (!flag){
                for (int j = 0; j < wordsList.size(); j++){
                    if (startsWith(word, wordsList[j]) || startsWith(wordsList[j], word)){
                        flag = true;
                        break;
                    }
                }
            }

            wordsList.push_back(word);
        }
        if (flag) cout << "Conjunto Ruim\n";
        else cout << "Conjunto Bom\n";

        flag = false;
        wordsList.clear();
        cin >> n;
       
        

        
        
    }
}
