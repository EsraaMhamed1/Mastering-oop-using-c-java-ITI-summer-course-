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




//3. private : 
class Base
{
public:
    int a;

protected:
    int b;

private:
    int c;
};

class Derived : private Base
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



//Example 
class GeoShape
{
protected:
    float dim1;
    float dim2;

public:

    GeoShape()
    {
        dim1 = dim2 = 0;
    }

    GeoShape(float x)
    {
        dim1 = dim2 = x;
    }

    GeoShape(float x, float y)
    {
        dim1 = x;
        dim2 = y;
    }

    void setDim1(float x)
    {
        dim1 = x;
    }

    void setDim2(float x)
    {
        dim2 = x;
    }

    float getDim1()
    {
        return dim1;
    }

    float getDim2()
    {
        return dim2;
    }

    float calculateArea()
    {
        return 0;
    }
};


// ================= Triangle =================

class Triangle : public GeoShape
{
public:

    Triangle(float b, float h) : GeoShape(b, h)
    {
    }

    float calculateArea()
    {
        return 0.5 * dim1 * dim2;
    }
};


// ================= Rectangle =================

class Rect : public GeoShape
{
public:

    Rect(float x, float y) : GeoShape(x, y)
    {
    }

    float calculateArea()
    {
        return dim1 * dim2;
    }
};

// ================= Circle =================
class Circle : private GeoShape
{
public:

    Circle(float r) : GeoShape(r)
    {
    }

    void setRadius(float r)
    {
        dim1 = dim2 = r;
    }

    float getRadius()
    {
        return dim1;
    }

    float calculateArea()
    {
        return 22.0 / 7 * dim1 * dim2;
    }
};
// ================= Square =================

class Square : private Rect
{
public:

    Square(float side) : Rect(side, side)
    {
    }

    void setSquareDim(float x)
    {
        dim1 = dim2 = x;
    }

    float getSquareDim()
    {
        return dim1;
    }

    float calculateArea()
    {
        return Rect::calculateArea();
    }
};


int main()
{
    Triangle t(10, 20);
    Rect r(10, 20);
    Circle c(5);
    Square s(5);

    cout << "Triangle Area = "
        << t.calculateArea() << endl;

    cout << "Rectangle Area = "
        << r.calculateArea() << endl;

    cout << "Circle Area = "
        << c.calculateArea() << endl;

    cout << "Square Area = "
        << s.calculateArea() << endl;

    return 0;
}


// problem in multible inheritance 2 : 
class Base
{
protected:
    int a;

public:
    Base(int x)
    {
        a = x;
    }
};

class Base1 : public Base
{
protected:
    int b;

public:
    Base1(int x, int y)
        : Base(x)
    {
        b = y;
    }
};

class Base2 : public Base
{
protected:
    int c;

public:
    Base2(int x, int z)
        : Base(x)
    {
        c = z;
    }
};

class Derived : public Base1, public Base2
{
private:
    int d;

public:
    Derived(int x, int y, int z, int w)
        : Base1(x, y), Base2(x, z)
    {
        d = w;
    }

    int product()
    {
        return a * b * c * d;   // ❌ Ambiguous
    }
};

int main()
{
    Derived d(2, 3, 4, 5);

    cout << d.product() << endl;

    return 0;
}



