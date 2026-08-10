
// Friend function :
class Complex
{
private:
    float real;
    float imag;

public:
    Complex(float r, float i)
    {
        real = r;
        imag = i;
    }

    void print()
    {
        cout << real << " + " << imag << "i" << endl;
    }

     friend Complex addTo(float v, Complex c);
};

Complex addTo(float v, Complex c)
{
    c.real = c.real + v;

    return c;
}

int main()
{
    Complex c(2, 5);

    Complex result = addTo(4, c);

    result.print(); 

    return 0;
}









