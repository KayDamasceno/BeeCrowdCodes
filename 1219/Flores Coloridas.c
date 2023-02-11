#include <stdio.h>
#include <math.h>




int main (){
    
    int a, b, c;
    double PI = 3.1415926535897;
    
    while(scanf("%d %d %d", &a, &b, &c)!=EOF){
    double perimetro =  ((a + b + c))/2.0;
    
    double areaTriangulo = sqrt(perimetro*(perimetro - a)*(perimetro-b)*(perimetro-c));
    
    double areaCirculoMaior = ((a*b*c*1.0)/(4*areaTriangulo))*((a*b*c*1.0)/(4*areaTriangulo))*PI;
    
    double raioCirculoMenor = ((a+b-c)*1.0)/2;
    
    double areaCirculoMenor = (areaTriangulo/perimetro)*(areaTriangulo/perimetro)*PI;
    
    printf ("%.4lf %.4lf %.4lf\n", areaCirculoMaior-areaTriangulo, areaTriangulo-areaCirculoMenor, areaCirculoMenor);
    }
}

