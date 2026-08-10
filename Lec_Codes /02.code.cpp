
#include <iostream>
using namespace std;

// default args 


int sum(int x, int y, int z, int m)
{
    int s;
    s = x + y + z + m;
    return s;
}

int main()
{
    cout << sum(1, 2, 3, 4) << endl;

     //cout << sum(1, 2, 3) << endl; // ERROR
    // cout << sum(1, 2) << endl;    // ERROR

    return 0;
}







int sum(int x, int y, int z = 0 , int m = 0)
{
    int s;
    s = x + y + z + m;
    return s;
}

int main()
{
    cout << sum(1, 2, 3, 4) << endl;  // 10
    cout << sum(1, 2, 3) << endl;     // 6
    cout << sum(1, 2) << endl;        // 3

    return 0;
}



class Complex
{
    int real;
    int img;

public:

    void setComplex(int r, int i)
    {
        real = r;
        img = i;
    }

    void setComplex(int v)
    {
        real = img = v;
    }

    void print()
    {
        cout << "Real = " << real << endl;
        cout << "Imaginary = " << img << endl;
    }
};

int main()
{
    Complex c;

    c.setComplex(3, 5);
    c.print();

    cout << "--------" << endl;

    c.setComplex(5);
    c.print();

    return 0;
}



// overloading 


class Complex
{
    int real;
    int img;

public:

    void setComplex(int r, int i = 0)
    {
        real = r;
        img = i;
    }

    void setComplex(int v)
    {
        real = img = v;
    }
};

int main()
{
    Complex c;

   c.setComplex(3, 5);

     // c.setComplex(5);   // ERROR: Ambiguous

    return 0;
}





// constructor 


class Complex
{
    float real;
    float img;

public:

    Complex()
    {
        real = 0;
        img = 0;

        cout << "This is the default constructor" << endl;
    }

    Complex(int v)
    {
        real = img = v;

        cout << "This is the overloaded constructor, with one parameter" << endl;
    }

    Complex(float r, float i)
    {
        real = r;
        img = i;

        cout << "This is the overloaded constructor, with two parameters" << endl;
    }
};

int main()
{
    Complex c1;
    Complex c2(5);
    Complex c3(5, 5);

    return 0;
}


// destructor 


class Complex
{
public:

    Complex()
    {
        cout << "Default Constructor" << endl;
    }

    Complex(int x)
    {
        cout << "Constructor with one parameter" << endl;
    }

    Complex(int x, int y)
    {
        cout << "Constructor with two parameters" << endl;
    }

    ~Complex()
    {
        cout << "The object destructor" << endl;
    }
};

int main()
{
    Complex c1;
    Complex c2(3);
    Complex c3(3, 5);

    return 0;
}




// this pointer 

class Complex
{
    int real;
    int imag;

public:

    void setComplex(int r, int i)
    {
       real = r;
       imag = i;
    }

    void print()
    {
        cout << "Real = " <<real << endl;
        cout << "Imag = " << imag << endl;
    }
};

int main()
{
    Complex c1;
    Complex c2;

    c1.setComplex(3, 5);
    c2.setComplex(10, 20);

    c1.print();
    c2.print();

    return 0;
}



class Student
{
private:
    int age;

public:

    void setAge(int age)
    {
        this->age = age;
    }
};



// Example


class Complex
{
private:
    float real;
    float imag;

public:

    Complex();

    Complex(float r);

    Complex(float r, float i);

    ~Complex();

    void setReal(float r);
    void setImag(float i);

    float getReal();
    float getImag();

    Complex add(Complex c);

    Complex sub(Complex c);

    
    void print();

    // Set both values
    void setComplex(float r, float i);
};

Complex::Complex()
{
    real = 0;
    imag = 0;
}

Complex::Complex(float r)
{
    real = r;
    imag = r;
}

Complex::Complex(float r, float i)
{
    real = r;
    imag = i;
}



Complex::~Complex()
{
    cout << "Object destroyed" << endl;
}



void Complex::setReal(float r)
{
    real = r;
}

void Complex::setImag(float i)
{
    imag = i;
}

float Complex::getReal()
{
    return real;
}

float Complex::getImag()
{
    return imag;
}


void Complex::setComplex(float r, float i)
{
    real = r;
    imag = i;
}


void Complex::print()
{
    cout << real << " + " << imag << "i" << endl;
}


Complex Complex::add(Complex c)
{
    Complex result;

    result.real = real + c.real;
    result.imag = imag + c.imag;

    return result;
}


Complex Complex::sub(Complex c)
{
    Complex result;

    result.real = real - c.real;
    result.imag = imag - c.imag;

    return result;
}



int main()
{
    Complex c1(3, 5);
    Complex c2(2, 4);

    cout << "C1 = ";
    c1.print();

    cout << "C2 = ";
    c2.print();

    Complex c3 = c1.add(c2);

    cout << "C1 + C2 = ";
    c3.print();

    Complex c4 = c1.sub(c2);

    cout << "C1 - C2 = ";
    c4.print();

    return 0;
}




class Student
{
public:
    static int count;

    Student()
    {
        count++;
    }
};

int Student::count = 0;

int main()
{
    Student s1;

    cout << "Count = " << Student::count << endl;

    Student s2;

    cout << "Count = " << Student::count << endl;

    Student s3;

    cout << "Count = " << Student::count << endl;

    return 0;
}



// Pointer 

int main()
{
    int x = 20;
    
    int* p = &x;

    cout << "Value of x = " << x << endl;
    cout << "Address of x = " << &x << endl;
    cout << "Value stored in p = " << p << endl;
    cout << "Value pointed to by p = " << *p << endl;

    return 0;
}



int main()
{
    int x = 20;

    int* p = &x;

    cout << "Before: " << x << endl;

    *p = 50;   

    cout << "After: " << x << endl;

    return 0;
}
