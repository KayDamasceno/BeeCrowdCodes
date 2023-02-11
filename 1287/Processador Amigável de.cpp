#include <iostream>
#include <cstdio>
#include <cstdlib>
 
using namespace std;
 
int main(){
    string n;
 
    while(getline(cin, n)){
        string saida = "";
 
        if(n.size() == 0){
            saida = "error";
        }
 
        for(int i=0; n[i]!='\0'; i++){
 
            if(n[i] >= '0' and n[i] <= '9'){
                saida += n[i];
 
            } else {
                if(n[i] == 'o' or n[i] == 'O'){
                    saida += "0";
 
                } else {
                    if(n[i] == 'l'){
                        saida += "1";
 
                    } else {
                        if(n[i] != ' ' and n[i] != ','){
                            saida = "error";
                            break;
                        }
                    }
                }
            }
        }
 
        if(saida == "error")
            printf("error\n");
        else {
            saida += '\0';
            long long num = atoll(saida.c_str());
 
            if(num > 2147483647 || num == 0 && n != "0" && n != "00"){
                printf("error\n");
            } else {
                printf("%lld\n", num);
            }
        }
    }
}
