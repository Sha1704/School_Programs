#include <iostream>
#include "header.h"
#include <string>
using namespace std;

int main()
{
    ArrayList l1;

    l1.push(19);
    l1.push(43);
    l1.push(64);
    l1.push(6);
    l1.push(96);
    l1.push(23);
    l1.push(02);
    cout<<"Element added"<< endl;

    l1.toString();

    l1.erase(19);
    l1.erase (6);
    l1.erase(02);
    cout<<"Element removed"<< endl;   

    l1.toString(); 

    return 0;
}