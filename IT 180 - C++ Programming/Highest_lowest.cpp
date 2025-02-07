#include <iostream>
using namespace std;

int write_array();
double mean(int arr[] , int size);
int lowest(int arr[], int size);
int highest(int arr[], int size);

int main()
{
    int size = 15;
    int arr[size];
    for (int i = 0; i < size; i++)
    {
        cout << "enter array value: " << (i+1);
        int val = write_array();
        arr[i] = val;
    }

    cout << "The Average of this array is: " << mean(arr, size)<<endl;
    cout << "The lowest number in this array is: " << lowest(arr, size)<<endl;
    cout << "The highest number in this array is: " << highest(arr, size)<<endl;
return 0;
}

int write_array()
{
    int val;
        cin >> val;
    return val;
}

double mean(int arr[], int size)
{
    int sum = 0;
    for (int i = 0; i < size; i++)
    {
        sum += arr[i];
    }
    return static_cast<double>(sum)/size;
}

int lowest(int arr[], int size)
{
    int lowest = arr[0];
    for (int i = 1; i < size; i++)
    {
            if (arr[i] < lowest)
            {
                lowest = arr[i];
            }
    }
    return lowest;
}

int highest(int arr[], int size)
{
    int highest = arr[0];
    for (int i = 1; i < size; i++)
    {
            if (arr[i] > highest)
            {
                highest = arr[i];
            }
    }
    return highest;
}