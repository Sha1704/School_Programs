#include <iostream>
#ifndef HEADER_H
#define HEADER_H
#include <string>
using namespace std;

class Address
{
    public:
    Address():houseNumber(0){}
    Address(string sn, int hn, string an, string ct, string st, string cou);

    private:
    string streetName;
    int houseNumber;
    string areaName;
    string city;
    string state;
    string country;
};

class Student
{
    public:
    Student (string id);
    void addAddress (string sn, int hn, string an, string ct, string st, string cou);
    void setEmail(string email);
    void setGpa(double gpa);
    void setName(string name);
    void display();

    private:
    string name;
    double gpa;
    Address address;
    string email;
    string studentId;
};

#endif