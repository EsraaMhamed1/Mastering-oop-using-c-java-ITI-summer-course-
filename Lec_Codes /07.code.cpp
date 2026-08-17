#include <iostream>
using namespace std; 

// Types of inhertiance : 
// 1 . public: 

class Base {
public:
    int a;
protected:
    int b;
private:
    int c;
}; 

class Derived : public Base {
public : 
    void show() {
        a = 10;
        b = 20;
      
        
        cout << "a = " << a << endl; 
        cout << "b = " << b << endl; 

    }
};

int main() {
    Derived obj; 

    obj.a = 100;


    obj.show();

    return 0; 
}



// 2. protected : 

class Base {
public : 
    int a; 
protected : 
    int b; 
private : 
    int c;
};

class Derived : protected Base {
public : 
    void doSomething(){
        a = 10; 
        b = 20; 
        //c = 20;  

        cout << "a = " << a << endl; 
        cout << "b = " << b << endl; 

    }
};


int main() {
    Derived obj; 

    obj.doSomething();

    return 0; 
}


// 3. private : 

class Base {
public : 
    int a; 
protected : 
    int b; 
private: 
    int c;
};

class Derived : private Base {

public : 
    void show() {
        a = 10; 
        b = 20; 

        cout << "a = " << a << endl; 
        cout << "b  = " << b << endl; 

    }
};

int main() {
    Derived obj; 
    obj.show();

    return 0; 

}



// Example :

class GeoShape {
protected:
    float dim1;
    float dim2; 

public: 
    GeoShape() {
        dim1 = dim2 = 0;
    }

    GeoShape(float x) {
        dim1 = dim2 = x; 
    }

    GeoShape(float x, float y) {
        dim1 = x; 
        dim2 = y; 
    }

    void setDim1(float  x) {
        dim1 = x; 
    }

    void setDim2(float y) {
        dim2 = y;
    }

    float getDim1() {
        return dim1;
    }

    float getDim2() {
        return dim2;
    }

    float calcArea() {
        return 0; 
    }
};

class Triangle : public GeoShape {
public :
    Triangle (float b , float h): GeoShape(b,h){
    }

    float calcArea() {
        return 0.5 * dim1 * dim2; 
    }
};

class Rect : public GeoShape {
public : 
    Rect(float x, float y) : GeoShape(x, y) {

    }

    float calcArea() {
        return dim1 * dim2; 
    }
};

class Circle : private GeoShape {
public : 
    Circle(float r) : GeoShape(r) {

    }

    float calcArea() {
        return 22.0 / 7 * dim1 * dim2; 
    }
};

class Square : private Rect {
public: 
    Square(float side) : Rect(side, side) {

    }
    void setSquareDim(float x) {
        dim1 = dim2 = x; 
    }

    float getSquareDim() {
        return dim1; 
    }

    float calcArea() {
        return Rect::calcArea(); 
    }
};


int main() {
    Triangle t(10, 20); 
    cout << "Triangle Area = " << t.calcArea() << endl; 

    Rect r(10, 20); 
    cout << "Rect Area = " << r.calcArea() << endl; 

    Circle c(5);
    cout << "Circle Area = " << c.calcArea() << endl; 

    Square s(4); 
    cout << "Square Area = " << s.calcArea() << endl; 

    return 0;
 }



// Multible inheritance  :

class Base1 {
protected :
    int a; 

public: 
    Base1 (int x ){
        a = x; 
    }
};

class Base2 {
protected: 
    int b; 

public:
    Base2(int y) {
        b = y; 
    }
};

class Derived : public Base1, public Base2 {
private : 
    int c; 

public:
    Derived(int x, int y, int z) : Base1(x), Base2(y) {
        c = z; 
    }

    void show() {
        cout << "a = " << a << endl; 
        cout << "b = " << b << endl; 
        cout << "c = " << c << endl; 
    }
};

int main() {
    Derived d(10, 20, 30); 

    d.show(); 


    return 0;
}



// problem in multible inheritance : 
// 1 .  

class Base1 {
protected:
    int a;

public:
    Base1(int x) {
        a = x;
    }
};

class Base2 {
protected:
    int a;

public:
    Base2(int y) {
        a = y;
    }
};

class Derived : public Base1, public Base2 {
    int c; 
public : 
    Derived(int x, int y, int z) : Base1(x), Base2(y) {

    }

    int product() {
        return Base1::a * Base2::a * c; 
    }
};

int main() {
    Derived d(10, 20, 3);

    cout << d.product(); 


    return 0; 
}


// 2. 

class Base {
protected : 
    int a; 

public:
    Base(int x) {
        a = x; 
    }
};

class Base1:virtual public Base {
protected:
    int b;

public:
    Base1(int x,int y):Base(x) {
        b = x;
    }
};

class Base2 : virtual public Base {
protected:
    int c;

public:
    Base2(int x, int z) :Base(x){
        c = z;
    }
};

class Derived : public Base1, public Base2 {
private:
    int d; 

public:
    Derived(int x, int y, int z, int w) :Base(x), Base1(x, y), Base2(x, z) {
        d = w;
    }

      int product() {
          return a * b * c * d; 
      }
};

int main() {
    Derived d(2, 3, 4, 5);

    cout << d.product() << endl; 

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


