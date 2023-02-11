#include <stdio.h>
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main ()
{

    unsigned int n;
    vector <int> num;
    vector <int> :: iterator it;
    scanf("%u", &n);

    

    
    while(n != 0)
    {
        num.clear();
        num.push_back(1);
        
        int m = 1, flag = 0, atual = 0;
        
        while(flag == 0)
        {
            
                for(unsigned int i = 1; i <= n; i++)
                {
                    if(!(find(num.begin(), num.end(), i) != num.end()))
                        atual++;
                    if(atual == m)
                    {
                        num.push_back(i);
                        atual = 0;
                    }
                }
            

            if(num.size() == n && num.at(num.size() - 1) == 13)
            {
                flag++;
            } else if(num.size() != n) {
                
            }
            else
            {
                num.clear();
                num.push_back(1);
                m++;
            }

        }
        
        printf("%d\n", m);
        scanf("%u", &n);
    }
    

}

