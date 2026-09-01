

// Friend function 
class Complex {
private:
    float real;
    float img; 

public:
    Complex(float r, float i) {
        real = r; 
        img = i;
    }

    void print() {
        cout << real << " + " << img << " i " << endl; 
    }

    friend Complex addTo(float v, Complex  c);
};

Complex addTo(float v, Complex c) {
    c.real = c.real + v;
    return c;
};

int main() {
    Complex c(2, 5);

    Complex result = addTo(4, c);

    result.print();
    return 0;
}


// passing obj to fun 

// 1. normal attribute 
void myFunc(int b) {
    cout <<"b = " << b << endl;

}

int main() {
    int a = 10; 

    myFunc(a);
}


// 2. object 
class Complex {
    float real; 
    float img; 

public : 
    Complex(float r, float i) {
        real = r;
        img = i;
    }

    void print() {
        cout << real << " + " << img << "i" << endl; 

    }
};

void myFunc(Complex b) {
    b.print();
}

int main() {
    Complex a(5,3);

    myFunc(a);

    return 0; 
}


//  dynamin area problem 
class Stack {
public :
    int* st;
    int size;
    int top; 

    Stack(int s) {
        size = s;
        top = 3;

        st = new int[size];

        st[0] = 10;
        st[1] = 20;
        st[2] = 30;

        cout << "constuctor called\n " << endl; 
    }

    ~Stack() {
        cout << "Destructor called \n" << endl; 
        delete[] st; 
    }
};


void viewContent(Stack x) {
    cout << "inside viewContent : \n"; 
    cout << "x.st adderss = " << x.st << endl; 
    for (int i = 0; i < x.top; i++)
    {
        cout << x.st[i] << " "; 
    }

    cout << endl; 
}

int main() {
    Stack s(3);

    cout << "inside main: \n"; 
    cout << "s.st address = " << s.st << endl; 


    viewContent(s);

    cout << "back main \n ";

    cout << "s.st address = " << s.st << endl;


    return 0;


}




// sol by refernce 

class Stack {
public:
    int* st;
    int size;
    int top;

    Stack(int s) {
        size = s;
        top = 3;

        st = new int[size];

        st[0] = 10;
        st[1] = 20;
        st[2] = 30;

        cout << "constuctor called\n " << endl;
    }

    ~Stack() {
        cout << "Destructor called \n" << endl;
        delete[] st;
    }
};


void viewContent(Stack& x) {
   
    cout << " address of x " << &x << endl; 
    cout << "address of x.st " << x.st << endl;

    cout << "stack content "; 

    for (int i = 0; i < x.top; i++)
    {
        cout << x.st[i] << " ";
    }

    cout << endl;
}

int main() {

    Stack s(3);

    cout << " address of s " << &s << endl;
    cout << "address of s.st " << s.st << endl;

    viewContent(s);
    return 0; 


}



// sol by copy constructor 

class Stack {
public:
    int* st;
    int size;
    int top;

    Stack(int s) {
        size = s;
        top = 3;

        st = new int[size];

        st[0] = 10;
        st[1] = 20;
        st[2] = 30;

        cout << "constuctor called\n " << endl;
    }

    // copy 
    Stack(const Stack& z) {
        cout << " \n copy constructor called " << endl; 

        size = z.size;
        top = z.top;

        st = new int[size];

        for (int i = 0; i < size; i++) {
            st[i] = z.st[i];
       }
    }

    void display() {
        for (int i = 0; i < size; i++) {
            cout << st[i] << " "; 

        }
    }

    ~Stack() {
        delete[] st;
    }
};



int main() {

    //old obj
    Stack s1(3);
    cout << "s1: "; 
    s1.display(); 


    // copy obj 
    Stack s2(s1);
    cout << " s2 "; 
    s2.display();

    return 0; 

}
