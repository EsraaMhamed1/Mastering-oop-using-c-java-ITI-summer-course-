
#include <iostream>
using namespace std;


/* 1. Default Args*/

/************* one parmeter *****************/
void welcome( string name="Student name ") {
    cout << "Hello, " << name << endl; 
}

int main()
{
    welcome("Esraa");
    welcome();
    return 0;
}

/************ more than one parmeter *********/
void student(string name, int age = 20)
{
    cout << name << " " << age << endl;
}

int main() {
    student("Esraa" );
    student("Ahmed", 24);
    return 0; 
}

/***********************************************/

