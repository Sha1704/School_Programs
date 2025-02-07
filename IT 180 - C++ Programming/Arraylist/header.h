#include <iostream>
#ifndef HEADER_H
#define HEADER_H
using namespace std;
#include <string>

class ArrayList
{
    public:
    int* array;
    int capacity, size;

    ArrayList();
    ~ArrayList();
    void push (int m);
    void erase (int m);
    void toString();
};

#endif