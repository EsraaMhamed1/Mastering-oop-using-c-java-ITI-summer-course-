#include <iostream>
using namespace std; 

// inheritanc types 
// 1. public : 

class Base
{
public:
    int a;

protected:
    int b;

private:
    int c;
};

class Derived : public Base
{
public:
    void show()
    {
        a = 10;   // Allowed
        b = 20;   // Allowed
        // c = 30;   // NOT Allowed

        cout << "a = " << a << endl;
        cout << "b = " << b << endl;
    }
};

int main()
{
    Derived obj;

    obj.a = 100;   // Allowed because a is public
    cout << obj.a << endl; 


    // obj.b = 200;  // NOT Allowed because b is protected
    // obj.c = 300;  // NOT Allowed because c is private

    obj.show();

    return 0;
}


//2. Protected :

class Base
{
public:
    int a;

protected:
    int b;

private:
    int c;
};

class Derived : protected Base
{
public:
    void show()
    {
        a = 10;   // Allowed
        b = 20;   // Allowed
        // c = 30;   // NOT Allowed

        cout << "a = " << a << endl;
        cout << "b = " << b << endl;
    }
};

int main()
{
    Derived obj;

    // obj.a = 100;  // NOT Allowed
    // obj.b = 200;  // NOT Allowed
    // obj.c = 300;  // NOT Allowed

    obj.show();

    return 0;
}


