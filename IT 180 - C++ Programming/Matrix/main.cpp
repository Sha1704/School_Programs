#include <iostream>
#include "header.h"

int main()
    {
       Matrix matrix1;
       Matrix matrix2;
       cout<<"matrix1: " <<endl <<matrix1.toString()<<endl;
       cout<<"matrix2: " <<endl <<matrix2.toString()<<endl;
       Matrix matrix3 = matrix1*matrix2;
       cout<<"matrix 1 and 2 multiplied: " <<endl <<matrix3.toString()<<endl;
       bool matrix4 = matrix1==matrix2;
       cout<<"are matrix one and 2 equal? (0 for no, 1 for yes)" << endl<< matrix4<< endl;

       return 0;
    }