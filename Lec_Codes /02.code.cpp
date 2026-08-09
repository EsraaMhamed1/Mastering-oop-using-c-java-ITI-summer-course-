
#include <iostream>
using namespace std;

/* 1. Default Args*/
void welcome( string name="Student name ") {
    cout << "Hello, " << name << endl; 
}

int main()
{
    welcome("Esraa");
    welcome();
    return 0;
}


