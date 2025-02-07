#include <iostream>
#include <string>
#include "header.h"
using namespace std;

Student::Student (string id)
{
   studentId = id;
}

void Student::addAddress(string sn, int hn, string an, string ct, string st, string cou)
{
    address = Address (sn,hn,an,ct,st,cou);
}

void Student::display()
{
    cout<< name << " - has student ID: " << studentId << ", email: " << email << ", and a final gpa of:" << gpa <<endl;
}

void Student::setGpa(double newGpa)
{
    gpa = newGpa;
}

void Student::setEmail(string newEmail)
{
    email = newEmail;
}


void Student::setName(string newName)
{
    name = newName;
}

Address::Address(string sn, int hn, string an, string ct, string st, string cou)
{
    streetName = sn;
    houseNumber = hn;
    areaName = an;
    city = ct;
    state = st;
    country = cou;
}
