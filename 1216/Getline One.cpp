#include <iostream>
#include <cstdio>
#include <iomanip>
using namespace std;

int main()
{
 double cr = 0, tp = 0, rs, x;
 string trash;
 char c;

 while(getline(cin,trash))
 {
  cin >> x;
  c = getchar();
  tp += x;
  cr++;
 }

 rs = tp / cr;

 cout << fixed << setprecision(1) << rs << endl;

 return 0;
}
