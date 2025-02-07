#include <iostream>
#ifndef HEADER_H
#define HEADER_H
#include <string>
using namespace std;

class Matrix
{
    public:
    int arr [3][3];
    int rowSize = 3;
    int colSize = 3;
    Matrix();
    string toString();
    Matrix operator *(Matrix x);
    bool operator ==(Matrix y);
};

#endif