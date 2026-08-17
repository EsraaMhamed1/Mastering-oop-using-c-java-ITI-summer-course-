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



// Case 4 : 
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

class Second : public Derived
{
public:
    void m1() override
    {
        cout << "Second::m1()" << endl;
    }

    void m2()
    {
        cout << "Second::m2()" << endl;
    }
};

int main()
{
    Second o3;

    Derived* ptr;

    ptr = &o3;

    ptr->m1();
    ptr->m2();

    return 0;
}

// V-table
// calcArea
class GeoShape
{
public:
    virtual float calculateArea()
    {
        return 0;
    }
};

class Triangle : public GeoShape
{
private:
    float base;
    float height;

public:
    Triangle(float b, float h)
    {
        base = b;
        height = h;
    }

    float calculateArea() override
    {
        return 0.5 * base * height;
    }
};

class Rect : public GeoShape
{
protected:
    float length;
    float width;

public:
    Rect(float l, float w)
    {
        length = l;
        width = w;
    }

    float calculateArea() override
    {
        return length * width;
    }
};

class Square : public Rect
{
public:
    Square(float side) : Rect(side, side)
    {
    }

    float calculateArea() override
    {
        return length * width;
    }
};

class Circle : public GeoShape
{
private:
    float radius;

public:
    Circle(float r)
    {
        radius = r;
    }

    float calculateArea() override
    {
        return 3.14 * radius * radius;
    }
};

int main()
{
    GeoShape* p;

    Circle c(10);
    Rect r(30, 40);
    Triangle t(100, 150);
    Square s(60);

    // Circle
    p = &c;
    cout << "Circle Area = " << p->calculateArea() << endl;

    // Rectangle
    p = &r;
    cout << "Rectangle Area = " << p->calculateArea() << endl;

    // Triangle
    p = &t;
    cout << "Triangle Area = " << p->calculateArea() << endl;

    // Square
    p = &s;
    cout << "Square Area = " << p->calculateArea() << endl;

    return 0;
}



//calcSum : 
class GeoShape
{
public:
    virtual float calculateArea()
    {
        return 0;
    }
};

class Triangle : public GeoShape
{
private:
    float base;
    float height;

public:
    Triangle(float b, float h)
    {
        base = b;
        height = h;
    }

    float calculateArea() override
    {
        return 0.5 * base * height;
    }
};

class Rect : public GeoShape
{
protected:
    float length;
    float width;

public:
    Rect(float l, float w)
    {
        length = l;
        width = w;
    }

    float calculateArea() override
    {
        return length * width;
    }
};

class Circle : public GeoShape
{
private:
    float radius;

public:
    Circle(float r)
    {
        radius = r;
    }

    float calculateArea() override
    {
        return 3.14 * radius * radius;
    }
};

float sumAreas(GeoShape* p1, GeoShape* p2, GeoShape* p3)
{
    return p1->calculateArea()
        + p2->calculateArea()
        + p3->calculateArea();
}

int main()
{
    Triangle myT(20, 10);
    Rect myR(2, 5);
    Circle myC(5);

    cout << "Total Area = "
        << sumAreas(&myT, &myR, &myC)
        << endl;

    return 0;
}

// template class 
template <class T>
class Stack
{
private:
    T* st;
    int size;
    int top;

public:

    Stack(int s)
    {
        size = s;
        top = 0;
        st = new T[size];
    }

    ~Stack()
    {
        delete[] st;
    }

    void push(T value)
    {
        if (top < size)
        {
            st[top] = value;
            top++;
        }
        else
        {
            cout << "Stack is full!" << endl;
        }
    }

    T pop()
    {
        if (top > 0)
        {
            top--;
            return st[top];
        }
        else
        {
            cout << "Stack is empty!" << endl;
            return T();
        }
    }
};

int main()
{
    // Stack of integers
    Stack<int> s1(5);

    s1.push(10);
    s1.push(3);
    s1.push(2);

    cout << "Integer Stack:" << endl;

    cout << s1.pop() << endl;
    cout << s1.pop() << endl;


    // Stack of characters
    Stack<char> s2(5);

    s2.push('a');
    s2.push('r');
    s2.push('s');

    cout << "\nCharacter Stack:" << endl;

    cout << s2.pop() << endl;
    cout << s2.pop() << endl;


    // Stack of double
    Stack<double> s3(5);

    s3.push(10.5);
    s3.push(20.7);

    cout << "\nDouble Stack:" << endl;

    cout << s3.pop() << endl;
    cout << s3.pop() << endl;

    return 0;
}
