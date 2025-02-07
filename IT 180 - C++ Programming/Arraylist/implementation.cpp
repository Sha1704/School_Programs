#include <iostream>
#include <string>
#include "header.h"
using namespace std;

ArrayList:: ArrayList()
    {
        size = 0;
        capacity = 1;
        array =  new int[capacity];
        array [0] = 0;
    }

ArrayList:: ~ArrayList()
    {
        delete[] array;
    }

void ArrayList:: push (int m)
    {
       if (size == capacity)
       {
        capacity *= 2;
        int* newArray = new int[capacity];

        for (int i = 0; i < size; i++)
        {
            newArray[i] = array[i];
        }

        delete[] array;
        array = newArray;
       }

       array[size] = m;
       size++;
    };

void ArrayList:: erase(int m)
    {
        int index = -1;

        for (int i =0; i < size; i++)
        {
            if (array[i] == m)
            {
                index = i;
                break;
            }
        }

        if (index != -1)
        {
            for (int i = index; i < size-1; i++)
            {
                array [i] = array[i+1];
            }

            size--;

            if (size < (capacity/2))
            {
                capacity /= 2;
                int* newArray = new int[capacity];

                for (int i =0; i < size; i++)
                {
                    newArray[i] = array[i];
                }

                delete[] array;
                array = newArray;
            }
        }
    };

void ArrayList:: toString()
    {
        for (int i =0; i < size; i++)
        {
            cout<<array[i]<<" ";
        }
        cout<<endl;
    }