#include <stdio.h>
#include <iostream>
#include <string>
#include <stdlib.h>
using namespace std;

int main(int argc, char** argv)
{

    string texto;
    char c;

    while(getline(cin, texto))
    {

        for(unsigned int i = 0; i < texto.length( ) ; i++)
        {
            c = texto[i];


            if(c == 'B') printf("V");
            if(c == ' ') printf(" ");
            if(c == 'C') printf("X");
            if(c == 'D') printf("S");
            if(c == 'E') printf("W");
            if(c == 'F') printf("D");
            if(c == 'G') printf("F");
            if(c == 'H') printf("G");
            if(c == 'I') printf("U");
            if(c == 'J') printf("H");
            if(c == 'K') printf("J");
            if(c == 'L') printf("K");
            if(c == 'M') printf("N");
            if(c == 'N') printf("B");
            if(c == 'O') printf("I");
            if(c == 'P') printf("O");
            if(c == 'R') printf("E");
            if(c == 'S') printf("A");
            if(c == 'T') printf("R");
            if(c == 'U') printf("Y");
            if(c == 'V') printf("C");
            if(c == 'X') printf("Z");
            if(c == 'W') printf("Q");
            if(c == 'Y') printf("T");
            if(c == '1') printf("`");
            if(c == '2') printf("1");
            if(c == '3') printf("2");
            if(c == '4') printf("3");
            if(c == '5') printf("4");
            if(c == '6') printf("5");
            if(c == '7') printf("6");
            if(c == '8') printf("7");
            if(c == '9') printf("8");
            if(c == '0') printf("9");
            if(c == '-') printf("0");
            if(c == '=') printf("-");
            if(c == '[') printf("P");
            if(c == ']') printf("[");
            if(c == '\\') printf("]");
            if(c == '/') printf(".");
            if(c == ',') printf("M");
            if(c == '.') printf(",");
            if(c == '\'') printf(";");
            if(c == ';') printf("L");
        
    }

    cout << endl;
}
return 0;
}

