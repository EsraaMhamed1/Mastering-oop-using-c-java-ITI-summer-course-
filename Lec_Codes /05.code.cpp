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



