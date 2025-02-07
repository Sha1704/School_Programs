#include <iostream>
#include "header.h"

int main()
{
    Student rishi ("rsaripa");
    rishi.setEmail("rishi.saripalle@ilstu.edu");
    rishi.setName ("Rishi Saripalle");
    rishi.setGpa (2.3);
    rishi.addAddress("isu road", 123, "isu", "Normal", "Fell", "USA");
    rishi.display();

    return 0;
}