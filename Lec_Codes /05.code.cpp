#include <iostream> 
using namespace std; 

// static moemory allocation 
class Complex
{
private:
    double real;
    double imag;

public:
    Complex()
    {
        real = 0;
        imag = 0;
    }

    Complex(double r)
    {
        real = r;
        imag = 0;
    }

    Complex(double r, double i)
    {
        real = r;
        imag = i;
    }

    void printComplex()
    {
        cout << real << " + " << imag << "i" << endl;
    }
};

int main()
{
    Complex arr[3] = {
        Complex(2),
        Complex(),
        Complex(5, 7)
    };

    for (int i = 0; i < 3; i++)
    {
        arr[i].printComplex();
    }

    return 0;
}


// dynamic allocation 
class Complex
{
private:
    double real;
    double imag;

public:
    Complex()
    {
        real = 0;
        imag = 0;
    }

    Complex(double r, double i)
    {
        real = r;
        imag = i;
    }

    void printComplex()
    {
        cout << real << " + " << imag << "i" << endl;
    }
};

int main()
{
    Complex* cptr;

    cptr = new Complex(2.1, 7.3);

    cptr->printComplex();

    delete cptr;

    // array of objects
    cptr = new Complex[3];

    // Access the objects like an array
    for (int i = 0; i < 3; i++)
    {
        cptr[i].printComplex();
    }

    delete[] cptr;

    return 0;
}


// classes relations 
//1. Association 

class Course
{
public:
    Course()
    {
        cout << "Course created\n";
    }

    void showCourse()
    {
        cout << "This is a Course\n";
    }
};

class Seminar
{
private:
    Course* c;   // Association

public:
    Seminar()
    {
        c = nullptr;
    }

    void offer(Course* course)
    {
        c = course;
        cout << "Seminar is offering a Course\n";
    }
};

int main()
{
    Course c1;

    Seminar s1;

    s1.offer(&c1);

    return 0;
}






