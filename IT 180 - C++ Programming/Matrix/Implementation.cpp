#include <iostream>
#include <string>
#include "header.h"
using namespace std;

Matrix::Matrix()
    {
        for(int i =0; i < rowSize; i++)
        {
            for (int j = 0; j<colSize; j++)
            {
                arr[i][j] = (rand()%10)+1;
            }
        }
    }

string Matrix::toString()
    {
        string str = "";
        for(int i =0; i < rowSize; i++)
        {
            for (int j = 0; j<colSize; j++)
            {
               str += to_string(arr[i][j]) + "        ";
            }
            str += "\n";
        }
        return str;
    }

Matrix Matrix::operator *(Matrix x)
    {
        Matrix temp;
        for(int i =0; i < rowSize; i++)
        {
            for (int j = 0; j<colSize; j++)
            {
                temp.arr[i][j] = 0;
                for (int k = 0; k<colSize; k++)
                {
                    temp.arr[i][j] += this->arr[i][k] * x.arr[k][j];
                }
            }
        }
        return temp;
    }

bool Matrix::operator ==(Matrix y)
    {
        for(int i =0; i < rowSize; i++)
        {
            for (int j = 0; j<colSize; j++)
            {
              if (this->arr[i][j] != y.arr[i][j])
              {
                return false;
              }
            }
        }
        return true;
    }