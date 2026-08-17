#include <iostream>
using namespace std; 


// clear points : 
class Base
{
public:
    void m1()
    {
        cout << "Base m1()" << endl;
    }
};

class Derived : public Base
{
public:
    void m1()
    {
        cout << "Derived m1()" << endl;
    }

    void m2()
    {
        cout << "Derived m2()" << endl;
    }
};

int main()
{
    Derived obj;
    Derived* ptr;

    obj.m1();            // Derived
    obj.Base::m1();      // Base
    obj.m2();            // Derived

    ptr = &obj;

    ptr->m1();           // Derived
    ptr->Base::m1();     // Base
    ptr->m2();           // Derived

    cout << "-----------------" << endl;

    Base* ptr2;

    ptr2 = &obj;

    ptr2->m1();          // Base

    // ptr2->m2();       // Compile Error

    return 0;
}


// Dynamic Binding  :
// case 1 : 
class Base
{
public:
    virtual void m1()
    {
        cout << "Base::m1()" << endl;
    }

    void m2()
    {
        cout << "Base::m2()" << endl;
    }
};

int main()
{
    Base o1;

    Base* ptr;

    ptr = &o1;

    ptr->m1();
    ptr->m2();

    return 0;
}

// case 2 : 

class Base
{
public:
    virtual void m1()
    {
        cout << "Base::m1()" << endl;
    }

    void m2()
    {
        cout << "Base::m2()" << endl;
    }
};

class Derived : public Base
{
public:
    void m1() override
    {
        cout << "Derived::m1()" << endl;
    }

    void m2()
    {
        cout << "Derived::m2()" << endl;
    }
};

int main()
{
    Derived o2;

    Base* ptr;

    ptr = &o2;

    ptr->m1();
    ptr->m2();

    return 0;
}



