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
    string name;

    Course(string n)
    {
        name = n;
    }
};

class Seminar
{
private:
    Course* c; // association

public:
    void offer(Course* course)
    {
        c = course;

        cout << "Seminar is offering: "
            << c->name << endl;
    }
};

int main()
{
    Course oop("OOP using C++");

    Seminar s1;

    s1.offer(&oop);

    return 0;
}



// Example (Create picture ) 
class Point
{
private:
    int x;
    int y;

public:

    Point()
    {
        x = 0;
        y = 0;
    }

    Point(int m, int n)
    {
        x = m;
        y = n;
    }

    void setX(int m)
    {
        x = m;
    }

    void setY(int n)
    {
        y = n;
    }

    int getX()
    {
        return x;
    }

    int getY()
    {
        return y;
    }
};



class Rect
{
private:
    Point ul;   // Upper Left
    Point lr;   // Lower Right

public:

    Rect() : ul(), lr()
    {
        cout << "Rect Constructor\n";
    }

    Rect(int x1, int y1, int x2, int y2)
        : ul(x1, y1), lr(x2, y2)
    {
        cout << "Rect Constructor\n";
    }

    void draw(ofstream& file)
    {
        int x = ul.getX();
        int y = ul.getY();

        int width = lr.getX() - ul.getX();
        int height = lr.getY() - ul.getY();

        file << "<rect x=\"" << x
            << "\" y=\"" << y
            << "\" width=\"" << width
            << "\" height=\"" << height
            << "\" fill=\"none\" stroke=\"black\" stroke-width=\"3\" />\n";
    }
};



class Circle
{
private:
    Point center;
    int radius;

public:

    Circle() : center()
    {
        radius = 0;
        cout << "Circle Constructor\n";
    }

    Circle(int x, int y, int r)
        : center(x, y)
    {
        radius = r;
        cout << "Circle Constructor\n";
    }

    void draw(ofstream& file)
    {
        file << "<circle cx=\"" << center.getX()
            << "\" cy=\"" << center.getY()
            << "\" r=\"" << radius
            << "\" fill=\"none\" stroke=\"blue\" stroke-width=\"3\" />\n";
    }
};


// Line

class Line
{
private:
    Point start;
    Point end;

public:

    Line() : start(), end()
    {
        cout << "Line Constructor\n";
    }

    Line(int x1, int y1, int x2, int y2)
        : start(x1, y1), end(x2, y2)
    {
        cout << "Line Constructor\n";
    }

    void draw(ofstream& file)
    {
        file << "<line x1=\"" << start.getX()
            << "\" y1=\"" << start.getY()
            << "\" x2=\"" << end.getX()
            << "\" y2=\"" << end.getY()
            << "\" stroke=\"red\" stroke-width=\"3\" />\n";
    }
};


class Picture
{
private:

    int cNum;
    int rNum;
    int lNum;

    Circle* pCircles;
    Rect* pRects;
    Line* pLines;

public:

    Picture()
    {
        cNum = 0;
        rNum = 0;
        lNum = 0;

        pCircles = NULL;
        pRects = NULL;
        pLines = NULL;
    }


    void setCircles(int n, Circle* ptr)
    {
        cNum = n;
        pCircles = ptr;
    }


    void setRects(int n, Rect* ptr)
    {
        rNum = n;
        pRects = ptr;
    }


    void setLines(int n, Line* ptr)
    {
        lNum = n;
        pLines = ptr;
    }


    void paint()
    {
        ofstream file("picture.svg");

        if (!file)
        {
            cout << "Error creating file!\n";
            return;
        }

        // SVG Header
        file << "<svg xmlns=\"http://www.w3.org/2000/svg\" "
            << "width=\"600\" height=\"600\">\n";

        // Background
        file << "<rect width=\"600\" height=\"600\" "
            << "fill=\"black\" />\n";


        // Draw Circles
        for (int i = 0; i < cNum; i++)
        {
            pCircles[i].draw(file);
        }


        // Draw Rectangles
        for (int i = 0; i < rNum; i++)
        {
            pRects[i].draw(file);
        }


        // Draw Lines
        for (int i = 0; i < lNum; i++)
        {
            pLines[i].draw(file);
        }


        // SVG End
        file << "</svg>\n";

        file.close();

        cout << "\nPicture created successfully!\n";
        cout << "File name: picture.svg\n";
    }
};



int main()
{
    // Graphic Mode
    Picture myPic;

    // Circles
    Circle cArr[3] =
    {
        Circle(150, 120, 50),
        Circle(350, 120, 70),
        Circle(550, 120, 40)
    };

    // Rectangles
    Rect rArr[2] =
    {
        Rect(80, 250, 220, 350),
        Rect(400, 250, 600, 350)
    };

    // Lines
    Line lArr[2] =
    {
        Line(80, 400, 600, 400),
        Line(100, 450, 580, 450)
    };

    // Put shapes inside Picture
    myPic.setCircles(3, cArr);
    myPic.setRects(2, rArr);
    myPic.setLines(2, lArr);

    // Draw everything
    myPic.paint();

    return 0;
}




